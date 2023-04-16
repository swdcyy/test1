package f4b.f;
import erd.o;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import s5b.b;
import java.lang.StringBuilder;
import java.lang.String;
import ekd.k1;
import q87.c;
import e4b.b;
import f4b.k;

public final class f implements o	// class@002899
{
    public final long b;
    public final MagicBusinessId c;

    public void f(long p0,MagicBusinessId p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       f tc = this.c;
       Object[] objArray = new Object[0];
       b.D().A("refresh_magic", "get magicfaces response at "+k1.t(this.b), objArray);
       b.d(tc, p0);
       p0 = p0.clone();
       k.a(tc, p0);
       return p0;
    }
}
