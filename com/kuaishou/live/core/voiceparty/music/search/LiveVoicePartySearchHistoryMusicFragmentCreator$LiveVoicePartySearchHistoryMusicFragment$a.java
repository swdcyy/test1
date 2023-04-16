package com.kuaishou.live.core.voiceparty.music.search.LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.voiceparty.music.search.LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment;
import java.lang.Runnable;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;

public class LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment$a extends AnimatorListenerAdapter	// class@0017e1
{
    public final Runnable a;
    public final LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment b;

    public void LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment$a(LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment p0,Runnable p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.height = -2;
       this.a.run();
       return;
    }
}
