package xd8.b;
import xd8.g;
import ma8.i;
import xd8.a;
import ok.x;
import com.google.common.base.Suppliers;
import com.mini.js.commonapitracer.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import ja8.e;
import com.mini.d;
import java.lang.StringBuilder;
import yd8.b;
import qc8.a;
import xd8.j;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import xd8.i;
import xd8.n;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import com.mini.js.helper.a;
import xd8.m;
import com.mini.js.commonapitracer.f;
import ga8.h;
import java.lang.Boolean;
import z98.b;
import mc8.c;
import org.json.JSONObject;
import android.animation.TimeInterpolator;
import com.mini.js.jscomponent.base.JSComponentBean$Position;
import com.mini.js.jscomponent.base.JSComponentBean$Style;
import com.mini.js.jscomponent.base.c;
import org.json.JSONException;
import mc8.b;
import android.animation.Animator;
import java.util.ArrayList;
import java.util.List;
import mc8.a;
import android.animation.AnimatorSet;
import java.util.Collection;

public abstract class b extends g	// class@002fcf
{
    public final x g;

    public void b(i p0){
       super(p0);
       this.g = Suppliers.a(new a(this, p0));
    }
    public c h(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.get();
    }
    public void n(Integer p0,e p1,Integer p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, b.class, "2")) {
          return;
       }
       g og = g.class;
       if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, g.class, "5")) {
          if (d.f()) {
             d.a("#BaseJS2NativeObj#", "add: nodeId:"+p0+" param:"+p1.g()+" pageid:"+p3);
          }
          if (this.e.s(p3)) {
             this.m(p1, b.a(313, "pageId is not pageInvalid"));
          }else if(this.f(p0) != null){
             this.b(p0, p1, p3, p2.intValue());
          }else if(!PatchProxy.applyVoidOneRefs(p0, this, og, "7") && this.f == null){
             this.f = new j(p0);
          }
          a uoa = this.l(p0, p1, p2, p3);
          if (!PatchProxy.applyVoidOneRefs(uoa, this, og, "8")) {
             og = this.f;
             if (og != null && og.c == null) {
                if (uoa == null) {
                   this.f = null;
                }else {
                   og.b = uoa.hashCode();
                   og.c = true;
                }
             }
          }
          if (uoa != null) {
             uoa.q = this.h();
             this.c.put(p0, uoa);
             if (!PatchProxy.applyVoidThreeRefs(p0, uoa, p1, this, g.class, "15")) {
                if (d.f()) {
                   d.a("JS_COMPONENT_CONTEXT", "createJSContextById 根据nodeId，创建一个JSContext");
                }
                if (p1 != null) {
                   String str = this.e(p1);
                   if (!TextUtils.isEmpty(str)) {
                      this.d.put(str, p0);
                      i oi = this.b.a(str);
                      if (oi != null) {
                         oi.e(uoa);
                         g tb = this.b;
                         Objects.requireNonNull(tb);
                         if (!PatchProxy.applyVoidTwoRefs(p0, str, tb, n.class, "3") && (p0 != null && str != null)) {
                            tb.a.put(p0, str);
                         }
                      }
                   }
                }
             }
          }
       }
    label_0123 :
       if (d.f()) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p3),p1};
          d.a("#BaseNativeManager#", String.format("add: nodeId=%s,pageId=%s,param=%s", objArray));
       }
       this.e.q(p3, p2.intValue(), a.c(p1, 1));
       this.m(p1, b.d());
       return;
    }
    public abstract String o();
    public void p(Integer p0,e p1,int p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "5")) {
          return;
       }
       int i = 1;
       if (d.f()) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p3),p1};
          d.a("#BaseNativeManager#", String.format("operate: nodeId=%s,pageId=%s,param=%s", objArray));
       }
       m om = this.f(p0);
       if (om != null) {
          om.f(Integer.valueOf(p2), p1, p3);
       }
       g te = this.e;
       if (om == null) {
          i = false;
       }
       te.q(p3, p2, a.c(p1, i));
       if (p1.b() != null) {
          p1.b().e(p1);
       }
       return;
    }
    public boolean q(Integer p0,e p1,Integer p2,int p3){
       Object[] obj;
       g b;
       String obj2;
       g og = this;
       object oobject = p0;
       object oobject1 = p1;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       if (d.f()) {
          obj = new Object[]{oobject,Integer.valueOf(p3),oobject1};
          d.a("#BaseNativeManager#", String.format("remove: nodeId=%s,pageId=%s,param=%s", obj));
       }
       if (PatchProxy.isSupport(g.class)) {
          StringBuilder obj1 = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, g.class, "9");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.booleanValue();
          }else {
          label_006e :
             String str = "#BaseJS2NativeObj#";
             if (d.f()) {
                obj1 = "remove: nodeId: "+p0+" parameters: ";
                object oobject2 = (oobject1 != null)? oobject1: "parameters is null";
                d.a(str, obj1+oobject2);
             }
             a uoa = this.f(p0);
             if (uoa != null) {
                uoa.destroy();
                og.c.remove(p0);
                if (!PatchProxy.applyVoidOneRefs(p0, this, g.class, "10") && !TextUtils.isEmpty(this.i())) {
                   b = og.b;
                   Objects.requireNonNull(b);
                   obj2 = PatchProxy.applyOneRefs(p0, b, n.class, "5");
                   if (obj2 != PatchProxyResult.class) {
                      i = obj2.booleanValue();
                   }else {
                      obj2 = b.a.remove(p0);
                      if (!TextUtils.isEmpty(obj2)) {
                         i oi = b.b.remove(obj2);
                         if (oi != null) {
                            oi.destroy();
                         }
                         if (oi != null) {
                            i = true;
                         }
                      }
                   }
                   if (d.f()) {
                      d.a(str, "释放JSContext, 结果是 "+i);
                   }
                }
             label_0109 :
                this.m(oobject1, b.d());
                i = true;
             }else {
                this.m(oobject1, b.a(102, "没有找到组件"));
                obj1 = "没有找到组件，检查下是否有创建。js-> ";
                obj2 = (oobject1 != null)? p1.g(): " input ";
                d.c(str, obj1+obj2+" this is "+this.getClass().getSimpleName());
             }
          }
       }else {
          goto label_006e ;
       }
       og.e.q(p3, p2.intValue(), a.c(oobject1, i));
       return i;
    }
    public void r(Integer p0,e p1,int p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "6")) {
          return;
       }
       if (d.f()) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p3),p1};
          d.a("#BaseNativeManager#", String.format("operate: nodeId=%s,pageId=%s,param=%s", objArray));
       }
       m om = this.f(p0);
       if (om != null) {
          om.b(p0, p1, p3);
          this.m(p1, b.d());
       }else {
          d.c("#BaseNativeManager#", "没有找到组件，组件id为 "+p0+" js 参数为: "+p1.g());
          this.m(p1, b.a(102, "没有找到组件"));
       }
       return;
    }
    public void s(Integer p0,e p1,int p2,int p3){
       boolean b;
       g og;
       PatchProxyResult patchProxyRe1;
       Object obj2;
       AnimatorSet uAnimatorSet;
       ArrayList uArrayList;
       int patchProxyRe2;
       Animator uAnimator;
       AnimatorSet uAnimatorSet1;
       double d;
       int i = this;
       object oobject = p0;
       object oobject1 = p1;
       int i1 = p3;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "4")) {
          return;
       }
       String str = "#BaseNativeManager#";
       boolean i2 = 1;
       boolean i3 = 0;
       if (d.f()) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p3),oobject1};
          d.a(str, String.format("update: nodeId=%s,pageId=%s,param=%s", objArray));
       }
       m om = this.f(p0);
       if (om != null) {
          a uoa = this.f(p0);
          c uoc = c.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          JSComponentBean$Style obj = null;
          JSONObject obj1 = PatchProxy.applyTwoRefs(uoa, oobject1, obj, uoc, "1");
          if (obj1 != patchProxyRe) {
             i2 = obj1.booleanValue();
          }else {
             obj1 = p1.f().optJSONObject("animation");
             if (obj1 != null) {
                int i4 = obj1.optInt("duration");
                if (i4 > 0) {
                   TimeInterpolator timeInterpol = c.a(obj1.optString("timingFunc"));
                   JSONObject jSONObject = p1.f();
                   JSComponentBean$Position position = PatchProxy.applyOneRefs(jSONObject, obj, uoc, "3");
                   if (position != patchProxyRe) {
                      patchProxyRe1 = patchProxyRe;
                   }else {
                      jSONObject = jSONObject.optJSONObject("position");
                      if (jSONObject == null) {
                         patchProxyRe1 = patchProxyRe;
                         obj2 = obj;
                      label_00db :
                         JSONObject jSONObject1 = p1.f();
                         b obj3 = PatchProxy.applyOneRefs(jSONObject1, obj, uoc, "2");
                         patchProxyRe = patchProxyRe1;
                         obj = (obj3 != patchProxyRe)? obj3: c.a(jSONObject1.optJSONObject("style"));
                      }else {
                         position = new JSComponentBean$Position();
                         d = 0;
                         patchProxyRe1 = patchProxyRe;
                         position.left = (float)jSONObject.optDouble("left", d);
                         position.top = (float)jSONObject.optDouble("top", d);
                         position.width = (float)jSONObject.optDouble("width", d);
                         position.height = (float)jSONObject.optDouble("height", d);
                      }
                   }
                   obj2 = position;
                   goto label_00db ;
                }
             }
             i2 = false;
          }
          if (!i2) {
             b = om.e(Integer.valueOf(p2), oobject1, i1);
             this.o();
             if (b) {
                og = this;
                og.m(oobject1, b.d());
             }else {
                og = this;
             }
             i3 = b;
          label_01a1 :
             og.e.q(i1, p2, a.c(oobject1, i3));
             return;
          }else {
             og = this;
             og.m(oobject1, b.a(-2, "动画运行中"));
          }
       }else {
          og = i;
          og.m(oobject1, b.a(102, "nodeId对应组件为空"));
          d.c(str, "没有找到组件，组件id为 "+oobject+" js 参数为: "+p1.g());
       }
       i3 = false;
       goto label_01a1 ;
    }
}
