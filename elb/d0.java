package elb.d0;
import java.lang.Object;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gq.a;
import q87.c;
import java.lang.CharSequence;
import e17.i$b;
import e17.i;
import zsd.u;
import android.text.Spanned;
import android.text.Html;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import elb.d0$a;
import e17.i$e;
import elb.d0$b;
import java.lang.Runnable;
import yb7.p;
import r26.a;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import w26.c;
import lnc.x6;
import lnc.y6;
import pm6.m;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.yxcorp.utility.TextUtils;
import elb.e0;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import java.lang.StringBuilder;

public final class d0	// class@002743
{
    public static final d0 a;

    static {
       d0.a = new d0();
    }
    public void d0(){
       super();
    }
    public static final void a(UploadInfo p0){
       UploadInfo uploadInfo;
       Object obj = p0;
       UploadInfo obj1 = null;
       if (PatchProxy.applyVoidOneRefs(obj, obj1, d0.class, "3")) {
          return;
       }
       a.p(obj, "uploadInfo");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "PublishedGuideUtils";
       a.D().w(str, "showBenefitPublishToast", objArray);
       UploadInfo mPublishToas = obj.mPublishToastMainText;
       Object[] objArray1 = 1;
       uploadInfo = (mPublishToas == null || !mPublishToas.length())? 1: null;
       if (uploadInfo) {
          return;
       }else if(obj.mRandomCoinParams != null){
          objArray1 = new Object[i];
          a.D().w(str, "has random dialog return", objArray1);
          return;
       }else {
          i$b uob = i.m();
          uob.s(R.layout.arg_RES_7f0d00f6);
          uob.y(Html.fromHtml(u.g2(u.g2(mPublishToas, "\n", "<br>", false, 4, null), "\\n", "<br>", false, 4, null)));
          uob.o(objArray1);
          uob.u(obj1);
          obj1 = obj.mIsGoldTask;
          UploadInfo mPublishToas1 = obj.mPublishToastIconUrl;
          if (mPublishToas1 == null || !mPublishToas1.length()) {
             i = 1;
          }
          if (!i || obj1 != null) {
             uob.A(new d0$a(obj1, obj));
          }
          p.e(new d0$b(uob), obj.mPublishToastDelay);
          obj.mHasTriedToShowPublishedGuide = objArray1;
          return;
       }
    }
    public static final void b(a p0){
       boolean b1;
       e0 uoe0;
       d0 uod0 = d0.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uod0, "1")) {
          return;
       }
       String str = "postWorkInfo";
       a.p(p0, str);
       Object[] objArray = new Object[0];
       a.D().w("PublishedGuideUtils", "showPublishedGuide", objArray);
       UploadInfo uploadInfo = p0.getUploadInfo();
       if (uploadInfo == null) {
          PostUtils.D("PublishedGuideUtils", "showNativePublishedGuide\(\) ", new IllegalStateException(" uploadInfo is null"));
          return;
       }else {
          UploadInfo obj1 = PatchProxy.applyOneRefs(uploadInfo, obj, uod0, "2");
          boolean b = true;
          if (obj1 != PatchProxyResult.class) {
             b1 = obj1.booleanValue();
          }else {
             a.p(uploadInfo, "uploadInfo");
             if (uploadInfo.mIsBenefitTask != null) {
                obj1 = uploadInfo.mIsGoldTask;
                if (uploadInfo.getVisibility() != PhotoVisibility.PUBLIC) {
                   if (obj1 != null) {
                      c uoc = y6.r(c.class);
                      if (uoc != null) {
                         uoc.GK();
                      }
                      Object[] objArray3 = new Object[0];
                      a.D().w("PublishedGuideUtils", "The work is not open to the public!", objArray3);
                   }
                }else if(TextUtils.n(m.c(), uploadInfo.getUploadResult().mPhotoId)){
                   Object[] objArray4 = new Object[0];
                   a.D().w("PublishedGuideUtils", "floatSharePanel showing", objArray4);
                   uoe0 = 1;
                }else {
                   uoe0 = null;
                }
                if (uploadInfo.mRandomCoinParams != null && !uoe0) {
                   p.d(new e0(uploadInfo));
                }else {
                   d0.a(uploadInfo);
                }
                b1 = true;
             }
             b1 = false;
          }
          if (b1) {
             return;
          }else if(PatchProxy.applyVoidOneRefs(p0, obj, uod0, "5")){
             a.p(p0, str);
             if (p0.isDisableUploadSuccessToast()) {
                Object[] objArray1 = new Object[0];
                a.D().w("PublishedGuideUtils", "getTrackAsset: error, empty media path", objArray1);
             }else {
                UploadInfo uploadInfo1 = p0.getUploadInfo();
                if (uploadInfo1 == null) {
                   PostUtils.D("PublishedGuideUtils", "showFriendTabToast\(\) ", new IllegalStateException(" uploadInfo is null"));
                }else {
                   boolean b2 = p0.isReturnToHomeRequest();
                   boolean b3 = (a.g(uploadInfo1.getMockFeedUploadTarget(), b.h) || a.g(uploadInfo1.getMockFeedUploadTarget(), b.c))? true: false;
                   if (uploadInfo1.getVisibility() == PhotoVisibility.PRIVATE) {
                      b = false;
                   }
                   Object[] objArray2 = new Object[0];
                   a.D().w("PublishedGuideUtils", "showFriendTabToast\(\) jumpToSlide="+b3+" isPublic="+b+" returnToHome="+b2, objArray2);
                   if (b3 && b2) {
                      int i = (b)? 0x7f104fae: 0x7f103e6a;
                      i.a(R.style.arg_RES_7f11066a, i);
                   }
                }
             }
          }
          return;
       }
    }
}
