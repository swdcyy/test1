package com.kuaishou.live.core.show.screenrecord.videocapture.gl.e;
import java.util.concurrent.Callable;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.a$a;
import android.os.Handler;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public class e implements Callable	// class@000ff7
{
    public final a$a b;
    public final Handler c;
    public final String d;

    public void e(a$a p0,Handler p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, e.class, "1");
       f uof = (obj != PatchProxyResult.class)? obj: new f(this.b, this.c, objArray);
    }
}
