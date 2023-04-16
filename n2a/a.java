package n2a.a;
import uw9.b$a;
import n2a.b;
import java.lang.Object;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import uw9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.e;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public final class a implements b$a	// class@0030c7
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(){
       a ta = this.a;
       CommentsFragment uCommentsFra = ta.p.b();
       if (PatchProxy.applyVoidOneRefs(uCommentsFra, ta, b.class, "4")) {
       }else if(uCommentsFra == null){
          e uoe = ta.v.beginTransaction();
          if (!uCommentsFra.isAdded()) {
             uoe.f(R.id.fragment_container, uCommentsFra);
          }else if(uCommentsFra.isHidden()){
             uoe.E(uCommentsFra);
          }
          uoe.m();
       }
       return;
    }
}
