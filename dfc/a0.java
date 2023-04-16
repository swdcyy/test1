package dfc.a0;
import df5.e;
import dfc.b0;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.action.RealActionBizType;
import java.lang.String;
import lec.f;

public final class a0 implements e	// class@00219b
{
    public final b0 a;

    public void a0(b0 p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       a0 ta = this.a;
       Objects.requireNonNull(ta);
       if (p0) {
       }else {
          f.k("NEWS_SLIDE", RealActionBizType.NEWS_SLIDE, 4, ta.p);
       }
       return;
    }
}
