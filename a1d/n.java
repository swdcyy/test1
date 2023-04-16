package a1d.n;
import android.view.View$OnClickListener;
import a1d.r;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.button.SlipSwitchButton;

public final class n implements View$OnClickListener	// class@000042
{
    public final r b;

    public void n(r p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, r.class, "6")) {
       }else {
          tb.w.setSwitch((tb.w.getSwitch() ^ 0x01));
       }
       return;
    }
}
