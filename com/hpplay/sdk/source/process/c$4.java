package com.hpplay.sdk.source.process.c$4;
import com.hpplay.sdk.source.g$a;
import com.hpplay.sdk.source.process.c;
import java.lang.String;
import java.lang.StringBuilder;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.browse.api.AuthListener;

public class c$4 extends g$a	// class@00069a
{
    public final c c;

    public void c$4(c p0){
       this.c = p0;
       super();
    }
    public void onAuthFailed(int p0){
       a.f(c.d(this.c), "   onAuthFailed "+p0);
       if (c.f(this.c) != null) {
          c.f(this.c).onAuthFailed(p0);
       }
       return;
    }
    public void onAuthSuccess(String p0,String p1){
       a.f(c.d(this.c), " onAuthSuccess success "+c.e(this.c));
       if (c.f(this.c) != null) {
          c.f(this.c).onAuthSuccess(p0, p1);
       }
       return;
    }
}
