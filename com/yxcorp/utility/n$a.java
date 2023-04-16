package com.yxcorp.utility.n$a;
import java.lang.Runnable;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import com.yxcorp.utility.n;

public final class n$a implements Runnable	// class@0009d2
{
    public final Context b;
    public final View c;

    public void n$a(Context p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       n.a0(this.b, this.c, 0);
    }
}
