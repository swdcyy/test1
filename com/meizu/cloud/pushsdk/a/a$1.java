package com.meizu.cloud.pushsdk.a.a$1;
import java.lang.Runnable;
import android.content.Context;
import java.lang.Object;
import com.meizu.cloud.pushsdk.d.a.c;
import com.meizu.cloud.pushsdk.a.a;
import com.meizu.cloud.pushsdk.a.a.b;
import java.lang.String;
import java.util.Map;
import com.meizu.cloud.pushsdk.a.a.c;

public final class a$1 implements Runnable	// class@00148d
{
    public final Context a;

    public void a$1(Context p0){
       this.a = p0;
       super();
    }
    public void run(){
       b.a(this.a).a("POST", null, a.a(this.a).toString());
    }
}
