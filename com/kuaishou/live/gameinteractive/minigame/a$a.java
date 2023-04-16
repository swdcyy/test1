package com.kuaishou.live.gameinteractive.minigame.a$a;
import com.kuaishou.live.gameinteractive.minigame.a;
import android.view.View$OnClickListener;
import a71.c;
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
import k43.c;
import x61.c;
import lp3.c;
import lp3.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.m;
import nl8.l;
import nl8.o;

public class a$a implements a	// class@001bdb
{
    public e a;
    public final e b;
    public final MutableLiveData c;

    public void a$a(View$OnClickListener p0,c p1){
       super();
       this.c = new MutableLiveData();
       e uoe = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 4006;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mShouldReportLogWithBottomBar = false;
          uoe.mIconRes = 0x7f0812ca;
          uoe.mTextRes = 0x7f10279d;
          uoe.mShowCallback = p1;
          uoe.mClickCallback = new c(p0);
       }
       this.b = uoe;
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "4")) {
          return;
       }
       this.a.a(c.class).O0(4006);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "3")) {
          return;
       }
       this.c.setValue(this.b);
       this.a.a(c.class).v1(this.c);
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.a = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
    public void setVisible(boolean p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       this.b.mIsVisible = Boolean.valueOf(p0);
       this.c.setValue(this.b);
       return;
    }
}
