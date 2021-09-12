import javax.security.sasl.AuthenticationException;
import org.apache.hive.service.auth.PasswdAuthenticationProvider;


public class HiveSimpleAuthenticator implements PasswdAuthenticationProvider {
    public void Authenticate(String user, String password) throws AuthenticationException {
        if (user.equals("user")){
            if (password.equals("password")) {
                return;
            }
        }
        throw new AuthenticationException();
    }
}
