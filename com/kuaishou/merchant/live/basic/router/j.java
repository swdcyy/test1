package com.kuaishou.merchant.live.basic.router.j;
import cb4.e;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import java.util.Set;
import ekd.x0;
import java.util.HashMap;
import java.util.Iterator;
import crd.b;
import lnc.b9;
import y04.d;
import y04.c;
import java.util.Map;
import brd.t;
import cjd.e;
import erd.o;
import c24.r0;
import com.kuaishou.merchant.live.basic.router.i;
import erd.g;

public class j implements e	// class@0018ca
{
    public b a;

    public void j(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       Uri obj = PatchProxy.applyOneRefs(p0, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.d();
       Set set = x0.c(obj);
       HashMap hashMap = new HashMap();
       if (set != null && !set.isEmpty()) {
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             hashMap.put(str, x0.b(obj, str, ""));
          }
       }
       b9.a(this.a);
       this.a = c.a().e(hashMap).map(new e()).subscribe(new r0(p0), i.b);
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
