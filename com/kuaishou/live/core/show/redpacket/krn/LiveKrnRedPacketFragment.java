package com.kuaishou.live.core.show.redpacket.krn.LiveKrnRedPacketFragment;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import java.lang.String;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import java.lang.Number;
import com.kuaishou.live.core.show.redpacket.krn.a;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import crd.b;
import lnc.b9;
import w81.c;
import w81.b;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.redpacket.krn.b;
import com.kuaishou.live.core.show.redpacket.krn.c;
import erd.g;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import ch2.c;
import java.util.HashMap;
import tw1.f;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import lp3.e;
import o63.c;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;

public class LiveKrnRedPacketFragment extends LiveRedPacketContainerItemBaseFragment	// class@000ecf
{
    public m m;
    public LiveKrnRedPackMessage$LiveKrnRedPack n;
    public b o;
    public static final int p;

    public void LiveKrnRedPacketFragment(String p0){
       super(p0);
    }
    public e0 dh(){
       Object obj = PatchProxy.apply(null, this, LiveKrnRedPacketFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.b();
    }
    public ClientContent$LiveStreamPackage eh(){
       Object obj = PatchProxy.apply(null, this, LiveKrnRedPacketFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.a();
    }
    public ClientContent$LiveVoicePartyPackageV2 fh(){
       Object obj = PatchProxy.apply(null, this, LiveKrnRedPacketFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.y();
    }
    public String hh(){
       return this.n.redPackId;
    }
    public int ih(){
       return 17;
    }
    public int jh(){
       return this.n.redPackType;
    }
    public long kh(){
       Object obj = PatchProxy.apply(null, this, LiveKrnRedPacketFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return k0.a(this.n, a.a).or(Long.valueOf(-1)).longValue();
    }
    public void lh(boolean p0){
       String str2;
       if (PatchProxy.isSupport(LiveKrnRedPacketFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveKrnRedPacketFragment.class, "11")) {
          return;
       }
       super.lh(p0);
       LiveLogTag lIVE_KRN_RED = LiveLogTag.LIVE_KRN_RED_PACKET;
       String str = "LiveKrnRedPacketFragment";
       lIVE_KRN_RED.appendTag(str);
       b.S(lIVE_KRN_RED, "onRedPacketSelect", "isFirstShow", Boolean.valueOf(p0));
       if (!p0) {
          return;
       }
       LiveKrnRedPackMessage$LiveKrnRedPack extraMessage = this.n.extraMessage;
       if (extraMessage != null) {
          String str1 = "reportData";
          if (!TextUtils.isEmpty(extraMessage.get(str1))) {
             str2 = this.n.extraMessage.get(str1);
          label_0051 :
             b.S(lIVE_KRN_RED.appendTag(str), "onRedPacketSelect", "reportDataMapJson", str2);
             b9.a(this.o);
             this.o = b.b().a(this.m.getLiveStreamId(), 4, str2).map(new e()).subscribe(b.b, c.b);
             return;
          }
       }
       str2 = "";
       goto label_0051 ;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveKrnRedPacketFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d0c3a, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveKrnRedPacketFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       b.P(LiveLogTag.LIVE_KRN_RED_PACKET.appendTag("LiveKrnRedPacketFragment"), "onDestroyView");
       b9.a(this.o);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       Object obj = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, LiveKrnRedPacketFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       String str = "LiveKrnRedPacketFragment";
       if (this.getHost() == null) {
          b.P(LiveLogTag.LIVE_KRN_RED_PACKET.appendTag(str), "getHost\(\) == null");
          return;
       }else if(this.getChildFragmentManager().findFragmentById(0x7f0a205e) == null){
          e uoe = this.getChildFragmentManager().beginTransaction();
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object[] objArray = null;
          LiveKrnFragment liveKrnFragm = PatchProxy.apply(objArray, obj, LiveKrnRedPacketFragment.class, "5");
          if (liveKrnFragm != patchProxyRe) {
          }else {
             c uoc = new c(obj);
             LiveKrnRedPacketFragment n = obj.n;
             LiveKrnRedPackMessage$LiveKrnRedPack bundleId = n.bundleId;
             LiveKrnRedPackMessage$LiveKrnRedPack componentNam = n.componentName;
             HashMap hashMap = PatchProxy.apply(objArray, obj, LiveKrnRedPacketFragment.class, "6");
             if (hashMap != patchProxyRe) {
             }else {
                hashMap = new HashMap();
                hashMap.put("redPackId", obj.n.redPackId);
                hashMap.put("senderId", String.valueOf(obj.n.senderId));
                hashMap.put("redPackType", String.valueOf(obj.n.redPackType));
                hashMap.put("currentTime", String.valueOf(f.a()));
                hashMap.put("showTime", String.valueOf(obj.n.showTime));
                hashMap.put("showDeadline", String.valueOf(obj.n.showDeadline));
                hashMap.put("grabTime", String.valueOf(obj.n.grabTime));
                Gson a = a.a;
                hashMap.put("senderInfo", a.q(obj.n.senderInfo));
                hashMap.put("receiverInfo", a.q(obj.n.receiverInfo));
                hashMap.put("totalKsCoin", String.valueOf(obj.n.totalKsCoin));
                hashMap.put("bizCustomParams", obj.n.followBizCustomParams);
                hashMap.put("place", obj.n.place);
                hashMap.put("transparent", obj.n.transparent);
                LiveKrnRedPackMessage$LiveKrnRedPack extraMessage = obj.n.extraMessage;
                if (extraMessage != null) {
                   hashMap.put("adId", extraMessage.get("adId"));
                   String str1 = "preallocateId";
                   hashMap.put(str1, obj.n.extraMessage.get(str1));
                }
                LiveLogTag lIVE_KRN_RED = LiveLogTag.LIVE_KRN_RED_PACKET;
                lIVE_KRN_RED.appendTag(str);
                b.U(lIVE_KRN_RED, "buildKrnRedPacketLaunchOption", "grabTime", hashMap.get("grabTime"), "showTime", hashMap.get("showTime"), "currentTime", hashMap.get("currentTime"));
             }
             liveKrnFragm = LiveKrnFragment.dh(LiveKrnDialogData.w(bundleId, componentNam, hashMap), obj.m.t5(), uoc);
          }
          uoe.f(R.id.live_krn_red_packet_container, liveKrnFragm);
          uoe.m();
       }
       return;
    }
}
