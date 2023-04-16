package com.kuaishou.live.lite.comment.model.CommentConfigProvider$Companion;
import java.lang.Object;
import nsd.u;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kuaishou.live.lite.comment.model.CommentConfigProvider;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.lite.comment.model.CommentConfigProvider$Companion$loadDisplayParamsListConfig$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import kotlin.jvm.internal.a;

public final class CommentConfigProvider$Companion	// class@000809
{

    public void CommentConfigProvider$Companion(){
       super();
    }
    public void CommentConfigProvider$Companion(u p0){
       super();
    }
    public final List a(){
       Object obj = PatchProxy.apply(null, this, CommentConfigProvider$Companion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.Z(LiveLogTag.LIVE_LITE_COMMENT, CommentConfigProvider.b+" loadDisplayParamsListConfig");
       obj = a.t().u("SOURCE_LIVE").getValue("liveCommentsDisplayConfig", new CommentConfigProvider$Companion$loadDisplayParamsListConfig$1().getType(), new ArrayList());
       a.o(obj, "SwitchConfigManager.getI¡­CommentsDisplayParams>\(\)\)");
       return obj;
    }
}
