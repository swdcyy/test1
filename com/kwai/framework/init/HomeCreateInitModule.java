package com.kwai.framework.init.HomeCreateInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import a76.d;
import android.app.Activity;
import java.lang.Boolean;
import android.os.Bundle;

public abstract class HomeCreateInitModule extends a	// class@001566
{

    public void HomeCreateInitModule(){
       super();
       this.o = true;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, HomeCreateInitModule.class, "1")) {
          return;
       }
       int i = -2118755940;
       Activity homeActivity = b.a(i).getHomeActivity();
       if (b.a(i).r(this.getClass(), "onHomeActivityCreate").booleanValue() && homeActivity != null) {
          this.l0(homeActivity, b.a(i).q());
       }
       super.l();
       return;
    }
    public abstract void l0(Activity p0,Bundle p1);
}
