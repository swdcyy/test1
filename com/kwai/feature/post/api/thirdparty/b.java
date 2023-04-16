package com.kwai.feature.post.api.thirdparty.b;
import com.kwai.feature.post.api.thirdparty.d$a;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import com.kwai.feature.post.api.thirdparty.d;
import java.lang.Boolean;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class b implements d$a	// class@001454
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final boolean a(Intent p0,String p1,String p2){
       boolean b;
       if ((Boolean.TRUE.toString()).equalsIgnoreCase(p2) || (Boolean.FALSE.toString()).equalsIgnoreCase(p2)) {
          SerializableHook.putExtra(p0, p1, Boolean.valueOf(p2));
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
