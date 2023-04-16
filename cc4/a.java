package cc4.a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.support.followdialog.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import wr3.d$a;

public final class a implements View$OnClickListener	// class@0004f1
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "5")) {
       }else if(tb.q.isAdded()){
          tb.q.dismiss();
          tb.r.a(2);
       }
       return;
    }
}
