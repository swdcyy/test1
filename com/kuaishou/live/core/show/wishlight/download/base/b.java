package com.kuaishou.live.core.show.wishlight.download.base.b;
import en2.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import en2.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t45.d;
import java.lang.Runnable;
import crd.b;
import brd.z;
import en2.b;

public class b implements a	// class@0012a4
{
    public String a;
    public boolean b;
    public final Runnable c;
    public static final List d;

    static {
       b.d = LiveLogTag.LIVE_AVATAR.appendTag("DiskCache");
    }
    public void b(){
       super();
       this.c = new c(this);
    }
    public void a(String p0){
       this.a = p0;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       d.c.d(this.c);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       d.c.d(new b(this));
       return;
    }
}
