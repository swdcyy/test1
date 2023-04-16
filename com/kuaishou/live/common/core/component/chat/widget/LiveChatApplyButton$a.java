package com.kuaishou.live.common.core.component.chat.widget.LiveChatApplyButton$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatApplyButton;
import android.graphics.drawable.GradientDrawable;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class LiveChatApplyButton$a implements ValueAnimator$AnimatorUpdateListener	// class@00104f
{
    public final GradientDrawable a;
    public final LiveChatApplyButton b;

    public void LiveChatApplyButton$a(LiveChatApplyButton p0,GradientDrawable p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveChatApplyButton$a.class, "1")) {
          return;
       }
       a.o(this.a, ColorStateList.valueOf(p0.getAnimatedValue().intValue()));
       return;
    }
}
