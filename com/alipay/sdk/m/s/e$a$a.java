package com.alipay.sdk.m.s.e$a$a;
import java.lang.Runnable;
import com.alipay.sdk.m.s.e$a;
import android.view.View;
import java.lang.Object;

public class e$a$a implements Runnable	// class@000eab
{
    public final View b;
    public final e$a c;

    public void e$a$a(e$a p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.b.setEnabled(true);
    }
}
