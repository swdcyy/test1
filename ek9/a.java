package ek9.a;
import ek9.a$b;
import nsd.u;
import java.lang.Object;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.QComment;
import java.util.Objects;
import ek9.a$a;
import kotlin.jvm.internal.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class a	// class@00216d
{
    public String a;
    public EmotionInfo b;
    public QMedia c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public e$c l;
    public QComment m;
    public QComment n;
    public QPhoto o;
    public boolean p;
    public boolean q;
    public static final a$b r;

    static {
       a.r = new a$b(null);
    }
    public void a(){
       super();
       this.a = "";
       this.p = true;
    }
    public void a(u p0){
       super();
       this.a = "";
       this.p = true;
    }
    public static final a a(l p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.r.a(p0);
    }
    public static final a b(QComment p0,l p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$b obj = PatchProxy.applyTwoRefs(p0, null, null, a.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.r;
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.applyTwoRefs(p0, null, obj, a$b.class, "2");
       if (uoa != patchProxyRe) {
       }else {
          a$a uoa1 = new a$a();
          uoa1.l(p0);
          uoa = uoa1.a();
       }
       return uoa;
    }
    public static final a c(a p0,l p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$b obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.r;
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.applyTwoRefs(p0, p1, obj, a$b.class, "4");
       if (uoa != patchProxyRe) {
       }else {
          a.p(p0, "raw");
          a$a uoa1 = new a$a();
          if (!PatchProxy.applyVoidOneRefs(p0, uoa1, a$a.class, "4")) {
             uoa1.a.n = p0.e();
             uoa1.a.a = p0.o();
             uoa1.a.b = p0.f();
             uoa1.a.c = p0.i();
             uoa1.a.d = p0.r();
             uoa1.a.e = p0.l();
             uoa1.a.g = p0.l();
             uoa1.a.h = p0.t();
             uoa1.a.i = p0.s();
             uoa1.a.j = p0.u();
             uoa1.a.k = p0.q();
             uoa1.a.l = p0.g();
             uoa1.a.m = p0.j();
             uoa1.a.n = p0.e();
             uoa1.a.o = p0.h();
             uoa1.a.p = p0.m();
             uoa1.a.q = p0.p();
          }
          p1.invoke(uoa1);
          uoa = uoa1.a();
       }
       return uoa;
    }
    public static final a d(QPhoto p0,l p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.r.b(p0, p1);
    }
    public final QComment e(){
       return this.n;
    }
    public final EmotionInfo f(){
       return this.b;
    }
    public final e$c g(){
       return this.l;
    }
    public final QPhoto h(){
       return this.o;
    }
    public final QMedia i(){
       return this.c;
    }
    public final QComment j(){
       return this.m;
    }
    public final String k(){
       return this.f;
    }
    public final String l(){
       return this.e;
    }
    public final boolean m(){
       return this.p;
    }
    public final String n(){
       return this.g;
    }
    public final String o(){
       return this.a;
    }
    public final boolean p(){
       return this.q;
    }
    public final boolean q(){
       return this.k;
    }
    public final boolean r(){
       return this.d;
    }
    public final boolean s(){
       return this.i;
    }
    public final boolean t(){
       return this.h;
    }
    public final boolean u(){
       return this.j;
    }
    public final boolean v(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.n != null) {
          return b;
       }
       if (!TextUtils.isEmpty(this.a) || (this.b == null && this.c == null)) {
          b = false;
       }
    label_002c :
       return b;
    }
}
