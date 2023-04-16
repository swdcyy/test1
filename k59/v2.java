package k59.v2;
import com.yxcorp.gifshow.widget.m;
import k59.u2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.LinkInfo;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShareInfo;
import mxb.c;
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
import k59.v2$a;
import zv5.b;
import bw5.u;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class v2 extends m	// class@002b2b
{
    public final u2 c;

    public void v2(u2 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, v2.class, "1")) {
          return;
       }
       this.c.P8();
       this.c.x.clear();
       this.c.w.clear();
       LinkInfo linkInfo = new LinkInfo();
       PhotoAdvertisement$ShareInfo shareInfo = c.I(this.c.p);
       PhotoAdvertisement photoAdverti = null;
       shareInfo = (shareInfo != null)? shareInfo.mShareIconUrl: photoAdverti;
       linkInfo.mIconUrl = shareInfo;
       linkInfo.mName = a1.p(0x7f101c05);
       u2 p = this.c.p;
       PhotoAdvertisement photoAdverti1 = (p != null)? p.get("AD"): photoAdverti;
       if (photoAdverti1 instanceof PhotoAdvertisement) {
          photoAdverti = photoAdverti1;
       }
       if (photoAdverti != null) {
          photoAdverti1 = photoAdverti.mUrl;
          if (photoAdverti1 != null) {
          label_005c :
             linkInfo.mUrl = photoAdverti1;
             linkInfo.mTitle = a1.p(0x7f104a61);
             linkInfo.mDesc = a1.p(0x7f104a60);
             str = String.valueOf(System.currentTimeMillis());
             IMShareRequest iMShareReque = new IMShareRequest(str, CollectionsKt__CollectionsKt.E(), t.k(IMShareLinkInfoObject.ofSend(linkInfo)));
             a uoa = d.a(0x7904f115);
             uoa.lG(str, new v2$a(this));
             Activity activity = this.c.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             d.a(0x7904f115).S40(activity, iMShareReque);
             return;
          }
       }
       str = "";
       goto label_005c ;
    }
}
