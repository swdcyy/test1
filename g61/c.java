package g61.c;
import ekd.f$j;
import com.kuaishou.live.basic.widget.LiveTransitionAvatarView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.List;
import com.kuaishou.live.model.LiveUserInfo;
import com.kuaishou.android.live.contants.LiveAvatarConstants$AvatarSize;
import com.kuaishou.live.basic.widget.GreyscaleImageView;

public class c extends f$j	// class@00242a
{
    public final LiveTransitionAvatarView a;

    public void c(LiveTransitionAvatarView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, LiveTransitionAvatarView.class, "6")) {
          LiveTransitionAvatarView b = ta.B;
          ta.B = ta.C;
          ta.C = b;
          int i = ta.F + 1;
          ta.F = i;
          LiveTransitionAvatarView d = ta.D;
          LiveUserInfo liveUserInfo = d.get(((i + 1) % d.size()));
          b.p0(liveUserInfo, ta.G, false);
       }
       return;
    }
}
