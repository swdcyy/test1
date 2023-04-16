package m0a.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Intent;
import com.kwai.framework.model.commonfeedslide.CommonFeedSlideParams;
import vm5.f;
import android.net.Uri;
import ekd.x0;
import lnc.o5;
import java.util.List;
import m0a.b;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;

public class a	// class@002ef2
{

    public void a(){
       super();
    }
    public static Boolean a(String p0,Boolean p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return p1;
       }
       return Boolean.valueOf(("true").equals(p0));
    }
    public static CommonFeedSlideParams b(Intent p0){
       boolean b1;
       String str1;
       int i2;
       boolean b2;
       Uri obj = p0;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Object obj1 = PatchProxy.applyOneRefs(obj, null, uoa, str);
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       boolean b = f.e(p0);
       CommonFeedSlideParams uCommonFeedS = new CommonFeedSlideParams();
       boolean i = 0;
       if (b) {
          CommonFeedSlideParams obj2 = PatchProxy.applyOneRefs(obj, null, uoa, "2");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(obj == null){
             Uri data = p0.getData();
             if (data != null && data.isHierarchical()) {
                b1 = true;
             }
          }
          b1 = false;
          if (b1) {
             obj = p0.getData();
             uCommonFeedS = PatchProxy.applyOneRefs(obj, null, uoa, "3");
             if (uCommonFeedS != patchProxyRe) {
             }else {
                uCommonFeedS = new CommonFeedSlideParams();
                uCommonFeedS.mScheme = obj.toString();
                uCommonFeedS.mSelectedPhotoId = x0.a(obj, "selectedPhotoId");
                uCommonFeedS.mCursor = x0.a(obj, "pcursor");
                uCommonFeedS.mHostKey = x0.a(obj, "hostKey");
                uCommonFeedS.mServerExtraInfo = x0.a(obj, "serverExtraInfo");
                uCommonFeedS.mPath = x0.a(obj, "path");
                uCommonFeedS.mUtmSource = x0.a(obj, "utm_source");
                String str2 = x0.a(obj, "page2");
                String str3 = PatchProxy.applyOneRefs(str2, null, uoa, "4");
                if (str3 != patchProxyRe) {
                }else if(TextUtils.isEmpty(str2)){
                   str3 = "DETAIL";
                }else {
                   str3 = str2.toUpperCase();
                }
                uCommonFeedS.mPage2 = str3;
                uCommonFeedS.mPageSize = 10;
                int i3 = o5.b(x0.a(obj, "pageSize"), i);
                if (i3 > 0) {
                   uCommonFeedS.mPageSize = i3;
                }
                uCommonFeedS.mPhotoIds = x0.d(obj, "photoIds");
                Boolean fALSE1 = Boolean.FALSE;
                uCommonFeedS.mDisableSidebar = a.a(x0.a(obj, "disableSidebar"), fALSE1);
                uCommonFeedS.mOpenDanmakuInput = a.a(x0.a(obj, "openDanmakuInput"), fALSE1).booleanValue();
                uCommonFeedS.mForceDanmakuSwitchOn = a.a(x0.a(obj, "forceDanmakuSwitchOn"), fALSE1).booleanValue();
             }
             b uob = b.class;
             CommonFeedSlideParams obj3 = PatchProxy.applyOneRefs(uCommonFeedS, null, uob, str);
             if (obj3 != patchProxyRe) {
                i = obj3.booleanValue();
             label_01de :
                if (b && i) {
                   return uCommonFeedS;
                }else {
                   return null;
                }
             }else {
                obj3 = uCommonFeedS.mScheme;
                b.a = obj3;
                b.b = uCommonFeedS.mUtmSource;
                Boolean tRUE = Boolean.TRUE;
                if (b.d(b.c(tRUE, obj3, 2048), "kwaiUrlError")) {
                   Boolean fALSE = Boolean.FALSE;
                   if (b.d(b.b(fALSE, uCommonFeedS.mHostKey, 50), "hostError")) {
                      int i1 = 100;
                      if (b.d(b.b(tRUE, uCommonFeedS.mPath, i1), "pathError")) {
                         obj2 = uCommonFeedS.mPhotoIds;
                         if (PatchProxy.isSupport(uob)) {
                            str1 = 100;
                            i2 = 50;
                            Object obj4 = PatchProxy.applyThreeRefs(fALSE, obj2, Integer.valueOf(i1), null, b.class, "4");
                            if (obj4 != patchProxyRe) {
                               b2 = obj4.booleanValue();
                            }else if(q.f(obj2)){
                               b2 = true;
                            }else {
                               b2 = b.a(obj2.size(), str1);
                            }
                         }else {
                            i2 = 50;
                            str1 = 100;
                            goto label_016b ;
                         }
                         if (b.d(b2, "photoIdsError") && (b.d(b.b(fALSE, uCommonFeedS.mCursor, 20), "pcursorError") && (b.d(b.b(fALSE, uCommonFeedS.mSelectedPhotoId, i2), "selectedPhotoIdError") && (b.d(b.a(uCommonFeedS.mPageSize, i2), "pageSizeError") && (b.d(b.c(fALSE, uCommonFeedS.mServerExtraInfo, 1024), "serverExtraInfoError") && (b.d(b.b(tRUE, uCommonFeedS.mUtmSource, i2), "utm_sourceError") && b.d(b.b(fALSE, uCommonFeedS.mPage2, i2), "page2Error"))))))) {
                            i = true;
                            goto label_01de ;
                         }
                      }
                   }
                }
             }
          }
       }
    label_01dd :
       i = false;
       goto label_01de ;
    }
}
