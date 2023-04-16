package com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedBaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import lnc.a1;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedBaseFragment$b;
import wr2.a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedBaseFragment$a;
import java.util.Map;
import java.lang.StringBuilder;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.recyclerview.widget.RecyclerView;
import g9c.d;
import androidx.fragment.app.Fragment;
import z12.e;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;

public abstract class VoicePartyFeedBaseFragment extends RecyclerFragment	// class@0014ef
{
    public a F;
    public String G;
    public static final int H;

    static {
       VoicePartyFeedBaseFragment.H = a1.e(4.00f);
    }
    public void VoicePartyFeedBaseFragment(){
       super();
       this.G = "unknown";
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyFeedBaseFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoicePartyFeedBaseFragment$b(this, this);
    }
    public a Gh(){
       return this.F;
    }
    public RecyclerView$n Hh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyFeedBaseFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoicePartyFeedBaseFragment$a(this);
    }
    public int M(){
       return 5;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyFeedBaseFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VoicePartyFeedBaseFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, VoicePartyFeedBaseFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "chat_room_aggregation_refer="+this.G;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyFeedBaseFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       this.h0().addItemDecoration(this.Hh());
       this.ia().R0(this.h0());
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyFeedBaseFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          String str = "voicePartyFeedEnterSourceType";
          if (p0.containsKey(str)) {
             this.G = p0.getString(str, "unknown");
             String[] stringArray = new String[0];
             e.c("VoicePartyFeedBaseFragment", "voicePartyFeedEnterSourceType = "+this.G, stringArray);
          }
       }
       return;
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyFeedBaseFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GridLayoutManager(this.getActivity(), 2);
    }
}
