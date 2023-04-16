package kgd.w0;
import nc5.c;
import com.yxcorp.plugin.setting.entries.holder.d0$a;
import java.lang.Object;
import android.widget.TextView;
import lnc.j9;

public final class w0 implements c	// class@0017c2
{
    public final d0$a b;

    public void w0(d0$a p0){
       this.b = p0;
    }
    public final void onUpdate(int p0,int p1){
       d0$a r = this.b.r;
       boolean b = (p1 > 0)? true: false;
       j9.a(r, b);
       return;
    }
}
