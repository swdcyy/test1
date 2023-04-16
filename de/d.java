package de.d;
import de.f;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Object;
import ce.b;
import ce.b$a;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactSoftException;
import android.view.View;
import com.facebook.react.uimanager.ViewManager;

public class d implements f	// class@001e3d
{
    public final int a;
    public final String b;
    public final ReadableArray c;

    public void d(int p0,String p1,ReadableArray p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(b p0){
       d ta = this.a;
       d tb = this.b;
       d tc = this.c;
       b$a uoa = p0.d(ta);
       if (uoa == null) {
          ReactSoftException.logSoftException(b.e, new IllegalStateException("Unable to find viewState for tag: "+ta+" for commandId: "+tb));
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
             throw new IllegalStateException("Unable to find viewState manager for tag "+ta);
          }
       }
       return;
    }
    public String toString(){
       return "DispatchStringCommandMountItem ["+this.a+"] "+this.b;
    }
}
