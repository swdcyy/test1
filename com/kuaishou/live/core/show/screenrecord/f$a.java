package com.kuaishou.live.core.show.screenrecord.f$a;
import com.kwai.live.gzone.widget.e$a;
import android.app.Activity;
import com.kwai.library.widget.popup.common.SystemBarInfo;
import com.kwai.library.widget.popup.common.f;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.live.core.show.screenrecord.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.c;

public class f$a extends e$a	// class@000fe0
{
    public f$b I;
    public boolean J;
    public boolean K;
    public long L;
    public boolean M;
    public boolean N;

    public void f$a(Activity p0){
       super(p0);
       SystemBarInfo systemBarInf = f.i(p0);
       int i = (systemBarInf.mIsExist == null)? 0: systemBarInf.mHeight;
       this.x(i);
       return;
    }
    public f c0(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this);
    }
    public c k(){
       return this.c0();
    }
}
