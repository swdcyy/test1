package com.kuaishou.growth.privacy.dialog.helper.c;
import java.util.concurrent.Callable;
import java.lang.Object;
import qe6.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.kuaishou.android.security.KSecurity$ENV;
import com.kuaishou.android.security.KSecurity;
import java.lang.Boolean;

public final class c implements Callable	// class@000711
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object call(){
       boolean b = false;
       if (b.a() && (a.t().d("repack_app_need_show_dialog", b) && KSecurity.detectEnvironment(KSecurity$ENV.REPACK))) {
          b = true;
       }
    label_001c :
       return Boolean.valueOf(b);
    }
}
