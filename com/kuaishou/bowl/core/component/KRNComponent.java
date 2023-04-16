package com.kuaishou.bowl.core.component.KRNComponent;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.bowl.core.component.KRNComponent$1;
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
import hu4.h;
import java.lang.Integer;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import java.util.Map;
import fv.h;
import uu.c;
import su4.a;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import yz7.e;
import fv.g;
import nv.d;
import java.lang.Exception;
import java.util.HashMap;
import pv.a;
import nv.c;
import su.g;
import java.lang.Boolean;
import iv.b;

public class KRNComponent extends a	// class@001190
{
    public f a;

    public void KRNComponent(){
       super();
       this.a = new KRNComponent$1(this);
    }
    public View createView(FragmentActivity p0,n p1,ViewGroup p2,f p3){
       p2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, KRNComponent.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       h oh = this.createRenderEngine(p0, p1, this.a);
       if (oh == null) {
          return null;
       }
       ViewGroup viewGroup = oh.d();
       this.bindRenderEngine(viewGroup, oh);
       return viewGroup;
    }
    public String getComponentType(){
       return "RN";
    }
    public boolean isTypeNative(){
       return false;
    }
    public void onBindView(a p0,View p1,int p2){
       int this;
       Object obj;
       a uoa = this;
       a uoa1 = p0;
       View view = p1;
       if (PatchProxy.isSupport(KRNComponent.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KRNComponent.class, "2")) {
          return;
       }
       if (uoa1) {
          a componentDat = uoa1.componentData;
          if (componentDat != null) {
             h.f(componentDat.engineConfig, componentDat.style, view);
             a componentDat1 = uoa1.componentData;
             h oh = c.a().g(uoa.pageHashCode, a.a(p1));
             if (oh != null) {
                PageDyComponentInfo filedData = componentDat1.filedData;
                if (filedData != null) {
                   PageComponentDataInfo$Field data = filedData.data;
                   if (data != null) {
                      int i = 0;
                      this = 2;
                      Map map = null;
                      int i1 = 1;
                      try{
                         obj = e.a(String.valueOf(data), Map.class);
                         try{
                            filedData = componentDat1.commonData;
                            if (filedData != null) {
                               map = e.a(String.valueOf(filedData), Map.class);
                            }
                            if (obj != null) {
                               obj.put("commonData", map);
                            }
                            g og = g.a(uoa.pageHashCode);
                            HashMap hashMap = new HashMap();
                            hashMap.put("index", Integer.valueOf(this.getAdapterPosition()));
                            hashMap.put("instanceId", this.getInstanceId());
                            hashMap.put("isFromCache", Boolean.valueOf(uoa.isFromCache));
                            if (og != null) {
                               og = og.A;
                               if (og != null) {
                                  Map map1 = og.a();
                                  if (map1 != null) {
                                     hashMap.putAll(map1);
                                  }
                               }
                            }
                            if (obj != null) {
                               obj.put("localProps", hashMap);
                            }
                            PageDyComponentInfo style = componentDat1.style;
                            if (style != null) {
                               obj.put("style", style);
                            }
                            Map[] this1 = new Map[this];
                            this1[i] = obj;
                            this1[i1] = componentDat1.style;
                            oh.n(view, this1);
                            if (uoa1.isReportViewShow == null && uoa.isFromCache == null) {
                               HashMap hashMap1 = new HashMap();
                               hashMap1.put("index", Integer.valueOf(p2));
                               if (map != null) {
                                  hashMap1.put("commonData", map);
                               }
                               oh.p(view, hashMap1);
                               uoa1.isReportViewShow = i1;
                            }
                         }catch(java.lang.Exception e0){
                         }
                         String[] stringArray = new String[]{"component","msg"};
                         String[] stringArray1 = new String[this];
                         stringArray1[i] = this.getComponentName();
                         stringArray1[i1] = e0.getMessage();
                         c.d(d.a(g.a(uoa.pageHashCode), "Component updateWidget json parse error"), a.a(stringArray, stringArray1));
                         goto label_009a ;
                      }catch(java.lang.Exception e0){
                         obj = map;
                         goto label_0071 ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void onViewChanged(){
    }
}
