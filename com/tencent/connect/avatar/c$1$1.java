package com.tencent.connect.avatar.c$1$1;
import java.lang.Runnable;
import com.tencent.connect.avatar.c$1;
import java.lang.Object;
import android.widget.ImageView;
import com.tencent.connect.avatar.c;

public class c$1$1 implements Runnable	// class@000e3c
{
    public final c$1 a;

    public void c$1$1(c$1 p0){
       this.a = p0;
       super();
    }
    public void run(){
       this.a.a.clearAnimation();
       c.a(this.a.a);
    }
}
