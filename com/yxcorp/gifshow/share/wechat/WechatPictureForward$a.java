package com.yxcorp.gifshow.share.wechat.WechatPictureForward$a;
import erd.o;
import com.yxcorp.gifshow.share.wechat.WechatPictureForward;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import e17.i;
import java.util.Objects;
import brd.t;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import mhc.v;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.app.Activity;
import cw9.c;
import t45.d;
import brd.z;
import ajc.l;
import ajc.m;
import erd.g;
import com.yxcorp.gifshow.share.wechat.b;

public final class WechatPictureForward$a implements o	// class@001ca1
{
    public final WechatPictureForward b;
    public final KwaiOperator c;

    public void WechatPictureForward$a(WechatPictureForward p0,KwaiOperator p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       WechatPictureForward$a obj = PatchProxy.applyOneRefs(p0, this, WechatPictureForward$a.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "isGranted");
          if (p0.booleanValue()) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1047d8);
             p0 = this.b;
             obj = this.c;
             Objects.requireNonNull(p0);
             SharePlatformData$ShareConfig obj1 = PatchProxy.applyOneRefs(obj, p0, WechatPictureForward.class, "2");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
                SharePlatformData$ShareConfig mQRCodeKey = p0.a(obj.i()).mQRCodeKey;
                if (mQRCodeKey == null) {
                   mQRCodeKey = "";
                }
                obj1 = p0.a(obj.i()).mShareUrl;
                a.o(obj1, "getShareConfig\(operator.model\).mShareUrl");
                Resources resources = obj.c().getResources();
                i = (resources != null)? c.b(resources, R.dimen.arg_RES_7f070d53): 190;
                z c = d.c;
                p0 = p0.D0(mQRCodeKey, obj1, i).observeOn(c).flatMap(new l(p0, obj)).doOnNext(m.b).subscribeOn(c);
                a.o(p0, "downloadQrCode\(qrCodeKey¡­eOn\(KwaiSchedulers.ASYNC\)");
             }
          }else {
             p0 = t.just(this.c.i()).doOnNext(b.b);
          }
          obj = p0;
       }
       return obj;
    }
}
