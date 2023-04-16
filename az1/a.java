package az1.a;
import ia1.b;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import ia1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
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

public class a implements b	// class@0002e2
{
    public static final String a = "az1.a";

    public void a(){
       super();
    }
    public String a(){
       return "live_wealth_grade_enter_room_tail_particle_anim.json";
    }
    public int b(){
       return 0;
    }
    public void c(ImageView p0){
       a.f(this, p0);
    }
    public boolean d(){
       return false;
    }
    public String e(){
       return a.a(this);
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveResourceFileUtil.k("live_wealth_grade_enter_room_effect");
    }
    public String g(){
       return a.c(this);
    }
    public boolean h(){
       return a.d(this);
    }
    public boolean isValid(){
       String obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "live_wealth_grade_enter_room_tail_particle_anim.json";
       boolean b = false;
       String str = "type";
       if (TextUtils.x(obj)) {
          b.C(LiveLogTag.LIVE_ENTER_ROOM_EFFECT, "checkResourceValid resource empty", c.j(str, a.a));
          return b;
       }else {
          LiveResourceFileUtil$LiveResourceFileType lIVE_WEALTH_ = LiveResourceFileUtil$LiveResourceFileType.LIVE_WEALTH_GRADE_ENTER_ROOM_EFFECT;
          File uFile = LiveResourceFileUtil.j(lIVE_WEALTH_, this.f()+File.separator+obj);
          if (uFile != null && uFile.exists()) {
             b = true;
          }
          if (!b) {
             b.C(LiveLogTag.LIVE_ENTER_ROOM_EFFECT, "checkResourceValid file empty or file not exits", c.j(str, a.a));
             LiveResourceFileUtil.h(lIVE_WEALTH_);
          }
          return b;
       }
    }
}
