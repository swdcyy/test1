package com.kwai.library.widget.popup.common.b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.library.widget.popup.common.c;
import android.animation.Animator;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;

public class b extends AnimatorListenerAdapter	// class@00098d
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.a0(false);
       b ta = this.a;
       c$b w = ta.b.w;
       if (w != null) {
          w.W(ta);
       }
       this.a.k();
       return;
    }
}
