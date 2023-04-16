package i2a.a;
import erd.g;
import com.yxcorp.gifshow.detail.nonslide.b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.detail.nonslide.b$a;

public final class a implements g	// class@002765
{
    public final b b;
    public final int c;

    public void a(b p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(tc), tb, uob, "19")) {
          b$a uoa = new b$a();
          uoa.a = 3;
          uoa.b = p0;
          uoa.d = tc;
          tb.c(uoa);
       }
       return;
    }
}
