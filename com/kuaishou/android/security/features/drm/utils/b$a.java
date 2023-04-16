package com.kuaishou.android.security.features.drm.utils.b$a;
import java.lang.Runnable;
import com.kuaishou.android.security.features.drm.utils.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.internal.dispatch.JNICLibrary;
import com.kuaishou.android.security.internal.common.ExceptionProxy;
import com.kuaishou.android.security.features.drm.utils.a;

public class b$a implements Runnable	// class@000f37
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       String[] stringArray = JNICLibrary.gDGI();
       int len = stringArray.length;
       for (int i = 0; i < len; i = i + 1) {
          ExceptionProxy.drud(stringArray[i]);
       }
       a.a(this, 0xea60);
       return;
    }
}
