
package arToAp;

import java.io.IOException;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Types;

public class CallGlPosting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ConnectionProvider connectionProvider = new ConnectionProvider();
		CallGlPosting callGlPosting = new CallGlPosting();
		CallOci callOci = new CallOci();
		String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=tcp)(HOST=omegaddedbscn.th3g3nt3l.com)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=OTC1S_SQL)))";
		String user = "App_Admin";
String pwd = "iH#3Z$U$Z#gTCNIO6";
