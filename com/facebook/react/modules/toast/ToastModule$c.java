package com.facebook.react.modules.toast.ToastModule$c;
import java.lang.Runnable;
import com.facebook.react.modules.toast.ToastModule;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;

public class ToastModule$c implements Runnable	// class@0012f9
{
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final ToastModule g;

    public void ToastModule$c(ToastModule p0,String p1,int p2,int p3,int p4,int p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToastModule$c.class, "1")) {
          return;
       }
       Toast toast = Toast.makeText(this.g.getReactApplicationContext(), this.b, this.c);
       toast.setGravity(this.d, this.e, this.f);
       toast.show();
       return;
    }
}
