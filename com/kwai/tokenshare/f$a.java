package com.kwai.tokenshare.f$a;
import com.kwai.tokenshare.a$a;
import com.kwai.tokenshare.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import du7.b;
import java.lang.ClassCastException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.tokenshare.KwaiTokenInitModule;

public class f$a implements a$a	// class@001920
{
    public final String a;
    public final f b;

    public void f$a(f p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "2")) {
          return;
       }
       FragmentActivity uFragmentAct = ActivityContext.g().e();
       try{
          b.d(uFragmentAct, this.a);
       }catch(java.lang.ClassCastException e0){
          e0.printStackTrace();
       }
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.b.a.o0() ^ 0x01);
    }
}
