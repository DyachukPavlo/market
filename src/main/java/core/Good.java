package core;

import java.util.Objects;

public abstract class Good{
    abstract double getPrice();
    abstract String getName();


    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Good)) {
            return false;
        }
        Good good = (Good) o;
        return this.getClass() == good.getClass() &&
               this.getPrice() == good.getPrice() &&
               Objects.equals(this.getName(), good.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPrice());
    }

}
