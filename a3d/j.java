package a3d.j;
import android.view.View$OnClickListener;
import com.yxcorp.login.userlogin.widget.QrCodeActionBar;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import tyc.q4;

public final class j implements View$OnClickListener	// class@00007f
{
    public final QrCodeActionBar b;

    public void j(QrCodeActionBar p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, QrCodeActionBar.class, "19")) {
       }else if(tb.i != null){
          Activity activity = tb.getActivity();
          if (activity != null) {
             q4.d(activity);
             QrCodeActionBar f = tb.f;
             if (f != null) {
                f.onClick(p0);
             }
          }
       }
       return;
    }
}
