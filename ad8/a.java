package ad8.a;
import android.view.View$OnFocusChangeListener;
import ad8.g;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.mini.d;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.EditText;

public final class a implements View$OnFocusChangeListener	// class@000078
{
    public final g b;

    public void a(g p0){
       this.b = p0;
    }
    public final void onFocusChange(View p0,boolean p1){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p1) {
          if (d.f()) {
             d.a(tb.r, "input 获取焦点了 OnFocusChange: true , 文字是 "+tb.s.getHint());
          }
       }else {
          tb.s.setVisibility(8);
          tb.J();
          if (d.f()) {
             d.a(tb.r, "input 失去焦点了 OnFocusChange: false, 文字是 "+tb.s.getHint());
          }
       }
       return;
    }
}
