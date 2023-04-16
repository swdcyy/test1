package com.kuaishou.live.ad.fanstop.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pl0.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import fq5.b;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCTopBannerNotice;
import lf3.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import sr5.b;

public class e extends PresenterV2	// class@0009a0
{
    public b p;
    public BaseFragment q;
    public b r;
    public final g s;

    public void e(){
       super();
       this.s = new o(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.p.u().u0(531, LiveCommonNoticeMessages$SCTopBannerNotice.class, this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.p.u().o(531, this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.r8("LIVE_FRAGMENT");
       this.r = this.r8("LIVE_PUSH_CALLER_CONTEXT");
       return;
    }
}
