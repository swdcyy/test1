package com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment$c;
import qvb.f;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n53.c;
import n53.b;
import r53.a;
import fq5.b;
import cjd.e;
import erd.o;
import java.util.List;
import com.kwai.live.gzone.kshell.bean.LiveGzoneKShellRankResponse;
import la6.b;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.gzone.treasurebox.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import im8.c;
import java.util.Collection;
import ekd.q;
import android.content.Context;
import i2b.a;
import android.widget.TextView;
import com.kwai.live.gzone.kshell.bean.LiveGzoneKShellRankResponse$BottomInfo;
import java.lang.CharSequence;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;

public class LiveGzoneKShellRankListFragment$c extends f	// class@001c4d
{
    public final LiveGzoneKShellRankListFragment p;

    public void LiveGzoneKShellRankListFragment$c(LiveGzoneKShellRankListFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneKShellRankListFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().b(this.p.F.a.getLiveStreamId()).map(new e());
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(LiveGzoneKShellRankResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneKShellRankListFragment$c.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       if (this.p.getView() == null) {
          return;
       }
       LiveGzoneKShellRankListFragment$c tp = this.p;
       if (tp.G == null) {
          tp.G = new c();
          tp = this.p;
          tp.G.f(tp.getView());
       }
       tp = this.p;
       Object[] objArray = new Object[]{tp.F,tp.I,p0,new c("rankListService", tp.K)};
       tp.G.i(objArray);
       if (!q.f(p1)) {
          tp = this.p;
          if (tp.J == null) {
             tp.J = a.a(tp.getView().getContext(), 0x7f0d0bcc);
             if (p0.mBottomInfo != null && p1.size() >= 100) {
                this.p.J.setText(p0.mBottomInfo.mBoardBottomSign);
             }
             this.p.ia().M0(this.p.J, new ViewGroup$LayoutParams(-1, a1.e(52.00f)));
          }
       }
       return;
    }
}
