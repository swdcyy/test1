package brb.e;
import im8.g;
import com.kwai.kcube.decorator.IContainerDecorator;
import arb.a;
import brb.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crb.a;
import wq6.f;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import com.yxcorp.gifshow.homepage.kcube.presenter.d;
import crb.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pr6.d;
import gsa.k0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.g;
import android.view.ViewGroup;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import br6.a;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.kwai.kcube.ext.MvpDecoratorViewHolder;
import brb.b;
import brb.d;
import z1.a;
import msd.a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import brb.i;
import java.util.Map;
import java.util.HashMap;

public class e extends IContainerDecorator implements g	// class@00043d
{
    public final a h;
    public d i;
    public final g j;

    public void e(){
       super();
       this.h = new a();
       this.j = new c(this);
    }
    public static void i(e p0,PresenterV2 p1){
       p0.j(p1);
    }
    private void j(PresenterV2 p0){
       p0.U7(new a(this.c(), c.a(this.b())));
       p0.U7(new d(this.c()));
       p0.U7(new d());
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.i = this.e();
       this.h.d = new k0(this);
       this.b().k3(this.j);
       return;
    }
    public List g(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       a[] obj = PatchProxy.applyOneRefs(p0, this, uoe, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new a[1];
       MvpDecoratorViewHolder mvpDecorator = PatchProxy.applyOneRefs(p0, this, uoe, "3");
       if (mvpDecorator != patchProxyRe) {
       }else {
          mvpDecorator = new MvpDecoratorViewHolder(a.a(p0.getContext(), 0x7f0d06cc), 0, new b(this), new d(this));
       }
       obj[0] = mvpDecorator;
       return Lists.e(obj);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new i());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.b().t3(this.j);
       return;
    }
}
