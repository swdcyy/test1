package com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedFragment;
import com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedBaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import rb2.a;
import com.kuaishou.live.core.voiceparty.channel.feed.a;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.List;
import java.util.Map;
import k2b.e0;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import y8c.g;
import xr2.b;
import qvb.i;
import lo2.a;

public class VoicePartyChannelFeedFragment extends VoicePartyFeedBaseFragment	// class@00136d
{
    public String I;
    public String J;
    public int K;
    public d L;
    public e0 M;
    public static final int N;

    public void VoicePartyChannelFeedFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, VoicePartyChannelFeedFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new a());
       obj.U7(new a());
       PatchProxy.onMethodExit(VoicePartyChannelFeedFragment.class, "8");
       return obj;
    }
    public boolean Eh(){
       return true;
    }
    public RecyclerView$n Hh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyChannelFeedFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.Hh();
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, VoicePartyChannelFeedFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.L);
       return obj;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyChannelFeedFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VoicePartyChannelFeedFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 13;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, VoicePartyChannelFeedFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M.getPageParams();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyChannelFeedFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          String str = "keyLiveStreamId";
          if (!p0.containsKey(str) || (p0.containsKey("keyVoicePartyId") && p0.containsKey("keyChannelId"))) {
             this.I = p0.getString(str, "");
             this.J = p0.getString("keyVoicePartyId", "");
             this.K = p0.getInt("keyChannelId", 0);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyChannelFeedFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyChannelFeedFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.M, this.getPage(), 0, 64);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyChannelFeedFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.I, this.J, this.K);
    }
}
