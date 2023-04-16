package com.kuaishou.live.deepaec.LiveDeepAecHelper$deepAecLibLoadTaskListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.deepaec.LiveDeepAecHelper;
import com.kuaishou.live.deepaec.LiveDeepAecHelper$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveDeepAecHelper$deepAecLibLoadTaskListener$2 extends Lambda implements a	// class@001ae9
{
    public final LiveDeepAecHelper this$0;

    public void LiveDeepAecHelper$deepAecLibLoadTaskListener$2(LiveDeepAecHelper p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveDeepAecHelper$a invoke(){
       Object obj = PatchProxy.apply(null, this, LiveDeepAecHelper$deepAecLibLoadTaskListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveDeepAecHelper$a(this.this$0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
