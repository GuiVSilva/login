import java.util.HashMap;
import java.util.Map;
/**
 * A classe LoginScreen é responsável por autenticar usuários com base em um banco de dados simulado.
 * Ela verifica se um nome de usuário e uma senha correspondem aos dados no banco de dados.
 */
public class loginScreen {
    private static final Map<String, String> USER_DATABASE = new HashMap<>();

    /**
     * Inicializa o banco de dados de usuários com alguns dados simulados.
     */
    static {
        USER_DATABASE.put("usuario", "senha");
        USER_DATABASE.put("outroUsuario", "outraSenha");
    }

    /**
     * Método para autenticar um usuário.
     *
     * @param username Nome de usuário.
     * @param password Senha do usuário.
     * @return true se a autenticação for bem-sucedida, senão false.
     */
    public boolean authenticate(String username, String password) {
        String storedPassword = USER_DATABASE.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }
}
