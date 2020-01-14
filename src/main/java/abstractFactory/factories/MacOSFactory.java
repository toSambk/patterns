package abstractFactory.factories;

import abstractFactory.buttons.MacOSButton;
import abstractFactory.checkboxes.Checkbox;
import abstractFactory.checkboxes.MacOSCheckbox;
import abstractFactory.buttons.Button;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
