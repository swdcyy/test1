package com.kuaishou.live.common.core.component.chat.widget.LiveChatApplyButton$c;
import ekd.f$j;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatApplyButton;
import android.graphics.drawable.GradientDrawable;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import androidx.core.graphics.drawable.a;

public class LiveChatApplyButton$c extends f$j	// class@001051
{
    public final GradientDrawable a;
    public final LiveChatApplyButton b;

    public void LiveChatApplyButton$c(LiveChatApplyButton p0,GradientDrawable p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveChatApplyButton$c.class, "1")) {
          return;
       }
       a.o(this.a, null);
       return;
    }
}
