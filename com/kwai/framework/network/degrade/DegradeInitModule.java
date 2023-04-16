package com.kwai.framework.network.degrade.DegradeInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kwai.framework.network.degrade.e;
import com.kwai.framework.network.degrade.DegradeInitModule$c;
import com.kwai.framework.network.degrade.e$b;
import com.kwai.framework.network.degrade.DegradeInitModule$b;
import com.kwai.framework.network.degrade.DegradeInitModule$a;

public class DegradeInitModule extends a	// class@0017b6
{

    public void DegradeInitModule(){
       super();
    }
    public int f0(){
       return 18;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, DegradeInitModule.class, "1")) {
          return;
       }
       b.a(-1538291188).d("page", new DegradeInitModule$c(this)).d("cdn", new DegradeInitModule$b(this)).d("geohash", new DegradeInitModule$a(this));
       return;
    }
}
