package a1d.c;
import android.view.View$OnClickListener;
import a1d.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.button.SlipSwitchButton;

public final class c implements View$OnClickListener	// class@00001b
{
    public final k b;

    public void c(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, k.class, "7")) {
       }else {
          tb.x.setSwitch((tb.x.getSwitch() ^ 0x01));
       }
       return;
    }
}
