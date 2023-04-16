package com.kuaishou.live.common.core.basic.resource.h;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$e;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileResponse$LiveResourceFileInfo;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.util.List;

public class h extends LiveResourceFileUtil$e	// class@000ee5
{
    public final LiveResourceFileResponse$LiveResourceFileInfo b;

    public void h(LiveResourceFileUtil$LiveResourceFileType p0,LiveResourceFileResponse$LiveResourceFileInfo p1){
       this.b = p1;
       super(p0);
    }
    public void c(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       super.c(p0);
       LiveResourceFileUtil.b.remove(LiveResourceFileUtil$LiveResourceFileType.fromTypeString(this.b.mType));
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.e(p0);
       LiveResourceFileUtil.b.remove(LiveResourceFileUtil$LiveResourceFileType.fromTypeString(this.b.mType));
       return;
    }
}
