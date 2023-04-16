package com.yxcorp.gifshow.ad.AdProcess$h;
import p49.a;
import com.yxcorp.gifshow.ad.AdProcess;
import java.lang.Object;
import q35.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import p49.c;
import p49.c$a;
import com.google.gson.JsonObject;
import o49.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import android.app.Activity;
import lnc.a1;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import qrd.l1;

public final class AdProcess$h implements a	// class@0014e6
{
    public final AdProcess a;

    public void AdProcess$h(AdProcess p0){
       this.a = p0;
       super();
    }
    public final void a(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcess$h.class, "1")) {
          return;
       }
       p0.d(BusinessType.CONVERSION);
       p0.h(c.Z.a().a());
       JsonObject jsonObject = new JsonObject();
       g.a.e(jsonObject, new QPhoto(this.a.d().getPhoto()));
       jsonObject.c0("applink", this.a.d().getScheme());
       jsonObject.c0("url", this.a.d().getUrl());
       jsonObject.a0("activity_available", Integer.valueOf(a1.i(this.a.c())));
       jsonObject.a0("item_click_type", Integer.valueOf(AdProcessUtils.e(this.a.d())));
       jsonObject.a0("conversion_type", Integer.valueOf(this.a.d().getConversionType()));
       p0.f(jsonObject);
       return;
    }
}
