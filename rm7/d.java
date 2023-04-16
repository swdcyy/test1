package rm7.d;
import rm7.a;
import pm7.h;
import java.lang.String;
import java.util.ArrayList;
import pm7.m;
import java.util.Map;
import java.util.HashMap;
import java.lang.Object;
import java.lang.System;
import com.kwai.robust.Robust;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.robust.Patch;
import android.content.Context;
import java.util.Objects;
import java.io.File;
import com.kwai.robust2.patchmanager.b;
import pm7.e;
import pm7.d;
import java.lang.StringBuilder;
import pm7.b;
import java.util.List;
import java.lang.Throwable;
import java.lang.Boolean;

public class d extends a	// class@00239f
{
    public final List h;

    public void d(h p0){
       super(p0, "Robust2PatchCleanAllPatch", true, false);
       this.h = new ArrayList();
    }
    public void e(m p0){
       this.j();
    }
    public Map i(){
       Map map = super.i();
       map.put("cleanPatchIds", this.h);
       return map;
    }
    public final void j(){
       long l = System.currentTimeMillis();
       Iterator iterator = Robust.get().getAppliedPatches().iterator();
       while (iterator.hasNext()) {
          Patch patch = iterator.next();
          Robust.get().rollbackPatch(this.d.b(), patch.getId());
          Objects.requireNonNull(this.d);
          b.t(this.d.e(), this.d.f(), patch.getId());
          Object[] objArray = new Object[0];
          d.b().a("EventCleanAllPatch", "EventCleanPatch OK, patchId:"+patch.getId(), objArray);
          this.h.add(patch.getId());
       }
       this.f(Boolean.TRUE);
       this.g((System.currentTimeMillis() - l), null);
       return;
    }
}
