package kevalpatel2106.com.automated_test_and_ci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kalpesh
 */
public class MainActivityTest {

    /**
     * Unit test for email.
     *
     * @throws Exception if test fails.
     */
    @Test
    public void validateEmail() throws Exception {
        assertSame(true, MainActivity.validateEmail("kalpesh.appexperts2@gmail.com"));
        assertSame(false, MainActivity.validateEmail("kalpesh.appexperts2.com"));
        assertSame(false, MainActivity.validateEmail(""));
        assertSame(false, MainActivity.validateEmail("k@com"));
    }

}