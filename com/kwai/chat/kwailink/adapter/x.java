package com.kwai.chat.kwailink.adapter.x;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.chat.kwailink.adapter.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.adapter.n;
import android.os.RemoteCallbackList;
import com.kwai.chat.kwailink.adapter.p$b;
import l75.f;
import com.kwai.chat.kwailink.adapter.p$a;

public final class x implements Runnable	// class@000a1c
{
    public final String b;

    public void x(String p0){
       this.b = p0;
    }
    public final void run(){
       x tb = this.b;
       if (PatchProxy.applyVoidOneRefs(tb, null, p.class, "11")) {
       }else if(!p.a(p.b, new n(tb))){
          p.b(new f(tb));
       }
       return;
    }
}
