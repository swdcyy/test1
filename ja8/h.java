package ja8.h;
import na8.a;
import ma8.i;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ja8.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import ja8.f;
import java.lang.StringBuilder;
import ja8.g;
import com.mini.js.commonapitracer.b;
import com.mini.js.commonapitracer.d;

public class h extends a	// class@00230a
{
    public final Map d;
    public final Map e;
    public boolean f;

    public void h(i p0){
       super(p0);
       this.d = new ConcurrentHashMap();
       this.e = new ConcurrentHashMap();
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       if (this.f != null) {
          this.hashCode();
          return;
       }else {
          this.F();
          this.f = true;
          return;
       }
    }
    public d C(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0) || TextUtils.isEmpty(p1)) {
          return null;
       }
       this.B();
       return this.d.get(this.E(p0, p1));
    }
    public f D(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0) || TextUtils.isEmpty(p1)) {
          return null;
       }
       this.B();
       return this.e.get(this.E(p0, p1));
    }
    public final String E(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"."+p1;
    }
    public void F(){
    }
    public void G(String p0,String p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "2")) {
          return;
       }
       if (TextUtils.isEmpty(p0) || (!TextUtils.isEmpty(p1) && p2 != null)) {
          this.d.put(this.E(p0, p1), p2);
       }
    label_0027 :
       return;
    }
    public void H(String p0,String p1,f p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "3")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          this.e.put(this.E(p0, p1), p2);
       }
       return;
    }
    public void I(String p0,String p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "10")) {
          return;
       }
       g og = PatchProxy.applyOneRefs(p2, this, h.class, "11");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(this, p2);
       }
       this.G(p0, p1, og);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, h.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NativeApiRegistry{mApiMap="+this.d+", mApiSyncMap="+this.e+'}';
    }
    public b z(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, "KS", "invoke");
    }
}
