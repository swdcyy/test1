package mxd.c;
import mxd.a;
import org.tensorflow.lite.DataType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.lang.Object;
import kxd.c;
import java.lang.Math;

public final class c extends a	// class@001d69
{
    public static final DataType e;

    static {
       c.e = DataType.UINT8;
    }
    public void c(){
       super();
    }
    public void c(int[] p0){
       super(p0);
    }
    public DataType e(){
       return c.e;
    }
    public float[] f(){
       this.a.rewind();
       float[] uofloatArray = new float[this.c];
       for (int i = 0; i < this.c; i = i + 1) {
          int i1 = this.a.get() & 0x00ff;
          uofloatArray[i] = (float)i1;
       }
       return uofloatArray;
    }
    public int[] g(){
       this.a.rewind();
       int[] ointArray = new int[this.c];
       for (int i = 0; i < this.c; i = i + 1) {
          int i1 = this.a.get() & 0x00ff;
          ointArray[i] = i1;
       }
       return ointArray;
    }
    public int h(){
       return c.e.byteSize();
    }
    public void i(float[] p0,int[] p1){
       c.b(p0, "The array to be loaded cannot be null.");
       int i = 0;
       boolean b = (p0.length == a.b(p1))? true: false;
       c.a(b, "The size of the array to be loaded does not match the specified shape.");
       this.k(p1);
       this.a.rewind();
       int len = p0.length;
       for (; i < len; i = i + 1) {
          this.a.put((byte)(int)Math.max(Math.min((double)p0[i], 0x406fe00000000000), 0));
       }
       return;
    }
    public void j(int[] p0,int[] p1){
       c.b(p0, "The array to be loaded cannot be null.");
       int b = (p0.length == a.b(p1))? true: false;
       c.a(b, "The size of the array to be loaded does not match the specified shape.");
       this.k(p1);
       this.a.rewind();
       int len = p0.length;
       for (b = 0; b < len; b = b + 1) {
          this.a.put((byte)Math.max(Math.min(p0[b], 255), 0));
       }
       return;
    }
}
