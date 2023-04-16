package com.kwai.live.gzone.accompanyplay.anchor.l$a;
import com.kwai.live.gzone.accompanyplay.anchor.l;
import android.view.View$OnClickListener;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z61.e;
import z61.b;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import h37.e;
import h37.d;
import x61.c;
import lp3.c;
import lp3.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.m;
import nl8.l;
import nl8.o;
import fq5.b;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge;

public class l$a implements l	// class@000b23
{
    public e a;
    public b b;
    public final e c;
    public final MutableLiveData d;

    public void l$a(View$OnClickListener p0){
       super();
       this.d = new MutableLiveData();
       e uoe = PatchProxy.applyOneRefs(p0, this, l$a.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 4005;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mIconRes = 0x7f0812bb;
          uoe.mTextRes = 0x7f102352;
          uoe.mShowCallback = new e(this);
          uoe.mClickCallback = new d(p0);
       }
       this.c = uoe;
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "7")) {
          return;
       }
       this.a.a(c.class).O0(4005);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "6")) {
          return;
       }
       this.d.setValue(this.c);
       this.a.a(c.class).v1(this.d);
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "5")) {
          return;
       }
       this.a = p0.f("LIVE_SERVICE_MANAGER");
       this.b = p0.f("LIVE_BASIC_CONTEXT");
       return;
    }
    public boolean isVisible(){
       b uob = PatchProxy.apply(null, this, l$a.class, "4");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = this.c.mIsVisible;
       }
       return uob.booleanValue();
    }
    public void k(boolean p0){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       p0.mBadge = (p0)? new LiveBottomBarItemBadge(): null;
       this.d.setValue(this.c);
       return;
    }
    public void setVisible(boolean p0){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.c.mIsVisible = Boolean.valueOf(p0);
       this.d.setValue(this.c);
       return;
    }
}
