package com.kwai.platform.krouter.handler.activity.ActivityHandler;
import com.kwai.platform.krouter.handler.activity.AbstractActivityHandler;
import java.lang.Class;
import xh7.b;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import xh7.a;

public class ActivityHandler extends AbstractActivityHandler	// class@001290
{
    public Class b;

    public void ActivityHandler(Class p0){
       super();
       this.b = p0;
    }
    public Intent e(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivityHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Intent(p0.b(), this.b);
    }
}
