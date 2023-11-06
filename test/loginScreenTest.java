import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class loginScreenTest {

    @Test
    public void testAuthenticationSuccess() {
        loginScreen loginScreen = new loginScreen();
        assertTrue(loginScreen.authenticate("usuario", "senha"));
    }

    @Test
    public void testAuthenticationFailure() {
        loginScreen loginScreen = new loginScreen();
        assertFalse(loginScreen.authenticate("usuario", "senhaErrada"));
    }

    @Test
    public void testNonExistentUser() {
        loginScreen loginScreen = new loginScreen();
        assertFalse(loginScreen.authenticate("usuarioInexistente", "senha"));
    }

    @Test
    public void testIncorrectPassword() {
        loginScreen loginScreen = new loginScreen();
        assertFalse(loginScreen.authenticate("usuario", "senhaIncorreta"));
    }

}