package com.meizu.cloud.pushsdk.c.e.b$1;
import com.meizu.cloud.pushsdk.c.g.f;
import com.meizu.cloud.pushsdk.c.e.b;
import com.meizu.cloud.pushsdk.c.g.l;
import com.meizu.cloud.pushsdk.c.g.b;
import com.meizu.cloud.pushsdk.c.e.d;
import com.meizu.cloud.pushsdk.c.f.a;
import java.lang.Object;
import android.os.Message;
import android.os.Handler;

public class b$1 extends f	// class@0014e4
{
    public long a;
    public long b;
    public final b c;

    public void b$1(b p0,l p1){
       this.c = p0;
       super(p1);
       this.a = 0;
       this.b = 0;
    }
    public void a(b p0,long p1){
       super.a(p0, p1);
       if (!this.b - null) {
          this.b = this.c.b();
       }
       this.a = this.a + p1;
       if (b.a(this.c) != null) {
          b.a(this.c).obtainMessage(1, new a(this.a, this.b)).sendToTarget();
       }
       return;
    }
}
