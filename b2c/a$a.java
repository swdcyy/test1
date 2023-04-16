package b2c.a$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.io.File;
import yic.o0;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import kotlin.jvm.internal.a;
import wp6.a;
import java.lang.System;
import ekd.a0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class a$a	// class@000394
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final String a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o0.b().getAbsolutePath()+File.separator;
    }
    public final String b(ProfileBgVideoInfo p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "url");
       if (p0 != null && a.c(p0.getPath())) {
          return a0.c(p0.getPath()+System.currentTimeMillis())+".mp4";
       }
       String str = (!TextUtils.x(p1))? a0.c(p1+System.currentTimeMillis())+".mp4": String.valueOf(System.currentTimeMillis())+".mp4";
       return str;
    }
}
