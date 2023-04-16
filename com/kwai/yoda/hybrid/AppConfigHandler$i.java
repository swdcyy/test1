package com.kwai.yoda.hybrid.AppConfigHandler$i;
import java.util.concurrent.Callable;
import com.kwai.yoda.hybrid.AppConfigHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import iy7.d;

public final class AppConfigHandler$i implements Callable	// class@001271
{
    public final AppConfigHandler b;

    public void AppConfigHandler$i(AppConfigHandler p0){
       this.b = p0;
       super();
    }
    public Object call(){
       List list = PatchProxy.apply(null, this, AppConfigHandler$i.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          list = this.b.d.getAll();
       }
       return list;
    }
}
