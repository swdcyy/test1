package o1.d$a;
import java.lang.Object;
import java.util.List;
import java.lang.Integer;
import java.lang.Float;

public final class d$a	// class@00273c
{
    public final int[] a;
    public final float[] b;

    public void d$a(int p0,int p1){
       super();
       int[] ointArray = new int[]{p0,p1};
       this.a = ointArray;
       this.b = new float[2]{0,0x3f800000};
    }
    public void d$a(int p0,int p1,int p2){
       super();
       int[] ointArray = new int[]{p0,p1,p2};
       this.a = ointArray;
       this.b = new float[3]{0,0x3f000000,0x3f800000};
    }
    public void d$a(List p0,List p1){
       super();
       int i = p0.size();
       int[] ointArray = new int[i];
       this.a = ointArray;
       float[] uofloatArray = new float[i];
       this.b = uofloatArray;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.a[i1] = p0.get(i1).intValue();
          this.b[i1] = p1.get(i1).floatValue();
       }
       return;
    }
}
