package com.hpplay.sdk.source.permission.b;
import java.lang.Object;
import com.hpplay.sdk.source.permission.b$a;
import android.app.SharedElementCallback;
import com.hpplay.sdk.source.permission.b$b;
import android.app.Activity;

public class b	// class@00067c
{

    public void b(){
       super();
    }
    public static SharedElementCallback a(b$a p0){
       b$b uob = (p0 != null)? new b$b(p0): null;
       return uob;
    }
    public static void a(Activity p0){
       p0.finishAfterTransition();
    }
    public static void a(Activity p0,b$a p1){
       p0.setEnterSharedElementCallback(b.a(p1));
    }
    public static void b(Activity p0){
       p0.postponeEnterTransition();
    }
    public static void b(Activity p0,b$a p1){
       p0.setExitSharedElementCallback(b.a(p1));
    }
    public static void c(Activity p0){
       p0.startPostponedEnterTransition();
    }
}
