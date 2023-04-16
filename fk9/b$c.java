package fk9.b$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import fk9.b;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Iterator;
import ek9.f;
import java.lang.Boolean;
import brd.y;

public class b$c implements Runnable	// class@002325
{
    public final WeakReference b;

    public void b$c(CommentsFragment p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       CommentsFragment uCommentsFra = this.b.get();
       if (uCommentsFra != null) {
          b uob = uCommentsFra.g7();
          if (uob.getItemCount() > 0 && (uob.I != null && uob.J != null)) {
             boolean b = false;
             uob.I = b;
             uCommentsFra.h0().scrollToPosition(b);
          }
       label_0034 :
          Iterator iterator = uob.r1().iterator();
          while (iterator.hasNext()) {
             iterator.next().run();
          }
          uob.r1().clear();
          uob.B.C.onNext(Boolean.TRUE);
       }
       return;
    }
}
