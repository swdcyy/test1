package com.kuaishou.live.ad.social.u;
import nl8.m;
import java.lang.Runnable;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.ad.social.v;
import java.util.ArrayList;
import z61.b;
import java.lang.Boolean;
import zl0.k1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import com.kwai.robust.PatchProxyResult;
import am0.f;
import java.util.List;
import android.view.View;
import com.kuaishou.live.bottombar.component.widget.d;
import com.kuaishou.live.ad.social.w;
import com.kuaishou.live.ad.social.y;
import java.util.Iterator;

public class u implements m	// class@000a25
{
    public e a;
    public final MutableLiveData b;
    public final v c;
    public final List d;

    public void u(Runnable p0){
       super();
       this.b = new MutableLiveData();
       v ov = new v();
       this.c = ov;
       this.d = new ArrayList();
       ov.mFeatureId = 1016;
       ov.mIsVisible = Boolean.FALSE;
       ov.mShouldReportLogWithBottomBar = false;
       ov.mTextRes = 0x7f103ffb;
       ov.mClickCallback = new k1(p0);
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "4")) {
          return;
       }
       this.a = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
    public boolean isVisible(){
       b uob = PatchProxy.apply(null, this, u.class, "8");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = this.c.mIsVisible;
       }
       return uob.booleanValue();
    }
    public void l(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "10")) {
          return;
       }
       this.d.add(p0);
       return;
    }
    public View m(){
       Object obj = PatchProxy.apply(null, this, u.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a.f();
    }
    public boolean n(){
       Object obj = PatchProxy.apply(null, this, u.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.a.k.b();
    }
    public void o(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "11")) {
          return;
       }
       this.d.remove(p0);
       return;
    }
    public void setVisible(boolean p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou, "1")) {
          return;
       }
       this.c.mIsVisible = Boolean.valueOf(p0);
       this.b.setValue(this.c);
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
}
