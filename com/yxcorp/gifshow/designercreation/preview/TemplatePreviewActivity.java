package com.yxcorp.gifshow.designercreation.preview.TemplatePreviewActivity;
import im8.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.designercreation.preview.TemplatePreviewActivity$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.designercreation.preview.TemplatePreviewActivityAccessor;
import java.util.Map;
import java.util.HashMap;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.kwai.feature.post.api.util.g;
import android.content.Intent;
import android.os.Parcelable;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter;
import android.view.View;
import im8.c;

public final class TemplatePreviewActivity extends GifshowActivity implements g	// class@00130a
{
    public KwaiTemplate A;
    public HashMap B;
    public PresenterV2 y;
    public String z;
    public static final TemplatePreviewActivity$a C;

    static {
       TemplatePreviewActivity.C = new TemplatePreviewActivity$a(null);
    }
    public void TemplatePreviewActivity(){
       super();
       this.z = "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TemplatePreviewActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new TemplatePreviewActivityAccessor();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, TemplatePreviewActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(TemplatePreviewActivity.class, new TemplatePreviewActivityAccessor());
       }else {
          obj.put(TemplatePreviewActivity.class, null);
       }
       return obj;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, TemplatePreviewActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "FEATURED_DETAIL";
    }
    public void onCreate(Bundle p0){
       TemplatePreviewActivity templatePrev = TemplatePreviewActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, templatePrev, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0039);
       g.a(this);
       String stringExtra = this.getIntent().getStringExtra("USER_ID");
       if (stringExtra == null) {
          stringExtra = "";
       }
       this.z = stringExtra;
       this.A = this.getIntent().getParcelableExtra("INIT_TEMPLATE");
       if (!PatchProxy.applyVoid(null, this, templatePrev, "3")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.y = presenterV2;
          presenterV2.U7(new TemplatePreviewPresenter());
          View view = this.findViewById(R.id.template_preview_container);
          templatePrev = this.y;
          if (templatePrev != null) {
             templatePrev.f(view);
          }
          TemplatePreviewActivity ty = this.y;
          if (ty != null) {
             Object[] objArray = new Object[]{new c("CREATION_TEMPLATE", this.A),new c("CREATION_USER_ID", this.z)};
             ty.i(objArray);
          }
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, TemplatePreviewActivity.class, "4")) {
          return;
       }
       super.onDestroy();
       TemplatePreviewActivity ty = this.y;
       if (ty != null && ty.R1() == true) {
          ty = this.y;
          if (ty != null) {
             ty.unbind();
          }
          ty = this.y;
          if (ty != null) {
             ty.destroy();
          }
       }
    label_0028 :
       return;
    }
}
