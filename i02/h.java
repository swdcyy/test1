package i02.h;
import erd.g;
import i02.i;
import s51.c;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;

public final class h implements g	// class@0027f0
{
    public final i b;
    public final c c;

    public void h(i p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       if (!TextUtils.x(p0) && tc.P0(p0)) {
          tc.r4(p0, tb.d);
       }
       return;
    }
}
