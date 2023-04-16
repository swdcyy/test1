package ai9.m;
import erd.g;
import ai9.p;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class m implements g	// class@0000d5
{
    public final p b;

    public void m(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       PostUtils.D("RecordToPictureController", "handle picture error", p0);
       tb.x = false;
    }
}
