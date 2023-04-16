package com.kuaishou.bowl.core.component.c$b;
import hu4.c;
import com.kuaishou.bowl.core.component.c;
import java.lang.Object;
import com.kwaishou.merchant.troubleshooting.core.util.LogParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.bowl.core.component.a;
import com.kwai.robust.PatchProxyResult;
import qu4.f;
import ru4.a;
import u08.c;
import java.lang.StringBuilder;
import nv.c;
import java.util.Map;
import yz7.e;
import su.e;
import fv.g;
import nv.d;
import tx4.h;
import java.util.Objects;
import java.util.List;
import su.g;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import com.google.gson.JsonElement;
import tu.i;
import java.util.ArrayList;
import uu.c;
import su4.a;
import hu4.h;
import com.kuaishou.render.engine.tk.b;
import java.util.Iterator;
import com.tkruntime.v8.V8ObjectProxy;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.lang.Exception;
import com.tkruntime.v8.V8Value;

public class c$b implements c	// class@0011a1
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(LogParams p0){
       c$b uob = c$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "3")) {
          return;
       }
       if (p0 != null) {
          a pageHashCode = this.a.pageHashCode;
          String str = PatchProxy.apply(null, this, uob, "5");
          if (str != PatchProxyResult.class) {
          }else {
             str = f.c.j(this.a.createComponentInfoNode());
          }
          p0.setPageId(pageHashCode);
          p0.setNodeId(str);
          p0.setBundleId(this.a.getBundleId());
          p0.setComponentName(this.a.getComponentName());
          p0.setBiz(this.a.getBundleId());
          c.a(p0);
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       String str = "------onDataUpdate data = "+p0;
       try{
          c.f(str);
          Map map = e.a(p0, Map.class);
          Object modelObj = this.a.getModelObj();
          if (modelObj != null && (modelObj instanceof Map && map != null)) {
             modelObj.putAll(map);
             if (e.b("KEY_LIVE_CART_PERF_OPT", true)) {
                this.a.updateModelObjAsync(modelObj);
             }else {
                this.a.updateModelObj(modelObj);
             }
          }
       }catch(java.lang.Exception e0){
          c.b(d.a(g.a(this.a.pageHashCode), "componentData.filedData parse error"));
       }
       return;
    }
    public void c(h p0){
       ArrayList uArrayList;
       h oh;
       b t;
       Iterator iterator1;
       V8ObjectProxy v8ObjectProx1;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       c$b ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, ta, c.class, "16");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(ta.f == null){
          c.f("异步没有设置完成，同步获取");
          obj = g.a(ta.pageHashCode);
          if (obj != null) {
             obj = obj.K;
             if (obj != null) {
                List list = obj.a(ta.componentData.filedData.data);
                ta.f = list;
                if (list != null && !list.isEmpty()) {
                }
             }
          }
       }else {
       }
    label_008e :
       if (objArray == null) {
          return;
       }else {
          Object[] objArray1 = new Object[]{objArray};
          p0.call(objArray1);
          Iterator iterator = objArray.iterator();
          while (iterator.hasNext()) {
             V8ObjectProxy v8ObjectProx = iterator.next();
             try{
                v8ObjectProx.setWeak();
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
                goto label_009e ;
             }
          }
          objArray.clear();
          return;
       }
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$b.class, "4")) {
          return;
       }
       f.c.a(this.a.createComponentInfoNode(), p0, p1);
       return;
    }
}
