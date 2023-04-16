package com.kuaishou.bowl.core.component.c;
import com.kuaishou.bowl.core.component.a;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.bowl.core.component.c$a;
import com.kuaishou.bowl.core.component.c$b;
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
import su.g;
import hu4.h;
import hu4.c;
import uu.k;
import java.lang.Runnable;
import ekd.s1;
import java.lang.ref.WeakReference;
import com.kuaishou.render.engine.tk.b;
import com.kuaishou.bowl.core.component.TKComponent$3;
import com.kuaishou.tachikoma.TKViewContainerWrapView$a;
import com.kuaishou.tachikoma.TKViewContainerWrapView;
import uu.c;
import com.kuaishou.render.engine.tk.view.TKWrapView;
import java.lang.Throwable;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import fv.g;
import nv.d;
import java.util.HashMap;
import pv.a;
import java.util.Map;
import nv.c;
import su.a;
import com.kuaishou.bowl.core.component.NativeComponent;
import iv.a;
import com.google.gson.Gson;
import androidx.fragment.app.Fragment;
import com.kuaishou.bowl.event.utils.StageName;
import fv.c;
import java.lang.Integer;
import android.widget.FrameLayout;
import su4.a;
import java.util.Objects;
import uu.h;
import java.util.List;
import java.util.ArrayList;
import uu.j;
import fv.h;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import yz7.e;
import java.lang.Exception;
import java.lang.Boolean;
import iv.b;
import java.lang.StringBuilder;
import sx4.e;
import tx4.h;

public class c extends a	// class@0011a2
{
    public NativeComponent a;
    public boolean b;
    public WeakReference c;
    public Handler d;
    public String e;
    public List f;
    public View g;
    public View h;
    public View$OnAttachStateChangeListener i;
    public c j;

    public void c(){
       super();
       this.d = new Handler(Looper.getMainLooper());
       this.e = "sync";
       this.i = new c$a(this);
       this.j = new c$b(this);
    }
    public View createView(FragmentActivity p0,n p1,ViewGroup p2,f p3){
       c uoc = this;
       FragmentActivity uFragmentAct = p0;
       n on = p1;
       ViewGroup viewGroup = p2;
       f uof = p3;
       g obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.l();
       if (uoc.b != null) {
          return uoc.n(uFragmentAct, viewGroup, uof);
       }
       on.d = uoc.pageHashCode;
       boolean b = true;
       on.c = b;
       on.e = this.getPageName();
       obj = g.a(uoc.pageHashCode);
       if (obj != null) {
          on.h = obj.P;
          on.k = obj.w;
       }
       h oh = uoc.createRenderEngine(uFragmentAct, on, uof);
       if (oh == null) {
          return null;
       }else {
          oh.j(uoc.j);
          if (!PatchProxy.applyVoid(null, uoc, c.class, "15")) {
             obj = g.a(uoc.pageHashCode);
             if (obj != null && obj.K != null) {
                s1.d(new k(uoc, obj));
             }
          }
          uoc.c = new WeakReference(oh);
          if (PatchProxy.isSupport(c.class)) {
             Object[] objArray = new Object[]{uFragmentAct,on,viewGroup,uof,oh};
             if (!PatchProxy.applyVoid(objArray, uoc, c.class, "3")) {
             label_00a0 :
                if (oh instanceof b) {
                   TKComponent$3 u3 = this;
                   TKComponent$3 u31 = this;
                   u3 = new TKComponent$3(this, p0, p1, p2, p3);
                   oh.s(u31);
                }
             }
          }else {
             goto label_00a0 ;
          }
          ViewGroup viewGroup1 = oh.d();
          if (viewGroup1 != null && (viewGroup1 instanceof TKViewContainerWrapView || (!PatchProxy.applyVoid(null, uoc, c.class, "8") && !c.a().m(uoc.pageHashCode, this.getComponentName())))) {
             c.a().p(uoc.pageHashCode, this.getComponentName(), 0);
          }
       label_00ec :
          if (viewGroup1 instanceof TKWrapView && viewGroup1.j()) {
             uoc.e = "async";
             uoc.addError("同步创建失败，开始异步创建", null, null);
          }
          if (viewGroup1 == null && (!c.a().m(uoc.pageHashCode, this.getComponentName()) || c.a().l(uoc.pageHashCode, this.getComponentName()))) {
             if (!TextUtils.isEmpty(this.getComponentData().downgradeName)) {
                c.a().p(uoc.pageHashCode, this.getComponentName(), true);
                uoc.b = true;
                return uoc.n(uFragmentAct, viewGroup, uof);
             }else {
                String[] stringArray = new String[]{"component"};
                String[] stringArray1 = new String[]{this.getComponentName()};
                c.d(d.a(g.a(uoc.pageHashCode), "dynamic view create error no degrade return null"), a.a(stringArray, stringArray1));
             }
          }
          uoc.bindRenderEngine(viewGroup1, oh);
          return viewGroup1;
       }
    }
    public String getComponentType(){
       return "TK";
    }
    public boolean isTypeNative(){
       return false;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       if (c.a().l(this.pageHashCode, this.getComponentName())) {
          this.b = true;
          String[] stringArray = new String[]{"component"};
          String[] stringArray1 = new String[true];
          stringArray1[0] = this.getComponentName();
          c.d(d.a(g.a(this.pageHashCode), "tk createView degrade view"), a.a(stringArray, stringArray1));
       }
       return;
    }
    public final void m(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       a uoa = (this.getComponentData() != null && !TextUtils.isEmpty(this.getComponentData().downgradeName))? c.a().d(this.pageHashCode, this.getComponentData().downgradeName): objArray;
       if (uoa == null) {
          uoa = c.a().d(this.pageHashCode, this.getComponentName());
       }
       if (uoa != null) {
          this.a = uoa.a();
          uoa = this.componentData;
          uoa.renderType = "NATIVE";
          uoa.bundleUrl = objArray;
          PageDyComponentInfo name = uoa.name;
          if (!TextUtils.isEmpty(uoa.downgradeName)) {
             uoa = this.componentData;
             uoa.name = uoa.downgradeName;
          }
          this.a.setPageHashCode(this.pageHashCode);
          this.a.setComponentData(this.componentData);
          this.a.setCallerContexts(this.callerContext);
          this.a.setActivityHashCode(this.activityHashCode);
          this.a.setCurActivity(this.getCurActivity());
          this.a.updateModelObj(this.getModelObj());
          this.a.parseModel(this.getGson());
          this.componentData.name = name;
          this.a.setCurFragment(this.getCurFragment());
          this.a.setPosition(this.position);
       }
       return;
    }
    public final View n(FragmentActivity p0,ViewGroup p1,f p2){
       c obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.m();
       if (this.a != null) {
          this.addLog("触发降级，降级成功", "");
          obj = this.a;
          obj.rootView = obj.createView(p0, null, p1, p2);
          c.j(StageName.pgy_component_degrade, this.componentData, this.getPageName(), this.rubasToken);
          return this.a.rootView;
       }else {
          this.addError("触发降级，降级失败", null, null);
          String[] stringArray = new String[]{"component"};
          String[] stringArray1 = new String[]{this.getComponentName()};
          c.d(d.a(g.a(this.pageHashCode), "no degradeComponent return null"), a.a(stringArray, stringArray1));
          return null;
       }
    }
    public final void o(a p0,View p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, c.class, "10")) {
          return;
       }
       if (this.a == null) {
          this.m();
       }
       c ta = this.a;
       if (ta != null) {
          ta.onBindView(ta, p1, p2);
       }
       return;
    }
    public void onBindView(a p0,View p1,int p2){
       h oh1;
       int i3;
       Object obj1;
       HashMap hashMap1;
       String str3;
       c uoc = this;
       a uoa = p0;
       View view = p1;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, c.class, "5")) {
          return;
       }
       uoc.h = view;
       this.l();
       int i = 0;
       if (uoc.b != null) {
          if (view instanceof TKViewContainerWrapView) {
             View view1 = view;
             if (view1.getChildCount() > 0) {
                c.a("reuse degrade view");
                uoc.o(uoa, view1.getChildAt(i), p2);
             }
          }else {
             this.o(p0, p1, p2);
          }
          return;
       }else {
          h oh = c.a().g(uoc.pageHashCode, a.a(uoc.h));
          if (view != null && oh != null) {
             c uoc1 = c.a();
             a pageHashCode = uoc.pageHashCode;
             Objects.requireNonNull(uoc1);
             if (!PatchProxy.applyVoidThreeRefs(pageHashCode, oh, p1, uoc1, c.class, "12")) {
                oh1 = uoc1.f(pageHashCode);
                if (oh1 != null && !PatchProxy.applyVoidTwoRefs(oh, view, oh1, h.class, "14")) {
                   List list = oh1.d.get(oh);
                   if (list == null) {
                      ArrayList uArrayList = new ArrayList();
                      uArrayList.add(view);
                      oh1.d.put(oh, uArrayList);
                   }else if(!list.contains(view)){
                      list.add(view);
                   }
                }
             }
          }
          oh1 = h.class;
          String str = "7";
          if (!PatchProxy.applyVoidTwoRefs(view, oh, uoc, c.class, str) && (oh != null && oh instanceof b)) {
             c j = uoc.j;
             if (!PatchProxy.applyVoidTwoRefs(j, view, oh, oh1, "5") && j != null) {
                h o = oh.o;
                if (o != null || view != null) {
                   if (view != null) {
                      oh.k.put(a.a(p1), j);
                   }else {
                      oh.k.put(a.a(o), j);
                   }
                }
             }
             j oj = new j(uoc);
             if (!PatchProxy.applyVoidTwoRefs(oj, view, oh, oh1, str)) {
                oh1 = oh.o;
                if (oh1 != null || view != null) {
                   if (view != null) {
                      oh.m.put(Integer.toHexString(p1.hashCode()), oj);
                   }else {
                      oh.m.put(Integer.toHexString(oh1.hashCode()), oj);
                   }
                }
             }
          }
       label_011b :
          str = null;
          if (view instanceof TKViewContainerWrapView) {
             int i1 = 0x7f0a15df;
             int i2 = 0x7f0a15de;
             if (!view.getChildCount()) {
                view.setTag(i2, uoa);
                view.setTag(i1, Integer.valueOf(p2));
             }else {
                view.setTag(i2, str);
                view.setTag(i1, str);
             }
          }
          if (uoa != null) {
             a componentDat = uoa.componentData;
             if (componentDat != null) {
                h.f(componentDat.engineConfig, componentDat.style, view);
                if (oh != null) {
                   PageDyComponentInfo filedData = componentDat.filedData;
                   if (filedData != null) {
                      PageComponentDataInfo$Field data = filedData.data;
                      if (data != null) {
                         String str1 = 1;
                         try{
                            Map obj = e.a(String.valueOf(data), Map.class);
                            try{
                               filedData = componentDat.commonData;
                               Map map = (filedData != null)? e.a(String.valueOf(filedData), Map.class): str;
                               obj1 = obj;
                               obj = map;
                            label_01aa :
                               g og = g.a(uoc.pageHashCode);
                               HashMap hashMap = new HashMap();
                               str = "index";
                               hashMap.put(str, Integer.valueOf(this.getAdapterPosition()));
                               hashMap.put("instanceId", this.getInstanceId());
                               hashMap.put("isFromCache", Boolean.valueOf(uoc.isFromCache));
                               hashMap.put("section", Integer.valueOf(i));
                               if (og != null) {
                                  og = og.A;
                                  if (og != null) {
                                     map = og.a();
                                     if (map != null) {
                                        hashMap.putAll(map);
                                     }
                                  }
                               }
                               String str2 = "commonData";
                               if (obj != null) {
                                  hashMap.put(str2, obj);
                               }
                               if (obj1 != null) {
                                  obj1.put("localProps", hashMap);
                               }
                               int i4 = 2;
                               try{
                                  Map[] mapArray = new Map[i4];
                                  mapArray[i] = obj1;
                                  mapArray[1] = componentDat.style;
                                  oh.n(view, mapArray);
                                  if (view instanceof TKViewContainerWrapView && view.c()) {
                                     uoc.addLog("调用setData成功", obj1);
                                  }
                               }catch(java.lang.Exception e0){
                                  uoc.addError("setData异常", obj1, e0);
                               }
                               if (uoa.isReportViewShow == null && uoc.isFromCache == null) {
                                  hashMap1 = new HashMap();
                                  hashMap1.put(str, Integer.valueOf(p2));
                                  if (obj != null) {
                                     hashMap1.put(str2, obj);
                                  }
                                  oh.p(view, hashMap1);
                                  uoa.isReportViewShow = true;
                               }
                               if (!PatchProxy.applyVoid(null, uoc, c.class, "6")) {
                                  hashMap1 = new HashMap();
                                  HashMap hashMap2 = new HashMap();
                                  hashMap2.put("instanceId", this.getInstanceId());
                                  hashMap1.put("functionName", "pageDy$onBindView");
                                  hashMap1.put("data", hashMap2);
                                  uoc.invoke("callMethodWithData", hashMap1);
                               }
                            }catch(java.lang.Exception e0){
                            }
                            String[] stringArray = new String[]{"component","msg"};
                            String[] stringArray1 = new String[2];
                            stringArray1[i] = this.getComponentName();
                            stringArray1[str1] = e0.getMessage();
                            c.d(d.a(g.a(uoc.pageHashCode), "Component updateWidget json parse error"), a.a(stringArray, stringArray1));
                            obj1 = i3;
                            obj = str;
                            goto label_01aa ;
                         }catch(java.lang.Exception e0){
                            i3 = str;
                            goto label_017f ;
                         }
                      }
                   }
                }
                uoc.addError("fileData is null", componentDat, null);
             }else {
             label_0275 :
                uoc.addError("component or componentData is null", str, str);
             }
          }else {
             goto label_0275 ;
          }
          return;
       }
    }
    public Object onInvoke(String p0,Object p1){
       String str = "invoke ";
       h obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       try{
          if (this.b != null) {
             c ta = this.a;
             if (ta != null) {
                return ta.invoke(p0, p1);
             }
          }else {
             obj = c.a().g(this.pageHashCode, a.a(this.h));
             a trootView = this.rootView;
             if (trootView == null) {
                trootView = this.g;
             }
             if (obj != null && trootView != null) {
                this.addLog(str+p0, p1);
                String str1 = (p1 instanceof String)? p1: e.f(p1);
                return obj.h(trootView, p0, str1);
             }
          }
       }catch(java.lang.Exception e1){
          this.addError(str+p0+" 异常", p1, e1);
       }
       return null;
    }
    public void onViewAppear(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       super.onViewAppear(p0);
       HashMap hashMap = new HashMap();
       hashMap.put("functionName", "onViewAppear");
       this.invoke("callMethodWithData", hashMap);
       this.d.removeCallbacksAndMessages(null);
       if (this.b != null) {
          c ta = this.a;
          if (ta != null) {
             a rootView = ta.rootView;
             if (rootView != null) {
                ta.onViewAppear(rootView);
             }
          }
       }
       return;
    }
    public void onViewChanged(){
    }
    public void onViewDisappear(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "14")) {
          return;
       }
       super.onViewDisappear(p0);
       HashMap hashMap = new HashMap();
       hashMap.put("functionName", "onViewDisappear");
       this.invoke("callMethodWithData", hashMap);
       this.d.removeCallbacksAndMessages(null);
       if (this.b != null) {
          c ta = this.a;
          if (ta != null) {
             a rootView = ta.rootView;
             if (rootView != null) {
                ta.onViewDisappear(rootView);
             }
          }
       }
       return;
    }
    public void preCreateView(){
       h oh1;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "17")) {
          return;
       }
       if (TextUtils.isEmpty(this.componentData.bundleUrl)) {
          return;
       }
       c uoc = c.a();
       a tpageHashCod = this.pageHashCode;
       PageDyComponentInfo bundleUrl = this.componentData.bundleUrl;
       Objects.requireNonNull(uoc);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray1 = PatchProxy.applyTwoRefs(tpageHashCod, bundleUrl, uoc, c.class, "38");
       if (objArray1 != patchProxyRe) {
       }else {
          oh1 = uoc.f(tpageHashCod);
          if (oh1 == null) {
             objArray1 = objArray;
          }else {
             Object obj = PatchProxy.applyOneRefs(bundleUrl, oh1, oh, "26");
             objArray1 = (obj != patchProxyRe)? obj: oh1.i.get(bundleUrl);
          }
       }
       if (objArray1 != null) {
          this.g = objArray1;
          return;
       }else {
          n on = new n(this.componentData.bundleUrl, new HashMap());
          on.d = this.pageHashCode;
          on.c = true;
          on.e = this.getPageName();
          g og = g.a(this.pageHashCode);
          if (og != null) {
             on.h = og.P;
             on.k = og.w;
          }
          oh1 = this.createRenderEngine(this.getCurActivity(), on, objArray);
          if (oh1 == null) {
             c.b("preCreateView engine is null");
             return;
          }else {
             ViewGroup viewGroup = oh1.d();
             this.g = viewGroup;
             if (viewGroup != null) {
                uoc = c.a();
                a tpageHashCod1 = this.pageHashCode;
                PageDyComponentInfo bundleUrl1 = this.componentData.bundleUrl;
                c tg = this.g;
                Objects.requireNonNull(uoc);
                if (!PatchProxy.applyVoidThreeRefs(tpageHashCod1, bundleUrl1, tg, uoc, c.class, "39")) {
                   oh1 = uoc.f(tpageHashCod1);
                   if (oh1 != null && !PatchProxy.applyVoidTwoRefs(bundleUrl1, tg, oh1, oh, "25")) {
                      oh1.i.put(bundleUrl1, tg);
                   }
                }
             }
             return;
          }
       }
    }
    public void reportRealShow(){
       String[] stringArray1;
       PageComponentDataInfo$Field data;
       Exception uException;
       Object[] objArray1;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "18")) {
          return;
       }
       super.reportRealShow();
       if (this.isReportRealShow == null && this.isFromCache == null) {
          this.l();
          if (this.b != null) {
             return;
          }else {
             h oh = c.a().g(this.pageHashCode, a.a(this.h));
             String str = "componentData is null";
             if (oh != null) {
                Map map = PatchProxy.apply(objArray, this, uoc, "19");
                if (map != PatchProxyResult.class) {
                }else {
                   a tcomponentDa = this.componentData;
                   if (tcomponentDa != null) {
                      PageDyComponentInfo filedData = tcomponentDa.filedData;
                      if (filedData != null) {
                         data = filedData.data;
                         if (data != null) {
                            try{
                               map = e.a(String.valueOf(data), Map.class);
                               try{
                                  PageDyComponentInfo commonData = this.componentData.commonData;
                                  if (commonData != null) {
                                     objArray1 = e.a(String.valueOf(commonData), Map.class);
                                  label_00a0 :
                                     g og = g.a(this.pageHashCode);
                                     HashMap hashMap1 = new HashMap();
                                     hashMap1.put("index", Integer.valueOf(this.getAdapterPosition()));
                                     hashMap1.put("instanceId", this.getInstanceId());
                                     hashMap1.put("isFromCache", Boolean.valueOf(this.isFromCache));
                                     hashMap1.put("section", Integer.valueOf(0));
                                     if (og != null) {
                                        og = og.A;
                                        if (og != null) {
                                           Map map1 = og.a();
                                           if (map1 != null) {
                                              hashMap1.putAll(map1);
                                           }
                                        }
                                     }
                                     if (objArray1 != null) {
                                        hashMap1.put("commonData", objArray1);
                                     }
                                     if (map != null) {
                                        map.put("localProps", hashMap1);
                                     }
                                  }
                                  objArray1 = objArray;
                                  goto label_00a0 ;
                               }catch(java.lang.Exception e3){
                               }
                               String[] stringArray3 = new String[]{"component","msg"};
                               String[] stringArray4 = new String[]{this.getComponentName(),uException.getMessage()};
                               c.d(d.a(g.a(this.pageHashCode), "reportRealShow parse error"), a.a(stringArray3, stringArray4));
                               goto label_009f ;
                            }catch(java.lang.Exception e0){
                               uException = e0;
                               map = objArray;
                               goto label_0078 ;
                            }
                         }
                      }
                      this.addError("fileData is null", objArray, objArray);
                   }else {
                      this.addError(str, objArray, objArray);
                   }
                   map = objArray;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("functionName", "realShow");
                if (map == null) {
                   map = new HashMap();
                }
                hashMap.put("data", map);
                uoc = this.h;
                str = e.f(hashMap);
                if (!PatchProxy.applyVoidThreeRefs(uoc, "callMethodWithData", str, oh, b.class, "5")) {
                   if (uoc == null) {
                      String[] stringArray = new String[]{"bundleId","viewKey"};
                      stringArray1 = new String[]{oh.v,oh.u};
                      c.d("reportRealShow error view is null", a.a(stringArray, stringArray1));
                   }else {
                      e uoe = oh.q(uoc);
                      if (uoe != null) {
                         try{
                            uoe.b("callMethodWithData", str, objArray);
                         }catch(java.lang.Exception e0){
                            stringArray1 = new String[]{"bundleId","viewKey","msg"};
                            String[] stringArray2 = new String[]{oh.v,oh.u,e0.getMessage()};
                            c.d("reportRealShow error", a.a(stringArray1, stringArray2));
                            if (oh.r != null) {
                               throw e0;
                            }
                         }
                      }
                   }
                }
             }else {
                this.addError(str, objArray, objArray);
             }
          }
       }
       return;
    }
}
