package il9.e;
import lnc.a1;
import il9.e$a;
import java.lang.Object;
import java.util.Random;
import android.util.SparseArray;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;

public final class e	// class@00286d
{
    public String A;
    public int B;
    public int C;
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final SparseArray d;
    public final Context e;
    public final Random f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Bitmap l;
    public boolean m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public final d$a s;
    public final String t;
    public boolean u;
    public final String v;
    public final int w;
    public SparseArray x;
    public CdnResource$a y;
    public String z;
    public static final int D;

    static {
       e.D = a1.e(34.00f);
    }
    public void e(e$a p0){
       int d1;
       super();
       this.f = new Random();
       this.e = p0.f;
       this.a = p0.c;
       e$a d = p0.d;
       this.b = d;
       this.c = p0.e;
       this.y = p0.b;
       this.u = p0.x;
       this.d = new SparseArray(((this.y.size() + d.length) + d.length));
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.r;
       this.j = p0.i;
       this.k = p0.j;
       this.l = p0.k;
       this.m = p0.l;
       this.n = p0.m;
       this.o = p0.n;
       this.p = p0.o;
       this.r = p0.q;
       this.q = p0.p;
       this.x = p0.a;
       this.s = p0.y;
       this.B = p0.s;
       this.C = p0.t;
       this.t = p0.v;
       this.v = (TextUtils.isEmpty(p0.u))? "ACTIVITY_RESOURCE": p0.u;
       p0 = p0.w;
       if (p0 <= null) {
          d1 = e.D;
       }
       this.w = d1;
       return;
    }
    public int a(){
       return this.h;
    }
    public int b(){
       return this.g;
    }
    public int c(){
       return this.i;
    }
    public float d(int p0){
       if (p0 == 1) {
          return this.k;
       }
       return this.j;
    }
    public Random e(){
       return this.f;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       int i = 0;
       while (i < this.d.size()) {
          e td = this.d;
          Bitmap uBitmap = td.get(td.keyAt(i));
          if (uBitmap != null && !uBitmap.isRecycled()) {
             uBitmap.recycle();
             this.d.removeAt(i);
          }
          i = i + 1;
       }
       return;
    }
}
