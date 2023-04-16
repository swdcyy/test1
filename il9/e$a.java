package il9.e$a;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import il9.e;
import kl9.a$b;
import jl9.c;
import java.lang.IllegalArgumentException;
import il9.e$b;
import android.util.SparseArray;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;
import com.yxcorp.gifshow.util.cdnresource.e;
import com.yxcorp.gifshow.util.cdnresource.m;
import jl9.d$a;

public class e$a	// class@00286b
{
    public SparseArray a;
    public CdnResource$a b;
    public int[] c;
    public int[] d;
    public int[] e;
    public Context f;
    public int g;
    public int h;
    public float i;
    public float j;
    public Bitmap k;
    public boolean l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u;
    public String v;
    public int w;
    public boolean x;
    public d$a y;

    public void e$a(Context p0){
       super();
       this.s = 2;
       this.t = 200;
       this.x = false;
       this.f = p0;
    }
    public static e$a b(Context p0,String p1){
       e$a obj = PatchProxy.applyTwoRefs(p0, p1, null, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new e$a(p0);
       if (TextUtils.isEmpty(p1)) {
          obj.k("ACTIVITY_RESOURCE");
       }else {
          obj.k(p1);
       }
       return obj;
    }
    public e a(){
       e$a obj = PatchProxy.apply(null, this, e$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          throw new IllegalArgumentException("需要调用setSfDrawable");
       }
       obj = this.c;
       if (obj == null || obj.length != 10) {
          throw new IllegalArgumentException("需要调用setComboNumber 并且length=10分别对应数字0-9");
       }
       obj = this.d;
       if (obj == null || !obj.length) {
          throw new IllegalArgumentException("需要调用setComboTextDrawable");
       }
       if (this.y == null) {
          this.y = c.a(0x3f800000, 0x3f800000);
       }
       if (!this.j) {
          this.j = this.i;
       }
       return new e(this);
    }
    public e$a c(int p0,int p1){
       this.g = p0;
       this.h = p1;
       return this;
    }
    public e$a d(int[] p0){
       this.c = p0;
       return this;
    }
    public e$a e(e$b[] p0){
       int[] ointArray = new int[p0.length];
       this.d = ointArray;
       ointArray = new int[p0.length];
       this.e = ointArray;
       for (int i = 0; i < p0.length; i = i + 1) {
          object oobject = p0[i];
          this.d[i] = oobject.a;
          this.e[i] = oobject.b;
       }
       return this;
    }
    public e$a f(SparseArray p0){
       this.a = p0;
       return this;
    }
    public e$a g(int p0){
       this.w = p0;
       return this;
    }
    public e$a h(float p0){
       this.j = p0;
       return this;
    }
    public e$a i(CdnResource$ResourceKey p0,int[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b = (TextUtils.isEmpty(this.v))? e.h(this.u, p0, p1, this.x): m.b(this.v, p0);
       return this;
    }
    public e$a j(d$a p0){
       this.y = p0;
       return this;
    }
    public e$a k(String p0){
       this.u = p0;
       return this;
    }
    public e$a l(int p0){
       this.r = p0;
       return this;
    }
    public e$a m(float p0){
       this.i = p0;
       return this;
    }
}
