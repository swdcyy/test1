package com.yxcorp.gifshow.share.operation.b;
import uo7.f0;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import uo7.k;
import uo7.h0;
import uo7.c0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.operation.b$a;
import brd.t;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import com.kwai.sharelib.model.PainterModel;
import com.kwai.sharelib.model.PainterModel$ImageContent;
import java.lang.CharSequence;
import com.kwai.sharelib.model.ShareInitResponse;
import e17.i;
import au6.e;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.System;
import com.yxcorp.gifshow.share.operation.b$b;
import io.reactivex.g;
import brd.z;
import lrd.b;
import com.yxcorp.gifshow.share.operation.b$c;
import erd.g;
import com.yxcorp.gifshow.share.operation.b$d;
import erd.o;
import com.yxcorp.gifshow.share.operation.b$e;

public final class b implements f0	// class@001c08
{
    public final Activity b;

    public void b(Activity p0){
       a.p(p0, "activity");
       super();
       this.b = p0;
    }
    public c0 W(ShareAnyResponse$ShareObject p0,k p1,String p2,String p3,h0 p4){
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p0 = PatchProxy.apply(objArray, this, b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       a.p(p1, "conf");
       a.p(p4, "urlMgr");
       return new b$a(this, p1, p1);
    }
    public final t a(k p0){
       ShareAnyResponse$ShareObject mPainterMode;
       PainterModel mImageConten;
       PainterModel mImageConten1;
       t ot;
       ShareAnyResponse obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "configuration");
       obj = p0.r();
       String str = null;
       PainterModel$ImageContent imageContent = null;
       if (obj != null) {
          obj = obj.mShareAnyData;
          if (obj != null) {
             ShareAnyResponse$ShareAnyData mShareObject = obj.mShareObject;
             if (mShareObject != null) {
                mPainterMode = mShareObject.mPainterModel;
                if (mPainterMode != null) {
                   mImageConten = mPainterMode.mImageContent;
                   if (mImageConten != null) {
                      imageContent = mImageConten.mImageBytes;
                   }
                   if (imageContent == null || !imageContent.length()) {
                      str = 1;
                   }
                   if (str) {
                      str = p0.j();
                      if (str != null) {
                         mImageConten1 = mPainterMode.mImageContent;
                         if (mImageConten1 != null) {
                            mImageConten1.mImageBytes = str;
                         }
                      }
                   }
                }else {
                label_0047 :
                   mPainterMode = p0.c();
                   if (mPainterMode == null) {
                      ShareInitResponse shareInitRes = p0.z();
                      shareInitRes = (shareInitRes != null)? shareInitRes.mPainterModel: imageContent;
                   }
                label_0058 :
                   if (mPainterMode != null) {
                      mImageConten = mPainterMode.mImageContent;
                      if (mImageConten != null) {
                         imageContent = mImageConten.mImageBytes;
                      }
                      if (imageContent == null || !imageContent.length()) {
                         str = 1;
                      }
                      if (str != null) {
                         str = p0.o();
                         if (str != null) {
                            mImageConten1 = mPainterMode.mImageContent;
                            if (mImageConten1 != null) {
                               mImageConten1.mImageBytes = str;
                            }
                         }
                      }
                   }else if(imageContent == null){
                      i.a(R.style.arg_RES_7f11066a, 0x7f1043cb);
                      e.b(e.a, null, "save painter failed, painterModel is null", null, 5, null);
                      ot = t.just(p0);
                      a.o(ot, "Observable.just\(configuration\)");
                      return ot;
                   }else {
                      ot = t.create(new b$b(p0, imageContent)).subscribeOn(b.d()).observeOn(b.d()).doOnNext(new b$c(p0.x()+System.currentTimeMillis())).flatMap(new b$d(p0)).onErrorReturn(new b$e(p0));
                      a.o(ot, "Observable.create<Bitmap¡­      configuration\n    }");
                      return ot;
                   }
                }
             }else {
                goto label_0047 ;
             }
          }else {
             goto label_0047 ;
          }
       }else {
          goto label_0047 ;
       }
       imageContent = mPainterMode;
       goto label_0078 ;
    }
    public boolean available(){
       return true;
    }
}
