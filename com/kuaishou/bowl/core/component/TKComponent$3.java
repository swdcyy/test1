package com.kuaishou.bowl.core.component.TKComponent$3;
import com.kuaishou.tachikoma.TKViewContainerWrapView$a;
import com.kuaishou.bowl.core.component.c;
import androidx.fragment.app.FragmentActivity;
import hu4.n;
import android.view.ViewGroup;
import hu4.f;
import java.lang.Object;
import com.kuaishou.tachikoma.TKViewContainerWrapView;
import java.lang.Throwable;
import tx4.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.bowl.core.component.a;
import fv.g;
import nv.d;
import java.util.HashMap;
import pv.a;
import java.util.Map;
import nv.c;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import uu.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uu.h;
import com.kuaishou.bowl.event.utils.StageName;
import com.kuaishou.bowl.core.component.TKComponent$3$3;
import fv.c;
import android.view.View;
import android.view.ViewParent;
import android.view.View$OnAttachStateChangeListener;
import android.widget.FrameLayout;
import java.lang.StringBuilder;
import com.kuaishou.bowl.core.component.TKComponent$3$1;
import com.kuaishou.bowl.core.component.TKComponent$3$2;

public class TKComponent$3 implements TKViewContainerWrapView$a	// class@001196
{
    public final FragmentActivity a;
    public final n b;
    public final ViewGroup c;
    public final f d;
    public final c e;

    public void TKComponent$3(c p0,FragmentActivity p1,n p2,ViewGroup p3,f p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(TKViewContainerWrapView p0,int p1,Throwable p2,w p3){
       boolean b;
       View view;
       String[] stringArray4;
       String[] stringArray5;
       TKComponent$3 te1;
       if (PatchProxy.isSupport(TKComponent$3.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, TKComponent$3.class, "2")) {
          return;
       }
       this.e.addError("创建View失败，触发失败回调", String.valueOf(p2), p2);
       String str = "component";
       String[] stringArray = new String[]{str};
       int i = 1;
       String[] stringArray1 = new String[i];
       int i1 = 0;
       stringArray1[i1] = this.e.getComponentName();
       c.d(d.a(g.a(this.e.pageHashCode), "create tk view fail,start degrade"), a.a(stringArray, stringArray1));
       stringArray = null;
       if (TextUtils.isEmpty(this.e.getComponentData().downgradeName)) {
          c uoc = c.a();
          TKComponent$3 te = this.e;
          a pageHashCode = te.pageHashCode;
          String componentNam = te.getComponentName();
          Objects.requireNonNull(uoc);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object obj = PatchProxy.applyTwoRefs(pageHashCode, componentNam, uoc, c.class, "17");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             h oh = uoc.a.get(pageHashCode);
             if (oh == null) {
                b = false;
             }else {
                Object obj1 = PatchProxy.applyOneRefs(componentNam, oh, h.class, "18");
                b = (obj1 != patchProxyRe)? obj1.booleanValue(): oh.a.containsKey(componentNam);
             }
          }
          if (b) {
          label_00e8 :
             te = this.e;
             c.a().p(te.pageHashCode, te.getComponentName(), i);
             view = this.e.createView(this.a, this.b, this.c, this.d);
             if (view != null && view.getParent() == null) {
                String[] stringArray2 = new String[]{str};
                String[] stringArray3 = new String[i];
                stringArray3[i1] = this.e.getComponentName();
                c.d(d.a(g.a(this.e.pageHashCode), "dynamic view create error degrade to native success"), a.a(stringArray2, stringArray3));
                te = this.e;
                Objects.requireNonNull(te);
                if (!PatchProxy.applyVoidTwoRefs(p0, view, te, c.class, "4")) {
                   if (p0 != null) {
                      view.removeOnAttachStateChangeListener(te.i);
                      view.addOnAttachStateChangeListener(te.i);
                      p0.removeAllViews();
                      p0.addView(view);
                      if (p0.getTag(0x7f0a15de) != null && p0.getTag(0x7f0a15df) != null) {
                         te.onBindView(p0.getTag(R.id.key_cache_component), view, p0.getTag(R.id.key_cache_position).intValue());
                         p0.setTag(R.id.key_cache_component, stringArray);
                         p0.setTag(R.id.key_cache_position, stringArray);
                      }
                   }else {
                      stringArray4 = new String[]{str};
                      stringArray5 = new String[i];
                      stringArray5[i1] = te.getComponentName();
                      c.d(d.a(g.a(te.pageHashCode), "dynamic view create error degrade to native error"), a.a(stringArray4, stringArray5));
                   }
                }
             }else {
                stringArray4 = new String[]{str};
                stringArray5 = new String[i];
                stringArray5[i1] = this.e.getComponentName();
                c.d(d.a(g.a(this.e.pageHashCode), "dynamic view create error create fail"), a.a(stringArray4, stringArray5));
                te1 = this.e;
                c.j(StageName.pgy_component_render_fail, te1.componentData, te1.getPageName(), this.e.rubasToken);
             }
          }else {
             te1 = this.e;
             c.k(StageName.pgy_component_render_fail, te1.componentData, te1.getPageName(), this.e.rubasToken, new TKComponent$3$3(this));
             stringArray4 = new String[]{str};
             stringArray5 = new String[i];
             stringArray5[i1] = this.e.getComponentName();
             c.d(d.a(g.a(this.e.pageHashCode), "dynamic view create error no degrade return null"), a.a(stringArray4, stringArray5));
             this.e.addError("降级失败，未配置降级组件", this.b, stringArray);
          }
       }else {
          goto label_00e8 ;
       }
    label_01d3 :
       return;
    }
    public void b(TKViewContainerWrapView p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKComponent$3.class, "1")) {
          return;
       }
       c.f("create tk view success:"+this.e.getComponentName());
       if (p0 != null) {
          p0.requestLayout();
       }
       TKComponent$3 te = this.e;
       c.k(StageName.pgy_component_render_success, te.componentData, te.getPageName(), this.e.rubasToken, new TKComponent$3$1(this, p1));
       te = this.e;
       c.k(StageName.pgy_component_tk_render_success, te.componentData, te.getPageName(), this.e.rubasToken, new TKComponent$3$2(this, p1));
       TKComponent$3 te1 = this.e;
       te1.addLog("创建View成功", te1.getComponentData());
       return;
    }
}
