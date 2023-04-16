package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment$c;
import com.yxcorp.gifshow.fragment.f;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;

public class LiveVoicePartyOrderedMusicFragment$c extends f	// class@0017c9
{
    public final LiveVoicePartyOrderedMusicFragment l;

    public void LiveVoicePartyOrderedMusicFragment$c(LiveVoicePartyOrderedMusicFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, LiveVoicePartyOrderedMusicFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.h(R.string.arg_RES_7f102547);
       return obj;
    }
    public void j(){
    }
    public void k(boolean p0,Throwable p1){
    }
}
