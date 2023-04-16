package c09.b;
import a59.e;
import c09.b$a;
import nsd.u;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShareInfo;
import mxb.c;
import com.yxcorp.gifshow.entity.LinkInfo;
import lnc.a1;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.System;
import com.kwai.feature.api.social.message.imshare.model.IMShareLinkInfoObject;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import trd.t;
import tkd.b;
import tkd.d;
import dw5.a;
import c09.b$b;
import zv5.b;
import bw5.u;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mxb.j0;
import mxb.i0;
import java.util.HashMap;
import java.util.Map;

public final class b extends e	// class@0004b6
{
    public ArrayList b;
    public ArrayList c;
    public f d;
    public static final b$a e;

    static {
       b.e = new b$a(null);
    }
    public void b(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.d = p0;
       this.b = new ArrayList();
       this.c = new ArrayList();
    }
    public String a(){
       return "clickToShare";
    }
    public Object c(JSONObject p0,a p1){
       String str;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       QPhoto qPhoto = this.d.e();
       if (qPhoto != null) {
          BaseFeed entity = qPhoto.getEntity();
          if (entity != null) {
             PhotoAdvertisement$ShareInfo shareInfo = c.I(entity);
             if (shareInfo != null) {
                LinkInfo linkInfo = new LinkInfo();
                linkInfo.mIconUrl = shareInfo.mShareIconUrl;
                linkInfo.mName = a1.p(0x7f101c05);
                shareInfo = entity.get("AD");
                if (!shareInfo instanceof PhotoAdvertisement) {
                   shareInfo = null;
                }
                if (shareInfo != null) {
                   PhotoAdvertisement mUrl = shareInfo.mUrl;
                   if (mUrl != null) {
                   label_004e :
                      linkInfo.mUrl = mUrl;
                      linkInfo.mTitle = a1.p(0x7f104a61);
                      linkInfo.mDesc = a1.p(0x7f104a60);
                      str = String.valueOf(System.currentTimeMillis());
                      IMShareRequest iMShareReque = new IMShareRequest(str, CollectionsKt__CollectionsKt.E(), t.k(IMShareLinkInfoObject.ofSend(linkInfo)));
                      d.a(0x7904f115).lG(str, new b$b(this, entity));
                      Activity uActivity = this.d.b();
                      Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                      d.a(0x7904f115).S40(uActivity, iMShareReque);
                      return this.e();
                   }
                }
                str = "";
                goto label_004e ;
             }else {
                return this.e();
             }
          }
       }
       return this.e();
    }
    public final ArrayList i(){
       return this.b;
    }
    public final ArrayList j(){
       return this.c;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       QPhoto qPhoto = this.d.e();
       if (qPhoto != null) {
          BaseFeed entity = qPhoto.getEntity();
          if (entity != null) {
             i0.a().e(15, entity).o(this.f(this.d)).a();
          }
       }
       return;
    }
}
