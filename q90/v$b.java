package q90.v$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import q90.v;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import android.content.Context;
import ekd.p0;
import e17.i;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import java.lang.System;
import j90.b;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaTagInfo;
import com.yxcorp.gifshow.nasa.NasaTagInfo$KuaiShanTemplateInfo;
import java.util.List;
import qrd.l1;
import az6.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import tkd.b;
import tkd.d;
import wm5.a;
import vm5.o;
import t90.j;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class v$b implements View$OnClickListener	// class@0029a3
{
    public final KSTemplateDetailInfo b;
    public final v c;
    public final boolean d;
    public final GifshowActivity e;

    public void v$b(KSTemplateDetailInfo p0,v p1,boolean p2,GifshowActivity p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onClick(View p0){
       int i;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, v$b.class, "1")) {
          return;
       }
       v$b tc = this.c;
       v$b tb = this.b;
       v$b te = this.e;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidTwoRefs(tb, te, tc, v.class, "3")) {
          int i1 = 0;
          Object[] objArray = new Object[i1];
          String str = "KSFriendTagBinder";
          if (!p0.C(te)) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
          }else {
             PhotoDetailParam photoDetailP = new PhotoDetailParam().setSource(6452).setBizType(4);
             a.o(photoDetailP, "PhotoDetailParam\(\)\n     ¡­izType.NASA_SLIDE_DETAIL\)");
             photoDetailP.getSlidePlayConfig().setEnablePullRefresh(i1);
             String str1 = "ksFriendTag#"+System.currentTimeMillis();
             photoDetailP.setSlidePlayId(str1);
             KSTemplateDetailInfo mTemplateId = tb.mTemplateId;
             a.o(mTemplateId, "info.mTemplateId");
             b uob = new b(mTemplateId);
             b.g(j.e(uob, str1, SlideMediaType.ALL));
             NasaSlideParam$a uoa = new NasaSlideParam$a();
             uoa.T("DETAIL");
             uoa.Z("KS_FRIEND_TAG");
             uoa.H(tb.mName);
             uoa.C(i1);
             uoa.q(i1);
             NasaTagInfo nasaTagInfo = new NasaTagInfo();
             KSTemplateDetailInfo mTemplateId1 = tb.mTemplateId;
             a.o(mTemplateId1, "info.mTemplateId");
             KSTemplateDetailInfo mName = tb.mName;
             a.o(mName, "info.mName");
             KSTemplateDetailInfo mPosterShowI = tb.mPosterShowIcon;
             a.o(mPosterShowI, "info.mPosterShowIcon");
             nasaTagInfo.setKuaishanInfo(new NasaTagInfo$KuaiShanTemplateInfo(mTemplateId1, mName, mPosterShowI));
             uoa.P(nasaTagInfo);
             Object[] objArray1 = new Object[i1];
             NasaSlideParam nasaSlidePar = uoa.a();
             d.a(0x66aa3a58).z20(te, 1025, photoDetailP, null, 0, 0, nasaSlidePar, true, null);
          }
       }
       tc = this.e;
       i = (int)this.b.mFriendUseCount;
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || (!PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(i), null, oj, "36") && tc != null)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FRIEND_USE";
          i3 oi3 = i3.f();
          oi3.c("friends_num", Integer.valueOf(i));
          uElementPack.params = oi3.e();
          u1.L("", tc, 1, uElementPack, null);
       }
       PatchProxy.onMethodExit(v$b.class, "1");
       return;
    }
}
