package com.yxcorp.gifshow.webview.bridge.a$g;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.component.JsShareGameParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import ekd.w0;
import android.net.Uri$Builder;
import com.yxcorp.gifshow.entity.MultiImageLinkInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import tkd.b;
import tkd.d;
import pu5.a;
import vxc.r;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n3d.a;
import qu5.r;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;

public class a$g extends z	// class@001713
{
    public final a k;

    public void a$g(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
       }else {
          MultiImageLinkInfo multiImageLi = new MultiImageLinkInfo();
          multiImageLi.mSourceName = p0.mGameName;
          multiImageLi.mTitle = p0.mTitle;
          multiImageLi.mUrl = w0.f("kwai://game").buildUpon().appendQueryParameter("url", p0.mTargetUrl).build().toString();
          multiImageLi.mIconUrl = p0.mIconUrl;
          ArrayList uArrayList = new ArrayList();
          multiImageLi.mImageUrls = uArrayList;
          JsShareGameParams mImageUrls = p0.mImageUrls;
          if (mImageUrls != null) {
             Collections.addAll(uArrayList, mImageUrls);
          }
          multiImageLi.mErrImageUrl = p0.mErrorImageUrl;
          multiImageLi.mDesc = p0.mDescription;
          multiImageLi.mSourceType = 2;
          d.a(-1497343380).Wi(this.k.a, multiImageLi, new r(multiImageLi));
          this.d(p0.mCallback, new JsSuccessResult());
       }
       return;
    }
}
