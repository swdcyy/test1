package com.yxcorp.gifshow.detail.DetailUriRouterHandler;
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
import android.net.Uri;
import android.content.Intent;
import com.yxcorp.gifshow.detail.article.ArticleDetailActivity;
import ekd.w0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import brd.t;
import com.yxcorp.gifshow.feed.g;
import ww9.a;
import com.yxcorp.gifshow.detail.article.b;
import erd.g;
import crd.b;
import yh7.a;

public class DetailUriRouterHandler extends AnnotationUriHandler	// class@001336
{

    public void DetailUriRouterHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DetailUriRouterHandler.class, "1")) {
          return;
       }
       Activity uActivity = a.b(p0.b());
       if (uActivity instanceof GifshowActivity) {
          Uri uri = p0.g();
          Intent intent = uActivity.getIntent();
          if (!PatchProxy.applyVoidThreeRefs(uActivity, uri, intent, null, ArticleDetailActivity.class, "3")) {
             String str = w0.a(uri, "photoId");
             if (!TextUtils.x(str)) {
                if (intent != null) {
                   intent.putExtra("commentId", w0.a(uri, "commentId"));
                   String str1 = "rootCommentId";
                   intent.putExtra(str1, w0.a(uri, str1));
                }
                g.e(str, w0.a(uri, "serverExpTag")).subscribe(new a(uActivity, intent), b.b);
             }
          }
          p1.a(new a(200));
       }else {
          p1.a(new a(403));
       }
       return;
    }
}
