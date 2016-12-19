package it.cosenonjaviste.security.jwt.utils;

/**
 * Helper class for centralizing constants
 *
 * @author acomo
 *
 */
public class JwtConstants {

	/**
	 * Authentication header
	 */
	public static final String AUTH_HEADER = "Authorization";

	/**
	 * subject claim key
	 */
	public static final String SUB = "sub";

	/**
	 * OIN Id
	 */
	 public static final String OIN_ID = "http://data.digitaalstelselomgevingswet.nl/definities/OIN";

	/**
	 * Roles claim key
	 */
	public static final String ROLES = "http://data.digitaalstelselomgevingswet.nl/definities/Role";

}
