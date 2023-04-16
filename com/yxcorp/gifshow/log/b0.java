package com.yxcorp.gifshow.log.b0;
import k2b.t1;
import java.lang.Object;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowFeed;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.log.c0;
import java.util.Objects;
import vjc.a;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.y;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.v;

public class b0 implements t1	// class@001af4
{

    public void b0(){
       super();
    }
    public void a(RealShowLogs$RealShowFeed p0,String p1,boolean p2){
       if (PatchProxy.isSupport(b0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, b0.class, "1")) {
          return;
       }
       c0 uoc0 = c0.q();
       Objects.requireNonNull(uoc0);
       if (!PatchProxy.isSupport(c0.class) || (!PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), uoc0, c0.class, "20") && !a.b(p2))) {
          uoc0.f(new y(uoc0, p0, TextUtils.k(b.a(0x4b316083).R0()), p1));
       }
       return;
    }
}
