package ce0.c;
import vt5.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import vt5.a;
import au5.b;
import android.app.Activity;
import kotlin.jvm.internal.a;
import wt5.d;
import st5.b;
import yt5.f;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.pendant.task.PhotoDetailTaskManagerWrapperV2;
import st5.a;
import tkd.b;
import tkd.d;
import yt5.j;
import java.util.Set;
import yt5.c;
import com.kwai.framework.init.a;
import com.kuaishou.growth.pendant.core.PendantInitModule;
import yt5.b;

public class c implements e	// class@0004a0
{

    public void c(){
       super();
    }
    public void H1(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "12")) {
          return;
       }
       b.a().H1(p0, p1);
       return;
    }
    public void Qr(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       a.p(p0, "activity");
       b.d().i(p0);
       return;
    }
    public void bQ(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       a.p(p0, "activity");
       b.d().g(p0);
       return;
    }
    public void fx(Activity p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "6")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "reason");
       b.d().b(p0, p1.a());
       return;
    }
    public void ha(Activity p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "reason");
       b.d().c(p0, p1.a());
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public f j(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhotoDetailTaskManagerWrapperV2();
    }
    public void j40(Activity p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "reason");
       this.ha(p0, p1);
       a.a(p0, p1, true);
       d.a(-1573231572).B3(p0, p1.a());
       return;
    }
    public void m7(Activity p0,Set p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "7")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "reasons");
       b.d().h(p0, p1);
       return;
    }
    public c mq(){
       Object obj = PatchProxy.apply(null, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a().i2();
    }
    public a pP(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PendantInitModule();
    }
    public b u00(){
       Object obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a().Z2();
    }
    public void zb(Activity p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "reason");
       this.fx(p0, p1);
       a.a(p0, p1, false);
       d.a(-1573231572).P0(p0, p1.a());
       return;
    }
}
