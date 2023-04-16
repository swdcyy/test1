package com.yxcorp.gifshow.v3.editor.text.subtitle.b0;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Objects;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import dvc.l0;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;

public final class b0 implements Observer	// class@001493
{
    public final SubtitleTextPresenter b;

    public void b0(SubtitleTextPresenter p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.e() == ListHolder$UpdateType.CHANGE_ALL) {
          p0 = tb.J;
          if (p0 != null) {
             p0.post(new l0(tb));
          }
       }
       return;
    }
}
