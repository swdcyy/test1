package com.yxcorp.gifshow.notice.krn.SocialReactTextShadowNode$2$1;
import com.yxcorp.gifshow.util.ColorURLSpan;
import com.yxcorp.gifshow.notice.krn.SocialReactTextShadowNode$2;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.notice.krn.m;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import android.text.style.URLSpan;
import android.net.Uri;
import ekd.x0;
import com.facebook.react.uimanager.ReactShadowNodeImpl;

public class SocialReactTextShadowNode$2$1 extends ColorURLSpan	// class@00219c
{
    public final String v;
    public final SocialReactTextShadowNode$2 w;

    public void SocialReactTextShadowNode$2$1(SocialReactTextShadowNode$2 p0,String p1,String p2,String p3){
       this.w = p0;
       this.v = p3;
       super(p1, p2);
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialReactTextShadowNode$2$1.class, "1")) {
          return;
       }
       if (this.w.b.h != null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("url", x0.f(this.getURL()).toString());
          writableMap.putInt("target", this.w.b.getReactTag());
          writableMap.putInt("type", 3);
          writableMap.putString("content", this.v);
          this.w.b.b("topLinkClick", writableMap);
       }
       return;
    }
}
