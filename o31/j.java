package o31.j;
import erd.g;
import o31.m;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import java.util.List;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupAutoActivePromptDialogInfo;
import ry1.d;

public final class j implements g	// class@003466
{
    public final m b;

    public void j(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       LiveUserStatusResponse mLiveFansGro = p0.a().mLiveFansGroupInfo;
       if (PatchProxy.applyVoidOneRefs(mLiveFansGro, tb, m.class, "4")) {
       }else if(mLiveFansGro != null){
          LiveFansGroupInfo mAutoActiveP = mLiveFansGro.mAutoActivePromptDialogInfo;
          if (mAutoActiveP != null) {
             mAutoActiveP.getContentColorSpanModelList();
          }
       }
       tb.To(p0.a(), tb.l);
       tb.e.c(p0);
       return;
    }
}
