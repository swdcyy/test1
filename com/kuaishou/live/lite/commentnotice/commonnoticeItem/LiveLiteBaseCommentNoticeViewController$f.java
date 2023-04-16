package com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$f;
import ekd.f$i;
import android.widget.TextView;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveLiteBaseCommentNoticeViewController$f extends f$i	// class@000849
{
    public final TextView b;

    public void LiveLiteBaseCommentNoticeViewController$f(TextView p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseCommentNoticeViewController$f.class, "1")) {
          return;
       }
       this.b.setVisibility(8);
       return;
    }
}
