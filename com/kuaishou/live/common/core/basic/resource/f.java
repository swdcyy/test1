package com.kuaishou.live.common.core.basic.resource.f;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$e;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.util.List;
import java.lang.Throwable;

public class f extends LiveResourceFileUtil$e	// class@000ee3
{
    public final LiveResourceFileUtil$LiveResourceFileType b;

    public void f(LiveResourceFileUtil$LiveResourceFileType p0,LiveResourceFileUtil$LiveResourceFileType p1){
       this.b = p1;
       super(p0);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.b();
       LiveResourceFileUtil.e.add(this.b);
       return;
    }
    public void c(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       super.c(p0);
       LiveResourceFileUtil.e.remove(this.b);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       super.e(p0);
       LiveResourceFileUtil.e.remove(this.b);
       return;
    }
}
