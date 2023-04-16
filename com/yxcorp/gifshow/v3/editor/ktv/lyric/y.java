package com.yxcorp.gifshow.v3.editor.ktv.lyric.y;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Objects;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import drc.b;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;

public final class y implements Observer	// class@000fe9
{
    public final z b;

    public void y(z p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       y tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.e() == ListHolder$UpdateType.CHANGE_ALL) {
          p0 = tb.P;
          if (p0 != null) {
             p0.post(new b(tb));
          }
       }
       return;
    }
}
