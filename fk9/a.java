package fk9.a;
import erd.g;
import fk9.b;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import al9.a;
import g9c.a;
import y8c.t;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;

public final class a implements g	// class@002322
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "11")) {
       }else if(!tb.s1()){
          if (tb.w.q().L0() != null && !tb.getItemCount()) {
             tb.w.sh().i();
          }else if(tb.w.q().g()){
             tb.w.sh().d(true);
          }
       }else {
          tb.w.sh().f();
          if (!tb.y.hasMore()) {
             tb.w.sh().p();
          }
       }
       return;
    }
}
