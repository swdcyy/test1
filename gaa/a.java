package gaa.a;
import io.reactivex.g;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import brd.v;
import java.io.File;
import com.yxcorp.gifshow.music.utils.o;
import qkd.b;
import android.util.Pair;
import java.lang.Integer;
import brd.g;
import wkd.b;
import com.yxcorp.gifshow.music.utils.a;
import gaa.b;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.music.utils.a$a;

public final class a implements g	// class@002425
{
    public final boolean b;
    public final Music c;

    public void a(boolean p0,Music p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       a tb = this.b;
       a tc = this.c;
       File uFile = (tb != null)? o.i(tc): o.f(tc);
       if (b.S(uFile)) {
          p0.onNext(new Pair(uFile, Integer.valueOf(100)));
          p0.onComplete();
       }else {
          a uoa = b.a(-905856758);
          String str = (tb != null)? "": tc.mUrl;
          Music mSnippetUrls = (tb != null)? tc.mSnippetUrls: tc.mUrls;
          uoa.g(tc, str, mSnippetUrls, new b(p0));
       }
       return;
    }
}
