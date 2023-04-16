package oe.a;
import java.lang.Runnable;
import android.content.Context;
import java.lang.Object;
import com.facebook.react.modules.fresco.FrescoModule;

public final class a implements Runnable	// class@00277f
{
    public final Context b;

    public void a(Context p0){
       this.b = p0;
    }
    public final void run(){
       FrescoModule.lambda$initializeAsyncWithDefaultConfig$0(this.b);
    }
}
