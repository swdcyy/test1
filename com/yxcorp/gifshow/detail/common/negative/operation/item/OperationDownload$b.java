package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDownload$b;
import erd.g;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDownload;
import kf5.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import v6a.m0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import exb.b;
import zic.p0;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import xx9.a;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import bz9.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class OperationDownload$b implements g	// class@00147c
{
    public final OperationDownload b;
    public final g c;

    public void OperationDownload$b(OperationDownload p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationDownload$b.class, "1")) {
       }else {
          p0 = this.b.E;
          String str = "photo";
          a.o(p0, str);
          if (!p0.isAllowPhotoDownload()) {
             this.c.a();
             a.o(i.g(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100ecf), true, true), "KSToast.applyStyle\(\n    бн\), true, true\n          \)");
          }else {
             p0 = this.b;
             String str1 = "PLAYER_PANEL_SHARE";
             b uob = null;
             p0.b(p0.C, p0.E.mEntity, new StatModel(str1), this.b.F.m0, uob);
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(uob, p0, OperationDownload.class, "4")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.type = 18;
                uElementPack.action2 = "DOWNLOAD_BTN_IN_LONG_PRESS_MASK";
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("source", str1);
                m0 r = p0.F.r;
                i = (r != null && r.c() == true)? 1: 0;
                jsonObject.a0("is_simplify_screen", Integer.valueOf(i));
                uElementPack.params = jsonObject.toString();
                OperationDownload e = p0.E;
                a.o(e, str);
                ClientContent$PhotoPackage photoPackage = w1.f(e.getEntity());
                OperationDownload e1 = p0.E;
                a.o(e1, str);
                photoPackage.identity = TextUtils.k(e1.getPhotoId());
                e1 = p0.E;
                a.o(e1, str);
                Long longx = Long.valueOf(e1.getUserId());
                a.o(longx, "java.lang.Long.valueOf\(photo.userId\)");
                photoPackage.authorId = longx.longValue();
                OperationDownload e2 = p0.E;
                a.o(e2, str);
                photoPackage.type = (c.a.a(e2))? 5: 1;
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.photoPackage = photoPackage;
                u1.M("", p0.D, 1, uElementPack, uContentPack, null);
             }
             this.c.a();
          }
       }
       return;
    }
}
