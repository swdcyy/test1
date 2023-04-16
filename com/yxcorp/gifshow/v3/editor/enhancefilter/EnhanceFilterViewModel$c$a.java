package com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$c$a;
import com.kwai.kve.VisionEngine$Handler;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.v0;
import android.content.Context;
import zt6.k;

public final class EnhanceFilterViewModel$c$a implements VisionEngine$Handler	// class@000f76
{
    public static final EnhanceFilterViewModel$c$a a;

    static {
       EnhanceFilterViewModel$c$a.a = new EnhanceFilterViewModel$c$a();
    }
    public void EnhanceFilterViewModel$c$a(){
       super();
    }
    public final void loadLibrary(String p0){
       boolean b = PatchProxy.applyVoidOneRefs(p0, this, EnhanceFilterViewModel$c$a.class, "1");
       if (b) {
          return;
       }
       b.b(p0);
       return;
    }
    public void setContext(Context p0){
       k.a(this, p0);
    }
}
