package com.kuaishou.live.core.show.conditionredpacket.grab.base.l;
import b62.j0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.View;
import android.widget.LinearLayout;
import u52.t;
import j62.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import i62.t$c;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView;
import p91.m;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.m;
import lnc.a1;
import java.lang.CharSequence;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.l$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketRollUserDialogFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class l extends j0	// class@000a91
{
    public LiveConditionRedPacketRollUserDialogFragment$a M;
    public static String sLivePresenterClassName = "LiveConditionRedPacketRollUsersLayoutPresenter";

    public void l(){
       super();
    }
    public void E8(){
       int i;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, ol, "4")) {
          if (!PatchProxy.applyVoid(objArray, this, ol, "6")) {
             i = 8;
             this.t.setVisibility(i);
             this.u.setVisibility(i);
             this.x.setVisibility(i);
             this.C.setVisibility(i);
          }
          i = 0;
          this.w.setVisibility(i);
          this.s.setVisibility(i);
          if (!PatchProxy.applyVoid(objArray, this, ol, "5")) {
             j0 tq1 = this.q;
             m.a(this.s, this.r, this.p.c.l(tq1.a, tq1.b), this.q.a);
          }
          this.w.setText(a1.p(R.string.arg_RES_7f1025ed));
       }
       j0 tq = this.q;
       b.d0(LiveLogTag.LIVE_CONDITION_RED_PACKET, "show roll dialog", "redPackId", tq.b, "redPackType", Integer.valueOf(tq.a));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       super.doBindView(p0);
       this.D.setOnClickListener(new l$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       super.j8();
       this.M = this.q8(LiveConditionRedPacketRollUserDialogFragment$a.class);
       return;
    }
}
