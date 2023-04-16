package d4c.a;
import android.view.View$OnClickListener;
import d4c.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import npb.c;
import kob.r;
import com.kuaishou.android.model.music.Music;
import qm9.e0;

public final class a implements View$OnClickListener	// class@0020c1
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "10")) {
       }else {
          b w = tb.w;
          if (w != null) {
             c current = w.getCurrent();
             if (current != null && current.c() == tb.u) {
                if (tb.w.isPlaying()) {
                   tb.w.pause();
                   w = tb.x;
                   if (w != null) {
                      w.c(tb.w.e40(), tb.u);
                   }
                }else {
                   tb.w.start();
                   w = tb.x;
                   if (w != null) {
                      w.b(tb.w.e40(), tb.u);
                   }
                }
             }else {
                tb.w.qI(tb.u.getUniqueCode());
                tb.w.start();
                w = tb.x;
                if (w != null) {
                   w.b(tb.w.e40(), tb.u);
                }
             }
          }
       }
       return;
    }
}
