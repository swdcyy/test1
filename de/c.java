package de.c;
import de.f;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Object;
import ce.b;
import ce.b$a;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactSoftException;
import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import java.lang.IllegalStateException;

public class c implements f	// class@001e3c
{
    public final int a;
    public final int b;
    public final ReadableArray c;

    public void c(int p0,int p1,ReadableArray p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(b p0){
       c ta = this.a;
       c tb = this.b;
       c tc = this.c;
       b$a uoa = p0.d(ta);
       if (uoa == null) {
          ReactSoftException.logSoftException(b.e, new ReactNoCrashSoftException("Unable to find viewState for tag: "+ta+" for commandId: "+tb));
       }else {
          b$a d = uoa.d;
          if (d != null) {
             uoa = uoa.a;
             if (uoa != null) {
                d.receiveCommand(uoa, tb, tc);
             }else {
                throw new IllegalStateException("Unable to find viewState view for tag "+ta);
             }
          }else {
             throw new IllegalStateException("Unable to find viewManager for tag "+ta);
          }
       }
       return;
    }
    public String toString(){
       return "DispatchCommandMountItem ["+this.a+"] "+this.b;
    }
}
