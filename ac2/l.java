package ac2.l;
import erd.g;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import java.lang.Object;
import java.lang.Long;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import android.text.SpannableStringBuilder;
import y51.a;
import android.graphics.drawable.Drawable;
import lnc.a1;

public final class l implements g	// class@0000b6
{
    public final c b;

    public void l(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       int i = 0;
       tb.F.setVisibility(i);
       c f = tb.F;
       long l = p0.longValue();
       p0 = c.class;
       if (PatchProxy.isSupport(p0)) {
          p0 = PatchProxy.applyOneRefs(Long.valueOf(l), tb, p0, "12");
          if (p0 != PatchProxyResult.class) {
          label_008b :
             f.setText(p0);
             return;
          }
       }
       int i1 = 0;
       if (l - i1 < 0) {
          l = i1;
       }
       l = TimeUnit.MILLISECONDS.toSeconds(l);
       long l1 = TimeUnit.MINUTES.toSeconds(1);
       long l2 = l / l1;
       l = l % l1;
       Object[] objArray = new Object[]{Long.valueOf(l2),Long.valueOf(l)};
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       spannableStr.append("1");
       spannableStr.setSpan(new a(a1.f(R.drawable.arg_RES_7f081371), "1").b(a1.e(14.00f), a1.e(14.00f)), i, 1, 33);
       spannableStr.append(" ");
       spannableStr.append(String.format(Locale.US, "已参与，%02d分%02d秒后公布结果", objArray));
       p0 = spannableStr;
       goto label_008b ;
    }
}
