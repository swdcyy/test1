package g79.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.albumwrapper.config.KwaiDefaultConfigProviderImpl;
import w69.m;
import com.yxcorp.utility.Log;
import android.app.Application;
import kotlin.jvm.internal.a;
import w69.c;
import com.kwai.robust.PatchProxyResult;
import w69.l;
import w69.y0;
import w69.r0;
import w69.x;
import w69.b0;
import w69.m0;
import w69.p0;
import w69.q0;
import gc7.b;
import com.kwai.library.widget.popup.common.e$b;
import com.kwai.library.widget.popup.common.a;
import com.kwai.library.widget.popup.common.PopupInterface$i;
import com.kwai.library.widget.popup.common.e;
import e17.i$b;
import gc7.a;
import e17.i$e;
import e17.i;

public final class a	// class@002426
{
    public static Application a;
    public static c b;
    public static final a c;

    static {
       a.c = new a();
    }
    public void a(){
       super();
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       if (this.l()) {
          return;
       }
       try{
          Object obj = KwaiDefaultConfigProviderImpl.class.newInstance();
          if (obj instanceof m) {
             objArray = obj;
          }
          if (objArray != null) {
             Log.d("AlbumSdkInner", "ensureKwaiInit");
             Application context = objArray.getContext();
             a.h(context, "it.context");
             c configuratio = objArray.getConfiguration();
             a.h(configuratio, "it.configuration");
             a.c.k(context, configuratio);
          }
          return;
       }catch(java.lang.ClassNotFoundException e0){
       }
    }
    public final Application b(){
       Application obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       obj = a.a;
       if (obj == null) {
          a.S("mApplication");
       }
       return obj;
    }
    public final l c(){
       c obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       obj = a.b;
       if (obj == null) {
          a.S("mConfiguration");
       }
       return obj.d;
    }
    public final y0 d(){
       c obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       obj = a.b;
       if (obj == null) {
          a.S("mConfiguration");
       }
       return obj.f;
    }
    public final r0 e(){
       c obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       obj = a.b;
       if (obj == null) {
          a.S("mConfiguration");
       }
       return obj.b;
    }
    public final x f(){
       c obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       obj = a.b;
       if (obj == null) {
          a.S("mConfiguration");
       }
       return obj.a;
    }
    public final b0 g(){
       c obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       obj = a.b;
       if (obj == null) {
          a.S("mConfiguration");
       }
       return obj.j;
    }
    public final m0 h(){
       c obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       obj = a.b;
       if (obj == null) {
          a.S("mConfiguration");
       }
       return obj.h;
    }
    public final p0 i(){
       c obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       obj = a.b;
       if (obj == null) {
          a.S("mConfiguration");
       }
       return obj.c;
    }
    public final q0 j(){
       c obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       obj = a.b;
       if (obj == null) {
          a.S("mConfiguration");
       }
       return obj.l;
    }
    public final void k(Application p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.q(p0, "application");
       a.q(p1, "configuration");
       if (this.l()) {
          return;
       }
       a.b = p1;
       a.a = p0;
       if (p1.k == null && !PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          e$b uob = new e$b();
          uob.a(new a());
          e.f(p0, uob);
          i$b uob1 = new i$b();
          uob1.A(a.a);
          i.r(uob1);
       }
       return;
    }
    public final boolean l(){
       boolean b = (a.a != null)? true: false;
       return b;
    }
}
