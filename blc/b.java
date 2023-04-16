package blc.b;
import bf5.e;
import tkc.l;
import android.app.Activity;
import androidx.fragment.app.c;
import k2b.e0;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import java.lang.Object;
import sy6.a;
import c95.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.content.Context;
import android.view.View;
import brd.a0;
import android.view.ViewGroup;
import bf5.d;
import tkd.b;
import tkd.d;
import ff5.a;
import brd.t;
import blc.a;
import erd.g;
import crd.b;
import blc.e;
import java.util.Map;
import lnc.b9;
import syb.c;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b extends e	// class@000494
{
    public b m;
    public e n;
    public boolean o;
    public d p;
    public b q;

    public void b(l p0,Activity p1,c p2,e0 p3,SlidePlayViewModel p4,MilanoContainerEventBus p5,e p6,b p7,g p8,f p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       this.n = p0.c;
       this.o = p0.a;
    }
    public c a(){
       c obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.e = false;
       obj.s = true;
       obj.k = true;
       obj.g = false;
       obj.t = false;
       obj.r = a1.d(0x7f070bf1);
       return obj;
    }
    public View b(Context p0){
       return null;
    }
    public a0 e(){
       return null;
    }
    public d f(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d uod = d.a(0x19cfac13).W60(p0);
       this.p = uod;
       return uod;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.m = this.k.m().subscribe(new a(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b9.a(this.m);
       b9.a(this.q);
       return;
    }
    public View i(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, d.a(-503129207).Vx());
    }
    public void j(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "3")) {
          return;
       }
       p0.U7(d.a(-503129207).sb(this.o, this.d.b));
       PatchProxy.onMethodExit(b.class, "3");
       return;
    }
}
