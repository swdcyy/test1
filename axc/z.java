package axc.z;
import android.content.DialogInterface$OnShowListener;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import kotlin.jvm.internal.a;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.utility.n;

public final class z implements DialogInterface$OnShowListener	// class@0002fc
{
    public final TextBasePanelFragment b;

    public void z(TextBasePanelFragment p0){
       this.b = p0;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       this.b.vh().setFocusable(true);
       this.b.vh().setFocusableInTouchMode(true);
       this.b.vh().requestFocus();
       BaseFragment uBaseFragmen = this.b.A.q();
       a.o(uBaseFragmen, "editorDelegate.previewFragment");
       n.a0(uBaseFragmen.getContext(), this.b.vh(), 100);
       return;
    }
}
