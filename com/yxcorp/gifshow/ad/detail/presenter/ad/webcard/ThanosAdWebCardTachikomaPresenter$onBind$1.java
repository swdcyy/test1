package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;

public final class ThanosAdWebCardTachikomaPresenter$onBind$1 extends Lambda implements l	// class@00162a
{
    public final ThanosAdWebCardTachikomaPresenter this$0;

    public void ThanosAdWebCardTachikomaPresenter$onBind$1(ThanosAdWebCardTachikomaPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdWebCardTachikomaPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "jsonObject");
       ThanosAdWebCardTachikomaPresenter k = this.this$0.K;
       PhotoAdvertisement$TkTemplateInfo templateId = (k != null)? k.templateId: null;
       if (templateId == null) {
          templateId = "";
       }
       p0.c0("template_id", templateId);
       return;
    }
}
