package com.tencent.connect.avatar.c$1;
import java.lang.Runnable;
import com.tencent.connect.avatar.c;
import java.lang.Object;
import java.lang.Thread;
import java.lang.InterruptedException;
import com.tencent.connect.avatar.c$1$1;
import android.widget.ImageView;

public class c$1 implements Runnable	// class@000e3d
{
    public final c a;

    public void c$1(c p0){
       this.a = p0;
       super();
    }
    public void run(){
       long l = 300;
       try{
          Thread.sleep(l);
       }catch(java.lang.InterruptedException e0){
          e0.printStackTrace();
       }
       this.a.post(new c$1$1(this));
       c.a(this.a, false);
       return;
    }
}
