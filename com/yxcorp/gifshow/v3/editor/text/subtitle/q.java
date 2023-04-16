package com.yxcorp.gifshow.v3.editor.text.subtitle.q;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.subtitle.r;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Objects;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import dvc.w;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;

public final class q implements Observer	// class@0014a6
{
    public final r b;

    public void q(r p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.e() == ListHolder$UpdateType.CHANGE_ALL) {
          p0 = tb.t;
          if (p0 != null) {
             p0.post(new w(tb));
          }
       }
       return;
    }
}
