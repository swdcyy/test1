package com.kuaishou.live.core.voiceparty.http.a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import e17.i;

public final class a implements Runnable	// class@00150e
{
    public final String b;

    public void a(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       i.d(R.style.arg_RES_7f110668, this.b);
       return;
    }
}
