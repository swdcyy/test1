package com.yxcorp.gifshow.news.bridge.NewsPrivacySettingBridge$d;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class NewsPrivacySettingBridge$d implements g	// class@00215d
{
    public final Promise b;

    public void NewsPrivacySettingBridge$d(Promise p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewsPrivacySettingBridge$d.class, "1")) {
       }else {
          NewsPrivacySettingBridge$d tb = this.b;
          if (tb != null) {
             tb.reject(p0);
          }
       }
       return;
    }
}
