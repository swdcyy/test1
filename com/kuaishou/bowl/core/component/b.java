package com.kuaishou.bowl.core.component.b;
import uu.d;
import com.kuaishou.bowl.core.component.NativeComponent;
import com.kuaishou.bowl.core.component.b$a;
import com.kuaishou.bowl.core.component.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import pv.b;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import com.kuaishou.bowl.event.utils.StageName;
import fv.c;
import com.kuaishou.bowl.core.component.a$d;
import com.kuaishou.bowl.core.util.ComponentStateMachine$ComponentState;
import com.kuaishou.bowl.core.component.b$b;
import java.lang.Runnable;
import ekd.s1;
import java.util.List;
import java.lang.ref.WeakReference;
import androidx.fragment.app.FragmentActivity;
import android.view.ViewGroup;
import java.util.Iterator;
import java.lang.StringBuilder;
import nv.c;
import com.kwai.robust.PatchProxyResult;
import hu4.n;
import hu4.f;
import fv.g;
import nv.d;
import com.kuaishou.bowl.core.component.a$e;
import android.view.View$OnAttachStateChangeListener;
import java.lang.RuntimeException;
import java.lang.Boolean;
import java.util.ArrayList;

public abstract class b extends NativeComponent implements d	// class@00119f
{
    public View$OnAttachStateChangeListener onAttachStateChangeListener;

    public void b(){
       super();
       this.onAttachStateChangeListener = new b$a(this);
    }
    public void bindData(a p0,View p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "2")) {
          return;
       }
       this.setPosition(p2);
       this.setP0("EVENT_COMPONENT_UPDATE_DATA_TIME");
       String str = b.a().b(this.pageHashCode, this.componentData.name);
       c.a(StageName.pdy_component_update_rootview_start, this.componentData, this.getPageName(), str);
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
       this.onBindChildren(p0);
       this.setP1();
       if (!this.isReportShowManual()) {
          s1.d(new b$b(this));
       }
       c.a(StageName.pdy_component_update_rootview_end, this.componentData, this.getPageName(), str);
       return;
    }
    public void deleteChild(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       if (p0 == null || (!this.children.isEmpty() && this.children.contains(p0))) {
          this.children.remove(p0);
          p0.moveToState(ComponentStateMachine$ComponentState.DESTROY);
          this.onCreateChildren(this.curActivity.get(), this.rootView);
          for (int i = 0; i < this.children.size(); i++) {
             this.children.get(i).update(this.children.get(i));
          }
       }
       return;
    }
    public final void destroyDelComponent(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       a tchildren = this.children;
       if (tchildren != null && !tchildren.isEmpty()) {
          Iterator iterator = this.children.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             c.f("É¾³ý×é¼þ"+uoa.getComponentName());
             uoa.moveToState(ComponentStateMachine$ComponentState.DESTROY);
          }
       }
       return;
    }
    public final a findCacheComponent(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.children;
       if (obj != null && !obj.isEmpty()) {
          Iterator iterator = this.children.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (p0.equals(uoa.getComponentName())) {
                iterator.remove();
                return uoa;
             }
          }
       }
       return null;
    }
    public View getView(FragmentActivity p0,n p1,ViewGroup p2,f p3){
       a$e obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          c.b(d.a(g.a(this.pageHashCode), "getRootView error activity is null"));
          return null;
       }else {
          this.setP0("EVENT_COMPONENT_COST_TIME");
          String str = b.a().b(this.pageHashCode, this.componentData.name);
          c.a(StageName.pdy_component_create_rootview_start, this.componentData, this.getPageName(), str);
          c.j(StageName.pgy_component_render_start, this.componentData, this.getPageName(), this.rubasToken);
          obj = new a$e(this, p0, p1, p2, p3);
          this.curCreateViewData = v8;
          if (!this.moveToState(ComponentStateMachine$ComponentState.CREATE)) {
             this.onCreate();
          }
          a trootView = this.rootView;
          if (trootView == null) {
             return null;
          }else {
             trootView.addOnAttachStateChangeListener(this.onAttachStateChangeListener);
             if (this.rootView instanceof ViewGroup) {
                this.onViewChanged();
                this.onCreateChildren(p0, this.rootView);
                this.setP1();
                c.a(StageName.pdy_component_create_rootview_end, this.componentData, this.getPageName(), str);
                return this.rootView;
             }else {
                throw new RuntimeException("ContainerComponent rootView must ViewGroup");
             }
          }
       }
    }
    public final void onBindChildren(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       for (int i = 0; i < p0.children.size(); i = i + 1) {
          a uoa = this.children.get(i);
          uoa.bindData(p0.children.get(i), uoa.rootView, i);
       }
       return;
    }
    public abstract void onCreateChildren(FragmentActivity p0,ViewGroup p1);
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       this.curState = ComponentStateMachine$ComponentState.DESTROY;
       a tchildren = this.children;
       if (tchildren == null) {
          return;
       }
       Iterator iterator = tchildren.iterator();
       while (iterator.hasNext()) {
          iterator.next().moveToState(ComponentStateMachine$ComponentState.DESTROY);
       }
       return;
    }
    public void onUnbind(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       this.curState = ComponentStateMachine$ComponentState.UNBIND;
       a tchildren = this.children;
       if (tchildren == null) {
          return;
       }
       Iterator iterator = tchildren.iterator();
       while (iterator.hasNext()) {
          iterator.next().moveToState(ComponentStateMachine$ComponentState.UNBIND);
       }
       return;
    }
    public void onViewAppear(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       super.onViewAppear(p0);
       a tchildren = this.children;
       if (tchildren != null) {
          Iterator iterator = tchildren.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             a rootView = uoa.rootView;
             if (rootView != null) {
                uoa.onViewAppear(rootView);
             }
          }
       }
       return;
    }
    public final void onViewDisappear(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       super.onViewDisappear(p0);
       return;
    }
    public boolean tryAnchor(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.children;
       if (obj == null) {
          return super.tryAnchor(p0);
       }
       Iterator iterator = obj.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().tryAnchor(p0)) {
             break ;
          }
       }
       c.f("anchor success componentName = "+this.getComponentName()+" instanceId = "+p0);
       return true;
    }
    public void update(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       super.update(p0);
       a children = p0.children;
       if (children != null && !children.isEmpty()) {
          int i = 0;
          if (this.diffChildren(p0)) {
             ArrayList uArrayList = new ArrayList();
             int i1 = 0;
             while (i1 < p0.children.size()) {
                a uoa = p0.children.get(i1);
                if (uoa != null) {
                   uoa = this.findCacheComponent(uoa.getComponentName());
                   if (uoa == null) {
                      uArrayList.add(p0.children.get(i1));
                   }else {
                      uArrayList.add(uoa);
                   }
                }
                i1 = i1 + 1;
             }
             this.destroyDelComponent();
             this.children = uArrayList;
             this.onCreateChildren(this.curActivity.get(), this.rootView);
          }
          while (i < p0.children.size()) {
             this.children.get(i).update(p0.children.get(i));
             i = i + 1;
          }
       }
       return;
    }
}
