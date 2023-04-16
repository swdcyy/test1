package og.d0;
import io.reactivex.g;
import com.kuaishou.android.model.music.Music;
import java.io.File;
import java.lang.Object;
import brd.v;
import wkd.b;
import com.yxcorp.gifshow.music.utils.a;
import t16.a;
import java.lang.String;
import og.n0;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.music.utils.a$a;

public final class d0 implements g	// class@00279e
{
    public final Music b;
    public final boolean c;
    public final File d;

    public void d0(Music p0,boolean p1,File p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       d0 tb = this.b;
       d0 tc = this.c;
       d0 td = this.d;
       a uoa = b.a(-905856758);
       a uoa1 = new a("record", "taken_in_resource");
       String str = (tc != null)? "": tb.mUrl;
       Music mSnippetUrls = (tc != null)? tb.mSnippetUrls: tb.mUrls;
       uoa.i(uoa1, tb, str, mSnippetUrls, new n0(tc, td, p0, tb));
       return;
    }
}
