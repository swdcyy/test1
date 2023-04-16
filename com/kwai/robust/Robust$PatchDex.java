package com.kwai.robust.Robust$PatchDex;
import com.kwai.robust.Patch;
import java.lang.ClassLoader;
import com.kwai.robust.PatchesInfo;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.ChangeQuickRedirect;
import com.kwai.robust.Robust$a;

public class Robust$PatchDex	// class@001403
{
    public final ClassLoader classLoader;
    public final Patch patch;
    public final Map patchObject;
    public final PatchesInfo patchesInfo;

    public void Robust$PatchDex(Patch p0,ClassLoader p1,PatchesInfo p2){
       super();
       this.patchObject = new HashMap();
       this.patch = p0;
       this.classLoader = p1;
       this.patchesInfo = p2;
       Map patch = p2.getPatch();
       if (patch != null && !patch.isEmpty()) {
          Iterator iterator = patch.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             this.patchObject.put(p1.loadClass(uEntry.getKey()), uEntry.getValue());
          }
       }
       return;
    }
    public void Robust$PatchDex(Patch p0,ClassLoader p1,PatchesInfo p2,Robust$a p3){
       super(p0, p1, p2);
    }
}
