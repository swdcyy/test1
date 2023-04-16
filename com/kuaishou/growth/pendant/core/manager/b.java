package com.kuaishou.growth.pendant.core.manager.b;
import com.kuaishou.growth.pendant.core.manager.f$c;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import com.kuaishou.growth.pendant.core.manager.f;
import com.yxcorp.download.DownloadManager;
import ce0.b;

public final class b implements f$c	// class@000647
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final String a(String p0){
       File uFile = f.f(p0);
       if (uFile != null) {
          DownloadManager.C("growth_animation", "");
          Object[] objArray = new Object[0];
          b.C().w("AnimationResourceManager", "fetchResourceV2, WarmFile is not null", objArray);
          uFile = uFile.getPath();
       }else {
          uFile = null;
       }
       return uFile;
    }
}
