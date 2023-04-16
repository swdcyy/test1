package gqb.r$d;
import erd.g;
import gqb.r;
import java.lang.Object;
import wpb.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.radio.MusicRadioPlayStatus;
import java.util.Objects;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.widget.ImageView;

public final class r$d implements g	// class@002b8e
{
    public final r b;

    public void r$d(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Context context;
       if (PatchProxy.applyVoidOneRefs(p0, this, r$d.class, "1")) {
       }else {
          r$d tb = this.b;
          boolean b = (p0.a == MusicRadioPlayStatus.PLAY)? true: false;
          Objects.requireNonNull(tb);
          r or = r.class;
          if (!PatchProxy.isSupport(or) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, or, "9")) {
             String str = "mPlayBtnImg";
             if (b) {
                b = tb.s;
                if (b == null) {
                   a.S(str);
                }
                context = tb.getContext();
                a.m(context);
                b.setImageDrawable(j.k(context, R.drawable.arg_RES_7f080dcb));
             }else {
                b = tb.s;
                if (b == null) {
                   a.S(str);
                }
                context = tb.getContext();
                a.m(context);
                b.setImageDrawable(j.k(context, R.drawable.arg_RES_7f080dcc));
             }
          }
       }
       return;
    }
}
