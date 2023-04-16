package com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import uw1.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import mrd.a;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.Number;
import uw1.i;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment$a;
import brd.y;
import tw1.d;
import android.view.View;
import android.os.Bundle;
import uw1.n;

public abstract class LiveRedPacketContainerItemBaseFragment extends BaseFragment implements a	// class@001759
{
    public String j;
    public final c k;
    public n l;

    public void LiveRedPacketContainerItemBaseFragment(String p0){
       super();
       this.k = a.g();
       this.j = p0;
    }
    public int ch(){
       return 0;
    }
    public abstract e0 dh();
    public abstract ClientContent$LiveStreamPackage eh();
    public abstract ClientContent$LiveVoicePartyPackageV2 fh();
    public String gh(String p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, this, LiveRedPacketContainerItemBaseFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return "";
       }
       obj = new JsonObject();
       obj.c0("open_source", p0);
       return obj.toString();
    }
    public abstract String hh();
    public int ih(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketContainerItemBaseFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return i.c(this.jh());
    }
    public abstract int jh();
    public abstract long kh();
    public void lh(boolean p0){
       if (PatchProxy.isSupport(LiveRedPacketContainerItemBaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveRedPacketContainerItemBaseFragment.class, "1")) {
          return;
       }
       if (!p0) {
          return;
       }
       this.k.onNext(LiveRedPacketContainerItemBaseFragment$a.a);
       d.l(this.gh(this.j), this.dh(), this.eh(), this.fh(), this.hh(), this.ih(), 0, 0, 3, "");
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerItemBaseFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       this.l = null;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPacketContainerItemBaseFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (p0 instanceof a) {
          p0.setDispatchDrawFinishedListener(this.l);
       }
       return;
    }
    public void setDispatchDrawFinishedListener(n p0){
       this.l = p0;
    }
}
