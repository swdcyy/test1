package com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$e;
import ekd.f$i;
import android.widget.TextView;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveLiteBaseCommentNoticeViewController$e extends f$i	// class@000848
{
    public final TextView b;

    public void LiveLiteBaseCommentNoticeViewController$e(TextView p0){
       this.b = p0;
       super();
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseCommentNoticeViewController$e.class, "1")) {
          return;
       }
       this.b.setVisibility(0);
       return;
    }
}
