package rm7.q;
import rm7.a;
import pm7.h;
import java.lang.String;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import java.lang.Object;
import com.kwai.robust2.patchmanager.model.PatchModel;
import pm7.e;
import pm7.d;
import pm7.b;
import java.util.Collection;
import com.kwai.robust.Patch;
import pm7.m;
import java.lang.System;
import java.io.File;
import com.kwai.robust2.patchmanager.b;
import java.lang.Throwable;
import java.util.Map;
import java.util.HashMap;
import com.kwai.robust2.patchmanager.model.PatchResponse;
import java.util.ArrayList;
import com.kwai.robust.Robust;
import rm7.r;
import rm7.s;
import qkd.b;
import rm7.t;
import com.kwai.robust2.patchmanager.c;
import com.kwai.robust2.patchmanager.apiservice.SafeModeApiServiceWrapper;
import com.kwai.robust2.patchmanager.apiservice.SafeModeApiServiceWrapper$b;
import java.util.Set;
import java.lang.Iterable;
import brd.t;
import rm7.n;
import rm7.o;
import erd.g;
import crd.b;
import qm7.b;
import qm7.b$a;
import rm7.p;
import brd.y;

public class q extends a	// class@0023ae
{

    public void q(h p0){
       super(p0, "Robust2PatchQuery", true, false);
    }
    public static boolean m(List p0,String p1){
       int i = 0;
       if (p0 != null && (p0.size() > 0 && !TextUtils.isEmpty(p1))) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             PatchModel patchModel = iterator.next();
             if (patchModel.isRollback == null) {
                PatchModel replacePatch = patchModel.replacePatchIds;
                if (replacePatch != null && replacePatch.contains(p1)) {
                   Object[] objArray = new Object[]{p1,patchModel};
                   d.b().a("EventQuery", "isReplacedPatch %s for %s", objArray);
                   return 1;
                }
             }
          }
       }
       return i;
    }
    public static boolean n(Collection p0,String p1){
       PatchModel extra;
       Iterator iterator = p0.iterator();
       while (true) {
          int i = 0;
          if (!iterator.hasNext()) {
             return i;
          }
          Patch patch = iterator.next();
          if (patch.getExtra() != null) {
             extra = patch.getExtra();
             if (extra.isRollback == null) {
                PatchModel replacePatch = extra.replacePatchIds;
                if (replacePatch != null && replacePatch.contains(p1)) {
                   break ;
                }
             }
          }
       }
       Object[] objArray = new Object[]{p1,extra};
       d.b().a("EventQuery", "isReplacedPatchByLoaded %s for %s", objArray);
       return 1;
    }
    public void e(m p0){
       a td = this.d;
       td.k(td.b);
       System.currentTimeMillis();
       b.j(b.f(this.d.e(), this.d.f()));
       this.o();
       return;
    }
    public Map i(){
       Map map = super.i();
       map.put("currentLoadedPatchIds", this.d.c());
       return map;
    }
    public final void j(PatchResponse p0){
       Object[] objArray;
       ArrayList uArrayList = new ArrayList();
       Collection appliedPatch = Robust.get().getAppliedPatches();
       Iterator iterator = p0.patchList.iterator();
       while (iterator.hasNext()) {
          PatchModel patchModel = iterator.next();
          int i = 2;
          if (!TextUtils.equals(patchModel.robustId, this.d.f())) {
             objArray = new Object[i];
             objArray[0] = patchModel.robustId;
             objArray[1] = patchModel.toJsonString();
             d.b().a("EventQuery", "filterPatch %s, robustId Fail, model:%s", objArray);
          }else {
             PatchModel patchModel1 = patchModel.featureName;
             PatchModel patchModel2 = patchModel.featureVersion;
             if (TextUtils.isEmpty(patchModel1) || (!TextUtils.isEmpty(patchModel2) && (!TextUtils.isEmpty(patchModel1) || (!TextUtils.isEmpty(patchModel2) || (!TextUtils.isEmpty(patchModel2) && !patchModel2.equals("1")))))) {
                objArray = new Object[]{patchModel.toJsonString()};
                d.b().a("EventQuery", "Patch model feature info illegal: %s", objArray);
             }else if(patchModel.isRollback != null){
                if (Robust.get().isPatchApplied(patchModel.patchId)) {
                   uArrayList.add(patchModel);
                }else {
                   uArrayList.add(patchModel);
                   objArray = new Object[i];
                   objArray[0] = patchModel.robustId;
                   objArray[1] = patchModel.toJsonString();
                   d.b().a("EventQuery", "filterPatch %s rollback, isPatchApplied false, model:%s", objArray);
                }
             }else if(Robust.get().isPatchApplied(patchModel.patchId)){
                objArray = new Object[i];
                objArray[0] = patchModel.robustId;
                objArray[1] = patchModel.toJsonString();
                d.b().a("EventQuery", "filterPatch %s apply, isPatchApplied, model:%s", objArray);
             }else if(q.m(p0.patchList, patchModel.patchId)){
                objArray = new Object[i];
                objArray[0] = patchModel.robustId;
                objArray[1] = patchModel.toJsonString();
                d.b().a("EventQuery", "filterPatch %s apply, isReplacedPatch, model:%s", objArray);
             }else if(q.n(appliedPatch, patchModel.patchId)){
                objArray = new Object[i];
                objArray[0] = patchModel.robustId;
                objArray[1] = patchModel.toJsonString();
                d.b().a("EventQuery", "filterPatch %s apply, isReplacedPatchByLoaded, model:%s", objArray);
             }else {
                uArrayList.add(patchModel);
             }
          }
       }
       if (uArrayList.size() > 0) {
          p0.patchList.clear();
          p0.patchList.addAll(uArrayList);
       }else {
          p0.patchList.clear();
       }
       return;
    }
    public void k(Throwable p0,long p1){
       a td = this.d;
       r or = new r(td);
       or.g(p1, p0);
       td.j(or);
    }
    public void l(PatchResponse p0,long p1){
       a td;
       s os;
       Object[] objArray;
       int i = 0;
       String str = "EventQuery";
       if (p0 == null) {
          td = this.d;
          os = new s(td);
          os.g(p1, null);
          td.j(os);
          objArray = new Object[i];
          d.b().a(str, "handleResponse response == null", objArray);
          return;
       }else {
          PatchResponse patchList = p0.patchList;
          if (patchList == null) {
             td = this.d;
             os = new s(td);
             os.g(p1, null);
             td.j(os);
             objArray = new Object[i];
             d.b().a(str, "handleResponse response.patchList == null", objArray);
             return;
          }else if(patchList.size() <= 0){
             td = this.d;
             os = new s(td);
             os.g(p1, null);
             td.j(os);
             objArray = new Object[i];
             d.b().a(str, "handleResponse response.patchList.size\(\) <= 0", objArray);
             return;
          }else {
             File uFile = new File(b.f(this.d.e(), this.d.f()), "patch.info");
             b.j(uFile.getParentFile());
             b.q0(uFile, p0.toJsonString());
             this.j(p0);
             if (p0.patchList.size() <= 0) {
                td = this.d;
                os = new s(td);
                os.g(p1, null);
                td.j(os);
                objArray = new Object[i];
                d.b().a(str, "handleResponse response.patchList.size\(\) <= 0 after filterPatch", objArray);
                return;
             }else {
                a td1 = this.d;
                t ot = new t(td1);
                ot.g(p1, null);
                ot.f(p0.patchList);
                td1.j(ot);
                return;
             }
          }
       }
    }
    public final void o(){
       String str = this.a();
       String str1 = ",";
       if (c.a().d()) {
          long l = System.currentTimeMillis();
          SafeModeApiServiceWrapper.c.a().a(this.d.f(), TextUtils.join(str1, this.d.d())).subscribe(new n(this, l), new o(this, l));
       }else {
          b.b.a().a(this.d.f(), TextUtils.join(str1, this.d.d())).subscribeWith(new p(this, System.currentTimeMillis()));
       }
       return;
    }
}
