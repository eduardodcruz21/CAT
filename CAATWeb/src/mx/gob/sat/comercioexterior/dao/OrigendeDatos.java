package mx.gob.sat.comercioexterior.dao;

public class OrigendeDatos {
	public static String getPersistenceUnit(int aduana) {
		switch (aduana / 10) {
		case 1:
			return "Adu010PU";// ACAPULCO, GRO.
		case 2:
			return "Adu020PU";// AGUA PRIETA, SON.
		case 5:
			return "Adu050PU";// SUBTENIENTE LOPEZ, Q. ROO.
		case 6:
			return "Adu060PU";// CD. DEL CARMEN, CAMP.
		case 7:
			return "Adu070PU";// CD. JUAREZ, CHIH.
		case 8:
			return "Adu080PU";// COATZACOALCOS, VER.
		case 11:
			return "Adu110PU";// ENSENADA, B.C.
		case 12:
			return "Adu120PU";// GUAYMAS, SON.
		case 14:
			return "Adu140PU";// LA PAZ, B.C.S.
		case 16:
			return "Adu160PU";// MANZANILLO, COL.
		case 17:
			return "Adu170PU";// MATAMOROS,TAMPS.
		case 18:
			return "Adu180PU";// MAZATLAN, SIN.
		case 19:
			return "Adu190PU";// MEXICALI, B.C.
		case 20:
			return "Adu200PU";// MEXICO
		case 22:
			return "Adu220PU";// NACO, SON.
		case 23:
			return "Adu230PU";// NOGALES, SON.
		case 24:
			return "Adu240PU";// NUEVO LAREDO, TAMPS.
		case 25:
			return "Adu250PU";// OJINAGA, CHIH.
		case 26:
			return "Adu260PU";// PUERTO PALOMAS, CHIH.
		case 27:
			return "Adu270PU";// PIEDRAS NEGRAS, COAH.
		case 28:
			return "Adu280PU";// PROGRESO, YUC.
		case 30:
			return "Adu300PU";// CD. REYNOSA, TAMPS.
		case 31:
			return "Adu310PU";// SALINA CRUZ, OAX.
		case 33:
			return "Adu330PU";// SAN LUIS RIO COLORADO, SON.
		case 34:
			return "Adu340PU";// CD. MIGUEL ALEMAN, TAMPS.
		case 37:
			return "Adu370PU";// CD. HIDALGO, CHIS.
		case 38:
			return "Adu380PU";// TAMPICO, TAMPS.
		case 39:
			return "Adu390PU";// TECATE, B.C.
		case 40:
			return "Adu400PU";// TIJUANA, B.C.
		case 42:
			return "Adu420PU";// TUXPAN, VER.
		case 43:
			return "Adu430PU";// VERACRUZ, VER.
		case 44:
			return "Adu440PU";// CD. ACUNA, COAH.
		case 46:
			return "Adu460PU";// TORREON, COAH.
		case 47:
			return "Adu470PU";// AEROPUERTO INTERNAL. CD. DE MEXICO, D.F.
		case 48:
			return "Adu480PU";// GUADALAJARA, JAL.
		case 50:
			return "Adu500PU";// SONOYTA, SON.
		case 51:
			return "Adu510PU";// LAZARO CARDENAS, MICH.
		case 52:
			return "Adu520PU";// MONTERREY, N.L.
		case 53:
			return "Adu530PU";// CANCUN, Q. ROO.
		case 64:
			return "Adu640PU";// QUERETARO, QRO.
		case 67:
			return "Adu670PU";// CHIHUAHUA, CHIH.
		case 73:
			return "Adu730PU";// AGUASCALIENTES, AGS.
		case 75:
			return "Adu750PU";// PUEBLA, PUE.
		case 80:
			return "Adu800PU";// COLOMBIA, N.L.
		case 81:
			return "Adu810PU";// ALTAMIRA, TAMPS.
		case 82:
			return "Adu820PU";// CD. CAMARGO, TAMPS.
		case 83:
			return "Adu830PU";// DOS BOCAS
		case 65:
			return "Adu650PU";// TOLUCA, MEX.
		case 84:
			return "Adu840PU";// GUANAJUATO, GTO
		default:
			return "";
		}
	}

	public static String getgetPersistenceUnitJNDI(int aduana) {
		switch (aduana / 10) {
		case 1:
			return "java:comp/env/Adu010DS";// ACAPULCO, GRO.
		case 2:
			return "java:comp/env/Adu020DS";// AGUA PRIETA, SON.
		case 5:
			return "java:comp/env/Adu050DS";// SUBTENIENTE LOPEZ, Q. ROO.
		case 6:
			return "java:comp/env/Adu060DS";// CD. DEL CARMEN, CAMP.
		case 7:
			return "java:comp/env/Adu070DS";// CD. JUAREZ, CHIH.
		case 8:
			return "java:comp/env/Adu080DS";// COATZACOALCOS, VER.
		case 11:
			return "java:comp/env/Adu110DS";// ENSENADA, B.C.
		case 12:
			return "java:comp/env/Adu120DS";// GUAYMAS, SON.
		case 14:
			return "java:comp/env/Adu140DS";// LA PAZ, B.C.S.
		case 16:
			return "java:comp/env/Adu160DS";// MANZANILLO, COL.
		case 17:
			return "java:comp/env/Adu170DS";// MATAMOROS,TAMPS.
		case 18:
			return "java:comp/env/Adu180DS";// MAZATLAN, SIN.
		case 19:
			return "java:comp/env/Adu190DS";// MEXICALI, B.C.
		case 20:
			return "java:comp/env/Adu200DS";// MEXICO
		case 22:
			return "java:comp/env/Adu220DS";// NACO, SON.
		case 23:
			return "java:comp/env/Adu230DS";// NOGALES, SON.
		case 24:
			return "java:comp/env/Adu240DS";// NUEVO LAREDO, TAMPS.
		case 25:
			return "java:comp/env/Adu250DS";// OJINAGA, CHIH.
		case 26:
			return "java:comp/env/Adu260DS";// PUERTO PALOMAS, CHIH.
		case 27:
			return "java:comp/env/Adu270DS";// PIEDRAS NEGRAS, COAH.
		case 28:
			return "java:comp/env/Adu280DS";// PROGRESO, YUC.
		case 30:
			return "java:comp/env/Adu300DS";// CD. REYNOSA, TAMPS.
		case 31:
			return "java:comp/env/Adu310DS";// SALINA CRUZ, OAX.
		case 33:
			return "java:comp/env/Adu330DS";// SAN LUIS RIO COLORADO, SON.
		case 34:
			return "java:comp/env/Adu340DS";// CD. MIGUEL ALEMAN, TAMPS.
		case 37:
			return "java:comp/env/Adu370DS";// CD. HIDALGO, CHIS.
		case 38:
			return "java:comp/env/Adu380DS";// TAMPICO, TAMPS.
		case 39:
			return "java:comp/env/Adu390DS";// TECATE, B.C.
		case 40:
			return "java:comp/env/Adu400DS";// TIJUANA, B.C.
		case 42:
			return "java:comp/env/Adu420DS";// TUXPAN, VER.
		case 43:
			return "java:comp/env/Adu430DS";// VERACRUZ, VER.
		case 44:
			return "java:comp/env/Adu440DS";// CD. ACUNA, COAH.
		case 46:
			return "java:comp/env/Adu460DS";// TORREON, COAH.
		case 47:
			return "java:comp/env/Adu470DS";// AEROPUERTO INTERNAL. CD. DE MEXICO, D.F.
		case 48:
			return "java:comp/env/Adu480DS";// GUADALAJARA, JAL.
		case 50:
			return "java:comp/env/Adu500DS";// SONOYTA, SON.
		case 51:
			return "java:comp/env/Adu510DS";// LAZARO CARDENAS, MICH.
		case 52:
			return "java:comp/env/Adu520DS";// MONTERREY, N.L.
		case 53:
			return "java:comp/env/Adu530DS";// CANCUN, Q. ROO.
		case 64:
			return "java:comp/env/Adu640DS";// QUERETARO, QRO.
		case 67:
			return "java:comp/env/Adu670DS";// CHIHUAHUA, CHIH.
		case 73:
			return "java:comp/env/Adu730DS";// AGUASCALIENTES, AGS.
		case 75:
			return "java:comp/env/Adu750DS";// PUEBLA, PUE.
		case 80:
			return "java:comp/env/Adu800DS";// COLOMBIA, N.L.
		case 81:
			return "java:comp/env/Adu810DS";// ALTAMIRA, TAMPS.
		case 82:
			return "java:comp/env/Adu820DS";// CD. CAMARGO, TAMPS.
		case 83:
			return "java:comp/env/Adu830DS";// DOS BOCAS
		case 65:
			return "java:comp/env/Adu650DS";// TOLUCA, MEX.
		case 84:
			return "java:comp/env/Adu840DS";// GUANAJUATO, GTO
		default:
			return "";
		}
	}

}
