package com.kwai.library.widget.map.a;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.lang.String;
import com.kwai.plugin.dva.work.c;
import yz6.u;
import java.lang.Boolean;

public final class a implements Callable	// class@000965
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object call(){
       Boolean uBoolean;
       try{
          Dva.instance().getPluginInstallManager().j("map_sdk_plugin").c();
          uBoolean = Boolean.valueOf(u.c());
       }catch(java.lang.Exception e0){
          uBoolean = Boolean.FALSE;
       }
       return uBoolean;
    }
}
