package ba3.i$a;
import androidx.lifecycle.Observer;
import ba3.i;
import java.lang.Object;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.comment.model.SimpleCommentMessage;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import ba3.i$d;
import com.kwai.framework.model.user.UserInfo;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;

public final class i$a implements Observer	// class@000345
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
       }else {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.lite.comment.model.SimpleCommentMessage");
          UserInfo mId = p0.getUserInfo().mId;
          a.o(mId, "commentMessage.userInfo.mId");
          UserInfo mName = p0.getUserInfo().mName;
          a.o(mName, "commentMessage.userInfo.mName");
          this.b.u0().setValue(new i$d(mId, mName, p0.getContent(), p0.getSenderState()));
       }
       return;
    }
}
