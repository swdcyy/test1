package com.kuaishou.live.core.voiceparty.music.search.LiveVoicePartySearchHistoryMusicFragmentCreator;
import com.kwai.feature.component.searchhistory.SearchLayout$e;
import java.lang.Object;
import com.kwai.feature.component.searchhistory.SearchLayout;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.music.search.LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment;

public class LiveVoicePartySearchHistoryMusicFragmentCreator implements SearchLayout$e	// class@0017e3
{

    public void LiveVoicePartySearchHistoryMusicFragmentCreator(){
       super();
    }
    public BaseFragment a(SearchLayout p0){
       LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartySearchHistoryMusicFragmentCreator.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveVoicePartySearchHistoryMusicFragmentCreator$LiveVoicePartySearchHistoryMusicFragment();
       obj.I = p0;
       return obj;
    }
}
