package hf2.h;
import androidx.lifecycle.Observer;
import hf2.l;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;

public final class h implements Observer	// class@002d83
{
    public final l b;

    public void h(l p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "5")) {
       }else if(p0.d == null){
          if (tb.z != null) {
             tb.z = false;
          }else if(tb.G.isFollowingOrFollowRequesting()){
             tb.a9();
          }else {
             tb.c9();
          }
       }
       return;
    }
}
