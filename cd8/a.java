package cd8.a;
import java.lang.Runnable;
import cd8.b;
import java.lang.Object;
import java.util.Objects;
import com.mini.js.jscomponent.keyboard.GlobalKeyboard;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.mini.js.jscomponent.keyboard.KeyboardHeightCalculatePopupWindow;
import ma8.i;
import java.lang.ref.WeakReference;
import android.widget.EditText;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.view.View;

public final class a implements Runnable	// class@0003f2
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       GlobalKeyboard globalKeyboa = GlobalKeyboard.a();
       b c = tb.c;
       Objects.requireNonNull(globalKeyboa);
       if (PatchProxy.applyVoidTwoRefs(c, tb, globalKeyboa, GlobalKeyboard.class, "9")) {
       }else if(globalKeyboa.e == null){
          KeyboardHeightCalculatePopupWindow keyboardHeig = new KeyboardHeightCalculatePopupWindow(c);
          globalKeyboa.e = keyboardHeig;
          keyboardHeig.a();
       }
       globalKeyboa = globalKeyboa.e;
       Objects.requireNonNull(globalKeyboa);
       if (!PatchProxy.applyVoidOneRefs(tb, globalKeyboa, KeyboardHeightCalculatePopupWindow.class, "2")) {
          globalKeyboa.c = new WeakReference(tb);
       }
       tb.a.requestFocus();
       InputMethodManager systemServic = tb.a.getContext().getSystemService("input_method");
       if (systemServic != null) {
          systemServic.showSoftInput(tb.a, 1);
       }
       return;
    }
}
