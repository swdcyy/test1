package ck1.a;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import qkd.b;

public class a	// class@0004d7
{

    public void a(){
       super();
    }
    public static File a(String p0){
       LiveResourceFileUtil$LiveResourceFileType obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveResourceFileUtil$LiveResourceFileType.LIVE_GIFT_SLOT_SPECIAL_COMBO_RESOURCE;
       File uFile = LiveResourceFileUtil.j(obj, LiveResourceFileUtil.k("live_gift_slot_special_combo_res")+File.separator+p0);
       if (!b.S(uFile)) {
          LiveResourceFileUtil.h(obj);
       }
       return uFile;
    }
}
