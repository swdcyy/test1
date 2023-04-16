package ib1.g;
import erd.g;
import com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment;
import java.lang.Object;
import kb1.d;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.t;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class g implements g	// class@002889
{
    public final LiveUserListFragment b;

    public void g(LiveUserListFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveUserListFragment.class, "12")) {
       }else if(p0.b != null){
          tb.sh().i();
       }
       return;
    }
}
