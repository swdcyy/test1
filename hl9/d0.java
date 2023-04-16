package hl9.d0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.utils.e;
import java.lang.Object;
import android.view.View;
import yk9.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;

public final class d0 implements View$OnClickListener	// class@0026c7
{
    public final e b;

    public void d0(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d0 tb = this.b;
       if (tb.d() != null) {
          tb.d().x(tb.c());
       }
       return;
    }
}
