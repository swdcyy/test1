package com.yxcorp.gifshow.share.init.ForwardInitModule$b;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n80.a;
import android.content.SharedPreferences;

public final class ForwardInitModule$b implements Callable	// class@001bc2
{
    public static final ForwardInitModule$b b;

    static {
       ForwardInitModule$b.b = new ForwardInitModule$b();
    }
    public void ForwardInitModule$b(){
       super();
    }
    public Object call(){
       String str = PatchProxy.apply(null, this, ForwardInitModule$b.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = a.a.getString("SharePanelInitInfo", "");
       }
       return str;
    }
}
