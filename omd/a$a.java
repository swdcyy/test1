package omd.a$a;
import android.view.View$OnClickListener;
import omd.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayDataItem;
import kotlin.jvm.internal.a;
import z1.a;

public final class a$a implements View$OnClickListener	// class@002021
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.P8(this.b).setSelected((a.P8(this.b).isSelected() ^ 0x01));
       a t = this.b.t;
       if (t == null) {
          a.S("mSelectedIcon");
       }
       t.setSelected(a.P8(this.b).isSelected());
       a$a tb = this.b;
       tb.u.accept(a.P8(tb));
       return;
    }
}
