package cqb.c;
import bf5.e;
import i0a.x;
import android.app.Activity;
import androidx.fragment.app.c;
import k2b.e0;
import sy6.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import java.lang.Object;
import com.yxcorp.gifshow.music.radio.MusicRadioActivity;
import aqb.a;
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
import cqb.f;
import java.util.Map;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gqb.j;
import gqb.r;
import gqb.k;
import gqb.p;
import gqb.b;

public class c extends e	// class@00236d
{
    public a m;

    public void c(x p0,Activity p1,c p2,e0 p3,a p4,MilanoContainerEventBus p5,e p6,b p7,g p8,f p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       if (p1 instanceof MusicRadioActivity) {
          this.m = p1.x3();
       }
       return;
    }
    public c a(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.x = a1.p(0x7f103756);
       return obj;
    }
    public View b(Context p0){
       return null;
    }
    public a0 e(){
       return null;
    }
    public d f(ViewGroup p0){
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(c.class, new f());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public View i(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, 0x7f0d101c);
    }
    public void j(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       p0.U7(new j());
       p0.U7(new r());
       p0.U7(new k());
       p0.U7(new p());
       p0.U7(new b());
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
