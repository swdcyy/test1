package com.yxcorp.gifshow.follow.stagger.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.follow.stagger.config.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.follow.stagger.config.FollowStaggerStartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iia.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001151
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("acquaintancePrivacyPopup", b.e(p0.mAcquaintancePrivacyPopupConfig));
          uEditor.putString("followPageCoverOptimize", b.e(p0.mFollowPageCoverOptimize));
          uEditor.putString("surveyWithPhotoPageConfig", b.e(p0.mSurveyWithPhotoPageConfig));
          g.a(uEditor);
       }
       return;
    }
}
