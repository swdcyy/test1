package j76.j;
import p97.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.kwailink.client.c0;
import p97.b;
import com.kwai.chat.sdk.signal.ClientUserInfo;
import com.yxcorp.utility.TextUtils;
import brd.t;
import rb7.c;
import p97.d;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Boolean;
import java.lang.Float;
import java.util.Objects;
import j76.l;
import j76.h;
import erd.r;
import j76.e;
import erd.o;
import java.lang.Long;
import j76.c;
import io.reactivex.g;
import j76.k;
import j76.d;
import j76.g;
import j76.f;
import j76.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import o75.e0;
import j76.b;
import i85.c;

public class j implements a	// class@0019b3
{
    public boolean a;

    public void j(){
       super();
       this.a = false;
    }
    public int H(){
       Object obj = PatchProxy.apply(null, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e().g().h();
    }
    public b a(){
       ClientUserInfo obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.e().c();
       return new b(TextUtils.k(obj.e()), TextUtils.k(obj.d()), TextUtils.k(obj.c()));
    }
    public t b(){
       Object obj = PatchProxy.apply(null, this, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.empty();
    }
    public void c(String p0){
    }
    public void d(int p0){
    }
    public String e(){
       return "";
    }
    public String f(){
       return null;
    }
    public t g(){
       Object obj = PatchProxy.apply(null, this, j.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.c.b(d.class);
    }
    public int getAppId(){
       Object obj = PatchProxy.apply(null, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e().b().a();
    }
    public String getCurrentUserId(){
       Object obj = PatchProxy.apply(null, this, j.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(f.e().c().e());
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, j.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.e().l();
    }
    public void i(float p0){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, j.class, "20")) {
          return;
       }
       Objects.requireNonNull(f.e().g());
       return;
    }
    public int j(){
       return 0;
    }
    public void k(boolean p0){
    }
    public long l(){
       Object obj = PatchProxy.apply(null, this, j.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return f.e().g().j();
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, j.class, "14")) {
          return;
       }
       f.e().g().s();
       return;
    }
    public t n(String p0,String[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.z();
       return c.c.b(l.class).filter(new h(p0, p1)).map(e.b);
    }
    public void o(){
    }
    public String p(){
       return "11.3.10.0";
    }
    public String q(){
       Object obj = PatchProxy.apply(null, this, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.e().g().g();
    }
    public t r(String p0,String p1,byte[] p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, j.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       long l = 0x2710;
       if (PatchProxy.isSupport(j.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Long.valueOf(l), this, j.class, "18");
          if (obj != patchProxyRe) {
          label_0042 :
             return obj;
          }
       }
       c uoc = new c(this, p0, p1, p2, 0x2710);
       obj = t.create(patchProxyRe);
       goto label_0042 ;
    }
    public void s(float p0){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, j.class, "19")) {
          return;
       }
       Objects.requireNonNull(f.e().g());
       return;
    }
    public long t(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return f.e().f();
    }
    public t u(String p0,String p1,byte[] p2,long p3){
       Object obj;
       if (PatchProxy.isSupport(j.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Long.valueOf(p3), this, j.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       c uoc = new c(this, p0, p1, p2, p3);
       return t.create(obj);
    }
    public t v(){
       Object obj = PatchProxy.apply(null, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.empty();
    }
    public t w(){
       Object obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.z();
       return c.c.b(k.class).map(d.b);
    }
    public t x(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.z();
       return c.c.b(l.class).filter(new g(p0, p1)).map(f.b);
    }
    public boolean y(){
       Object obj = PatchProxy.apply(null, this, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.e().l();
    }
    public final void z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "1")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       Objects.requireNonNull(f.e());
       KwaiSignalDispatcher.get(objArray).setPushPacketListener(a.a);
       String[] stringArray = new String[0];
       f.e().n(b.a, stringArray);
       this.a = true;
       return;
    }
}
