package com.yxcorp.gifshow.nearby.common.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.nearby.common.a;
import ok.x;
import java.lang.Object;
import com.kwai.nearby.startup.local.LocalStartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kn4.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import java.lang.StringBuilder;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@0020e3
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("nearbyFestivalActivity", b.e(p0.mFestivalBubbleConfig));
          uEditor.putString("nearbyFeedPreloadConfig", b.e(p0.mNearbyFeedPreLoadConfig));
          uEditor.putString("nearbyFilterBoxBubbleConfig", b.e(p0.mNearbyFilterBoxBubbleConfig));
          uEditor.putString("nearbyInnerLocationGuide", b.e(p0.mNearbyInnerLocationGuide));
          uEditor.putString("nearbyInnerSlideGuide", b.e(p0.mNearbyInnerSlideGuide));
          uEditor.putString("nearbyLiveStreamConfig", b.e(p0.mNearbyLivePlayConfig));
          uEditor.putString("nearbyLocationWindowShowConfig", b.e(p0.mNearbyLocationWindowShowConfig));
          uEditor.putString("nearbyMapConfig", b.e(p0.mNearbyMapConfig));
          uEditor.putString("nearbyPoiInterceptConfig", b.e(p0.mNearbyPoiInterceptConfig));
          uEditor.putString("nearbyRedDot", b.e(p0.mNearbyRedDot));
          uEditor.putString(b.d("user")+"nearbyTabNameChangeConfig", b.e(p0.mNearbyTabNameChangeConfig));
          uEditor.putString("nearbyTabNameConfig", b.e(p0.mNearbyTabNameConfig));
          uEditor.putString(b.d("user")+"nearbyWireMagicFaceId", p0.mNearbyWireMagicFaceId);
          uEditor.putString("Subcategories", b.e(p0.mSubcategories));
          g.a(uEditor);
       }
       return;
    }
}
