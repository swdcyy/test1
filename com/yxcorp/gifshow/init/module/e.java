package com.yxcorp.gifshow.init.module.e;
import xfd.a$a;
import java.lang.Object;
import xfd.a;
import com.yxcorp.gifshow.init.module.DFPInitModule;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.lang.String;
import com.yxcorp.gifshow.init.module.f;
import com.yxcorp.gifshow.init.module.h;
import com.yxcorp.gifshow.init.module.g;
import com.yxcorp.gifshow.init.module.i;
import qe6.b;
import xfd.a$b;
import java.lang.Exception;
import java.lang.StringBuilder;
import k2b.u1;

public final class e implements a$a	// class@0019bd
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void invoke(Object p0){
       a uoa = p0;
       p0 = DFPInitModule.q;
       try{
          PluginDownloadExtension.k.a("secenv");
          uoa.X50(DFPInitModule.q, f.a, h.a, g.a, i.a, b.a());
       }catch(java.lang.Exception e8){
          e8.getMessage();
          u1.Q("security_custom_key_02", "invoke initEnv exception: "+e8.getMessage());
       }
       return;
    }
}
