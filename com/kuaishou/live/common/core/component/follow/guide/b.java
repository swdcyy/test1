package com.kuaishou.live.common.core.component.follow.guide.b;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.follow.guide.b$c;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import p92.c;
import com.kuaishou.live.core.show.follow.LiveFollowGuideExtraInfoResponse;
import crd.c;
import rg1.c;
import rg1.b;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import com.kuaishou.live.common.core.component.follow.guide.b$a;
import com.kuaishou.live.common.core.component.follow.guide.b$b;
import erd.g;

public class b	// class@00110e
{

    public void b(){
       super();
    }
    public static b a(String p0,b$c p1){
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, b.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!TextUtils.x(p0)) {
          return b.b().b(p0).observeOn(d.a).map(new e()).subscribe(new b$a(p1), new b$b(p1));
       }
       p1.a(obj);
       return c.b();
    }
}
