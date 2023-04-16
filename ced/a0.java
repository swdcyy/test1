package ced.a0;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.m;
import java.lang.Object;
import xdd.c;
import java.util.Objects;
import android.widget.TextView;
import com.kuaishou.android.model.mix.LipsSyncModel;
import com.yxcorp.gifshow.entity.QPhoto;

public final class a0 implements g	// class@00053a
{
    public final m b;

    public void a0(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       m c = tb.C;
       int i = (p0.a != null)? 0: 8;
       c.setVisibility(i);
       if (p0.a != null) {
          p0 = tb.B;
          if (p0 != null) {
             p0.getLipsSyncModel();
          }
       }
       return;
    }
}
