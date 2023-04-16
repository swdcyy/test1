package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;

public final class ThanosAdActionBarTKPresenter$onBind$1 extends Lambda implements l	// class@001577
{
    public final ThanosAdActionBarTKPresenter this$0;

    public void ThanosAdActionBarTKPresenter$onBind$1(ThanosAdActionBarTKPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdActionBarTKPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "jsonObject");
       ThanosAdActionBarTKPresenter e = this.this$0.E;
       PhotoAdvertisement$TkTemplateInfo templateId = (e != null)? e.templateId: null;
       if (templateId == null) {
          templateId = "";
       }
       p0.c0("template_id", templateId);
       return;
    }
}
