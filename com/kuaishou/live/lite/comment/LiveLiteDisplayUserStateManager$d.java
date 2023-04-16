package com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$d;
import erd.o;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.mock.LiveDisplayUserStateResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.util.Base64;

public final class LiveLiteDisplayUserStateManager$d implements o	// class@0007f1
{
    public final LiveLiteDisplayUserStateManager b;

    public void LiveLiteDisplayUserStateManager$d(LiveLiteDisplayUserStateManager p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteDisplayUserStateManager$d obj = PatchProxy.applyOneRefs(p0, this, LiveLiteDisplayUserStateManager$d.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.b;
          Objects.requireNonNull(obj);
          obj = PatchProxy.applyOneRefs(p0, obj, LiveLiteDisplayUserStateManager.class, "5");
          if (obj != patchProxyRe) {
          }else if(p0 != null){
             p0 = p0.mLiteRichTextUserStates;
          }else {
             p0 = null;
          }
          p0 = (TextUtils.isEmpty(p0))? new LiveRichTextUserState(): LiveRichTextUserState.parseFrom(Base64.decode(p0, 0));
          obj = p0;
       }
       return obj;
    }
}
