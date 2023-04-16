package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$processSuccess$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import u07.t;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.SectorProgressView;
import android.view.View;
import com.yxcorp.gifshow.share.model.ShareWechatMomentsChooseConfig;
import com.yxcorp.gifshow.share.model.ShareWechatMomentsChooseConfig$Config;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import uo7.k;
import cic.c;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.library.widget.popup.common.c;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;

public final class ShareStyleSelectHelper$processSuccess$1 extends Lambda implements a	// class@001ba9
{
    public final t $dialog;
    public final ShareStyleSelectHelper this$0;

    public void ShareStyleSelectHelper$processSuccess$1(ShareStyleSelectHelper p0,t p1){
       this.this$0 = p0;
       this.$dialog = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ShareWechatMomentsChooseConfig$Config mActionTitle;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShareStyleSelectHelper$processSuccess$1.class, "1")) {
          return;
       }
       ShareStyleSelectHelper.e(this.this$0).setVisibility(8);
       ShareStyleSelectHelper k = this.this$0.k;
       if (k != null) {
          ShareWechatMomentsChooseConfig mVideoConfig = k.mVideoConfig;
          if (mVideoConfig != null) {
             mActionTitle = mVideoConfig.mActionTitle;
          label_0025 :
             if (!TextUtils.x(mActionTitle)) {
                TextView textView = ShareStyleSelectHelper.f(this.this$0);
                ShareStyleSelectHelper k1 = this.this$0.k;
                if (k1 != null) {
                   ShareWechatMomentsChooseConfig mVideoConfig1 = k1.mVideoConfig;
                   if (mVideoConfig1 != null) {
                      objArray = mVideoConfig1.mActionTitle;
                   }
                }
                textView.setText(objArray);
             }else {
                ShareStyleSelectHelper.f(this.this$0).setText(this.this$0.b().k().getResources().getString(R.string.arg_RES_7f105062));
             }
             ShareStyleSelectHelper.f(this.this$0).setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f0802e3, 0, 0, 0);
             View view = this.$dialog.z();
             a.m(view);
             view = view.findViewById(R.id.share_video_area);
             a.o(view, "dialog.popupView!!.findV¡­t>\(R.id.share_video_area\)");
             view.setEnabled(true);
             return;
          }
       }
       mActionTitle = objArray;
       goto label_0025 ;
    }
}
