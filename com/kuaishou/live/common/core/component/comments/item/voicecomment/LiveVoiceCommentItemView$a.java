package com.kuaishou.live.common.core.component.comments.item.voicecomment.LiveVoiceCommentItemView$a;
import android.graphics.drawable.Drawable$Callback;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.LiveVoiceCommentItemView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.Runnable;

public class LiveVoiceCommentItemView$a implements Drawable$Callback	// class@0010a3
{
    public final LiveVoiceCommentItemView b;

    public void LiveVoiceCommentItemView$a(LiveVoiceCommentItemView p0){
       this.b = p0;
       super();
    }
    public void invalidateDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoiceCommentItemView$a.class, "1")) {
          return;
       }
       this.b.invalidate();
       return;
    }
    public void scheduleDrawable(Drawable p0,Runnable p1,long p2){
    }
    public void unscheduleDrawable(Drawable p0,Runnable p1){
    }
}
