package rm7.e;
import rm7.a;
import pm7.h;
import java.lang.String;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import java.lang.Object;
import com.kwai.robust.Patch;
import com.kwai.robust2.patchmanager.model.PatchModel;
import pm7.e;
import pm7.d;
import pm7.b;
import pm7.m;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Queue;
import java.lang.System;
import com.kwai.robust2.patchmanager.b;
import java.lang.StringBuilder;
import com.kwai.robust.Robust;
import android.content.Context;
import java.util.Objects;
import rm7.g;
import com.yxcorp.utility.SystemUtil;
import java.io.File;
import qkd.b;
import java.lang.Throwable;
import java.util.Set;
import rm7.f;

public class e extends a	// class@0023a0
{
    public final Queue h;
    public final Set i;

    public void e(h p0){
       super(p0, "Robust2PatchColdLoad", false, false);
       this.h = new ConcurrentLinkedQueue();
       this.i = new ConcurrentSkipListSet();
    }
    public static boolean j(List p0,String p1){
       int i = 0;
       if (p0.size() > 0 && !TextUtils.isEmpty(p1)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             PatchModel extra = iterator.next().getExtra();
             if (extra != null && extra.isRollback == null) {
                PatchModel replacePatch = extra.replacePatchIds;
                if (replacePatch != null && replacePatch.contains(p1)) {
                   Object[] objArray = new Object[]{p1,extra};
                   d.b().a("EventColdLoad", "isReplacedPatch %s for %s", objArray);
                   return 1;
                }
             }
          }
       }
       return i;
    }
    public void e(m p0){
       this.l(null);
    }
    public Map i(){
       Map map = super.i();
       map.put("loadedPatchIds", new ArrayList(this.i));
       return map;
    }
    public final void k(boolean p0,a p1){
       if (p0) {
          this.d.j(p1);
       }else {
          this.h.add(p1);
       }
       return;
    }
    public final void l(String p0){
       Object[] objArray1;
       List list1;
       Iterator iterator1;
       a d;
       long l1;
       a uoa = this;
       int i = 1;
       int i1 = TextUtils.isEmpty(p0) ^ 0x01;
       List list = b.m(uoa.d, p0);
       boolean i2 = 0;
       Object[] objArray = new Object[i2];
       d.b().a("EventColdLoad", "getPatchFormListFile:"+list+",cost "+(System.currentTimeMillis() - System.currentTimeMillis())+"ms", objArray);
       Iterator iterator = list.iterator();
       a uoa1 = 1;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i3 = 2;
          if (Robust.get().isPatchApplied(obj.getId())) {
             objArray1 = new Object[i3];
             objArray1[i2] = obj.getId();
             objArray1[i] = obj.getExtra();
             d.b().a("EventColdLoad", "applyPatch FAIL isPatchApplied, patchId:%s model:%s", objArray1);
          }else if(e.j(list, obj.getId())){
             objArray1 = new Object[i3];
             objArray1[i2] = obj.getId();
             objArray1[i] = obj.getExtra();
             d.b().a("EventColdLoad", "applyPatch FAIL isReplacedPatch, patchId:%s model:%s", objArray1);
          }else {
             long l = System.currentTimeMillis();
             Robust robust = Robust.get();
             Context uContext = uoa.d.b();
             if (!i1) {
                i2 = uoa1;
             }
             robust.applyPatch(uContext, obj, i2);
             Objects.requireNonNull(uoa.d);
             d = uoa.d;
             if (i1) {
                i2 = d.g(obj.getId());
                list1 = list;
             }else {
                String id = obj.getId();
                if (!SystemUtil.L(uoa.d.b())) {
                   list1 = list;
                }else {
                   list1 = list;
                   File uFile = b.n(uoa.d.e(), uoa.d.f(), id);
                   if (b.p(uFile)) {
                      b.q(uFile);
                      l1 = 1;
                   label_0106 :
                      i2 = l1;
                   }
                }
                l1 = 0;
                goto label_0106 ;
             }
             g og = new g(d, i2);
             l1 = System.currentTimeMillis() - l;
             og.g(l1, null);
             og.f(obj);
             uoa.k(i1, og);
             l1 = System.currentTimeMillis() - l;
             Object[] objArray2 = new Object[0];
             d.b().a("EventColdLoad", "applyPatch OK, patchId:"+obj.getId()+",cost "+l1+"ms", objArray2);
             if (!i1) {
                uoa.i.add(obj.getId());
             }
             iterator1 = iterator;
             i2 = 0;
             uoa1 = null;
          label_01aa :
             list = list1;
             iterator = iterator1;
             i = 1;
          }
          list1 = list;
          iterator1 = iterator;
          goto label_01aa ;
       }
       return;
    }
}
