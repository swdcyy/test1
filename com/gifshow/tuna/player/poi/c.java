package com.gifshow.tuna.player.poi.c;
import w07.l;
import com.gifshow.tuna.player.poi.f;
import java.lang.Object;
import com.kwai.library.widget.popup.bubble.a;
import java.util.Objects;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import oj.e;
import java.lang.Runnable;

public final class c implements l	// class@0015f2
{
    public final f a;

    public void c(f p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       p0 = p0.z();
       if (p0 == null) {
       }else {
          View view = p0.findViewById(R.id.arrow);
          if (view != null) {
             p0.post(new e(ta, view, p0));
          }
       }
       return;
    }
}
