package lections.empty.mvc.model;

public class DBLayer implements ModelLayer {
    @Override
    public Student getStudent() {
        return new Student();
    }
}
