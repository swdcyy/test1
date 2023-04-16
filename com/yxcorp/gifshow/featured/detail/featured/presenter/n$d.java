package com.yxcorp.gifshow.featured.detail.featured.presenter.n$d;
import bx6.b;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import qea.u;
import com.yxcorp.gifshow.featured.detail.featured.poornet.b;
import com.kwai.library.slide.base.widget.a;
import wd5.f;
import com.kwai.library.slide.base.widget.d;
import g9a.a;
import jf5.a;
import android.view.ViewStub;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import rf5.u;
import bz6.b;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;

public class n$d implements b	// class@000f86
{
    public d a;
    public final n b;

    public void n$d(n p0){
       this.b = p0;
       super();
    }
    public Fragment b(){
       return this.b.x;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, n$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.a(-622777217).p();
    }
    public boolean d(){
       return true;
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, n$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-953099949).d();
    }
    public a getFooterLoadingLayout(){
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, this, n$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          obj = this.b.x;
          if (obj instanceof f) {
             objArray = obj.N8();
          }
          d uod = new d();
          this.a = uod;
          n$d tb = this.b;
          uod.j(new a(tb.v, tb.H, objArray, tb.y.R));
          obj = this.b.B;
          if (obj != null) {
             this.a.j = obj.Q;
          }
       }
       return this.a;
    }
}
