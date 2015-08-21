package basic;

import java.math.BigDecimal;
import java.util.List;

public interface BasicDAO<T> {
    public T get(BigDecimal id);

    public boolean set(T t);

    public List<T> getMany(String query);

    public boolean delete(T t);
}
