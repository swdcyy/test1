package com.kuaishou.live.redpacket.core.condition.view.LiveRedPacketContainerItemBaseFragmentV2;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import java.lang.String;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import om3.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import eo3.w;
import eo3.g;
import eo3.b0;
import java.lang.Number;
import java.lang.Boolean;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import mrd.c;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment$a;
import brd.y;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kuaishou.live.redpacket.core.condition.view.RedPacketContainerV2FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.kuaishou.live.redpacket.core.condition.view.LiveRedPacketContainerItemBaseFragmentV2$a;
import android.view.ViewParent;
import com.trello.rxlifecycle3.components.support.RxFragment;

public class LiveRedPacketContainerItemBaseFragmentV2 extends LiveRedPacketContainerItemBaseFragment	// class@000ecb
{
    public g m;
    public a n;
    public LiveRedPacketContainerItemBaseFragmentV2$a o;
    public RedPacketContainerV2FrameLayout p;
    public static final int q;

    public void LiveRedPacketContainerItemBaseFragmentV2(String p0){
       super(p0);
    }
    public e0 dh(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketContainerItemBaseFragmentV2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.i();
    }
    public ClientContent$LiveStreamPackage eh(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketContainerItemBaseFragmentV2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.a();
    }
    public ClientContent$LiveVoicePartyPackageV2 fh(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketContainerItemBaseFragmentV2.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.B();
    }
    public String hh(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketContainerItemBaseFragmentV2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getContext().h().a();
    }
    public int jh(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketContainerItemBaseFragmentV2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.m.getContext().h().b();
    }
    public long kh(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketContainerItemBaseFragmentV2.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.m.getContext().f;
    }
    public void lh(boolean p0){
       if (PatchProxy.isSupport(LiveRedPacketContainerItemBaseFragmentV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveRedPacketContainerItemBaseFragmentV2.class, "3")) {
          return;
       }
       super.lh(p0);
       if (!p0) {
          return;
       }
       f uof = this.m.getContext().c();
       if (uof instanceof RedPacketConditionRedPackInfoWrapper) {
          uof.b().onNext(LiveRedPacketContainerItemBaseFragment$a.a);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveRedPacketContainerItemBaseFragmentV2.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (this.p == null) {
          RedPacketContainerV2FrameLayout redPacketCon = new RedPacketContainerV2FrameLayout(p0.getContext());
          this.p = redPacketCon;
          redPacketCon.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
          View view = this.o.a(this.j);
          ViewParent parent = view.getParent();
          if (parent instanceof ViewGroup) {
             parent.removeView(view);
          }
          this.p.addView(view);
       }
       return this.p;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerItemBaseFragmentV2.class, "5")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerItemBaseFragmentV2.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.p.removeView(this.o.a(this.j));
       return;
    }
}
