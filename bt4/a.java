package bt4.a;
import ps6.e;
import com.kuaishou.recruit.krn.RecruitTabKrnFragment;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;

public final class a implements e	// class@0003cb
{
    public final RecruitTabKrnFragment a;
    public final LaunchModel b;

    public void a(RecruitTabKrnFragment p0,LaunchModel p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void o0(Throwable p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       String str = this.b.c();
       LiveLogTag lIVE_RECRUIT = LiveLogTag.LIVE_RECRUIT;
       lIVE_RECRUIT.appendTag("RecruitTabKrnFragment");
       b.T(lIVE_RECRUIT, "getKrnFragment error", "error", p0, "webUrl", str);
       if (TextUtils.isEmpty(str)) {
       }else {
          ta.nh(ta.mh(str));
       }
       return;
    }
}
