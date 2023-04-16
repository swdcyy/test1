package mxd.b;
import mxd.a;
import org.tensorflow.lite.DataType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.lang.Object;
import kxd.c;

public final class b extends a	// class@001d68
{
    public static final DataType e;

    static {
       b.e = DataType.FLOAT32;
    }
    public void b(){
       super();
    }
    public void b(int[] p0){
       super(p0);
    }
    public DataType e(){
       return b.e;
    }
    public float[] f(){
       this.a.rewind();
       float[] uofloatArray = new float[this.c];
       this.a.asFloatBuffer().get(uofloatArray);
       return uofloatArray;
    }
    public int[] g(){
       this.a.rewind();
       int[] ointArray = new int[this.c];
       for (int i = 0; i < this.c; i = i + 1) {
          ointArray[i] = (int)this.a.getFloat();
       }
       return ointArray;
    }
    public int h(){
       return b.e.byteSize();
    }
    public void i(float[] p0,int[] p1){
       c.b(p0, "The array to be loaded cannot be null.");
       boolean b = (p0.length == a.b(p1))? true: false;
       c.a(b, "The size of the array to be loaded does not match the specified shape.");
       this.k(p1);
       this.a.rewind();
       this.a.asFloatBuffer().put(p0);
       return;
    }
    public void j(int[] p0,int[] p1){
       c.b(p0, "The array to be loaded cannot be null.");
       int i = 0;
       boolean b = (p0.length == a.b(p1))? true: false;
       c.a(b, "The size of the array to be loaded does not match the specified shape.");
       this.k(p1);
       this.a.rewind();
       int len = p0.length;
       for (; i < len; i = i + 1) {
          this.a.putFloat((float)p0[i]);
       }
       return;
    }
}
