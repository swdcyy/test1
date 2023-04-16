package laa.o0;
import erd.o;
import com.yxcorp.gifshow.edit.draft.model.b0;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import haa.g;
import android.util.Pair;
import java.lang.Boolean;

public final class o0 implements o	// class@002d96
{
    public final b0 b;

    public void o0(b0 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p0 = this.b.a(p0);
       return new Pair(p0, Boolean.valueOf(p0.a()));
    }
}
