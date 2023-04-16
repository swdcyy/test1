package ad8.f;
import android.text.TextWatcher;
import ad8.g;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.mini.d;
import ma8.i;
import qc8.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.mini.host.HostSwitchConfigManager;
import n88.b;
import java.util.ArrayList;
import java.lang.reflect.Type;
import ma8.g;
import android.widget.EditText;
import bd8.a;

public class f implements TextWatcher	// class@00007d
{
    public final g b;

    public void f(g p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       i f;
       a d;
       boolean b;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, f.class, "1")) {
          return;
       }
       f tb = this.b;
       if (tb.y == null) {
          if (d.f()) {
             d.a(this.b.r, "afterTextChanged 发送onKeyboardValueChange事件 ");
          }
          tb = this.b;
          f = tb.z.f;
          g s = tb.s;
          a e = tb.e;
          d = tb.d;
          Objects.requireNonNull(tb);
          ArrayList obj = PatchProxy.apply(null, tb, g.class, "19");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = tb.z.e.G().getValue("mini_app_input_sogou_white_list", ArrayList.class, new ArrayList());
             b = (obj.contains("mini_110") || obj.contains(tb.z.m()))? true: false;
          }
          f.e(s, e, d, p1, p3, b, this.b.n());
       }else {
          d.c(tb.r, "afterTextChanged JS 更新的input 文字，不发送onKeyboardValueChange...");
       }
       return;
    }
}
