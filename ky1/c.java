package ky1.c;
import hy1.d;
import java.lang.Object;
import ky1.b;
import hy1.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import my1.e;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ly1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.google.gson.JsonObject;
import iy1.l;
import com.google.gson.JsonElement;
import k2b.u1;
import hy1.c;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Math;
import ky1.a;

public abstract class c implements d	// class@002e23
{
    public x a;

    public void c(){
       super();
       this.a = b.b;
    }
    public final boolean a(e p0){
       String str = "1";
       ClientContent$LiveStreamPackage obj = PatchProxy.applyOneRefs(p0, this, c.class, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.h(p0)) {
          return false;
       }
       if (this.g()) {
          p0 = p0.d.a;
          obj = this.a.get();
          if (!PatchProxy.applyVoidTwoRefs(p0, obj, null, a.class, str)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "STRENGTHEN_NOTICE_BANNER";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("biz_id", p0.b());
             uElementPack.params = jsonObject.toString();
             uContentPack.liveStreamPackage = obj;
             u1.u0(9, uElementPack, uContentPack);
          }
       }
       return true;
    }
    public void b(e p0){
       c.a(this, p0);
    }
    public ViewGroup c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.findViewById(0x7f0a2692);
    }
    public final void d(e p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       k1.n(this);
       k1.s(p1, this, Math.max(0, p0.b()));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       k1.n(this);
       return;
    }
    public void f(x p0){
       this.a = p0;
    }
    public boolean g(){
       return (this instanceof a ^ 0x01);
    }
    public abstract boolean h(e p0);
    public boolean i(e p0){
       return false;
    }
}
