package com.yxcorp.gifshow.ad.AdProcessUtils$a;
import java.lang.Runnable;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import yx.j0;

public final class AdProcessUtils$a implements Runnable	// class@0014eb
{
    public final Context b;
    public final Intent c;

    public void AdProcessUtils$a(Context p0,Intent p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdProcessUtils$a.class, "1")) {
          return;
       }
       try{
          this.b.startActivity(this.c);
       }catch(java.lang.Exception e0){
          j0.b("AdProcessUtils", "cannot start deepLink activity in processScheme", e0);
       }
       return;
    }
}
