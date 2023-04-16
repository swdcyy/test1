package ced.r1;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.f0;
import java.lang.Object;
import xdd.b;
import java.util.Objects;

public final class r1 implements g	// class@000579
{
    public final f0 b;

    public void r1(f0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.b == 1) {
       }else if(p0.a != null){
          tb.Y8();
       }else {
          tb.Z8();
       }
       return;
    }
}
