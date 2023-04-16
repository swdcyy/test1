package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1$onSuccess$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import com.yxcorp.gifshow.widget.SectorProgressView;
import android.view.View;
import com.yxcorp.gifshow.share.model.ShareWechatMomentsChooseConfig;
import com.yxcorp.gifshow.share.model.ShareWechatMomentsChooseConfig$Config;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.app.Activity;
import uo7.k;
import android.content.res.Resources;
import com.kwai.library.widget.popup.common.c;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;

public final class ShareStyleSelectHelper$listener$1$onSuccess$2 extends Lambda implements a	// class@001ba7
{
    public final ShareStyleSelectHelper$listener$1 this$0;

    public void ShareStyleSelectHelper$listener$1$onSuccess$2(ShareStyleSelectHelper$listener$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ShareWechatMomentsChooseConfig$Config mActionTitle;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShareStyleSelectHelper$listener$1$onSuccess$2.class, "1")) {
          return;
       }
       ShareStyleSelectHelper.e(this.this$0.a).setVisibility(8);
       ShareStyleSelectHelper k = this.this$0.a.k;
       if (k != null) {
          ShareWechatMomentsChooseConfig mVideoConfig = k.mVideoConfig;
          if (mVideoConfig != null) {
             mActionTitle = mVideoConfig.mActionTitle;
          label_0029 :
             if (!TextUtils.x(mActionTitle)) {
                TextView textView = ShareStyleSelectHelper.f(this.this$0.a);
                ShareStyleSelectHelper k1 = this.this$0.a.k;
                if (k1 != null) {
                   ShareWechatMomentsChooseConfig mVideoConfig1 = k1.mVideoConfig;
                   if (mVideoConfig1 != null) {
                      objArray = mVideoConfig1.mActionTitle;
                   }
                }
                textView.setText(objArray);
             }else {
                ShareStyleSelectHelper.f(this.this$0.a).setText(this.this$0.b.k().getResources().getString(R.string.arg_RES_7f105062));
             }
             ShareStyleSelectHelper.f(this.this$0.a).setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f0802e3, 0, 0, 0);
             View view = this.this$0.a.q.z();
             a.m(view);
             view = view.findViewById(R.id.share_video_area);
             a.o(view, "dialog.popupView!!.findV¡­t>\(R.id.share_video_area\)");
             view.setEnabled(true);
             return;
          }
       }
       mActionTitle = objArray;
       goto label_0029 ;
    }
}
