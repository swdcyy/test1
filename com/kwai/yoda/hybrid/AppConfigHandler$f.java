package com.kwai.yoda.hybrid.AppConfigHandler$f;
import java.util.concurrent.Callable;
import com.kwai.yoda.hybrid.AppConfigHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import iy7.b;

public final class AppConfigHandler$f implements Callable	// class@00126e
{
    public final AppConfigHandler b;

    public void AppConfigHandler$f(AppConfigHandler p0){
       this.b = p0;
       super();
    }
    public Object call(){
       List list = PatchProxy.apply(null, this, AppConfigHandler$f.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          list = this.b.e.getAll();
       }
       return list;
    }
}
