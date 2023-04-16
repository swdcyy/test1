package com.kwai.component.upgrade.UpgradeMigrationInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ai5.l;
import java.lang.Runnable;
import com.kwai.framework.init.c;

public class UpgradeMigrationInitModule extends TTIInitModule	// class@000bfb
{

    public void UpgradeMigrationInitModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpgradeMigrationInitModule.class, "1")) {
          return;
       }
       c.b(new l(this));
       return;
    }
}
