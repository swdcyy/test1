package ht1.c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;

public final class c implements Runnable	// class@002774
{
    public final LiveResourceFileUtil$LiveResourceFileType b;

    public void c(LiveResourceFileUtil$LiveResourceFileType p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       LiveResourceFileUtil.h(this.b);
       return;
    }
}
