package com.yxcorp.gifshow.action.i$a;
import com.yxcorp.gifshow.action.i$b;
import com.yxcorp.gifshow.action.i;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i$a extends i$b	// class@001322
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super(null);
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       this.b.m();
       return;
    }
}
