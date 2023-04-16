package com.yxcorp.gifshow.profile.status.panel.StatusPanelListTipsHelper;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListTipsHelper$mNoMoreView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListTipsHelper$mPanelEmptyView$2;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListTipsHelper$mErrorView$2;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import g9c.d;
import mkc.b;

public final class StatusPanelListTipsHelper extends f	// class@0015bc
{
    public final p l;
    public final p m;
    public final p n;
    public final QPhoto o;
    public final int p;

    public void StatusPanelListTipsHelper(RecyclerFragment p0,QPhoto p1,int p2){
       a.p(p0, "fragment");
       a.p(p1, "mPhoto");
       super(p0);
       this.o = p1;
       this.p = p2;
       this.l = s.c(new StatusPanelListTipsHelper$mNoMoreView$2(this));
       this.m = s.c(new StatusPanelListTipsHelper$mPanelEmptyView$2(this));
       this.n = s.c(new StatusPanelListTipsHelper$mErrorView$2(this));
    }
    public View J0(){
       Object obj = PatchProxy.apply(null, this, StatusPanelListTipsHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a().a(this.w());
       return this.w();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, StatusPanelListTipsHelper.class, "5")) {
          return;
       }
       if (this.v() != null) {
          f tg = this.g;
          a.o(tg, "mFragment");
          tg.ia().l1(this.v());
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, StatusPanelListTipsHelper.class, "4")) {
          return;
       }
       f tg = this.g;
       a.o(tg, "mFragment");
       tg.ia().L0(this.v());
       return;
    }
    public b r(){
       b obj = PatchProxy.apply(null, this, StatusPanelListTipsHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.f;
       a.o(obj, "TipsType.LOADING_DARK_COMPAT_GRAY");
       return obj;
    }
    public final View v(){
       Object obj = PatchProxy.apply(null, this, StatusPanelListTipsHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public final View w(){
       Object obj = PatchProxy.apply(null, this, StatusPanelListTipsHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
}
