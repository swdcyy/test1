package com.kuaishou.live.core.show.screenrecord.videocapture.gl.a;
import java.lang.Object;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.c;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.c$a;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.b;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.b$a;

public abstract class a	// class@000fef
{
    public static final Object a;
    public static final int[] b;
    public static final int[] c;

    static {
       a.a = new Object();
       a.b = new int[9]{0x3024,8,0x3023,8,0x3022,8,0x3040,4,0x3038};
       a.c = new int[11]{0x3024,8,0x3023,8,0x3022,8,0x3040,4,0x3033,1,0x3038};
    }
    public void a(){
       super();
    }
    public static a a(a$a p0,int[] p1){
       b uob;
       c obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (c.j() && (p0 == null || p0 instanceof c$a))? new c(p0, p1): new b(p0, p1);
       return obj;
    }
    public abstract void b();
    public abstract void c(int p0,int p1);
    public abstract void d();
    public abstract a$a e();
    public abstract void f();
    public abstract void g();
    public abstract void h();
}
