import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class PythagoreanTriplet {
    private final int a;
    private final int b;
    private final int c;
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
    @Override
    public String toString() {
        return "PythagoreanTriplet{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    public static Builder makeTripletsList() {
        return new Builder();
    }
    public static class Builder {
        private int sumTo;
        private int maxFactor;
        public Builder thatSumTo(int i) {
            sumTo = i;
            if (maxFactor == 0) {
                maxFactor = i;
            }
            return this;
        }
        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> ret = new ArrayList<>();
            for (int a = 1; a <= maxFactor; a++) {
                int aa = a * a;
                for (int b = a + 1; b <= maxFactor; b++) {
                    int bb = b * b;
                    int cc = aa + bb;
                    int c = (int) Math.sqrt(cc);
                    if (c <= maxFactor && a + b + c == sumTo && cc == c * c) {
                        ret.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }
            return ret;
        }
        public Builder withFactorsLessThanOrEqualTo(int i) {
            maxFactor = i;
            return this;
        }
    }
}