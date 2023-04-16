package com.yxcorp.gifshow.like.resource.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.like.resource.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.like.resource.LikeResourceStartupCommonPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m0b.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001a61
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("atmosphereResourceCache", b.e(p0.mAtmosphereResourceCache));
          uEditor.putString("feedLikeActivityResourceMap", b.e(p0.mFeedLikeActivityResourceMap));
          uEditor.putString("likeActivityResourceConfig", b.e(p0.mLikeActivityResourceConfig));
          g.a(uEditor);
       }
       return;
    }
}
