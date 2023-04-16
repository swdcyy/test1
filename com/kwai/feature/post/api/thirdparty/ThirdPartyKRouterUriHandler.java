package com.kwai.feature.post.api.thirdparty.ThirdPartyKRouterUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import xh7.a;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.thirdparty.e;
import android.content.Intent;
import yh7.a;

public class ThirdPartyKRouterUriHandler extends AnnotationUriHandler	// class@001450
{

    public void ThirdPartyKRouterUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ThirdPartyKRouterUriHandler.class, "1")) {
          return;
       }
       Activity uActivity = a.b(p0.b());
       if (uActivity instanceof GifshowActivity) {
          if (new e(uActivity.getIntent(), uActivity).e(uActivity.getIntent())) {
             p1.a(new a(200));
          }else {
             p1.a(new a(499));
          }
       }else {
          p1.a(new a(403));
       }
       return;
    }
}
