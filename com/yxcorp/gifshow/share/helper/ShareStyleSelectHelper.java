package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import cic.c;
import uo7.k;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.share.model.ShareWechatMomentsChooseConfig;
import java.lang.reflect.Type;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$a;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import u07.t;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1;
import com.yxcorp.gifshow.widget.SectorProgressView;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$autoDownloadVideo$1;
import cxb.a;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import kp.r1;
import ekd.j;
import java.lang.Integer;
import exb.b;
import ixb.z;
import ixb.x;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class ShareStyleSelectHelper extends c	// class@001baa
{
    public final String e;
    public SectorProgressView f;
    public TextView g;
    public TextView h;
    public TextView i;
    public TextView j;
    public ShareWechatMomentsChooseConfig k;
    public boolean l;
    public boolean m;
    public boolean n;
    public b o;
    public boolean p;
    public t q;
    public e r;

    public void ShareStyleSelectHelper(k p0,QPhoto p1){
       a.p(p0, "conf");
       a.p(p1, "photo");
       super(p0, p1);
       this.e = "userChoosePicture";
       this.k = a.t().getValue("shareWechatMomentsChooseConfig", ShareWechatMomentsChooseConfig.class, null);
       d uod = new d(p0.k());
       uod.Z0(55);
       uod.b1(KwaiDialogOption.d);
       uod.A(true);
       uod.J(new ShareStyleSelectHelper$a(this, p1, p0));
       uod.L(new ShareStyleSelectHelper$b(this, p0, p1));
       t ot = uod.b0();
       a.o(ot, "KwaiDialogBuilder\(conf.m¡­w\n      }\)\n      .build\(\)");
       this.q = ot;
       this.r = new ShareStyleSelectHelper$listener$1(this, p0);
    }
    public static final SectorProgressView e(ShareStyleSelectHelper p0){
       p0 = p0.f;
       if (p0 == null) {
          a.S("progressBar");
       }
       return p0;
    }
    public static final TextView f(ShareStyleSelectHelper p0){
       p0 = p0.g;
       if (p0 == null) {
          a.S("progressText");
       }
       return p0;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShareStyleSelectHelper.class, "7")) {
          return;
       }
       GifshowActivity gifshowActiv = this.b().k();
       QPhoto mEntity = this.c().mEntity;
       String str = "SHARE_PANNEL";
       ShareStyleSelectHelper$autoDownloadVideo$1 uoautoDownlo = new ShareStyleSelectHelper$autoDownloadVideo$1(this);
       if (!PatchProxy.applyVoidFourRefs(gifshowActiv, mEntity, str, uoautoDownlo, null, a.class, "1")) {
          StatModel statModel = new StatModel(str);
          if (!PatchProxy.applyVoidFourRefs(gifshowActiv, mEntity, statModel, uoautoDownlo, null, a.class, "2")) {
             int i = 1;
             if (mEntity != null && (!j.h(r1.n0(mEntity)) && r1.n0(mEntity).length > i)) {
                a.a(gifshowActiv, mEntity, statModel);
             }else {
                int i1 = -1;
                if (PatchProxy.isSupport(a.class)) {
                   Object[] objArray1 = new Object[]{gifshowActiv,mEntity,statModel,Integer.valueOf(i1),uoautoDownlo};
                   if (!PatchProxy.applyVoid(objArray1, objArray, a.class, "3")) {
                   }
                }else if(mEntity != null){
                   QPhoto qPhoto = new QPhoto(mEntity);
                   if (qPhoto.isAtlasPhotos() || qPhoto.isLongPhotos()) {
                      a.a(gifshowActiv, mEntity, statModel);
                   }else {
                      objArray = x.a(gifshowActiv, qPhoto, statModel, uoautoDownlo);
                   }
                   if (objArray != null) {
                      objArray.start();
                   }
                }
             }
          }
       }
       return;
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareStyleSelectHelper.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       i3 oi3 = i3.f();
       oi3.d("is_wx_limit", "TRUE");
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, null);
       return;
    }
    public final void h(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareStyleSelectHelper.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       i3 oi3 = i3.f();
       oi3.d("is_wx_limit", "TRUE");
       oi3.d("icon_type", p1);
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, null);
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, ShareStyleSelectHelper.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "WECHAT_TIMELINE_LIMIT_POPUP";
       i3 oi3 = i3.f();
       oi3.d("is_wx_limit", "TRUE");
       uElementPack.params = oi3.e();
       u1.u0(4, uElementPack, null);
       return;
    }
}
