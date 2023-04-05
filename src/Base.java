import java.util.Objects;

public class Base {
    public  Base() {
    }
    public static boolean base(String login, String password, String confirmPassword) {
        try {
            check(login,password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    private static void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

            if (Objects.isNull(login) || login.length() > 20) {
                throw new WrongLoginException("Длина логина должна быть меньше или равна 20!");
            }
            if (Objects.isNull(login) || login.length() > 20) {
                throw new WrongPasswordException("Длина логина должна быть меньше 20!");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли должны совпадать!");
            }
            Checker checker = new LoopChecker();
            if (!checker.check(login)) {
                throw new WrongLoginException("Логин содержит некоректные символы!");
            }
            if (!checker.check(password)) {
                throw new WrongPasswordException("Логин содержит некоректные символы!");
            }
        }
    }


