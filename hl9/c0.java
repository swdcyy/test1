package hl9.c0;
import android.content.DialogInterface$OnShowListener;
import com.yxcorp.gifshow.comment.utils.e;
import java.lang.Object;
import android.content.DialogInterface;

public final class c0 implements DialogInterface$OnShowListener	// class@0026c5
{
    public final e b;

    public void c0(e p0){
       this.b = p0;
    }
    public final void onShow(DialogInterface p0){
       e h = this.b.h;
       if (h != null) {
          h.onShow(p0);
       }
       return;
    }
}
