package f52.f;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.b;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import com.kuaishou.android.live.log.b;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import android.widget.TextView;

public final class f implements g	// class@002889
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_CLOSE;
       lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenter");
       b.Q(lIVE_AUDIENC, " CountDown", c.j("CountDown", p0));
       Object[] objArray = new Object[]{p0};
       p0 = String.format(a1.p(R.string.arg_RES_7f1038c1), objArray);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "9")) {
       }else {
          String str = Pattern.compile("[^0-9]").matcher(p0).replaceAll("");
          tb.r.setText(str);
          tb.p.setText(Pattern.compile("[\\d]").matcher(p0).replaceAll(""));
          lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenter");
          b.Q(lIVE_AUDIENC, " CountDown", c.j("count", str));
       }
       return;
    }
}
