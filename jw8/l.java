package jw8.l;
import erd.g;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import io.reactivex.internal.functions.Functions;
import lq.f;
import crd.b;

public final class l implements g	// class@0029c3
{
    public final c b;

    public void l(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       if (tb.D()) {
          DraftFileManager.E().p(tb).subscribe(Functions.d(), f.b);
       }
       return;
    }
}
