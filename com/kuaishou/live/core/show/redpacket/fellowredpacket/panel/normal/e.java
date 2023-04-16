package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.e;
import k51.c;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import java.lang.CharSequence;
import android.widget.TextView;
import xg2.d;
import java.util.List;
import z12.a0;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.widget.LiveFellowRedPacketGiftRecyclerView;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$e;
import im8.f;
import java.lang.Integer;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import l12.d;
import va1.f0;
import n17.a;

public class e extends c	// class@000ead
{
    public final int p;
    public f q;
    public LiveGiftPackage r;
    public a s;
    public LiveFellowRedPacketPanelFragment$e t;
    public KwaiImageView u;
    public TextView v;
    public TextView w;
    public LiveFellowRedPacketGiftRecyclerView x;
    public final View$OnClickListener y;
    public static String sLivePresenterClassName = "LiveFellowRedPacketListItemPresenter";

    public void e(int p0){
       super();
       this.y = new e$a(this);
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.v.setText(String.valueOf(this.r.mTotalKsCoin));
       this.w.setText(String.valueOf(this.r.getTotalGiftCount()));
       this.x.y(this.r.mGiftInfos, new d(this));
       this.x.setLayoutResId(this.p);
       View view = this.m8();
       e tt = this.t;
       boolean b = (tt != null && tt.a() == this.q.get().intValue())? true: false;
       view.setSelected(b);
       return;
    }
    public void J8(){
       this.s = null;
       this.t = null;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a205c);
       this.v = m1.f(p0, 0x7f0a205d);
       this.w = m1.f(p0, 0x7f0a1d80);
       this.x = m1.f(p0, 0x7f0a1d66);
       this.m8().setOnClickListener(this.y);
       f0.a(this.u, LiveRedPacketResourcePathConstant.LIVE_FELLOW_REDPACK_KCOIN_ICON);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.x8("ADAPTER_POSITION");
       this.r = this.q8(LiveGiftPackage.class);
       this.s = this.s8(a.class);
       this.t = this.s8(LiveFellowRedPacketPanelFragment$e.class);
       return;
    }
}
