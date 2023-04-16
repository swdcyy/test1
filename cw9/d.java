package cw9.d;
import android.content.ComponentCallbacks;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cw9.e;
import android.app.Application;
import o56.a;
import android.content.res.Resources;

public class d implements ComponentCallbacks	// class@001e26
{

    public void d(){
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       e.b = 0xbf800000;
       e.d(p0);
       e.g(a.b().getResources());
       return;
    }
    public void onLowMemory(){
    }
}
