package a31.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.shake.view.LiveAudienceShakeJumpDialog;
import android.widget.CheckBox;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import z1.a;

public final class b implements View$OnClickListener	// class@000038
{
    public final LiveAudienceShakeJumpDialog b;
    public final CheckBox c;

    public void b(LiveAudienceShakeJumpDialog p0,CheckBox p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = this.c.isChecked();
       if (!PatchProxy.isSupport(LiveAudienceShakeJumpDialog.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, LiveAudienceShakeJumpDialog.class, "6")) {
          x.E(tb);
          tb.u.accept(Boolean.valueOf(b));
       }
       return;
    }
}
