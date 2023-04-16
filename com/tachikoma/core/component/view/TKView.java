package com.tachikoma.core.component.view.TKView;
import com.tachikoma.core.component.e;
import gx4.f;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.tachikoma.core.component.TKYogaLayout;
import com.tkruntime.v8.V8Object;
import zp8.a;
import gx4.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.util.Map;
import yp8.a;
import java.util.Objects;
import jq8.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lg.g;
import com.tkruntime.v8.V8Function;
import java.lang.Boolean;
import com.tachikoma.core.component.view.a;
import android.content.Context;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import com.tachikoma.core.yoga.layout.YogaLayout;
import android.view.ViewGroup;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.tachikoma.core.component.view.TKView$a;
import java.lang.Runnable;
import iq8.x;
import iq8.r;
import java.lang.IllegalStateException;
import java.lang.CharSequence;
import android.text.TextUtils;

public class TKView extends e	// class@000db1
{
    public boolean clipChildren;
    public final ArrayList orderedChildList;
    public final Map v;

    public void TKView(f p0){
       super(p0);
       this.v = new HashMap();
       this.orderedChildList = new ArrayList();
       this.clipChildren = true;
    }
    public static void access$000(TKView p0){
       p0.destroyOnUIThread();
    }
    private void destroyOnUIThread(){
       if (PatchProxy.applyVoid(null, this, TKView.class, "4")) {
          return;
       }
       if (this.isTargetViewExist()) {
          this.getView().g();
       }
       this.orderedChildList.clear();
       return;
    }
    public void add(V8Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKView.class, "7")) {
          return;
       }
       if (p0 == null) {
          a.i("TKView", "add null subview");
          return;
       }else {
          e nativeModule = this.getNativeModule(p0);
          if (nativeModule != null && !this.v.containsValue(nativeModule)) {
             nativeModule.retainJsObj();
             a domNode = this.getDomNode();
             Objects.requireNonNull(domNode);
             if (!PatchProxy.applyVoidOneRefs(nativeModule, domNode, a.class, "6")) {
                a uoa = domNode.c();
                Objects.requireNonNull(uoa);
                Object obj = PatchProxy.apply(null, uoa, a.class, "2");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                }else {
                   uoa = uoa.a;
                   i = (uoa != null)? uoa.l(): 0;
                }
                domNode.a(nativeModule, i);
             }
             this.v.put(nativeModule.getViewID(), nativeModule);
             this.orderedChildList.add(nativeModule);
             nativeModule.attachToParent(this);
          }
          return;
       }
    }
    public void addEventListener(String p0,V8Function p1,boolean p2){
       if (PatchProxy.isSupport(TKView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, TKView.class, "2")) {
          return;
       }
       if (("dispatch").equals(p0)) {
          this.getView().l = new a(this);
       }
       super.addEventListener(p0, p1, p2);
       return;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public TKYogaLayout createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TKYogaLayout(p0);
    }
    public List getChildren(){
       return this.orderedChildList;
    }
    public V8Object getSubview(String p0){
       V8Object subview;
       e obj = PatchProxy.applyOneRefs(p0, this, TKView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v.get(p0);
       if (obj != null) {
          return obj.getJsObj();
       }
       Iterator iterator = this.v.values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          e uoe = iterator.next();
          if (uoe instanceof TKView) {
             subview = uoe.getSubview(p0);
             if (subview != null) {
                break ;
             }
          }
       }
       return subview;
    }
    public void insertBefore(V8Object p0,V8Object p1){
       String str = "10";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKView.class, str)) {
          return;
       }
       e nativeModule = this.getNativeModule(p0);
       e nativeModule1 = this.getNativeModule(p1);
       if (nativeModule1 == null || !this.v.containsValue(nativeModule1)) {
          this.add(p0);
          return;
       }else if(nativeModule == null || this.v.containsValue(nativeModule)){
          nativeModule.retainJsObj();
          a domNode = this.getDomNode();
          Objects.requireNonNull(domNode);
          if (!PatchProxy.applyVoidTwoRefs(nativeModule, nativeModule1, domNode, a.class, str)) {
             YogaLayout yogaLayout = domNode.f();
             if (yogaLayout != null) {
                domNode.a(nativeModule, yogaLayout.indexOfChild(nativeModule1.getView()));
             }
          }
          this.v.put(nativeModule.getViewID(), nativeModule);
          this.orderedChildList.add(nativeModule);
          nativeModule.attachToParent(this);
       }
       return;
    }
    public void layout(){
       if (PatchProxy.applyVoid(null, this, TKView.class, "12")) {
          return;
       }
       this.getDomNode().d();
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKView tKView = TKView.class;
       if (PatchProxy.isSupport(tKView) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKView, "3")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new TKView$a(this));
       }
       return;
    }
    public void remove(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKView.class, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       e nativeModule = this.getNativeModule(p0);
       if (nativeModule != null && this.v.containsValue(nativeModule)) {
          nativeModule.detachFromParent(this);
          this.getDomNode().e(nativeModule);
          this.v.remove(nativeModule.getViewID());
          this.orderedChildList.remove(nativeModule);
          nativeModule.unRetainJsObj();
       }
       return;
    }
    public void removeAll(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKView.class, "9")) {
          return;
       }
       Iterator iterator = this.v.values().iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          uoe.detachFromParent(this);
          uoe.unRetainJsObj();
       }
       a domNode = this.getDomNode();
       Objects.requireNonNull(domNode);
       if (!PatchProxy.applyVoid(objArray, domNode, a.class, "9")) {
          YogaLayout yogaLayout = domNode.f();
          if (yogaLayout != null) {
             yogaLayout.removeAllViews();
          }
       }
       this.v.clear();
       this.orderedChildList.clear();
       return;
    }
    public void replace(V8Object p0,V8Object p1){
       String str = "11";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKView.class, str)) {
          return;
       }
       e nativeModule = this.getNativeModule(p0);
       e nativeModule1 = this.getNativeModule(p1);
       if (nativeModule == null || (nativeModule1 == null || (this.v.containsValue(nativeModule1) && !this.v.containsValue(nativeModule)))) {
          nativeModule1.detachFromParent(this);
          this.v.remove(nativeModule1.getViewID());
          nativeModule1.unRetainJsObj();
          nativeModule.retainJsObj();
          a domNode = this.getDomNode();
          Objects.requireNonNull(domNode);
          if (!PatchProxy.applyVoidTwoRefs(nativeModule, nativeModule1, domNode, a.class, str)) {
             YogaLayout yogaLayout = domNode.f();
             if (yogaLayout == null) {
                if (r.a()) {
                   throw new IllegalStateException("Super view must be YogaLayout!");
                }
             }else {
                domNode.e(nativeModule1);
                domNode.a(nativeModule, yogaLayout.indexOfChild(nativeModule1.getView()));
             }
          }
          this.v.put(nativeModule.getViewID(), nativeModule);
          int i = 0;
          while (i < this.orderedChildList.size()) {
             if (this.orderedChildList.get(i) == nativeModule1) {
                this.orderedChildList.remove(nativeModule1);
                this.orderedChildList.add(i, nativeModule);
                break ;
             }
             i = i + 1;
          }
          nativeModule.attachToParent(this);
       }
    label_009d :
       return;
    }
    public void setChildViewID(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKView.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       e uoe = this.v.get(p0);
       if (uoe != null) {
          if (p1 != null) {
             this.v.put(p1, uoe);
          }
          this.v.remove(p0);
       }
       return;
    }
    public void setClipChildren(boolean p0){
       TKView tKView = TKView.class;
       if (PatchProxy.isSupport(tKView) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKView, "6")) {
          return;
       }
       this.clipChildren = p0;
       this.getView().setClipChildren(p0);
       return;
    }
    public void setStyle(HashMap p0){
       TKView tKView = TKView.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tKView, "15")) {
          return;
       }
       super.setStyle(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, tKView, "16") && p0 != null) {
          p0 = p0.get("overflow");
          if (p0 instanceof String) {
             this.setClipChildren((TextUtils.equals(p0, "visible") ^ 0x01));
          }
       }
       return;
    }
    public boolean supportAsyncPrepareView(){
       return true;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKView.class, "5")) {
          return;
       }
       super.unRetainAllJsObj();
       Iterator iterator = this.v.values().iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          if (uoe != null) {
             uoe.unRetainJsObj();
          }
       }
       return;
    }
}
