package f3b.v;
import java.lang.Object;
import java.lang.String;
import com.google.common.collect.ImmutableList;
import y2b.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f3b.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.AbstractCollection;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import java.lang.Boolean;

public abstract class v	// class@002893
{

    public void v(){
       super();
    }
    public static v a(String p0,ImmutableList p1,b p2,ImmutableList p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(p0, p1, p2, p3);
    }
    public static v h(v p0,v p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, v.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return p1;
       }
       if (p1 == null) {
          return p0;
       }
       obj = (p1.d())? p1.g(): p0.g();
       ImmutableList immutableLis = (p1.c())? p1.b(): p0.b();
       b uob = p1.i();
       ImmutableList immutableLis1 = (p1.f())? p1.j(): p0.j();
       if (TextUtils.isEmpty(obj) && (immutableLis == null || (immutableLis.isEmpty() && (uob == null || (uob.c() == null && (immutableLis1 == null || immutableLis1.isEmpty())))))) {
          return null;
       }else {
          return v.a(obj, immutableLis, uob, immutableLis1);
       }
    }
    public abstract ImmutableList b();
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, v.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b() != null && !this.b().isEmpty())? true: false;
       return b;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, v.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.g()) ^ 0x01);
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, v.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.i() != null)? true: false;
       return b;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, v.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.j() != null && !this.j().isEmpty())? true: false;
       return b;
    }
    public abstract String g();
    public abstract b i();
    public abstract ImmutableList j();
}
