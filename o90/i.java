package o90.i;
import android.view.View$OnClickListener;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n90.g;

public final class i implements View$OnClickListener	// class@002773
{
    public final KuaiShanEditActivityV2 b;

    public void i(KuaiShanEditActivityV2 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       KuaiShanEditActivityV2 s = this.b.S;
       if (s != null) {
          s.b();
       }
       this.b.H3();
       this.b.G3();
       return;
    }
}
