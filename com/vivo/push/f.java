package com.vivo.push.f;
import java.lang.Runnable;
import com.vivo.push.e;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.z;

public final class f implements Runnable	// class@001080
{
    public final String a;
    public final e b;

    public void f(e p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       if (e.a(this.b) == null) {
          return;
       }
       if (!TextUtils.isEmpty(this.a) && z.b(e.a(this.b), e.a(this.b).getPackageName(), this.a)) {
          this.b.i();
       }
       return;
    }
}
