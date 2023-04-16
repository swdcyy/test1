package b79.c$a;
import android.view.View$OnClickListener;
import b79.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.models.QMedia;
import r79.c;
import z69.y;

public final class c$a implements View$OnClickListener	// class@00037e
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       p0 = p0.getTag(R.id.ksa_media_item);
       if (!p0 instanceof QMedia) {
          p0 = null;
       }
       if (p0 != null) {
          c k = this.b.k;
          if (k != null) {
             k.W6(p0);
          }
       }
       return;
    }
}
