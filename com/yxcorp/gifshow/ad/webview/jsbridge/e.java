package com.yxcorp.gifshow.ad.webview.jsbridge.e;
import ql9.q;
import com.yxcorp.gifshow.ad.webview.jsbridge.f;
import com.yxcorp.gifshow.commercial.api.b;
import f55.g;
import com.kuaishou.android.model.ads.NeoParamsVideoInfo;
import java.lang.Object;
import ql9.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import yx.j0;
import android.os.Bundle;
import im9.a;
import com.kuaishou.android.model.ads.AdNeoInfo;
import com.kuaishou.android.model.ads.NeoParamsBaseInfo;
import java.util.List;
import nsd.u;
import dy8.g;
import dy8.b;
import fg6.a;
import com.google.gson.Gson;
import brd.t;
import o49.h;
import com.kwai.framework.model.feed.BaseFeed;
import o49.f;
import p49.c;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.yxcorp.gifshow.ad.webview.jsbridge.b;
import msd.l;
import com.yxcorp.gifshow.commercial.api.AdSession;
import java.util.UUID;
import brd.x;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import o59.o;
import erd.a;
import o59.f;
import o59.e;
import erd.g;
import crd.b;
import ql9.p;

public class e implements q	// class@0018ce
{
    public final b a;
    public final g b;
    public final NeoParamsVideoInfo c;
    public final f d;

    public void e(f p0,b p1,g p2,NeoParamsVideoInfo p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(boolean p0,o p1){
       Object obj = this;
       Object[] obj1 = p1;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), obj1, obj, uoe, "1")) {
          return;
       }
       uoe = obj.d;
       e a = obj.a;
       e b = obj.b;
       e c = obj.c;
       Objects.requireNonNull(uoe);
       f uof = f.class;
       int i = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),obj1,a,b,c};
          if (!PatchProxy.applyVoid(objArray, uoe, uof, "4")) {
          label_004c :
             String str = "AdvertiseBridgeModule";
             if (!p0) {
                obj1 = new Object[i];
                j0.f(str, "onNeoAdVideoPageClose, rewarded is false", obj1);
                a.d();
                b.a(-1, "task is not finish", null);
             }else if(obj1 == null){
                obj1 = new Object[i];
                j0.c(str, "onNeoAdVideoPageClose, rewardInfo is null", obj1);
                a.d();
             }else {
                e uoe1 = a;
                a uoa = new a(c.mPageId, c.mSubPageId, obj1.c, c.mBusinessId, "video", c.mExtParams, obj1.a, obj1.b, obj1.d, 0, 512, null);
                h oh = new h(p1.a(), c.mPageId, c.mSubPageId, new f(c.g, BusinessType.NEO_VIDEO, b.b, null, 8, null), uoe1.e().getSessionId().toString());
                t ot = b.a().a(a.a.q(str)).compose(b);
                c = b;
                f uof1 = new f(c, str, obj1);
                ot.map(new e()).observeOn(d.a).doFinally(new o(uoe1)).subscribe(uof1, new e(c, obj1));
             }
          }
       }else {
          goto label_004c ;
       }
       return;
    }
    public void onFirstFrame(){
       p.a(this);
    }
    public void r(){
       p.c(this);
    }
}
