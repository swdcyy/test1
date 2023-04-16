package com.kuaishou.live.common.core.component.comments.item.voicecomment.d;
import android.view.View$OnTouchListener;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.b$c;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.b;
import kf1.g;
import java.lang.Runnable;
import android.view.GestureDetector;

public final class d implements View$OnTouchListener	// class@0010ad
{
    public final b$c b;

    public void d(b$c p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       d tb = this.b;
       Objects.requireNonNull(tb);
       int actionMasked = p1.getActionMasked();
       if (!actionMasked) {
          p0.e = false;
          tb.c(tb.f);
       }else if(actionMasked == 1 || actionMasked == 3){
          p0.post(new g(tb));
       }
       return tb.g.b.onTouchEvent(p1);
    }
}
