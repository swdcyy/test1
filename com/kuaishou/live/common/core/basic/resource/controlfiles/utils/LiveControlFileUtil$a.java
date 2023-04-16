package com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$a;
import java.lang.Object;
import nsd.u;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil;
import ja1.d;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.util.List;
import java.util.ArrayList;
import trd.u;
import java.lang.Number;
import java.util.Collection;
import java.lang.Boolean;
import qrd.p;
import java.io.File;
import kotlin.jvm.internal.a;
import java.io.IOException;
import java.lang.StringBuilder;

public final class LiveControlFileUtil$a	// class@000ee0
{

    public void LiveControlFileUtil$a(){
       super();
    }
    public void LiveControlFileUtil$a(u p0){
       super();
    }
    public final Map a(){
       ArrayList uArrayList;
       HashMap obj = PatchProxy.apply(null, this, LiveControlFileUtil$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       d a = LiveControlFileUtil.a;
       if (a != null) {
          a = a.resourceTypeMap;
          if (a != null) {
             Set set = a.entrySet();
             if (set != null) {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   Object key = uEntry.getKey();
                   List value = uEntry.getValue();
                   if (value != null) {
                      uArrayList = new ArrayList(u.Y(value, 10));
                      Iterator iterator1 = value.iterator();
                      while (iterator1.hasNext()) {
                         uArrayList.add(String.valueOf(iterator1.next().intValue()));
                      }
                   }else {
                      uArrayList = null;
                   }
                   obj.put(key, uArrayList);
                }
             }
          }
       }
       return obj;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, LiveControlFileUtil$a.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = LiveControlFileUtil.c.getValue();
       }
       return obj.booleanValue();
    }
    public final void c(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileUtil$a.class, "9")) {
          return;
       }
       a.p(p0, "dest");
       a.p(p1, "patch");
       if (p1.exists() && p1.isDirectory()) {
          File[] uFileArray = p1.listFiles();
          if (uFileArray != null) {
             int len = uFileArray.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   object oobject = uFileArray[i];
                   a.o(oobject, "it");
                   File uFile = new File(p0, oobject.getName());
                   if (oobject.isDirectory()) {
                      if (uFile.exists() || uFile.mkdir()) {
                         LiveControlFileUtil.e.c(uFile, oobject);
                      }else {
                         throw new IOException("mkdir folder "+uFile+" error");
                      }
                   }else if(oobject.renameTo(uFile)){
                      throw new IOException("rename file failed from "+oobject+" to "+uFile);
                   }
                   i = i + 1;
                }
             }
          }
          p1.delete();
       }
       return;
    }
}
