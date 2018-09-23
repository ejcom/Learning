package lections.patternGeekBrains;

import javax.swing.text.Document;
import java.io.File;

public class Factory {
    public AbstractWriter getWriter(Object object) {
        AbstractWriter writer = null;
        if (object instanceof File) {
            writer = new ConcreteFileWriter();
        } else if (object instanceof Document) {
            writer = new ConcreteXmlWriter();
        }
        return writer;
    }
}

// Абстрактный класс принимающий действие
abstract class AbstractWriter {
    public abstract void write(Object context);
}

// Выполняющий конкретное действие
class ConcreteFileWriter extends AbstractWriter {
    @Override
    public void write(Object context) {
//        somebody
    }
}

// Выполняющий другое действие
class ConcreteXmlWriter extends AbstractWriter {
    @Override
    public void write(Object context) {
//        somebody
    }
}
