package laa.h0;
import msd.l;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.c;
import brd.t;
import brd.a0;

public final class h0 implements l	// class@002d86
{
    public final DraftFileManager b;

    public void h0(DraftFileManager p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       h0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = (p0.D())? tb.q(p0).singleOrError(): a0.B(p0);
       return p0;
    }
}