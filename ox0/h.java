package ox0.h;
import erd.g;
import ox0.l;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import android.app.Dialog;
import pp.c;
import va1.m;
import rd1.d;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.String;
import java.lang.CharSequence;

public final class h implements g	// class@0035bd
{
    public final l b;
    public final int c;
    public final TextView d;

    public void h(l p0,int p1,TextView p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h td = this.d;
       Objects.requireNonNull(tb);
       long l = (long)(this.c - 1);
       if (!p0.longValue() - l) {
          m.a(tb.a, LiveLogTag.CHAT);
          tb.h.p9(2);
       }else if(td != null){
          Object[] objArray = new Object[]{String.valueOf((l - p0.longValue()))};
          td.setText(a.a().a().getString(R.string.arg_RES_7f101f30, objArray));
       }
       return;
    }
}
