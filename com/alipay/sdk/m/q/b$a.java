package com.alipay.sdk.m.q.b$a;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;

public final class b$a implements Runnable	// class@000e9d
{
    public final Activity b;

    public void b$a(Activity p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.finish();
    }
}
