package com.kwai.tokenshare.c$a;
import com.kwai.tokenshare.a$a;
import com.kwai.tokenshare.c;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import m4d.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.kwai.tokenshare.KwaiTokenInitModule;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class c$a implements a$a	// class@00191c
{
    public final BaseDialogInfo a;
    public final d b;
    public final c c;

    public void c$a(c p0,BaseDialogInfo p1,d p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       Log.g("KwaiTokenInitModule", "showDialogByApp step6");
       this.c.a.r0(this.a, this.b, ActivityContext.g().e());
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.c.a.o0() ^ 0x01);
    }
}
