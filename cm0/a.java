package cm0.a;
import java.lang.Object;
import androidx.fragment.app.DialogFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Dialog;
import android.view.Window;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.i5;

public class a	// class@0004e0
{

    public void a(){
       super();
    }
    public static void a(DialogFragment p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "1")) {
          return;
       }
       if (p0 != null && (p0.getDialog() != null && (p0.getDialog().getWindow() != null && n.b(a.b())))) {
          Window window = p0.getDialog().getWindow();
          window.addFlags(Integer.MIN_VALUE);
          window.clearFlags(0x8000000);
          i5.j(window, p1);
       }
    label_0047 :
       return;
    }
}
