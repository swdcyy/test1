package a7c.h;
import a7c.h$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.util.Objects;
import a7c.e$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a7c.e;
import com.yxcorp.gifshow.pymk.net.a;
import java.lang.Boolean;
import androidx.collection.SparseArrayCompat;
import ok.x;
import i7c.e;
import i7c.f;
import com.yxcorp.gifshow.pymk.f;
import f7c.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import a7c.f;
import g7c.g;
import a7c.b$a;
import a7c.b;
import io.reactivex.subjects.PublishSubject;
import qvb.q;
import qvb.a;
import h7c.a;
import com.yxcorp.gifshow.pymk.log.h;
import brd.t;
import g7c.a;
import java.lang.Number;
import java.lang.Integer;
import ok.h;
import org.json.JSONObject;
import a7c.d;
import f7c.a;

public class h	// class@000097
{
    public e a;
    public d b;
    public int c;
    public a d;
    public x e;
    public x f;
    public x g;
    public f h;
    public int i;
    public d j;
    public a k;
    public h l;
    public x m;
    public x n;
    public PublishSubject o;
    public boolean p;
    public g q;
    public boolean r;
    public t s;
    public b t;

    public void h(h$a p0){
       a uoa;
       d uod;
       f uof;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       this.b = p0.a;
       h$a b = p0.b;
       Objects.requireNonNull(b);
       Object[] objArray = null;
       e uoe = PatchProxy.apply(objArray, b, e$a.class, "4");
       if (uoe != patchProxyRe) {
       }else {
          uoe = new e(b);
       }
       this.a = uoe;
       this.g = p0.o;
       this.h = p0.p;
       this.e = p0.d;
       this.f = p0.e;
       b = p0.c;
       String str = "2";
       if (b == null) {
          h$a g = p0.g;
          h$a f = p0.f;
          Objects.requireNonNull(uoe);
          Object obj = PatchProxy.apply(objArray, uoe, e.class, str);
          boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): uoe.a.containsKey(12);
          uoa = new a(g, f, b1, p0.d);
       }
       h th = this.h;
       th.p = new e(uoa);
       th.q = this.b;
       this.c = p0.h;
       this.d = p0.i;
       this.i = p0.l;
       b = p0.m;
       if (b == null) {
          uod = new d();
       }
       this.j = uod;
       this.r = p0.r;
       if (p0.n == null) {
          h th1 = this.h;
          if (th1 != null && !TextUtils.isEmpty(th1.k2())) {
             uof = new f(this);
          label_00a0 :
             this.k = uof;
             this.q = new g();
             this.m = p0.k;
             b = p0.s;
             if (b != null) {
                Objects.requireNonNull(b);
                b uob = PatchProxy.apply(objArray, b, b$a.class, str);
                if (uob != patchProxyRe) {
                }else {
                   uob = new b(b);
                }
                this.t = uob;
             }
             this.l = p0.q;
             this.n = p0.t;
             this.p = p0.v;
             if (p0.u != null) {
                this.o = PublishSubject.g();
             }
             this.s = p0.j;
             h tj = this.j;
             Objects.requireNonNull(tj);
             if (!PatchProxy.applyVoidOneRefs(this, tj, d.class, "14")) {
                tj.b = this;
                uof = this.s();
                tj.c = uof;
                uof.h(tj);
                uoa = new a(tj.c.l2(), tj.b.t(), objArray);
                uoa.d(this.m);
                g og = this.v();
                h ts = this.s;
                h oh = PatchProxy.applyThreeRefs(uoa, og, ts, null, h.class, "1");
                if (oh != patchProxyRe) {
                }else {
                   oh = new h(uoa, og, true, ts);
                }
                tj.d = oh;
                oh.h = this.j();
                tj.d.r(tj.c.l2());
                tj.d.s(tj.c.m2(), tj.c.j2());
             }
             return;
          }
       }
       uof = p0.n;
       goto label_00a0 ;
    }
    public boolean a(){
       h obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = (obj != null && obj.b != null)? true: false;
       return b;
    }
    public boolean b(){
       h obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       boolean b = (obj == null)? false: obj.get().booleanValue();
       return b;
    }
    public boolean c(){
       h obj = PatchProxy.apply(null, this, h.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       boolean b = (obj != null && obj.get().booleanValue())? true: false;
       return b;
    }
    public boolean d(){
       boolean b1;
       b h;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, h.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = true;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, b.class, "3");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             h = obj.h;
             b1 = (h != null && h.get().booleanValue())? true: false;
          }
          if (b1) {
          label_0045 :
             return b;
          }
       }
       b = false;
       goto label_0045 ;
    }
    public boolean e(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, h.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = true;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, b.class, "1");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             b d = obj.d;
             b1 = (d != null && d.get().booleanValue())? true: false;
          }
          if (b1) {
          label_0045 :
             return b;
          }
       }
       b = false;
       goto label_0045 ;
    }
    public boolean f(){
       h obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = (obj != null && obj.a != null)? true: false;
       return b;
    }
    public boolean g(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, h.class, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = true;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, b.class, "7");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             b f = obj.f;
             b1 = (f != null && f.get().booleanValue())? true: false;
          }
          if (b1) {
          label_0045 :
             return b;
          }
       }
       b = false;
       goto label_0045 ;
    }
    public int h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, h.class, "13");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.t;
       int i = -1;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, b.class, "6");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
             b k = obj.k;
             if (k != null) {
                i = k.get().intValue();
             }
          }
       }
       return i;
    }
    public h i(){
       return this.l;
    }
    public a j(){
       return this.k;
    }
    public JSONObject k(){
       h obj = PatchProxy.apply(null, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj == null) {
          return null;
       }
       return obj.get();
    }
    public int l(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, h.class, "12");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.t;
       int i = -1;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, b.class, "5");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
             b j = obj.j;
             if (j != null) {
                i = j.get().intValue();
             }
          }
       }
       return i;
    }
    public int m(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, h.class, "11");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.t;
       int i = -1;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, b.class, "4");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
             b i1 = obj.i;
             if (i1 != null) {
                i = i1.get().intValue();
             }
          }
       }
       return i;
    }
    public PublishSubject n(){
       return this.o;
    }
    public d o(){
       return this.b;
    }
    public e p(){
       return this.a;
    }
    public int q(){
       return this.c;
    }
    public a r(){
       return this.d;
    }
    public f s(){
       return this.h;
    }
    public int t(){
       return this.i;
    }
    public d u(){
       return this.j;
    }
    public g v(){
       return this.q;
    }
    public int w(){
       h obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.t;
       b c = (obj != null)? obj.c: 0;
       return c;
    }
    public int x(){
       h obj = PatchProxy.apply(null, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.t;
       b g = (obj != null)? obj.g: 0;
       return g;
    }
    public boolean y(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, h.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = true;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, b.class, "2");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             b e = obj.e;
             b1 = (e != null && e.get().booleanValue())? true: false;
          }
          if (b1) {
          label_0045 :
             return b;
          }
       }
       b = false;
       goto label_0045 ;
    }
    public boolean z(){
       return this.r;
    }
}
