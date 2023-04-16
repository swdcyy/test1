package com.kuaishou.live.core.show.enterroom.mount.a;
import ia1.b;
import java.lang.String;
import ia1.a;
import android.widget.ImageView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.enterroom.mount.LiveEnterRoomMountView$a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.StringBuilder;
import java.io.File;

public class a implements b	// class@000b1c
{
    public String a;
    public int b;
    public LiveEnterRoomMountView$a c;
    public static final String d = "com.kuaishou.live.core.show.enterroom.mount.a";

    public String a(){
       return a.b(this);
    }
    public int b(){
       return -1;
    }
    public void c(ImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a tc = this.c;
       if (tc != null) {
          tc.a();
       }
       return;
    }
    public boolean d(){
       return a.e(this);
    }
    public String e(){
       return a.a(this);
    }
    public String f(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          return LiveResourceFileUtil.k("live_enter_room_effect");
       }
       if (obj != 1) {
          return "";
       }
       return LiveResourceFileUtil.k("live_noble_enter_room_mount_resource");
    }
    public String g(){
       return this.a;
    }
    public boolean h(){
       return a.d(this);
    }
    public boolean isValid(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = "type";
       boolean b = false;
       if (TextUtils.x(this.g())) {
          b.C(LiveLogTag.LIVE_ENTER_ROOM_EFFECT, "checkResourceValid resource empty", c.j(str, a.d));
          return b;
       }else {
          obj = this.b;
          String str1 = 1;
          if (obj == null) {
             objArray = LiveResourceFileUtil$LiveResourceFileType.LIVE_ENTER_ROOM_EFFECT;
          }else if(obj == str1){
             objArray = LiveResourceFileUtil$LiveResourceFileType.LIVE_NOBLE_ENTER_ROOM_MOUNT_RESOURCE;
          }
          if (objArray == null) {
             return b;
          }else {
             File uFile = LiveResourceFileUtil.j(objArray, this.f()+File.separator+this.g());
             if (uFile != null && uFile.exists()) {
                b = true;
             }
             if (!b) {
                b.C(LiveLogTag.LIVE_ENTER_ROOM_EFFECT, "checkResourceValid file empty or file not exits", c.j(str, a.d));
                LiveResourceFileUtil.h(objArray);
             }
             return b;
          }
       }
    }
}
