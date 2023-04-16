package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;

public final class AdPlayEndTKPresenter$onBind$2 extends Lambda implements l	// class@0015ef
{
    public final AdPlayEndTKPresenter this$0;

    public void AdPlayEndTKPresenter$onBind$2(AdPlayEndTKPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdPlayEndTKPresenter$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "jsonObject");
       AdPlayEndTKPresenter g = this.this$0.G;
       PhotoAdvertisement$TkTemplateInfo templateId = (g != null)? g.templateId: null;
       if (templateId == null) {
          templateId = "";
       }
       p0.c0("template_id", templateId);
       return;
    }
}
