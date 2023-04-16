package ib1.h;
import erd.g;
import com.kuaishou.live.common.core.component.admin.user.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.admin.model.AssistantsResponse;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jb1.s;
import java.util.List;

public final class h implements g	// class@00288a
{
    public final b b;

    public void h(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g og = this.b.q.g7();
       if (og instanceof s) {
          og.L = p0.mPrompt;
          og.K = p0.mAdminLimit;
          og.J = p0.mSuperAssistantLimit;
          og.M = p0.getItems();
       }
       return;
    }
}
