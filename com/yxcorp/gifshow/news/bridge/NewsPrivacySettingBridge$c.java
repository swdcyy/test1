package com.yxcorp.gifshow.news.bridge.NewsPrivacySettingBridge$c;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class NewsPrivacySettingBridge$c implements g	// class@00215c
{
    public final Promise b;

    public void NewsPrivacySettingBridge$c(Promise p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewsPrivacySettingBridge$c.class, "1")) {
       }else {
          a.o(p0, "result");
          if (p0.booleanValue()) {
             p0 = this.b;
             if (p0 != null) {
                p0.resolve(null);
             }
          }else {
             p0 = this.b;
             if (p0 != null) {
                p0.reject("-1", "params is invalidate");
             }
          }
       }
       return;
    }
}
