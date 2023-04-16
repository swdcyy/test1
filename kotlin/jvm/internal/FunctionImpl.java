package kotlin.jvm.internal.FunctionImpl;
import qrd.l;
import java.io.Serializable;
import msd.a;
import msd.l;
import msd.p;
import msd.q;
import msd.r;
import msd.s;
import msd.t;
import msd.u;
import msd.v;
import msd.w;
import msd.b;
import msd.c;
import msd.d;
import msd.e;
import msd.f;
import msd.g;
import msd.h;
import msd.i;
import msd.j;
import msd.k;
import msd.m;
import msd.n;
import msd.o;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.UnsupportedOperationException;

public abstract class FunctionImpl implements l, Serializable, a, l, p, q, r, s, t, u, v, w, b, c, d, e, f, g, h, i, j, k, m, n, o	// class@00188e
{

    public void FunctionImpl(){
       super();
    }
    public final void a(int p0){
       if (this.getArity() != p0) {
          this.b(p0);
       }
       return;
    }
    public final void b(int p0){
       throw new IllegalStateException("Wrong function arity, expected: "+p0+", actual: "+this.getArity());
    }
    public abstract int getArity();
    public Object invoke(){
       this.a(0);
       Object[] objArray = new Object[0];
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0){
       this.a(1);
       Object[] objArray = new Object[]{p0};
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1){
       this.a(2);
       Object[] objArray = new Object[]{p0,p1};
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.a(3);
       Object[] objArray = new Object[]{p0,p1,p2};
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3){
       this.a(4);
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4){
       this.a(5);
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5){
       this.a(6);
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6){
       this.a(7);
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7){
       this.a(8);
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8){
       this.a(9);
       Object[] objArray = new Object[9];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9){
       this.a(10);
       Object[] objArray = new Object[10];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10){
       this.a(11);
       Object[] objArray = new Object[11];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11){
       this.a(12);
       Object[] objArray = new Object[12];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object p12){
       this.a(13);
       Object[] objArray = new Object[13];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       objArray[12] = p12;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object p12,Object p13){
       this.a(14);
       Object[] objArray = new Object[14];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       objArray[12] = p12;
       objArray[13] = p13;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object p12,Object p13,Object p14){
       this.a(15);
       Object[] objArray = new Object[15];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       objArray[12] = p12;
       objArray[13] = p13;
       objArray[14] = p14;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object p12,Object p13,Object p14,Object p15){
       this.a(16);
       Object[] objArray = new Object[16];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       objArray[12] = p12;
       objArray[13] = p13;
       objArray[14] = p14;
       objArray[15] = p15;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object p12,Object p13,Object p14,Object p15,Object p16){
       this.a(17);
       Object[] objArray = new Object[17];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       objArray[12] = p12;
       objArray[13] = p13;
       objArray[14] = p14;
       objArray[15] = p15;
       objArray[16] = p16;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object p12,Object p13,Object p14,Object p15,Object p16,Object p17){
       this.a(18);
       Object[] objArray = new Object[18];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       objArray[12] = p12;
       objArray[13] = p13;
       objArray[14] = p14;
       objArray[15] = p15;
       objArray[16] = p16;
       objArray[17] = p17;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object p12,Object p13,Object p14,Object p15,Object p16,Object p17,Object p18){
       this.a(19);
       Object[] objArray = new Object[19];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       objArray[12] = p12;
       objArray[13] = p13;
       objArray[14] = p14;
       objArray[15] = p15;
       objArray[16] = p16;
       objArray[17] = p17;
       objArray[18] = p18;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object p12,Object p13,Object p14,Object p15,Object p16,Object p17,Object p18,Object p19){
       this.a(20);
       Object[] objArray = new Object[20];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       objArray[12] = p12;
       objArray[13] = p13;
       objArray[14] = p14;
       objArray[15] = p15;
       objArray[16] = p16;
       objArray[17] = p17;
       objArray[18] = p18;
       objArray[19] = p19;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object p12,Object p13,Object p14,Object p15,Object p16,Object p17,Object p18,Object p19,Object p20){
       this.a(21);
       Object[] objArray = new Object[21];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       objArray[12] = p12;
       objArray[13] = p13;
       objArray[14] = p14;
       objArray[15] = p15;
       objArray[16] = p16;
       objArray[17] = p17;
       objArray[18] = p18;
       objArray[19] = p19;
       objArray[20] = p20;
       return this.invokeVararg(objArray);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object p12,Object p13,Object p14,Object p15,Object p16,Object p17,Object p18,Object p19,Object p20,Object p21){
       this.a(22);
       Object[] objArray = new Object[22];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       objArray[12] = p12;
       objArray[13] = p13;
       objArray[14] = p14;
       objArray[15] = p15;
       objArray[16] = p16;
       objArray[17] = p17;
       objArray[18] = p18;
       objArray[19] = p19;
       objArray[20] = p20;
       objArray[21] = p21;
       return this.invokeVararg(objArray);
    }
    public Object invokeVararg(Object[] p0){
       throw new UnsupportedOperationException();
    }
}
