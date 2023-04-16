package com.facebook.react.modules.toast.ToastModule$b;
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

public class ToastModule$b implements Runnable	// class@0012f8
{
    public final String b;
    public final int c;
    public final int d;
    public final ToastModule e;

    public void ToastModule$b(ToastModule p0,String p1,int p2,int p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToastModule$b.class, "1")) {
          return;
       }
       Toast toast = Toast.makeText(this.e.getReactApplicationContext(), this.b, this.c);
       toast.setGravity(this.d, 0, 0);
       toast.show();
       return;
    }
}
