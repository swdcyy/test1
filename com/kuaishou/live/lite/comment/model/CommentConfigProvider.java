package com.kuaishou.live.lite.comment.model.CommentConfigProvider;
import com.kuaishou.live.lite.comment.model.CommentConfigProvider$Companion;
import nsd.u;
import java.lang.Object;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;

public final class CommentConfigProvider	// class@00080a
{
    public final LiveCommentsDisplayParams a;
    public static final String b;
    public static List c;
    public static final CommentConfigProvider$Companion d;

    static {
       CommentConfigProvider.d = new CommentConfigProvider$Companion(null);
       CommentConfigProvider.b = "CommentConfigProvider";
    }
    public void CommentConfigProvider(boolean p0){
       super();
       List c = CommentConfigProvider.c;
       if (c != null) {
       }else {
          c = CommentConfigProvider.d.a();
       }
       String str = (p0)? "GRPR": "normal";
       String str1 = null;
       Iterator iterator = c.iterator();
       while (true) {
          if (iterator.hasNext()) {
             LiveCommentsDisplayParams liveComments = iterator.next();
             if (TextUtils.equals(str, liveComments.mScene)) {
                b.Z(LiveLogTag.LIVE_LITE_COMMENT, CommentConfigProvider.b+" init params found");
                str1 = liveComments;
             }
          }
          if (str1 == null) {
             str1 = LiveCommentsDisplayParams.createDefaultParams();
             a.o(str1, "LiveCommentsDisplayParams.createDefaultParams\(\)");
             break ;
          }
          break ;
       }
       this.a = str1;
       return;
    }
    public final int a(){
       return this.a.mChangeScrollSpeedLimitNum;
    }
}
