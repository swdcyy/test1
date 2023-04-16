package ohc.f;
import ohc.c;
import ohc.h;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ohc.c$a;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Integer;
import com.kuaishou.android.model.mix.SummaryViewModel;
import rq4.d;
import com.kwai.robust.PatchProxyResult;
import ohc.e;
import fg6.a;
import ohc.d;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.HashMap;
import java.lang.RuntimeException;
import uo7.k;
import ohc.l;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import com.yxcorp.utility.TextUtils;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import java.lang.CharSequence;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;

public class f extends h implements c	// class@003958
{

    public void f(){
       super();
    }
    public void b(QPhoto p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       String str = "photo";
       a.p(p0, str);
       String str1 = "extraInfoMap";
       a.p(p1, str1);
       if (!PatchProxy.applyVoidThreeRefs(this, p0, p1, null, c$a.class, "1")) {
          a.p(p0, str);
          a.p(p1, str1);
          PhotoMeta photoMeta = p0.getPhotoMeta();
          if (photoMeta != null) {
             p1.put("reco_photo_type", Integer.valueOf(photoMeta.mRecoType));
             photoMeta = photoMeta.mFeedBottomRightSummary;
             if (photoMeta != null) {
                p1.put("remark_id", Integer.valueOf(photoMeta.mType));
             }
          }
       }
       p1.put("share_with_sdk", Integer.valueOf(1));
       return;
    }
    public final String c(QPhoto p0,d p1){
       String this;
       Map map1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "photo";
       a.p(p0, obj);
       String str = "log";
       a.p(p1, str);
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, c$a.class, "2");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, obj);
          a.p(p1, str);
          Map map = PatchProxy.applyOneRefs(p1, null, e.class, "1");
          if (map != patchProxyRe) {
          }else {
             try{
                map1 = a.a.i(p1.v, new d().getType());
                if (map1 == null) {
                   map1 = new HashMap();
                }
             }catch(com.google.gson.JsonSyntaxException e11){
                e11.printStackTrace();
                map1 = new HashMap();
             }
             map = map1;
          }
          this.b(p0, map);
          this = new Gson().q(map);
       }
       return this;
    }
    public void f(k p0,d p1){
       ShareAnyResponse$ShareAnyData mShareObject;
       int i1;
       ShareAnyResponse$ShareObject mShareUrl;
       f uof = f.class;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uof, str)) {
       }else {
          a.p(p0, "conf");
          String str1 = "log";
          a.p(p1, str1);
          int i = 1;
          p1.d = i;
          if (p0.r() != null) {
             ShareAnyResponse shareAnyResp = p0.r();
             a.m(shareAnyResp);
             if (shareAnyResp.mShareAnyData != null) {
                shareAnyResp = p0.r();
                a.m(shareAnyResp);
                mShareObject = shareAnyResp.mShareAnyData.mShareObject;
             label_003a :
                p1.j = TextUtils.I(p0.K().getUserId());
                p1.k = TextUtils.I(p0.K().getPhotoId());
                if (p0.K().isVideoType()) {
                   i1 = 2;
                }else if(p0.K().isImageType()){
                   i1 = 3;
                }else {
                   i1 = 0;
                }
                p1.g = i1;
                if (mShareObject != null) {
                   if (!(i ^ TextUtils.x(mShareObject.mShareUrl))) {
                      mShareObject = null;
                   }
                   if (mShareObject != null) {
                      mShareUrl = mShareObject.mShareUrl;
                      if (mShareUrl != null) {
                      label_0091 :
                         p1.q = mShareUrl;
                         p1.p = TextUtils.I(p0.K().getExpTag());
                         QPhoto qPhoto = p0.K();
                         String obj = PatchProxy.applyTwoRefs(qPhoto, p1, this, uof, "3");
                         if (obj != PatchProxyResult.class) {
                         }else {
                            obj = "photo";
                            a.p(qPhoto, obj);
                            a.p(p1, str1);
                            Object obj1 = PatchProxy.applyThreeRefs(this, qPhoto, p1, null, c$a.class, "2");
                            if (obj1 != PatchProxyResult.class) {
                               obj = obj1;
                            }else {
                               a.p(qPhoto, obj);
                               a.p(p1, str1);
                               Map map = PatchProxy.applyOneRefs(p1, null, e.class, str);
                               if (map != PatchProxyResult.class) {
                               }else {
                                  try{
                                     map = a.a.i(p1.v, new d().getType());
                                     if (map == null) {
                                        map = new HashMap();
                                     }
                                  }catch(com.google.gson.JsonSyntaxException e0){
                                     e0.printStackTrace();
                                     map = new HashMap();
                                  }
                               }
                            }
                         }
                         p1.v = obj;
                      }
                   }
                }
             label_0085 :
                mShareUrl = TextUtils.I(p0.K().getVideoUrl());
                goto label_0091 ;
             }
          }
          mShareObject = null;
          goto label_003a ;
       }
       return;
    }
    public void o(k p0,ShareInitResponse$SharePanelElement p1){
       this.r(p0, p1);
    }
}
