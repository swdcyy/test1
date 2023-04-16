package com.yxcorp.gifshow.webview.bridge.a$b;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.component.JsStartPlayLongVideo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.n0;
import android.net.Uri;
import ekd.w0;
import android.net.Uri$Builder;
import android.content.Intent;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;

public class a$b extends z	// class@00170e
{
    public final a k;

    public void a$b(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else if(!TextUtils.x(p0.mPhotoId)){
          Activity uActivity = this.e();
          Object[] objArray = new Object[]{p0.mPhotoId};
          Uri$Builder uBuilder = w0.f(n0.a("kwai://work/%s", objArray)).buildUpon().appendQueryParameter("detail_browse_type", "non_slide").appendQueryParameter("feed_biz_type", "pay_course");
          uBuilder.appendQueryParameter("with_secure_flag", "true");
          uBuilder.build();
          if (!TextUtils.x(p0.mUtmSource)) {
             uBuilder.appendQueryParameter("utm_source", p0.mUtmSource);
             uBuilder.build();
          }
          if (!TextUtils.x(p0.mPageName)) {
             uBuilder.appendQueryParameter("h5_page", p0.mPageName);
             uBuilder.build();
          }
          uActivity.startActivity(new Intent("android.intent.action.VIEW", uBuilder.build()).setPackage(uActivity.getPackageName()));
          this.d(p0.mCallback, new JsSuccessResult());
       }
       return;
    }
}
