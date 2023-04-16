package e31.c;
import a71.a;
import e31.h;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveAudienceTaskConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import s51.c;

public final class c implements a	// class@002093
{
    public final h a;

    public void c(h p0){
       this.a = p0;
    }
    public final boolean a(int p0){
       c ta = this.a;
       ta.b();
       LiveAudienceTaskConfig mTaskFinishU = (ta.c == 1)? ta.g.mTaskFinishUrl: ta.g.mTaskCenterUrl;
       if (!PatchProxy.applyVoidOneRefs(mTaskFinishU, ta, h.class, "4") && !TextUtils.x(mTaskFinishU)) {
          ta.f.r4(mTaskFinishU, null);
       }
       return false;
    }
}
