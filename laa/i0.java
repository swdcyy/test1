package laa.i0;
import msd.l;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.c;
import brd.t;
import brd.a0;

public final class i0 implements l	// class@002d88
{
    public final DraftFileManager b;

    public void i0(DraftFileManager p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       i0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = (p0.D())? tb.c(p0).singleOrError(): a0.B(p0);
       return p0;
    }
}