package laa.b;
import ekd.q$a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.Object;
import laa.e;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite;

public final class b implements q$a	// class@002d7b
{
    public final c a;

    public void b(c p0){
       this.a = p0;
    }
    public final Object apply(Object p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       return ta.i(p0.a);
    }
}
