package n2a.b$a;
import androidx.fragment.app.c$b;
import n2a.b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import uw9.b;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import im8.f;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import n2a.c;
import java.lang.Boolean;
import brd.y;

public class b$a extends c$b	// class@0030c8
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void m(c p0,Fragment p1,View p2,Bundle p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b$a.class, "1")) {
          return;
       }
       if (p1 == this.a.p.b()) {
          b$a ta = this.a;
          CommentsFragment uCommentsFra = ta.p.b();
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(uCommentsFra, ta, b.class, "5")) {
             ta.q.set(uCommentsFra.h0());
             if (ta.w != null) {
                uCommentsFra.ia().N0(ta.w);
                b w = ta.w;
                if (w instanceof c) {
                   w.z();
                }
             }
             ta.t.onNext(Boolean.TRUE);
          }
       }
       return;
    }
}
