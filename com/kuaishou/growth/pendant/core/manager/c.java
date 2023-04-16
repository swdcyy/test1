package com.kuaishou.growth.pendant.core.manager.c;
import erd.o;
import com.kuaishou.growth.pendant.core.manager.f$b;
import com.kuaishou.growth.pendant.core.manager.f$c;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.core.manager.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ce0.b;
import com.kuaishou.growth.pendant.core.manager.f$a;
import java.io.File;
import wkd.b;
import j80.c;
import qkd.b;
import java.lang.StringBuilder;
import ee0.a;
import io.reactivex.g;
import ee0.d;
import com.kuaishou.growth.pendant.core.manager.d;

public final class c implements o	// class@000648
{
    public final f$b b;
    public final f$c c;

    public void c(f$b p0,f$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       c tb = this.b;
       c tc = this.c;
       t ot = PatchProxy.applyThreeRefs(p0, tb, tc, null, f.class, "4");
       if (ot != PatchProxyResult.class) {
       }else {
          String str = tc.a(p0);
          int i = 0;
          if (!TextUtils.x(str)) {
             Object[] objArray = new Object[i];
             b.C().w("AnimationResourceManager", "prepareFile, warmFile is exists", objArray);
             ot = t.just(new f$a(new File(str), "warmUp"));
          }else {
             File uFile = new File(b.a(-1504323719).j("pendant_resource"), f.e(p0));
             if (tb.a(uFile)) {
                Object[] objArray1 = new Object[i];
                b.C().w("AnimationResourceManager", "prepareFile, file is valid", objArray1);
                ot = t.just(new f$a(uFile, "cache"));
             }else {
                b.m(uFile);
                Object[] objArray2 = new Object[i];
                b.C().w("AnimationResourceManager", "deleteContents, file url = "+p0, objArray2);
                ot = PatchProxy.applyTwoRefs(p0, uFile, null, f.class, "5");
                if (ot != PatchProxyResult.class) {
                }else {
                   ot = t.create(new a(p0, uFile)).map(new d(uFile));
                }
                ot = ot.map(d.b);
             }
          }
       }
       return ot;
    }
}
