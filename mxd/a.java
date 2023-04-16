package mxd.a;
import java.lang.Object;
import kxd.c;
import org.tensorflow.lite.DataType;
import mxd.a$a;
import java.lang.Enum;
import mxd.c;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import java.lang.String;
import mxd.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.lang.IllegalArgumentException;

public abstract class a	// class@001d67
{
    public ByteBuffer a;
    public int[] b;
    public int c;
    public final boolean d;

    public void a(){
       super();
       this.c = -1;
       this.d = true;
       int[] ointArray = new int[true];
       ointArray[0] = 0;
       this.a(ointArray);
    }
    public void a(int[] p0){
       super();
       this.c = -1;
       this.d = false;
       this.a(p0);
    }
    public static int b(int[] p0){
       c.b(p0, "Shape cannot be null.");
       int len = p0.length;
       int i = 1;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          i = i * p0[i1];
       }
       return i;
    }
    public static a c(int[] p0,DataType p1){
       int i = a$a.a[p1.ordinal()];
       if (i == 1) {
          return new b(p0);
       }
       if (i == 2) {
          return new c(p0);
       }
       throw new AssertionError("TensorBuffer does not support data type: "+p1);
    }
    public final void a(int[] p0){
       c.b(p0, "TensorBuffer shape cannot be null.");
       boolean b = false;
       if (p0.length) {
          int i = p0.length;
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                if (p0[i1] < 0) {
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }
          }
          c.a(b, "Values in TensorBuffer shape should be non-negative.");
          i = a.b(p0);
          if (this.c == i) {
             return;
          }else {
             this.c = i;
             this.b = p0.clone();
             ByteBuffer uByteBuffer = ByteBuffer.allocateDirect((this.c * this.h()));
             this.a = uByteBuffer;
             uByteBuffer.order(ByteOrder.nativeOrder());
             return;
          }
       }
       b = true;
       goto label_0018 ;
    }
    public ByteBuffer d(){
       return this.a;
    }
    public abstract DataType e();
    public abstract float[] f();
    public abstract int[] g();
    public abstract int h();
    public abstract void i(float[] p0,int[] p1);
    public abstract void j(int[] p0,int[] p1);
    public void k(int[] p0){
       if (this.d != null) {
          this.a(p0);
       }else if(Arrays.equals(p0, this.b)){
          this.b = p0.clone();
       }else {
          throw new IllegalArgumentException();
       }
       return;
    }
}
