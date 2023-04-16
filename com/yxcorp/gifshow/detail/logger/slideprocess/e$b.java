package com.yxcorp.gifshow.detail.logger.slideprocess.e$b;
import fw8.b;
import com.yxcorp.gifshow.detail.logger.slideprocess.e;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$b extends b	// class@00157c
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       this.b.Z8(p0);
       return;
    }
}
