package ff2.a$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.io.File;
import qkd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a$a	// class@002948
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public String a(String p0){
       LiveResourceFileUtil$LiveResourceFileType obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          p0 = "";
       }else {
          obj = LiveResourceFileUtil$LiveResourceFileType.LIVE_NOBLE_ENTER_ROOM_MOUNT_RESOURCE;
          if (!b.S(LiveResourceFileUtil.j(obj, LiveResourceFileUtil.k("live_noble_enter_room_mount_resource")+"/"+p0+".webp"))) {
             b.B(LiveLogTag.LIVE_NOBLE, "nobleenterroommount not local resource, checkResourceValid file empty or file not exits");
             LiveResourceFileUtil.h(obj);
          }
          p0 = LiveResourceFileUtil.k("live_noble_enter_room_mount_resource")+"/"+p0+".webp";
       }
       return p0;
    }
    public String b(String p0){
       LiveResourceFileUtil$LiveResourceFileType obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          p0 = "";
       }else {
          obj = LiveResourceFileUtil$LiveResourceFileType.LIVE_NOBLE_ENTER_ROOM_WELCOME_RESOURCE;
          if (!b.S(LiveResourceFileUtil.j(obj, LiveResourceFileUtil.k("live_noble_enter_room_mount_resource")+"/"+p0+".webp"))) {
             b.B(LiveLogTag.LIVE_NOBLE, "nobleenterroomwelcome not local resource, checkResourceValid file empty or file not exits");
             LiveResourceFileUtil.h(obj);
          }
          p0 = LiveResourceFileUtil.k("live_noble_enter_room_welcome_resource")+"/"+p0+".webp";
       }
       return p0;
    }
}
