package com.yxcorp.gifshow.share.guide.mode.ShareFloatChecker;
import bic.d;
import uo7.k;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.guide.mode.ShareFloatChecker$mDestChannels$1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import zsd.u;
import java.util.Iterator;
import java.util.ArrayList;

public final class ShareFloatChecker extends d	// class@001b97
{
    public final ArrayList d;
    public final k e;
    public final PhotoDetailParam f;
    public final int g;

    public void ShareFloatChecker(k p0,PhotoDetailParam p1,int p2){
       a.p(p0, "conf");
       a.p(p1, "mParam");
       Activity uActivity = p0.k();
       Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       super(uActivity, p1, p2);
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.d = new ShareFloatChecker$mDestChannels$1();
    }
    public boolean N(){
       boolean b1;
       Object[] objArray1;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ShareFloatChecker shareFloatCh = ShareFloatChecker.class;
       Object[] objArray = null;
       ShareFloatChecker obj = PatchProxy.apply(objArray, this, shareFloatCh, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (super.N()) {
          obj = this.e;
          Object obj1 = PatchProxy.applyOneRefs(obj, this, shareFloatCh, "2");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(obj.r() == null){
             objArray1 = objArray;
          }else {
             ShareAnyResponse shareAnyResp = obj.r();
             a.m(shareAnyResp);
             shareAnyResp = shareAnyResp.mShareAnyData;
          }
          if (objArray1 != null) {
             objArray = objArray1.mShareChannel;
          }
          obj1 = PatchProxy.applyTwoRefs(objArray1, objArray, this, shareFloatCh, "3");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(objArray1 == null){
             str = "EMPTY#REPLACEMENT";
          }else {
             str = objArray1.mShareMethod;
          }
          if (!u.I1("token", str, true) && !u.I1("download", str, true)) {
             Object obj2 = PatchProxy.applyOneRefs(objArray, this, shareFloatCh, "4");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else {
                Iterator iterator = this.d.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (u.I1(iterator.next(), objArray, true)) {
                         b1 = true;
                      }
                   }else {
                      b1 = false;
                   }
                }
             }
             if (b1) {
                b1 = true;
             }
          }
       label_0097 :
          b1 = false;
          if (b1) {
             b = true;
          }
       }
       return b;
    }
}
