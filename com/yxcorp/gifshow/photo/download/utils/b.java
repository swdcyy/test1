package com.yxcorp.gifshow.photo.download.utils.b;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.reflect.Type;
import java.lang.StringBuilder;
import java.text.DecimalFormat;
import androidx.fragment.app.DialogFragment;
import java.util.Locale;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import kxb.e;
import kxb.c;
import com.yxcorp.gifshow.photo.download.utils.a;
import com.yxcorp.gifshow.fragment.ProgressFragment$a;

public class b	// class@000f22
{

    public void b(){
       super();
    }
    public static ProgressFragment a(GifshowActivity p0,DownloadPhotoInfoResponse p1,QPhoto p2,View$OnClickListener p3){
       ProgressFragment progressFrag;
       boolean b;
       CharSequence obj2;
       boolean b1;
       DownloadPhotoInfoResponse uDownloadPho = p1;
       Object obj = p2;
       ProgressFragment obj1 = PatchProxy.applyFourRefsWithListener(p0, p1, p2, p3, null, b.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = null;
       if (!uDownloadPho) {
          PatchProxy.onMethodExit(b.class, "1");
          return obj1;
       }else {
          int i = 0;
          int i1 = a.t().a("downloadShowCancelButtonMinTimeInterval", i);
          DownloadPhotoInfoResponse mVideoSize = uDownloadPho.mVideoSize;
          int i2 = 1;
          if (PatchProxy.isSupport(b.class)) {
             progressFrag = PatchProxy.applyTwoRefs(obj, Long.valueOf(mVideoSize), obj1, b.class, "2");
             if (progressFrag != PatchProxyResult.class) {
             }else if(!p2.isVideoType()){
                if (PatchProxy.isSupport(b.class)) {
                   obj2 = PatchProxy.applyOneRefs(Long.valueOf(mVideoSize), obj1, b.class, "4");
                   if (obj2 != PatchProxyResult.class) {
                      b1 = obj2.booleanValue();
                   }else if((double)mVideoSize - (a.t().getValue("maxDownloadableSizeFor4G", Double.TYPE, Double.valueOf(15.00f)).doubleValue() * 1048576.00f) >= 0){
                      b1 = true;
                   }else {
                      b1 = false;
                   }
                }else {
                   goto label_006b ;
                }
                if (!b1) {
                   obj2 = null;
                }else {
                   String str1 = new DecimalFormat("0.0").format((mVideoSize / 0x100000))+"MB";
                }
             }
             progressFrag = obj1;
          }else {
             goto label_004a ;
          }
          b = (mVideoSize - 0xf00000 >= 0)? true: false;
          ProgressFragment progressFrag1 = new ProgressFragment();
          progressFrag1.Eh(i, 100);
          progressFrag1.S = 14.00f;
          progressFrag1.T = 14.00f;
          progressFrag1.setCancelable(i);
          progressFrag1.Kh(uDownloadPho.mShowCancelButton);
          Locale uS = Locale.US;
          Object[] objArray = new Object[i2];
          objArray[i] = a1.p(0x7f100f18);
          progressFrag1.Jh(String.format(uS, "%s ", objArray));
          if (!TextUtils.x(progressFrag)) {
             String str = PatchProxy.applyOneRefs(progressFrag, null, b.class, "3");
             if (str != PatchProxyResult.class) {
             }else {
                Object[] objArray1 = new Object[i2];
                objArray1[i] = progressFrag;
                str = String.format(uS, a1.p(R.string.arg_RES_7f100a8f), objArray1);
             }
             progressFrag1.yh(str);
          }
          progressFrag1.Ch(R.drawable.arg_RES_7f08234f);
          progressFrag1.C = a1.d(0x7f07027d);
          progressFrag1.D = i;
          if (uDownloadPho.mShowCancelButton != null) {
             e.g(obj.mEntity, progressFrag, i1, b, i);
             c uoc = new c(p2, progressFrag, i1, b, p3);
             progressFrag1.Bh(i2);
          }else if(i1 > 0){
             a uoa = new a(progressFrag1, p2, progressFrag, i1, b, p3);
             progressFrag1.Hh((long)(i1 * 1000), uDownloadPho);
          }
          PatchProxy.onMethodExit(b.class, "1");
          return progressFrag1;
       }
    }
}
