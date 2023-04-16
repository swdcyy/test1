package com.kuaishou.live.lite.comment.CommentViewController$d;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse$LiveCommentStyle;

public final class CommentViewController$d implements o	// class@0007d9
{
    public static final CommentViewController$d b;

    static {
       CommentViewController$d.b = new CommentViewController$d();
    }
    public void CommentViewController$d(){
       super();
    }
    public Object apply(Object p0){
       boolean b;
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, CommentViewController$d.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = p0.mLiveCommentStyle;
          p0 = (p0 != null)? p0.mEnableMyCommentSuffix: false;
          uBoolean = Boolean.valueOf(p0);
       }
       return uBoolean;
    }
}
