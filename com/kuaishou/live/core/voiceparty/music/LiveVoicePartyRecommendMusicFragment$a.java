package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyRecommendMusicFragment$a;
import com.yxcorp.gifshow.fragment.f;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyRecommendMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import lnc.a1;
import java.lang.CharSequence;

public class LiveVoicePartyRecommendMusicFragment$a extends f	// class@0017cb
{
    public final LiveVoicePartyRecommendMusicFragment l;

    public void LiveVoicePartyRecommendMusicFragment$a(LiveVoicePartyRecommendMusicFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public View J0(){
       KwaiEmptyStateView obj = PatchProxy.apply(null, this, LiveVoicePartyRecommendMusicFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.J0();
       if (this.l.G == 1) {
          obj.h(a1.p(R.string.arg_RES_7f101b62));
       }
       return obj;
    }
}
