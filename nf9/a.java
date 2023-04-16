package nf9.a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickingServerMediaListener;
import oc9.d0;
import nf9.a$a;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import crd.b;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.base.d;
import ui9.j;
import com.yxcorp.gifshow.camerasdk.q;
import xi9.n;
import nf9.a$b;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.video.westeros.models.ServerMediaRequest;
import nf9.a$d;
import android.content.Intent;
import j4b.n;
import nf9.a$c;
import erd.g;

public final class a extends d0 implements FaceMagicController$FaceMagicPickingServerMediaListener	// class@003176
{
    public MagicEmoji$MagicFace o;
    public Map p;
    public static final a$a q;

    static {
       a.q = new a$a(null);
    }
    public void a(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.p = new LinkedHashMap();
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       Iterator iterator = this.p.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!uEntry.getValue().isDisposed()) {
             Object[] objArray = new Object[0];
             a.D().w("ServerSwapController", "cancel server request : "+uEntry.getKey(), objArray);
             uEntry.getValue().dispose();
          }
       }
       this.p.clear();
       return;
    }
    public final void h2(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       d th = this.h;
       if (th != null) {
          j oj = th.q();
          if (oj != null) {
             Object[] objArray = new Object[0];
             a.D().w("ServerSwapController", "updatePickedServerMediaStatus : "+p0+" , "+p1, objArray);
             oj.c0(p0, p1);
          }
       }
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "camera");
       super.nb(p0);
       p0.q().G(this);
       return;
    }
    public void onCancelServerTaskWithKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ServerSwapController", "onCancelServerTaskWithKey : "+p0, objArray);
       k1.o(new a$b(this, p0));
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       super.onDestroyView();
       d th = this.h;
       if (th != null) {
          j oj = th.q();
          if (oj != null) {
             oj.G(null);
          }
       }
       this.g2();
       return;
    }
    public void onReceivedServerMediaRequest(ServerMediaRequest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a uoa = a.D();
       StringBuilder str = "onReceivedServerMediaRequest : ";
       String key = (p0 != null)? p0.getKey(): null;
       Object[] objArray = new Object[0];
       uoa.w("ServerSwapController", str+key, objArray);
       k1.o(new a$d(this, p0));
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.l(n.class, new a$c(this));
       return;
    }
}
