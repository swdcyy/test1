package com.yxcorp.gifshow.reminder.news.NewsSlidePlayUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xh7.a;
import yh7.a;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.gifshow.activity.UriRouterActivity;
import android.net.Uri;
import java.util.Map;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import efc.a;
import java.util.List;
import bfc.j;

public final class NewsSlidePlayUriHandler extends AnnotationUriHandler	// class@001aee
{

    public void NewsSlidePlayUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       GifshowActivity gifshowActiv;
       NewsSlidePlayUriHandler newsSlidePla = NewsSlidePlayUriHandler.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, newsSlidePla, "1")) {
          return;
       }
       Object obj = null;
       if (p0.a("com.kwai.platform.krouter.return_intent", false)) {
          a uoa = new a(201);
          a b = uoa.b;
          Intent intent = PatchProxy.applyOneRefs(p0, obj, newsSlidePla, "2");
          if (intent != PatchProxyResult.class) {
          }else {
             intent = new Intent();
             intent.setClass(p0.b(), UriRouterActivity.class);
             intent.setData(p0.g());
          }
          b.put("com.kwai.platform.krouter.return_intent", intent);
          p1.a(uoa);
          return;
       }else if(p0.b() instanceof GifshowActivity){
          gifshowActiv = p0.b();
       }else {
          gifshowActiv = ActivityContext.g().e();
       }
       if (gifshowActiv instanceof GifshowActivity) {
          j.a(gifshowActiv, gifshowActiv.f(), a.e(p0.g()), obj);
          p1.a(new a(200));
       }else {
          p1.a(new a(404));
       }
       return;
    }
}
