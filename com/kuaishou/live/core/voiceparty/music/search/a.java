package com.kuaishou.live.core.voiceparty.music.search.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.music.search.LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import qvb.i;
import java.util.List;
import wt2.b;
import java.lang.Runnable;
import wt2.c;

public final class a implements View$OnClickListener	// class@0017e4
{
    public final LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment b;

    public void a(LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       if (tb.H == null) {
          tb.Hh(true);
          tb.a();
          tb.Gh(tb.h0(), (tb.q().getItems().size() * LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment.J), new b(tb));
       }else {
          tb.Hh(false);
          tb.jd();
          tb.Gh(tb.h0(), false, new c(tb));
       }
       return;
    }
}
