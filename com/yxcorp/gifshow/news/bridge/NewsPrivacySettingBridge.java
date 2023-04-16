package com.yxcorp.gifshow.news.bridge.NewsPrivacySettingBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.yxcorp.gifshow.news.bridge.NewsPrivacySettingBridge$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactContext;
import lj0.c;
import lj0.d;
import bi5.a;
import com.facebook.react.bridge.Promise;
import java.lang.Integer;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.news.bridge.NewsPrivacySettingBridge$b;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.news.bridge.NewsPrivacySettingBridge$c;
import com.yxcorp.gifshow.news.bridge.NewsPrivacySettingBridge$d;
import erd.g;
import crd.b;

public final class NewsPrivacySettingBridge extends KrnBridge	// class@00215e
{
    public static final NewsPrivacySettingBridge$a Companion;

    static {
       NewsPrivacySettingBridge.Companion = new NewsPrivacySettingBridge$a(null);
    }
    public void NewsPrivacySettingBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
    }
    public String getName(){
       return "NewsPrivacySettingBridge";
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, NewsPrivacySettingBridge.class, "2")) {
          return;
       }
       c uoc = d.a(p2);
       String str = "";
       if (uoc != null) {
          str = uoc.b();
          str1 = uoc.f();
       }else {
          str1 = str;
       }
       a.a(p0, p1, str, str1);
       return;
    }
    public final void saveNewsPrivacyScope(int p0,int p1,Promise p2){
       if (PatchProxy.isSupport(NewsPrivacySettingBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, NewsPrivacySettingBridge.class, "1")) {
          return;
       }
       this.reportAndCheck(this.getName(), "saveNewsPrivacyScope", this.getReactApplicationContext());
       t.fromCallable(new NewsPrivacySettingBridge$b(p0, p1)).subscribeOn(d.c).observeOn(d.a).subscribe(new NewsPrivacySettingBridge$c(p2), new NewsPrivacySettingBridge$d(p2));
       return;
    }
}
