package com.facebook.react.modules.toast.ToastModule$a;
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

public class ToastModule$a implements Runnable	// class@0012f7
{
    public final String b;
    public final int c;
    public final ToastModule d;

    public void ToastModule$a(ToastModule p0,String p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToastModule$a.class, "1")) {
          return;
       }
       Toast.makeText(this.d.getReactApplicationContext(), this.b, this.c).show();
       return;
    }
}
