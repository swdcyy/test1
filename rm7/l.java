package rm7.l;
import rm7.a;
import pm7.h;
import java.lang.String;
import pm7.m;
import java.lang.Object;
import rm7.l$a;
import java.util.Iterator;
import java.util.List;
import com.kwai.robust2.patchmanager.model.PatchModel;
import com.kwai.robust.Patch;
import rm7.m;
import pm7.e;
import pm7.d;
import pm7.b;
import java.lang.Throwable;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.System;
import com.kwai.robust.Robust;
import android.content.Context;
import java.io.File;
import com.kwai.robust2.patchmanager.b;
import java.util.Objects;
import rm7.c;
import rm7.b;
import rm7.v;
import rm7.u;

public class l extends a	// class@0023a9
{

    public void l(h p0){
       super(p0, "Robust2PatchLoad", false, false);
    }
    public void e(m p0){
       l$a uoa = this.a();
       Iterator iterator = uoa.b.iterator();
       while (iterator.hasNext()) {
          this.k(iterator.next());
       }
       Iterator iterator1 = uoa.a.iterator();
       while (iterator1.hasNext()) {
          Patch patch = iterator1.next();
          this.j(patch, patch.getExtra());
       }
       a td = this.d;
       m om = new m(td);
       td.j(om);
       return;
    }
    public Map i(){
       Map map = super.i();
       l$a uoa = this.a();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       if (uoa != null) {
          Iterator iterator = uoa.a.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getId());
          }
          Iterator iterator1 = uoa.b.iterator();
          while (iterator1.hasNext()) {
             uArrayList1.add(iterator1.next().patchId);
          }
       }
       Map map1 = map;
       map1.put("applyPatchIds", uArrayList);
       map1.put("rollbackPatchIds", uArrayList1);
       return map;
    }
    public final void j(Patch p0,PatchModel p1){
       Object[] objArray2;
       long l = System.currentTimeMillis();
       PatchModel replacePatch = p1.replacePatchIds;
       int i = 1;
       if (replacePatch != null && replacePatch.size() > 0) {
          Iterator iterator = p1.replacePatchIds.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             this.d.g(str);
             int i1 = 2;
             String str1 = "loadImpl rollbackPatch %s replacePatchId:%s";
             if (Robust.get().isPatchApplied(str)) {
                Robust.get().rollbackPatch(this.d.b(), str);
                b.t(this.d.e(), this.d.f(), str);
                Object[] objArray = new Object[i1];
                objArray[0] = p0.getId();
                objArray[i] = p1.patchId;
                d.b().a("EventLoad", str1, objArray);
             }else {
                b.t(this.d.e(), this.d.f(), str);
                Object[] objArray1 = new Object[i1];
                objArray1[0] = str;
                objArray1[i] = p1.patchId;
                d.b().a("EventLoad", str1, objArray1);
             }
          }
       }
       if (!Robust.get().isPatchApplied(p0.getId())) {
          Robust.get().applyPatch(this.d.b(), p0);
          Objects.requireNonNull(this.d);
          a td = this.d;
          c uoc = new c(td);
          uoc.g((System.currentTimeMillis() - l), null);
          uoc.f(p0);
          td.j(uoc);
          objArray2 = new Object[i];
          objArray2[0] = p1.patchId;
          d.b().a("EventLoad", "loadImpl applyPatch patchId:%s", objArray2);
       }else {
          objArray2 = new Object[i];
          objArray2[0] = p1.patchId;
          d.b().a("EventLoad", "loadImpl applyPatch exists! patchId:%s", objArray2);
       }
       return;
    }
    public final void k(PatchModel p0){
       a td;
       v ov;
       Object[] objArray;
       long l = System.currentTimeMillis();
       this.d.g(p0.patchId);
       Throwable throwable = null;
       if (Robust.get().isPatchApplied(p0.patchId)) {
          Robust.get().rollbackPatch(this.d.b(), p0.patchId);
          Objects.requireNonNull(this.d);
          b.t(this.d.e(), this.d.f(), p0.patchId);
          td = this.d;
          ov = new v(td);
          ov.g((System.currentTimeMillis() - l), throwable);
          ov.f(p0);
          td.j(ov);
          objArray = new Object[]{p0.patchId};
          d.b().a("EventLoad", "rollbackImpl patchId:%s", objArray);
       }else if(b.t(this.d.e(), this.d.f(), p0.patchId)){
          td = this.d;
          ov = new v(td);
          ov.g((System.currentTimeMillis() - l), throwable);
          ov.f(p0);
          td.j(ov);
          objArray = new Object[]{p0.patchId};
          d.b().a("EventLoad", "rollbackImpl unapplied patchId:%s", objArray);
       }else {
          td = this.d;
          u ou = new u(td);
          ou.g((System.currentTimeMillis() - l), throwable);
          ou.f(p0);
          td.j(ou);
          objArray = new Object[]{p0.patchId};
          d.b().c("EventLoad", "rollbackImpl unapplied FAIL patchId:%s", objArray);
       }
       return;
    }
}
