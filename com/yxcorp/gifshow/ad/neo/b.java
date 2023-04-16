package com.yxcorp.gifshow.ad.neo.b;
import java.lang.Object;
import java.util.HashMap;
import android.view.View;
import android.app.Activity;
import com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.neo.b$a;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tw.f;
import java.lang.StringBuilder;
import w29.a;
import lnc.a1;
import dg.h;
import dg.e;
import ekd.f;
import android.util.Property;
import android.animation.ObjectAnimator;
import ky8.a;
import android.animation.TimeInterpolator;

public class b	// class@001791
{
    public final Map a;

    public void b(){
       super();
       this.a = new HashMap();
    }
    public final void a(View p0,int p1,Activity p2,PhotoApkDownloadTaskInfo p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, b.class, "4")) {
          return;
       }
       PhotoApkDownloadTaskInfo mAdDataWrapp = p3.mAdDataWrapper;
       if (mAdDataWrapp == null) {
          mAdDataWrapp = new PhotoAdDataWrapper(p3.mPhoto.mEntity);
       }
       b$a uoa = new b$a(this, p2, mAdDataWrapp, p3, p1);
       p0.setOnClickListener(mAdDataWrapp);
       return;
    }
    public void b(View p0,APKDownloadTask p1,Activity p2){
       b uob = b.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "1")) {
          return;
       }
       PhotoApkDownloadTaskInfo taskInfo = p1.getTaskInfo();
       int i = 8;
       if (taskInfo.mAdDataWrapper == null && taskInfo.mPhoto == null) {
          p0.setVisibility(i);
          return;
       }else {
          KwaiImageView kwaiImageVie = p0.findViewById(R.id.install_toast_icon);
          kwaiImageVie.L(taskInfo.getAppIcon());
          kwaiImageVie.setVisibility(0);
          this.a(kwaiImageVie, 45, p2, taskInfo);
          TextView textView = p0.findViewById(R.id.install_toast_inatsll_app_name);
          textView.setVisibility(0);
          ApkDownloadTaskInfo mAppName = taskInfo.mAppName;
          String str = PatchProxy.applyOneRefs(mAppName, this, uob, "3");
          if (str != PatchProxyResult.class) {
          }else if(TextUtils.x(mAppName)){
             str = "";
          }else {
             str = f.f(mAppName);
             if (str.length() > i) {
                str = str.offsetByCodePoints(0, 7)+"...";
             }
          }
          textView.setText(str);
          this.a(textView, 121, p2, taskInfo);
          this.a(p0, 48, p2, taskInfo);
          if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
             f.n(0, (float)a1.e(60.00f), 380.00f, 20.00f, new a(this, p0));
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0,0x3f800000});
             objectAnimat.setInterpolator(new a(0.25f, 0.10f, 0.25f, 0x3f800000));
             objectAnimat.setDuration(300);
             objectAnimat.start();
          }
          p0.setVisibility(0);
          return;
       }
    }
}
