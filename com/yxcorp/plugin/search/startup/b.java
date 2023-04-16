package com.yxcorp.plugin.search.startup.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.plugin.search.startup.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.plugin.search.startup.SearchStartupCommonPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x6d.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@00076c
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("FeedNegativeFeedback", b.e(p0.mFeedNegativeFeedback));
          uEditor.putString("HomeSpringSceneTime", b.e(p0.mHomeSpringSceneTime));
          uEditor.putInt("RecoAfterPlayMaxCards", p0.mRecoAfterPlayMaxCards);
          uEditor.putLong("RecoAfterPlayTriggerTime", p0.mRecoAfterPlayTriggerTime);
          uEditor.putInt("SearchFeedbackAccessPos", p0.mSearchFeedbackAccessPos);
          uEditor.putString("SearchFeedbackPageUrl", p0.mSearchFeedbackPageUrl);
          uEditor.putInt("SearchKboxEventAllShowCount", p0.mSearchKboxEventAllShowCount);
          uEditor.putInt("SearchKboxEventShowCount", p0.mSearchKboxEventShowCount);
          uEditor.putFloat("SearchLiveReserveFollowToastMills", p0.mSearchLiveReserveFollowToastMills);
          uEditor.putFloat("SearchLiveReservePermissionMills", p0.mSearchLiveReservePermissionMills);
          uEditor.putInt("SearchShowPhotoDurationSeconds", p0.mSearchShowPhotoDurationSeconds);
          uEditor.putFloat("SearchSinglePhotoWidthRation", p0.mSearchSinglePhotoWidthRation);
          uEditor.putInt("SearchUserTabFoldGetMoreThreshold", p0.mSearchUserTabFoldGetMoreThreshold);
          uEditor.putInt("SearchUserTabPymkDailyCount", p0.mSearchUserTabPymkDailyCount);
          g.a(uEditor);
       }
       return;
    }
}
