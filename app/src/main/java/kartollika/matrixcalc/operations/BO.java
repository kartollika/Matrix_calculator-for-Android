package kartollika.matrixcalc.operations;

import kartollika.matrixcalc.Matrix;
import kartollika.matrixcalc.RationalNumber;

public abstract class BO extends Operation {

    private Matrix m1, m2;
    private RationalNumber k;

    protected BO(Matrix m1, Matrix m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    protected BO(Matrix m1, RationalNumber k) {
        this.m1 = m1;
        this.k = k;
    }

    protected Matrix getM1() {
        return m1;
    }

    protected Matrix getM2() {
        return m2;
    }

    protected RationalNumber getK() {
        return k;
    }
}
