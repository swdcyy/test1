package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import bk2.e;
import xg2.e;
import bk2.e$a;
import vg2.b;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$d;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import z8c.e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$a;
import android.view.View$OnClickListener;
import java.lang.Number;
import java.util.Map;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.live.core.show.conditionredpacket.logger.SourceType;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import h62.d;
import java.util.Objects;
import xg2.a;
import crd.b;
import lnc.b9;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import p91.m;
import zg2.g;
import y8c.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$b;
import qvb.i;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$c;

public class LiveFellowRedPacketPanelFragment extends RecyclerFragment implements d	// class@000ea7
{
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public m J;
    public int K;
    public String L;
    public boolean M;
    public boolean N;
    public int O;
    public a P;
    public boolean Q;
    public boolean R;
    public LiveFellowRedPacketPanelFragment$g S;
    public g T;
    public e U;
    public b V;

    public void LiveFellowRedPacketPanelFragment(){
       super();
       this.K = -1;
       this.O = 0;
       this.U = new e(new e(this));
       this.V = b.a();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketPanelFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFellowRedPacketPanelFragment$d(this, this);
    }
    public boolean S0(){
       return false;
    }
    public boolean S1(){
       return false;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketPanelFragment.class, "4")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a1ca3);
       this.G = m1.f(p0, 0x7f0a11b1);
       this.H = m1.f(p0, 0x7f0a36ba);
       int i = 0x7f0a0e46;
       this.I = m1.f(p0, i);
       this.h0().addItemDecoration(new e(1, a1.e(10.00f), false));
       m1.a(p0, new LiveFellowRedPacketPanelFragment$a(this), i);
       if (this.N != null) {
          this.I.setVisibility(8);
       }
       return;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketPanelFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.V.a;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFellowRedPacketPanelFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveFellowRedPacketPanelFragment.class, null);
       return objectsByTag;
    }
    public void jh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFellowRedPacketPanelFragment.class, "14")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveFellowRedPacketPanelFragment.class, "5")) {
          d.f(LiveRedPacketAction.RED_PACK_SEND_BUTTON_SHOW, SourceType.AUDIENCE_BUTTON_SOURCE_TYPE, RedPacketType.RED_PACKET_TYPE_ACTIVITY, 0);
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFellowRedPacketPanelFragment.class, "2")) {
          return;
       }
       super.onDestroyView();
       LiveFellowRedPacketPanelFragment tP = this.P;
       if (tP != null) {
          Objects.requireNonNull(tP);
          if (!PatchProxy.applyVoid(objArray, tP, a.class, "3")) {
             b9.a(tP.a);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFellowRedPacketPanelFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFellowRedPacketPanelFragment.class, "3") || (this.N != null || (!this.J.e() && this.Q != null))) {
          this.P = new a(this.J, p0, this.T);
       }
    label_0038 :
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketPanelFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFellowRedPacketPanelFragment$b(this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveFellowRedPacketPanelFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFellowRedPacketPanelFragment$c(this);
    }
}
