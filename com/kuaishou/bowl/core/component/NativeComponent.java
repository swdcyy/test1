package com.kuaishou.bowl.core.component.NativeComponent;
import com.kuaishou.bowl.core.component.a;
import androidx.fragment.app.FragmentActivity;
import hu4.n;
import android.view.ViewGroup;
import hu4.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import fv.g;
import nv.d;
import java.util.HashMap;
import pv.a;
import nv.c;
import hu4.h;
import com.kuaishou.bowl.event.utils.StageName;
import com.kuaishou.bowl.core.component.NativeComponent$1;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import fv.c;
import vu4.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import yz7.e;
import java.lang.Exception;
import su.e;
import uu.c;
import java.util.Objects;
import uu.h;
import java.util.Set;

public abstract class NativeComponent extends a	// class@001192
{

    public void NativeComponent(){
       super();
    }
    public final View createView(FragmentActivity p0,n p1,ViewGroup p2,f p3){
       String[] stringArray;
       String[] stringArray1;
       String obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, NativeComponent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p1 == null) {
          p1 = new n(obj, obj);
       }
       int i = 0;
       if (!this.initRenderParams(p0, p2, p1)) {
          stringArray = new String[]{"component"};
          stringArray1 = new String[]{this.getComponentName()};
          c.d(d.a(g.a(this.pageHashCode), "native initRenderParams error nativeView is null"), a.a(stringArray, stringArray1));
          this.setP1();
          return obj;
       }else {
          h oh = this.createRenderEngine(p0, p1, p3);
          if (oh == null) {
             stringArray = new String[]{"component"};
             stringArray1 = new String[]{this.getComponentName()};
             c.d(d.a(g.a(this.pageHashCode), "native createView createRenderEngine error"), a.a(stringArray, stringArray1));
             return obj;
          }else {
             c.k(StageName.pgy_component_render_success, this.componentData, this.getPageName(), this.rubasToken, new NativeComponent$1(this));
             return oh.s;
          }
       }
    }
    public String getComponentType(){
       return "NATIVE";
    }
    public PresenterV2 getPresenterV2(View p0){
       return null;
    }
    public final boolean initRenderParams(FragmentActivity p0,ViewGroup p1,n p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, NativeComponent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "kwai://native/"+this.getComponentName();
       HashMap hashMap = new HashMap();
       View view = this.onCreateView(p0, p1);
       if (view == null) {
          return false;
       }
       hashMap.put("component", view);
       if (p2 != null) {
          p2.a = obj;
          n b = p2.b;
          if (b != null) {
             b.putAll(hashMap);
          }else {
             p2.b = hashMap;
          }
       }
       return true;
    }
    public boolean isTypeNative(){
       return true;
    }
    public void onBindView(a p0,View p1,int p2){
       PageDyComponentInfo commonData;
       if (PatchProxy.isSupport(NativeComponent.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, NativeComponent.class, "3")) {
          return;
       }
       if (p0 != null) {
          a componentDat = p0.componentData;
          if (componentDat != null) {
             PageDyComponentInfo filedData = componentDat.filedData;
             if (filedData != null && filedData.data != null) {
                Map map = null;
                boolean b = true;
                try{
                   commonData = componentDat.commonData;
                   if (commonData != null) {
                      map = e.a(String.valueOf(commonData), Map.class);
                   }
                }catch(java.lang.Exception e9){
                   String[] stringArray = new String[]{"component","msg"};
                   String[] stringArray1 = new String[2];
                   stringArray1[0] = this.getComponentName();
                   stringArray1[b] = e9.getMessage();
                   c.d(d.a(g.a(this.pageHashCode), "Component onBindView json parse error"), a.a(stringArray, stringArray1));
                }
                if (p0.isReportViewShow == null && this.isFromCache == null) {
                   HashMap hashMap = new HashMap();
                   hashMap.put("index", Integer.valueOf(p2));
                   if (map != null) {
                      hashMap.put("commonData", map);
                   }
                   this.viewShow(hashMap);
                   p0.isReportViewShow = b;
                }
             }
          }
       }
       return;
    }
    public abstract View onCreateView(FragmentActivity p0,ViewGroup p1);
    public final void putPresenterV2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NativeComponent.class, "4")) {
          return;
       }
       if (!e.b("enableManagePresenterV2", false)) {
          return;
       }
       PresenterV2 presenterV2 = this.getPresenterV2(p0);
       if (presenterV2 != null) {
          c uoc = c.a();
          a tpageHashCod = this.pageHashCode;
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoidTwoRefsWithListener(tpageHashCod, presenterV2, uoc, c.class, "42")) {
             h oh = uoc.a.get(tpageHashCod);
             if (oh != null && !PatchProxy.applyVoidOneRefsWithListener(presenterV2, oh, h.class, "29")) {
                oh.j.add(presenterV2);
                PatchProxy.onMethodExit(h.class, "29");
             }
             PatchProxy.onMethodExit(c.class, "42");
          }
       }
       return;
    }
    public void viewShow(Map p0){
    }
}
