package o90.h;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n90.g;

public final class h implements DialogInterface$OnCancelListener	// class@002772
{
    public final KuaiShanEditActivityV2 b;

    public void h(KuaiShanEditActivityV2 p0){
       this.b = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       KuaiShanEditActivityV2 s = this.b.S;
       if (s != null) {
          s.b();
       }
       return;
    }
}
