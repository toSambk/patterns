package abstractFactory.factories;

import abstractFactory.checkboxes.Checkbox;
import abstractFactory.buttons.Button;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}