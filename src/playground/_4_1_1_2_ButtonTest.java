package playground;

public class _4_1_1_2_ButtonTest {
    interface Clickable {
        void click();

        default void showOff() {
            System.out.println("I'm clickable!");
        }
    }

    interface Focusable {
        default void setFocus(boolean b) {
            System.out.println("I " +
                    (b ? "got" : "lost") + " focus");
        }

        default void showOff() {
            System.out.println("I'm focusable!");
        }
    }

    static class Button implements Clickable, Focusable {
        @Override
        public void click() {
            System.out.println("I was clicked");
        }

        @Override
        public void showOff() {
            Clickable.super.showOff();
            Focusable.super.showOff();
        }
    }

    public static void main(String... args) {
        var button = new Button();
        button.showOff();
        button.setFocus(true);
        button.click();
    }
}