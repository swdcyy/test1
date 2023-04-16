package com.kuaishou.bowl.core.component.a;
import java.lang.Object;
import com.kuaishou.bowl.core.util.ComponentStateMachine$ComponentState;
import java.util.ArrayList;
import iv.a;
import java.util.HashMap;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import qu4.f;
import ru4.a;
import android.view.View;
import java.lang.Integer;
import pv.b;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import com.kuaishou.bowl.event.utils.StageName;
import fv.c;
import uu.c;
import java.lang.ref.WeakReference;
import com.kuaishou.bowl.core.component.a$d;
import com.kuaishou.bowl.core.component.a$a;
import java.lang.Runnable;
import ekd.s1;
import hu4.h;
import su4.a;
import java.util.Objects;
import uu.h;
import java.util.Map;
import java.lang.StringBuilder;
import nv.c;
import com.kuaishou.bowl.core.component.a$c;
import java.lang.Enum;
import fv.g;
import nv.d;
import java.lang.Exception;
import pv.a;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import hu4.n;
import hu4.f;
import hu4.o;
import android.view.ViewGroup;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import bv4.b;
import android.text.TextUtils;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.google.gson.Gson;
import su.g;
import com.google.gson.JsonElement;
import yz7.e;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;
import com.kuaishou.bowl.core.component.a$e;
import su.e;
import java.lang.Double;
import java.lang.Math;
import java.util.Random;
import com.kuaishou.bowl.data.center.data.model.page.component.TrackInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.Track;
import uu.a;
import com.kuaishou.bowl.core.util.ComponentStateMachine;
import com.google.common.collect.ImmutableTable;
import java.util.Iterator;
import com.kuaishou.bowl.core.component.a$b;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import com.google.gson.JsonObject;
import k2b.e0;
import mv.d;
import fv.d;
import java.util.Collection;
import ekd.q;
import mv.a;
import java.lang.System;
import mv.b;
import uu.b;

public abstract class a	// class@00119c
{
    public String activityHashCode;
    public Map areaTrackMap;
    public a callerContext;
    public List children;
    public HashMap clientContentParams;
    public HashMap clientElementParams;
    public Object commonObj;
    public PageDyComponentInfo componentData;
    public WeakReference curActivity;
    public a$d curBindViewData;
    public a$e curCreateViewData;
    public WeakReference curFragment;
    public ComponentStateMachine$ComponentState curState;
    public boolean dataChangeFlag;
    public Gson gson;
    public boolean isFromCache;
    public boolean isReportRealShow;
    public boolean isReportShow;
    public boolean isReportViewShow;
    public Object modelObj;
    public String pageHashCode;
    public String pageName;
    public int position;
    public String relatedAction;
    public a relatedComponent;
    public View rootView;
    public String rubasToken;
    public Object styleObj;
    public Object tkModelFiledObj;

    public void a(){
       super();
       this.curState = ComponentStateMachine$ComponentState.INIT;
       this.children = new ArrayList();
       this.pageHashCode = "";
       this.activityHashCode = "";
       this.callerContext = new a();
       this.isFromCache = false;
       this.clientElementParams = new HashMap();
       this.clientContentParams = new HashMap();
       this.areaTrackMap = new HashMap();
       this.isReportRealShow = false;
       this.dataChangeFlag = false;
    }
    public static void j(a p0,ComponentStateMachine$ComponentState p1){
       p0.lambda$moveToState$0(p1);
    }
    public static void k(a p0){
       p0.lambda$updateModelObjAsync$1();
    }
    private void lambda$moveToState$0(ComponentStateMachine$ComponentState p0){
       this.callOnState(p0);
    }
    private void lambda$updateModelObjAsync$1(){
       this.updateFiledData();
    }
    public void addError(String p0,Object p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "53")) {
          return;
       }
       this.addError(p0, p1, p2, false);
       return;
    }
    public void addError(String p0,Object p1,Throwable p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, a.class, "56")) {
          return;
       }
       f.c.d(this.createComponentInfoNode(), p0, p1, p2, p3);
       return;
    }
    public void addLog(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "51")) {
          return;
       }
       this.addLog(p0, p1, false);
       return;
    }
    public void addLog(String p0,Object p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "54")) {
          return;
       }
       f.c.e(this.createComponentInfoNode(), p0, p1, p2);
       return;
    }
    public void addWarn(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "52")) {
          return;
       }
       this.addWarn(p0, p1, false);
       return;
    }
    public void addWarn(String p0,Object p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "55")) {
          return;
       }
       f.c.i(this.createComponentInfoNode(), p0, p1, p2);
       return;
    }
    public void bindData(a p0,View p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "16")) {
          return;
       }
       this.setPosition(p2);
       this.setP0("EVENT_COMPONENT_UPDATE_DATA_TIME");
       String str = b.a().b(this.pageHashCode, this.componentData.name);
       c.a(StageName.pdy_component_update_rootview_start, this.componentData, this.getPageName(), str);
       c.j(StageName.pgy_component_update_start, this.componentData, this.getPageName(), this.rubasToken);
       if (this.curActivity == null) {
          this.curActivity = c.a().b(this.pageHashCode);
       }
       if (p0.curActivity == null) {
          p0.curActivity = c.a().b(this.pageHashCode);
       }
       if (p1 != this.rootView) {
          this.rootView = p1;
          this.onViewChanged();
       }else {
          this.rootView = p1;
       }
       this.curBindViewData = new a$d(this, p0, p1, p2);
       if (!this.moveToState(ComponentStateMachine$ComponentState.BIND)) {
          this.onBind();
       }
       this.clearDataChangeFlag();
       this.setP1();
       c.a(StageName.pdy_component_update_rootview_end, this.componentData, this.getPageName(), str);
       c.j(StageName.pgy_component_update_end, this.componentData, this.getPageName(), this.rubasToken);
       if (!this.isReportShowManual()) {
          s1.d(new a$a(this));
       }
       return;
    }
    public void bindRenderEngine(View p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "58")) {
          return;
       }
       if (p1 != null && p0 != null) {
          c uoc = c.a();
          a tpageHashCod = this.pageHashCode;
          String str = a.a(p0);
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoidThreeRefs(tpageHashCod, str, p1, uoc, c.class, "11")) {
             h oh = uoc.f(tpageHashCod);
             if (oh != null && !PatchProxy.applyVoidTwoRefs(str, p1, oh, h.class, "12")) {
                oh.c.put(str, p1);
             }
          }
       }
       return;
    }
    public final void callOnState(ComponentStateMachine$ComponentState p0){
       String[] stringArray;
       String[] stringArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "35")) {
          return;
       }
       c.f(this.getComponentName()+" callOnState = "+p0+" page = "+this.activityHashCode);
       int i = a$c.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4 && this.checkViewState(p0)) {
                   try{
                      this.onDestroy();
                   }catch(java.lang.Exception e8){
                      stringArray = new String[]{"component","msg"};
                      stringArray1 = new String[]{this.getComponentName(),e8.getMessage()};
                      c.d(d.a(g.a(this.pageHashCode), "callOnState onDestroy error"), a.a(stringArray, stringArray1));
                   }
                }
             }else if(this.checkViewState(p0)){
                try{
                   this.onUnbind();
                }catch(java.lang.Exception e8){
                   stringArray = new String[]{"component","msg"};
                   stringArray1 = new String[]{this.getComponentName(),e8.getMessage()};
                   c.d(d.a(g.a(this.pageHashCode), "callOnState onUnbind error"), a.a(stringArray, stringArray1));
                }
             }
          }else if(this.checkViewState(p0)){
             this.onBind();
          }
       }else if(this.checkViewState(p0)){
          this.onCreate();
       }
    }
    public final boolean checkViewState(ComponentStateMachine$ComponentState p0){
       int i1;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.rootView;
       if (obj != null) {
          int i = 0x7f0a0c5b;
          try{
             i1 = obj.getTag(i).intValue();
          }catch(java.lang.Exception e0){
             i1 = 0;
          }
       }else {
          goto label_0026 ;
       }
    }
    public void clearDataChangeFlag(){
       this.dataChangeFlag = false;
    }
    public a createComponentInfoNode(){
       Object obj = PatchProxy.apply(null, this, a.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(this.getComponentName(), this.getComponentType(), this.getInstanceId(), this.pageHashCode, this.rootView);
       return obj;
    }
    public final h createRenderEngine(FragmentActivity p0,n p1,f p2){
       h obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null || p1 == null) {
          c.b(d.a(g.a(this.pageHashCode), "Component createRenderEngine activity or renderParams is null"));
          return obj;
       }else {
          this.setCurActivity(p0);
          if (this.componentData != null) {
             obj = o.a(p0, p1);
          }
          if (obj != null && p2 != null) {
             obj.k(p2);
          }
          if (obj == null) {
             String[] stringArray = new String[]{"component"};
             String[] stringArray1 = new String[]{this.getComponentName()};
             c.d(d.a(g.a(this.pageHashCode), "getRootView createRenderEngine error "), a.a(stringArray, stringArray1));
          }
          return obj;
       }
    }
    public abstract View createView(FragmentActivity p0,n p1,ViewGroup p2,f p3);
    public final boolean diffChildren(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.children.size() != this.children.size()) {
          return true;
       }
       int i = 0;
       while (true) {
          if (i >= this.children.size()) {
             return false;
          }
          if (!(this.children.get(i).getComponentName()).equals(p0.children.get(i).getComponentName())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public int getAdapterPosition(){
       return this.position;
    }
    public String getBundleId(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.componentData;
       String str = "";
       if (obj == null) {
          return str;
       }
       if (TextUtils.x(obj.bundleId)) {
          try{
             obj = this.componentData;
             PageDyComponentInfo bundleUrl = obj.bundleUrl;
             Object obj1 = PatchProxy.applyOneRefs(bundleUrl, objArray, b.class, "2");
             if (obj1 != patchProxyRe) {
                str = obj1;
             }else if(TextUtils.isEmpty(bundleUrl)){
                str = Uri.parse(bundleUrl).getQueryParameter("bundleId");
             }
             obj.bundleId = str;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public String getBundleUrl(){
       a tcomponentDa = this.componentData;
       if (tcomponentDa == null) {
          return "";
       }
       return tcomponentDa.bundleUrl;
    }
    public PageDyComponentInfo getComponentData(){
       return this.componentData;
    }
    public String getComponentName(){
       a obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.componentData;
       if (obj == null || TextUtils.x(obj.name)) {
          return "";
       }
       return this.componentData.name;
    }
    public abstract String getComponentType();
    public FragmentActivity getCurActivity(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.curActivity;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public Fragment getCurFragment(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.curFragment;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public boolean getDataChangeFlag(){
       return this.dataChangeFlag;
    }
    public Gson getGson(){
       a obj = PatchProxy.apply(null, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.gson;
       if (obj != null) {
          return obj;
       }
       g og = g.a(this.pageHashCode);
       if (og != null) {
          this.gson = og.w;
       }
       return this.gson;
    }
    public String getInstanceId(){
       Object obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getComponentData() != null) {
          return this.getComponentData().instanceId;
       }
       return "";
    }
    public Object getModelObj(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.modelObj == null) {
          this.parseModel(this.getGson());
       }
       return this.modelObj;
    }
    public String getPageName(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.pageName;
       if (obj != null) {
          return obj;
       }
       String str = g.a(this.pageHashCode);
       this.pageName = str;
       return str;
    }
    public final Object getParsedObj(Gson p0,JsonElement p1,Class p2){
       String[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p0 == null) {
             return e.a(p1.toString(), p2);
          }
          return p0.c(p1, p2);
       }catch(java.lang.Exception e7){
          String str = "Component parseModel json parse error2 ";
          if (SystemUtil.I()) {
             throw new RuntimeException(str+this.getComponentName()+obj+e7.getMessage());
          }
          String[] stringArray = new String[]{v5,v4};
          obj = new String[v3];
          obj[v2] = this.getComponentName();
          obj[v1] = e7.getMessage();
          c.d(d.a(g.a(this.pageHashCode), str), a.a(stringArray, obj));
       }
       return null;
    }
    public List getRealChildren(Map p0){
       return this.children;
    }
    public Object getTkModelFiledObj(){
       Object obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.tkModelFiledObj == null) {
          try{
             this.parseTKModelFiled(this.getGson());
          }catch(java.lang.Exception e0){
             String[] stringArray = new String[]{"msg"};
             String[] stringArray1 = new String[]{e0.getMessage()};
             c.d("parse TK model error", a.a(stringArray, stringArray1));
          }
       }
    }
    public View getView(FragmentActivity p0,n p1,ViewGroup p2,f p3){
       String obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          c.b(d.a(g.a(this.pageHashCode), "getRootView error activity is null"));
          return null;
       }else {
          this.setP0("EVENT_COMPONENT_COST_TIME");
          obj = b.a().b(this.pageHashCode, this.componentData.name);
          c.a(StageName.pdy_component_create_rootview_start, this.componentData, this.getPageName(), obj);
          c.j(StageName.pgy_component_render_start, this.componentData, this.getPageName(), this.rubasToken);
          a$e uoe = new a$e(this, p0, p1, p2, p3);
          this.curCreateViewData = v1;
          if (!this.moveToState(ComponentStateMachine$ComponentState.CREATE)) {
             this.onCreate();
          }
          this.onViewChanged();
          this.setP1();
          c.a(StageName.pdy_component_create_rootview_end, this.componentData, this.getPageName(), obj);
          f.c.h(this.createComponentInfoNode());
          return this.rootView;
       }
    }
    public final Object invoke(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.onInvoke(p0, p1);
    }
    public boolean isReportClickManual(){
       a uoa;
       String obj = PatchProxy.apply(null, this, a.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          obj = this.getPageName();
          Object obj1 = e.c("enableEraAutoTrackV2");
          if (obj1 != null && (obj1 instanceof Map && (obj1.containsKey(obj) && new Random().nextInt(100) < (int)Math.round(obj1.get(obj).doubleValue())))) {
             uoa = 1;
          }
          if (!uoa) {
             return true;
          }else {
             uoa = this.componentData;
             if (uoa != null) {
                PageDyComponentInfo trackInfo = uoa.trackInfo;
                if (trackInfo != null) {
                   if (trackInfo.clickEvent == null) {
                      TrackInfo common = trackInfo.common;
                      if (common != null && (common.elementPackage == null && (common == null || common.contentPackage == null))) {
                      label_0072 :
                         return true;
                      }
                   }
                   return false;
                }else {
                   goto label_0072 ;
                }
             }else {
                goto label_0072 ;
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_0053 :
       uoa = null;
       goto label_0054 ;
    }
    public boolean isReportShowManual(){
       a uoa;
       String obj = PatchProxy.apply(null, this, a.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          obj = this.getPageName();
          Object obj1 = e.c("enableEraAutoTrackV2");
          if (obj1 != null && (obj1 instanceof Map && (obj1.containsKey(obj) && new Random().nextInt(100) < (int)Math.round(obj1.get(obj).doubleValue())))) {
             uoa = 1;
          }
          if (!uoa) {
             return true;
          }else {
             uoa = this.componentData;
             if (uoa != null) {
                PageDyComponentInfo trackInfo = uoa.trackInfo;
                if (trackInfo != null) {
                   if (trackInfo.showEvent == null) {
                      TrackInfo common = trackInfo.common;
                      if (common != null && (common.elementPackage == null && (common == null || common.contentPackage == null))) {
                      label_0072 :
                         return true;
                      }
                   }
                   return false;
                }else {
                   goto label_0072 ;
                }
             }else {
                goto label_0072 ;
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_0053 :
       uoa = null;
       goto label_0054 ;
    }
    public abstract boolean isTypeNative();
    public void markDataChanged(){
       this.dataChangeFlag = true;
    }
    public boolean moveToState(ComponentStateMachine$ComponentState p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "34");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       c.f(this.getComponentName()+"moveToState from "+this.curState+" to "+p0+" page = "+this.activityHashCode);
       obj = this.curState;
       a uoa = new a(this);
       Object obj1 = PatchProxy.applyThreeRefs(obj, p0, uoa, null, ComponentStateMachine.class, "1");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          List list = ComponentStateMachine.a.get(obj, p0);
          if (list == null) {
             b = false;
          }else {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                uoa.a(iterator.next());
             }
             b = true;
          }
       }
       return b;
    }
    public final void onBind(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "39")) {
          return;
       }
       c.f("onBind component = "+this.getComponentName()+" page = "+this.activityHashCode);
       a tcurBindView = this.curBindViewData;
       if (tcurBindView != null) {
          this.onBindView(tcurBindView.a, tcurBindView.b, tcurBindView.c);
          this.curBindViewData = objArray;
       }else {
          tcurBindView = this.rootView;
          if (tcurBindView != null) {
             this.onBindView(this, tcurBindView, 0);
          }
       }
       this.curState = ComponentStateMachine$ComponentState.BIND;
       return;
    }
    public abstract void onBindView(a p0,View p1,int p2);
    public void onComponentClick(){
       if (PatchProxy.applyVoid(null, this, a.class, "27")) {
          return;
       }
       if (this.isReportShowManual()) {
          return;
       }
       a tcomponentDa = this.componentData;
       if (tcomponentDa != null) {
          PageDyComponentInfo trackInfo = tcomponentDa.trackInfo;
          if (trackInfo != null) {
             TrackInfo clickEvent = trackInfo.clickEvent;
             if (clickEvent != null) {
                if (clickEvent == null) {
                   c.f("没有埋点数据");
                   return;
                }else {
                   Track areas = clickEvent.areas;
                   if (areas != null && areas.size() > 0) {
                      c.f("有区域埋点数据，需业务手动调用埋点");
                      return;
                   }else {
                      s1.e(new a$b(this), 100);
                   }
                }
             }
          }
       }
       return;
    }
    public final void onCreate(){
       if (PatchProxy.applyVoid(null, this, a.class, "38")) {
          return;
       }
       c.f("onCreate component = "+this.getComponentName());
       if (this.rootView == null) {
          a tcurCreateVi = this.curCreateViewData;
          if (tcurCreateVi != null) {
             this.rootView = this.createView(tcurCreateVi.a, tcurCreateVi.b, tcurCreateVi.c, tcurCreateVi.d);
             this.curCreateViewData = null;
          }
       }
       this.putPresenterV2(this.rootView);
       this.curState = ComponentStateMachine$ComponentState.CREATE;
       return;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "41")) {
          return;
       }
       c.f("onDestroy component = "+this.getComponentName()+" page = "+this.activityHashCode);
       this.curCreateViewData = objArray;
       this.curBindViewData = objArray;
       this.curState = ComponentStateMachine$ComponentState.DESTROY;
       a trootView = this.rootView;
       if (trootView != null) {
          trootView.setTag(R.id.dynamic_component_view_state_tag, Integer.valueOf(3));
       }
       this.addLog("执行销毁完成", this.getComponentData());
       return;
    }
    public Object onInvoke(String p0,Object p1){
       return null;
    }
    public void onUnbind(){
       if (PatchProxy.applyVoid(null, this, a.class, "40")) {
          return;
       }
       c.f("onUnbind component = "+this.getComponentName()+" page = "+this.activityHashCode);
       this.curState = ComponentStateMachine$ComponentState.UNBIND;
       this.addLog("执行解绑完成", this.getComponentData());
       return;
    }
    public void onViewAppear(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "32")) {
          return;
       }
       c.f("onViewAppear component = "+this.getComponentName()+" page = "+this.activityHashCode);
       return;
    }
    public abstract void onViewChanged();
    public void onViewDisappear(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "33")) {
          return;
       }
       c.f("onViewDisappear component = "+this.getComponentName()+" page = "+this.activityHashCode);
       return;
    }
    public synchronized void parseModel(Gson p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "20")) {
          return;
       }
       this.gson = p0;
       Class uClass = c.a().e(this.pageHashCode, this.getComponentName());
       if (uClass == null) {
          uClass = Map.class;
       }
       a tcomponentDa = this.componentData;
       if (tcomponentDa != null) {
          PageDyComponentInfo filedData = tcomponentDa.filedData;
          if (filedData != null && filedData.data != null) {
             this.modelObj = this.getParsedObj(this.getGson(), tcomponentDa.filedData.data, uClass);
          }
       }
       return;
    }
    public synchronized void parseTKModelFiled(Gson p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "21")) {
          return;
       }
       this.gson = p0;
       a tcomponentDa = this.componentData;
       if (tcomponentDa != null && tcomponentDa.style != null) {
          PageDyComponentInfo filedData = tcomponentDa.filedData;
          if (filedData != null && filedData.data != null) {
             if (!("TK").equals(tcomponentDa.renderType)) {
                return;
             }else {
                JsonElement jsonElement = this.componentData.filedData.data.r().e0("commonTKModelField");
                if (jsonElement == null) {
                   return;
                }else {
                   String str = jsonElement.w();
                   if (!TextUtils.isEmpty(str)) {
                      Class uClass = c.a().i(this.pageHashCode);
                      if (uClass != null) {
                         PageDyComponentInfo filedData1 = this.componentData.filedData;
                         if (filedData1 != null) {
                            PageComponentDataInfo$Field data = filedData1.data;
                            if (data != null) {
                               jsonElement = data.r().e0(str);
                               if (jsonElement == null) {
                                  return;
                               }else {
                                  this.tkModelFiledObj = this.getParsedObj(this.getGson(), jsonElement, uClass);
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void preCreateView(){
    }
    public void putClientContentParams(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "48")) {
          return;
       }
       if (!TextUtils.x(p0) && p1 != null) {
          this.clientContentParams.put(p0, p1);
       }
       return;
    }
    public void putClientElementParams(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "47")) {
          return;
       }
       if (!TextUtils.x(p0) && p1 != null) {
          this.clientElementParams.put(p0, p1);
       }
       return;
    }
    public void putPresenterV2(View p0){
    }
    public void reportClickEvent(){
       PageDyComponentInfo trackInfo;
       TrackInfo clickEvent;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "28")) {
          return;
       }
       if (this.isFromCache != null) {
          c.f("缓存的组件不做上报"+this.componentData.name);
          return;
       }else {
          a tcurFragment = this.curFragment;
          if (tcurFragment != null) {
             try{
                objArray = tcurFragment.get();
             }catch(java.lang.Exception e0){
                c.b("reportClickEvent error curFragment is not a iLogPage");
             }
          }
       }
    }
    public void reportClickEvent(String p0){
       TrackInfo clickEvent;
       Track areas;
       Track track;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "29")) {
          return;
       }
       if (this.isFromCache != null) {
          c.f("缓存的组件不做上报"+this.componentData.name+" area:"+p0);
          return;
       }else if(TextUtils.x(p0)){
          c.b("reportClickEvent error area is nul");
          return;
       }else {
          a tcomponentDa = this.componentData;
          if (tcomponentDa != null) {
             PageDyComponentInfo trackInfo = tcomponentDa.trackInfo;
             if (trackInfo != null && tcomponentDa.filedData != null) {
                trackInfo.assemblyCommonData();
                StringBuilder str = null;
                a tcurFragment = this.curFragment;
                if (tcurFragment != null) {
                   try{
                      str = tcurFragment.get();
                   }catch(java.lang.Exception e0){
                      c.b("reportClickEvent error curFragment is not a iLogPage");
                   }
                }
             }
          }
          return;
       }
    }
    public void reportModuleShowEvent(){
       e0 uoe0;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "24")) {
          return;
       }
       if (this.isFromCache != null) {
          c.f("缓存的组件不做模块上报"+this.componentData.name);
          return;
       }else {
          a tcomponentDa = this.componentData;
          if (tcomponentDa != null && tcomponentDa.trackInfo != null) {
             tcomponentDa = this.curFragment;
             if (tcomponentDa != null) {
                try{
                   uoe0 = tcomponentDa.get();
                label_0044 :
                   if (uoe0 == null) {
                      c.b("reportModuleShowEvent error iLogPage is nul");
                      return;
                   }else {
                      TrackInfo module = this.componentData.trackInfo.module;
                      if (module != null) {
                         Track elementPacka = module.elementPackage;
                         if (elementPacka != null) {
                            String str = "params";
                            if (elementPacka.get(str) != null) {
                               try{
                                  String str1 = module.elementPackage.get(str).get("action_name");
                                  c.f("moduleName = "+str1);
                                  if (c.a().n(this.pageHashCode, str1)) {
                                     c.f("当前module已经上报 return"+str1);
                                     return;
                                  }else {
                                     d.j(uoe0, module.elementPackage, module.contentPackage, objArray);
                                     c.a().t(this.pageHashCode, str1, true);
                                     c.f("module曝光上报 moduleName = "+str1);
                                  }
                               }catch(java.lang.Exception e0){
                                  c.f("reportModuleShowEvent error : "+e0.getMessage());
                               }
                            }
                         }
                      }
                   }
                }catch(java.lang.Exception e0){
                   c.b("reportModuleShowEvent error curFragment is not a iLogPage");
                }
                uoe0 = objArray;
                goto label_0044 ;
             }else {
                goto label_0043 ;
             }
          }
       }
    }
    public void reportRealShow(){
    }
    public void reportShowEvent(){
       TrackInfo showEvent;
       Track areas;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "25")) {
          return;
       }
       if (this.isFromCache != null) {
          c.f("缓存的组件不做上报"+this.componentData.name);
          return;
       }else if(this.isReportShow != null){
          c.f("当前组件已经曝光过了"+this.componentData.name);
          return;
       }else {
          a tcomponentDa = this.componentData;
          if (tcomponentDa != null) {
             PageDyComponentInfo trackInfo = tcomponentDa.trackInfo;
             if (trackInfo != null && tcomponentDa.filedData != null) {
                trackInfo.assemblyCommonData();
                tcomponentDa = this.curFragment;
                if (tcomponentDa != null) {
                   try{
                      objArray = tcomponentDa.get();
                   }catch(java.lang.Exception e0){
                      c.b("reportShowEvent error curFragment is not a iLogPage");
                   }
                }
             }
          }
          return;
       }
    }
    public void reportShowEvent(String p0){
       TrackInfo showEvent;
       Track areas;
       Track elementPacka;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "26")) {
          return;
       }
       if (this.isFromCache != null) {
          c.f("缓存的组件不做上报"+this.componentData.name+" area : "+p0);
          return;
       }else if(TextUtils.x(p0)){
          c.b("reportShowEvent error area is nul");
          return;
       }else if(this.areaTrackMap.containsKey(p0)){
          c.f("已经上报过了本次本次不上报");
          return;
       }else {
          a tcomponentDa = this.componentData;
          if (tcomponentDa != null) {
             PageDyComponentInfo trackInfo = tcomponentDa.trackInfo;
             if (trackInfo != null && tcomponentDa.filedData != null) {
                trackInfo.assemblyCommonData();
                StringBuilder str = null;
                a tcurFragment = this.curFragment;
                if (tcurFragment != null) {
                   try{
                      str = tcurFragment.get();
                   }catch(java.lang.Exception e0){
                      c.b("reportShowEvent error curFragment is not a iLogPage");
                   }
                }
             }
          }
          return;
       }
    }
    public void setActivityHashCode(String p0){
       this.activityHashCode = p0;
    }
    public void setCallerContexts(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "23")) {
          return;
       }
       this.callerContext.e(p0);
       a trelatedComp = this.relatedComponent;
       if (trelatedComp != null) {
          trelatedComp.setCallerContexts(p0);
       }
       if (!q.f(this.children)) {
          Iterator iterator = this.children.iterator();
          while (iterator.hasNext()) {
             iterator.next().setCallerContexts(p0);
          }
       }
       return;
    }
    public void setCommonObj(Object p0){
       this.commonObj = p0;
    }
    public void setComponentData(PageDyComponentInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       try{
          this.componentData = p0;
          PageDyComponentInfo engineConfig = p0.engineConfig;
          if (engineConfig != null && (engineConfig.containsKey("isPreCreateView") && p0.engineConfig.get("isPreCreateView").booleanValue())) {
             this.preCreateView();
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public void setCurActivity(FragmentActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.curActivity = new WeakReference(p0);
       return;
    }
    public void setCurFragment(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       this.curFragment = new WeakReference(p0);
       return;
    }
    public void setCurView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       this.rootView = p0;
       this.onViewChanged();
       return;
    }
    public void setP0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "30")) {
          return;
       }
       if (this.componentData != null) {
          a tcomponentDa = this.componentData;
          a.a().h(this.componentData.instanceId, System.currentTimeMillis(), tcomponentDa.name, tcomponentDa.renderType, p0, this.getBundleId());
       }
       return;
    }
    public void setP1(){
       if (PatchProxy.applyVoid(null, this, a.class, "31")) {
          return;
       }
       if (this.componentData != null) {
          f.c.g(this.createComponentInfoNode(), a.a().c(this.getInstanceId()));
          a.a().i(this.componentData.instanceId, System.currentTimeMillis());
       }
       return;
    }
    public void setPageHashCode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.pageHashCode = p0;
       this.pageName = g.a(p0);
       this.rubasToken = b.a().b(p0, this.getInstanceId());
       this.getBundleId();
       return;
    }
    public void setPosition(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "46")) {
          return;
       }
       this.position = p0;
       this.clientElementParams.put("position", Integer.valueOf(p0));
       this.clientElementParams.put("index", Integer.valueOf(p0));
       this.clientElementParams.put("indexId", Integer.valueOf(p0));
       return;
    }
    public boolean tryAnchor(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if ((this.getInstanceId()).equals(p0)) {
          return true;
       }
       return false;
    }
    public void update(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "17")) {
          return;
       }
       this.componentData = p0.componentData;
       this.modelObj = p0.modelObj;
       this.commonObj = p0.commonObj;
       this.tkModelFiledObj = p0.tkModelFiledObj;
       this.relatedAction = p0.relatedAction;
       this.relatedComponent = p0.relatedComponent;
       this.isReportViewShow = false;
       this.isReportRealShow = false;
       this.isFromCache = false;
       this.styleObj = null;
       this.clientElementParams.clear();
       this.clientContentParams.clear();
       this.areaTrackMap.clear();
       this.isReportShow = false;
       return;
    }
    public final void updateFiledData(){
       String[] stringArray;
       String[] stringArray1;
       if (PatchProxy.applyVoid(null, this, a.class, "43")) {
          return;
       }
       a tgson = this.gson;
       int i = 1;
       if (tgson == null) {
          try{
             this.componentData.filedData.data = e.c().x(this.modelObj).r();
             this.addLog("更新Model", this.getComponentData());
          }catch(java.lang.Exception e0){
             stringArray = new String[]{"component","msg"};
             stringArray1 = new String[]{this.getComponentName(),e0.getMessage()};
             c.d(d.a(g.a(this.pageHashCode), "Component updateModelObj json parse error"), a.a(stringArray, stringArray1));
             this.addError("更新Model", this.getComponentData(), e0);
          }
       }else {
          try{
             this.componentData.filedData.data = tgson.x(this.modelObj).r();
             this.addLog("更新Model", this.getComponentData());
          }catch(java.lang.Exception e0){
             stringArray = new String[]{"component","msg"};
             stringArray1 = new String[]{this.getComponentName(),e0.getMessage()};
             c.d(d.a(g.a(this.pageHashCode), "Component updateModelObj json parse error2"), a.a(stringArray, stringArray1));
             this.addError("更新Model", this.getComponentData(), e0);
          }
       }
    }
    public void updateModelObj(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "42")) {
          return;
       }
       this.modelObj = p0;
       this.updateFiledData();
       return;
    }
    public void updateModelObjAsync(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "44")) {
          return;
       }
       this.modelObj = p0;
       s1.d(new b(this));
       return;
    }
}
