package gz0.b;
import ia1.b;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import ia1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
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
import java.io.File;

public class b implements b	// class@0025c4
{
    public static final String a = "gz0.b";

    public void b(){
       super();
    }
    public String a(){
       return "live_gift_button_animation_v2.json";
    }
    public int b(){
       return 0x7f081144;
    }
    public void c(ImageView p0){
    }
    public boolean d(){
       return false;
    }
    public String e(){
       return a.a(this);
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveResourceFileUtil.k("live_new_icons_v2")+"/"+"live_gift_button_animation_image";
    }
    public String g(){
       return a.c(this);
    }
    public boolean h(){
       return a.d(this);
    }
    public boolean isValid(){
       boolean b;
       String obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "live_gift_button_animation_v2.json";
       b = false;
       String str = "type";
       if (TextUtils.x(obj)) {
          b.C(LiveLogTag.LIVE_NEW_ICONS_V2, "checkResourceValid resource empty", c.j(str, b.a));
          return b;
       }else {
          LiveResourceFileUtil$LiveResourceFileType lIVE_ICONS_N = LiveResourceFileUtil$LiveResourceFileType.LIVE_ICONS_NEW_V2;
          File uFile = LiveResourceFileUtil.j(lIVE_ICONS_N, this.f()+File.separator+obj);
          if (uFile != null && uFile.exists()) {
             b = true;
          }
          if (!b) {
             b.C(LiveLogTag.LIVE_NEW_ICONS_V2, "checkResourceValid file empty or file not exits", c.j(str, b.a));
             LiveResourceFileUtil.h(lIVE_ICONS_N);
          }
          return b;
       }
    }
}
