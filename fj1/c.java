package fj1.c;
import androidx.lifecycle.Observer;
import fj1.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.a;
import kotlin.text.StringsKt__StringsKt;
import android.text.style.ForegroundColorSpan;

public final class c implements Observer	// class@002355
{
    public final d b;

    public void c(d p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(TextUtils.x(p0)){
          this.b.a().setText("");
       }else {
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(p0);
          a.o(p0, "it");
          int i = StringsKt__StringsKt.i3(p0, "/", 0, false, 6, null);
          spannableStr.setSpan(new ForegroundColorSpan(R.color.arg_RES_7f06163e), 0, i, 33);
          spannableStr.setSpan(new ForegroundColorSpan(R.color.arg_RES_7f06163f), i, p0.length(), 33);
          this.b.a().setText(spannableStr);
       }
       return;
    }
}
