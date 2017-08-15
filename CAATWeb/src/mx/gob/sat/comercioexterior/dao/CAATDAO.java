package mx.gob.sat.comercioexterior.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import mx.gob.sat.comercioexterior.servicio.response.Chofer;
import mx.gob.sat.comercioexterior.servicio.response.DetalleCAAT;
import mx.gob.sat.comercioexterior.servicio.response.DetalleCAATNav;
import mx.gob.sat.comercioexterior.servicio.response.Vehiculo;

public class CAATDAO {

	public DetalleCAAT consultaDatosGenerales(String caat) throws Exception {
		DetalleCAAT dc = new DetalleCAAT();
		String cmd = null;
		Connection conn;
		try {
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("jdbc/p_scepweb01");
			conn = ds.getConnection();
		} catch (SQLException e) {
			System.out.println("ERROR: failed to connect!");
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (NamingException e) {
			System.out.println("ERROR: failed to connect!");
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		}

		try {
			cmd = "SELECT " + "    a.d_nombre, " + "    a.d_rfc, "
					+ "    a.d_domicilio, " + "    a.d_nomdirector, "
					+ "    a.d_nomcontacto, " + "    a.d_telcontacto, "
					+ "    a.d_correo, " + "    a.b_extranjero, "
					+ "    b.c_tipoempresa " + "FROM mm_caat_transter a, "
					+ "     dd_caat_empresa b " + "WHERE a.d_cve_caat = ? "
					+ "AND a.c_caat = b.c_caat " + "UNION " + "SELECT "
					+ "    a.d_nombre, " + "    a.d_rfc, "
					+ "    a.d_domicilio, " + "    a.d_nomdirector, "
					+ "    a.d_nomcontacto, " + "    a.d_telcontacto, "
					+ "    a.d_correo, " + "    '0', " + "    b.c_tipoempresa "
					+ "FROM mm_caat_agentes a, " + "     dd_caat_empresa b "
					+ "WHERE a.d_cve_caat = ? " + "AND a.c_caat = b.c_caat ";
			System.out.println("CMD: " + cmd);

			PreparedStatement stmt = conn.prepareStatement(cmd);
			stmt.setString(1, caat);
			stmt.setString(2, caat);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				dc.setNombre(rs.getString(1));
				dc.setRfc(rs.getString(2));
				dc.setDomicilio(rs.getString(3));
				dc.setNombreDirGral(rs.getString(4));
				dc.setNombreContacto(rs.getString(5));
				dc.setTelefonoContacto(rs.getString(6));
				dc.setEmail(rs.getString(7));
				dc.setExtranjero(rs.getString(8));
				dc.setTipoEmpresa(rs.getString(9));
			}
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("ERROR: execution failed - statement: " + cmd);
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("ERROR: failed to close the connection!");
				e.printStackTrace();
				throw e;
			}
		}
		return dc;
	}

	public List<Vehiculo> consultaVehiculos(String caat) throws Exception {
		List<Vehiculo> vcs = new ArrayList<Vehiculo>();
		Vehiculo vc;
		String cmd = null;
		Connection conn;
		try {
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("jdbc/p_scepweb01");
			conn = ds.getConnection();
		} catch (SQLException e) {
			System.out.println("ERROR: failed to connect!");
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (NamingException e) {
			System.out.println("ERROR: failed to connect!");
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		}

		try {
			cmd = "SELECT " + "    a.d_vin, " + "    a.d_numeconomico, "
					+ "    a.d_tipovehiculo, " + "    a.d_transponder, "
					+ "    a.d_numplacas, " + "    b.d_descripcion, "
					+ "    c.d_descripcion " + "FROM dd_caat_autos a, "
					+ "     ci_entidad_fed b, " + "     ci_pais c "
					+ "WHERE a.d_cve_caat = ? "
					+ "AND a.c_edoprovincia = b.c_entidad_fed "
					+ "AND a.c_paisemisor = c.c_pais ";
			System.out.println("CMD: " + cmd);

			PreparedStatement stmt = conn.prepareStatement(cmd);
			stmt.setString(1, caat);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				vc = new Vehiculo();
				vc.setVin(rs.getString(1));
				vc.setNumEconomico(rs.getString(2));
				vc.setTipo(rs.getString(3));
				vc.setTransponder(rs.getString(4));
				vc.setNumPlacas(rs.getString(5));
				vc.setEstado(rs.getString(6));
				vc.setPaisEmisor(rs.getString(7));
				vcs.add(vc);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("ERROR: execution failed - statement: " + cmd);
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("ERROR: failed to close the connection!");
				e.printStackTrace();
				throw e;
			}
		}
		return vcs;
	}

	public List<Chofer> consultaChoferes(String caat) throws Exception {
		List<Chofer> vcs = new ArrayList<Chofer>();
		Chofer vc;
		String cmd = null;
		Connection conn;
		try {
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("jdbc/p_scepweb01");
			conn = ds.getConnection();
		} catch (SQLException e) {
			System.out.println("ERROR: failed to connect!");
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (NamingException e) {
			System.out.println("ERROR: failed to connect!");
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		}

		try {
			cmd = "SELECT " + "    b.d_descripcion, " + "    a.d_curp, "
					+ "    c.d_descripcion, " + "    a.d_direccion "
					+ "FROM dd_caat_choferes a, " + "     ci_pais b, "
					+ "     ci_pais c " + "WHERE a.d_cve_caat = ? "
					+ "AND a.c_paisnac = b.c_pais "
					+ "AND a.c_pais = c.c_pais ";
			System.out.println("CMD: " + cmd);

			PreparedStatement stmt = conn.prepareStatement(cmd);
			stmt.setString(1, caat);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				vc = new Chofer();
				vc.setNacionalidad(rs.getString(1));
				vc.setCurp(rs.getString(2));
				vc.setPaisResidencia(rs.getString(3));
				vc.setDireccion(rs.getString(4));
				vcs.add(vc);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("ERROR: execution failed - statement: " + cmd);
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("ERROR: failed to close the connection!");
				e.printStackTrace();
				throw e;
			}
		}
		return vcs;
	}

	public DetalleCAATNav consultaDatosGeneralesNAV(String caat)
			throws Exception {
		DetalleCAATNav dc = new DetalleCAATNav();
		String cmd = null;
		Connection conn;
		try {
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("jdbc/p_scepweb01");
			conn = ds.getConnection();
		} catch (SQLException e) {
			System.out.println("ERROR: failed to connect!");
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (NamingException e) {
			System.out.println("ERROR: failed to connect!");
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		}

		try {
			cmd = "SELECT " + "    a.d_nombre, " + "    a.d_nomreplegal, "
					+ "    b.d_descripcion " + "FROM mm_caat_transmar a, "
					+ "     ci_pais b " + "WHERE a.d_cve_caat = ? "
					+ "AND a.c_paisproced = b.c_pais ";
			System.out.println("CMD: " + cmd);

			PreparedStatement stmt = conn.prepareStatement(cmd);
			stmt.setString(1, caat);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				dc.setNombre(rs.getString(1));
				dc.setRepresentanteLegal(rs.getString(2));
				dc.setPais(rs.getString(3));
			}
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("ERROR: execution failed - statement: " + cmd);
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("ERROR: failed to close the connection!");
				e.printStackTrace();
				throw e;
			}
		}
		return dc;
	}
}
