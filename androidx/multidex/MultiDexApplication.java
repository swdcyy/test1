package androidx.multidex.MultiDexApplication;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.multidex.MultiDex;

public class MultiDexApplication extends Application	// class@000857
{

    public void MultiDexApplication(){
       super();
    }
    public void attachBaseContext(Context p0){
       super.attachBaseContext(p0);
       MultiDex.install(this);
    }
}
