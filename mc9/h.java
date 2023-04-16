package mc9.h;
import erd.g;
import com.yxcorp.gifshow.camera.record.autoapply.sample.c;
import java.lang.Object;
import java.lang.Float;
import java.util.Objects;
import gq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class h implements g	// class@002e47
{
    public final c b;

    public void h(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       tb.m = p0.floatValue();
       Object[] objArray = new Object[0];
       a.D().s("SampleProcessor", "progress:"+p0, objArray);
    }
}
