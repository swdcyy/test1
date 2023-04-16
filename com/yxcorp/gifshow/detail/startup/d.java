package com.yxcorp.gifshow.detail.startup.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.detail.startup.c;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.detail.startup.DetailStartupCommonPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class d extends ConfigAutoParseJsonConsumer	// class@001a0e
{

    public void d(){
       super(c.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putString("BottomInteractionConfig", b.e(p0.mBottomInteractionConfig));
          uEditor.putBoolean("HighCollectCountUser", p0.mHighCollectCountUser);
          uEditor.putString("ImIconShareGuide", b.e(p0.mImIconShareGuide));
          uEditor.putString("MoreOperationConfig", b.e(p0.mMoreOperationConfig));
          uEditor.putString("posterShowStartConfig", b.e(p0.mPostShowStartUpInfo));
          uEditor.putString("QuickCommentEmotionConfig", b.e(p0.mQuickCommentEmotionConfig));
          uEditor.putString("quickShareElementInfo", b.e(p0.mQuickShareElementInfo));
          uEditor.putString("StartupParams", b.e(p0.mStartupParams));
          uEditor.putString("SubscribeAuthorConfig", b.e(p0.mSubscribeAuthorConfig));
          uEditor.putString("TimeManagementConfig", b.e(p0.mTimeManagementConfig));
          uEditor.putString("visibilityExpirationConfig", b.e(p0.visibilityExpirationConfig));
          g.a(uEditor);
       }
       return;
    }
}
