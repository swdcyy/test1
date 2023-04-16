package lf1.f;
import erd.o;
import com.kuaishou.live.common.core.component.comments.mock.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.mock.LiveDisplayUserStateResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.util.Base64;

public final class f implements o	// class@002ee7
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       LiveRichTextUserState liveRichText = PatchProxy.applyOneRefs(p0, tb, b.class, "9");
       if (liveRichText != PatchProxyResult.class) {
       }else {
          p0 = p0.mRichTextUserStates;
          liveRichText = (TextUtils.isEmpty(p0))? new LiveRichTextUserState(): LiveRichTextUserState.parseFrom(Base64.decode(p0, 0));
       }
       return liveRichText;
    }
}
