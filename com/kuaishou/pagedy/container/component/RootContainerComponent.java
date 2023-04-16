package com.kuaishou.pagedy.container.component.RootContainerComponent;
import so4.a;
import com.kuaishou.bowl.core.component.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.bowl.core.component.a;
import su.g;
import java.util.Map;
import fo4.c;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Integer;
import nv.c;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import hu4.n;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import qu4.f;
import ru4.a;
import hu4.f;
import android.view.ViewParent;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.pagedy.container.widget.RootNodeView;
import android.content.Context;
import mrd.c;

public class RootContainerComponent extends b implements a	// class@000a58
{
    public c dispatchDrawSubject;

    public void RootContainerComponent(){
       super();
    }
    public void applyClipConfig(){
       if (PatchProxy.applyVoid(null, this, RootContainerComponent.class, "4")) {
          return;
       }
       if (this.rootView == null) {
          return;
       }
       if (g.a(this.pageHashCode) != null && g.a(this.pageHashCode).p != null) {
          String str = "KEY_ROOT_NODE_CONFIG_CALLBACK";
          if (g.a(this.pageHashCode).p.get(str) != null) {
             Object obj = g.a(this.pageHashCode).p.get(str);
             if (obj instanceof c) {
                boolean b = obj.c();
                this.rootView.setClipChildren(b);
                this.rootView.setClipToPadding(b);
             }
          }
       }
       return;
    }
    public void onBindView(a p0,View p1,int p2){
       if (PatchProxy.isSupport(RootContainerComponent.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, RootContainerComponent.class, "5")) {
          return;
       }
       c.f("RootNodeWidget onBindView");
       return;
    }
    public void onCreateChildren(FragmentActivity p0,ViewGroup p1){
       n on;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RootContainerComponent.class, "2")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       p1.removeAllViews();
       if (this.children != null) {
          int i = 0;
          while (i < this.children.size()) {
             a uoa = this.children.get(i);
             if (!uoa.isTypeNative()) {
                a componentDat = uoa.componentData;
                if (componentDat != null) {
                   on = new n(componentDat.bundleUrl, componentDat.getMapParams());
                   if (("RN").equals(uoa.getComponentType())) {
                      n b = on.b;
                      if (b != null) {
                         b.put("tsPageId", uoa.pageHashCode);
                         on.b.put("tsComponentId", f.c.j(this.createComponentInfoNode()));
                      }
                   }
                }else {
                label_0065 :
                   on = null;
                }
             }else {
                goto label_0065 ;
             }
             View view = uoa.getView(p0, on, p1, null);
             if (view != null) {
                if (view.getParent() != null) {
                   view.getParent().removeView(view);
                }
                p1.addView(view);
             }
             i = i + 1;
          }
       }
       return;
    }
    public View onCreateView(FragmentActivity p0,ViewGroup p1){
       Context context;
       RootNodeView obj = PatchProxy.applyTwoRefs(p0, p1, this, RootContainerComponent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null) {
          context = p1.getContext();
       }
       obj = new RootNodeView(context, 1);
       obj.setDispatchDrawSubject(this.dispatchDrawSubject);
       return obj;
    }
    public void onViewChanged(){
    }
    public void setDispatchDrawSubject(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RootContainerComponent.class, "1")) {
          return;
       }
       this.dispatchDrawSubject = p0;
       a trootView = this.rootView;
       if (trootView != null && trootView instanceof a) {
          trootView.setDispatchDrawSubject(p0);
       }
       return;
    }
}
