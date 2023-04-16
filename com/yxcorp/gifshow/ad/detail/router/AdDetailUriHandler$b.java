package com.yxcorp.gifshow.ad.detail.router.AdDetailUriHandler$b;
import erd.o;
import com.yxcorp.gifshow.ad.detail.router.AdDetailUriHandler;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Long;
import tkd.b;
import tkd.d;
import nl9.u;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;

public final class AdDetailUriHandler$b implements o	// class@0016e3
{
    public final AdDetailUriHandler b;
    public final String c;
    public final String d;
    public final long e;

    public void AdDetailUriHandler$b(AdDetailUriHandler p0,String p1,String p2,long p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       PhotoAdvertisement obj = PatchProxy.applyOneRefs(p0, this, AdDetailUriHandler$b.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "qPhoto");
          AdDetailUriHandler$b tb = this.b;
          AdDetailUriHandler$b tc = this.c;
          a.o(tc, "serverExpTag");
          AdDetailUriHandler$b td = this.d;
          a.o(td, "extraInfo");
          AdDetailUriHandler$b te = this.e;
          Objects.requireNonNull(tb);
          if (PatchProxy.isSupport(AdDetailUriHandler.class)) {
             obj = PatchProxy.applyFourRefs(p0, tc, td, Long.valueOf(te), tb, AdDetailUriHandler.class, "2");
             if (obj != PatchProxyResult.class) {
                p0 = obj;
             }else {
             label_0049 :
                d.a(-1694791652).xf(p0, td);
                if (TextUtils.isEmpty(p0.getServerExpTag())) {
                   p0.setServerExpTag(tc);
                }
                obj = k.B(p0);
                if (obj != null) {
                   obj.mockFansTopChargeInfo();
                   obj.mVideoPlayStartTimeMS = te;
                   PhotoAdvertisement mAdLabelDesc = obj.mAdLabelDescription;
                   mAdLabelDesc = (mAdLabelDesc == null || !mAdLabelDesc.length())? 1: 0;
                   if (!mAdLabelDesc) {
                      p0.setCaption(obj.mAdLabelDescription);
                   }
                }
             }
          }else {
             goto label_0049 ;
          }
          obj = p0;
       }
       return obj;
    }
}
