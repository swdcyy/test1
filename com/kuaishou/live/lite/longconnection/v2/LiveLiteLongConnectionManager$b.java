package com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$b;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$EnterDetail;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import qrd.l1;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$d;
import ut7.h;

public final class LiveLiteLongConnectionManager$b implements o	// class@000a25
{
    public static final LiveLiteLongConnectionManager$b a;

    static {
       LiveLiteLongConnectionManager$b.a = new LiveLiteLongConnectionManager$b();
    }
    public void LiveLiteLongConnectionManager$b(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteLongConnectionManager$b.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(l1.a, new LiveBaseLongConnectionManager$d());
       }
       return uoa;
    }
}
