package cw9.a;
import android.content.ComponentCallbacks;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import cw9.b;

public class a implements ComponentCallbacks	// class@001e23
{

    public void a(){
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       b.i(a.b().getResources());
       return;
    }
    public void onLowMemory(){
    }
}
