package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import uo7.k;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.SectorProgressView;
import nsd.r0;
import android.app.Activity;
import android.content.res.Resources;
import java.util.Arrays;
import java.lang.CharSequence;
import com.yxcorp.gifshow.share.model.ShareWechatMomentsChooseConfig;
import com.yxcorp.gifshow.share.model.ShareWechatMomentsChooseConfig$Config;
import com.yxcorp.utility.TextUtils;
import android.widget.LinearLayout;
import android.widget.ImageView;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b$b;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b$c;
import o07.n;

public final class ShareStyleSelectHelper$b implements PopupInterface$f	// class@001ba2
{
    public final ShareStyleSelectHelper b;
    public final k c;
    public final QPhoto d;

    public void ShareStyleSelectHelper$b(ShareStyleSelectHelper p0,k p1,QPhoto p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       ShareStyleSelectHelper h;
       ShareWechatMomentsChooseConfig$Config mTitle1;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ShareStyleSelectHelper$b.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "dialog");
       a.p(p1, "inflater");
       a.p(p2, "container");
       View view = a.g(p1, R.layout.arg_RES_7f0d1194, p2, false);
       a.o(view, "view");
       boolean b = true;
       view.setClickable(b);
       View view1 = view.findViewById(R.id.share_video);
       a.o(view1, "view.findViewById\(R.id.share_video\)");
       p3.g = view1;
       view1 = view.findViewById(R.id.title);
       a.o(view1, "view.findViewById\(R.id.title\)");
       p3.h = view1;
       view1 = view.findViewById(R.id.message);
       a.o(view1, "view.findViewById\(R.id.message\)");
       p3.i = view1;
       View view2 = view.findViewById(R.id.share_image);
       a.o(view2, "view.findViewById\(R.id.share_image\)");
       p3.j = view2;
       view2 = view.findViewById(R.id.download_progress);
       a.o(view2, "view.findViewById\(R.id.download_progress\)");
       p3.f = view2;
       String str = this.c.k().getResources().getString(R.string.arg_RES_7f10503a);
       a.o(str, "conf.mCurrentActivity.re¡­      .video_downloading\)");
       Object[] objArray = new Object[b];
       objArray[0] = "0";
       str = String.format(str, Arrays.copyOf(objArray, b));
       a.o(str, "java.lang.String.format\(format, *args\)");
       ShareStyleSelectHelper.f(this.b).setText(str);
       ShareStyleSelectHelper k = this.b.k;
       ShareWechatMomentsChooseConfig$Config uConfig = null;
       ShareWechatMomentsChooseConfig mVideoConfig = (k != null)? k.mVideoConfig: uConfig;
       ShareWechatMomentsChooseConfig$Config mTitle = (mVideoConfig != null)? mVideoConfig.mTitle: uConfig;
       if (!TextUtils.x(mTitle)) {
          h = this.b.h;
          if (h == null) {
             a.S("titleText");
          }
          mTitle1 = (mVideoConfig != null)? mVideoConfig.mTitle: uConfig;
          h.setText(mTitle1);
       }
       mTitle = (mVideoConfig != null)? mVideoConfig.mOtherTitle: uConfig;
       if (!TextUtils.x(mTitle)) {
          h = this.b.j;
          if (h == null) {
             a.S("shareImageText");
          }
          mTitle1 = (mVideoConfig != null)? mVideoConfig.mOtherTitle: uConfig;
          h.setText(mTitle1);
       }
       mTitle = (mVideoConfig != null)? mVideoConfig.mMessage: uConfig;
       if (!TextUtils.x(mTitle)) {
          h = this.b.i;
          if (h == null) {
             a.S("messageText");
          }
          mTitle1 = (mVideoConfig != null)? mVideoConfig.mMessage: uConfig;
          h.setText(mTitle1);
       }
       ShareStyleSelectHelper$b tb = this.b;
       if (tb.l != null) {
          ShareStyleSelectHelper.e(tb).setVisibility(8);
          mTitle = (mVideoConfig != null)? mVideoConfig.mActionTitle: uConfig;
          if (!TextUtils.x(mTitle)) {
             TextView textView = ShareStyleSelectHelper.f(this.b);
             if (mVideoConfig != null) {
                uConfig = mVideoConfig.mActionTitle;
             }
             textView.setText(uConfig);
          }else {
             ShareStyleSelectHelper.f(this.b).setText(this.c.k().getResources().getString(R.string.arg_RES_7f105062));
          }
          ShareStyleSelectHelper.f(this.b).setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f0802e3, false, false, false);
          View view3 = view.findViewById(R.id.share_video_area);
          a.o(view3, "view.findViewById<Linear¡­t>\(R.id.share_video_area\)");
          view3.setEnabled(b);
       }else {
          View view4 = view.findViewById(R.id.share_video_area);
          a.o(view4, "view.findViewById<Linear¡­t>\(R.id.share_video_area\)");
          view4.setEnabled(false);
       }
       view.findViewById(R.id.close_btn).setOnClickListener(new ShareStyleSelectHelper$b$a(this, p0));
       view.findViewById(R.id.share_video_area).setOnClickListener(new ShareStyleSelectHelper$b$b(this, p0));
       view.findViewById(R.id.share_image).setOnClickListener(new ShareStyleSelectHelper$b$c(this, p0));
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
