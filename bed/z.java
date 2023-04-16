package bed.z;
import io.reactivex.g;
import bed.y;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.kuaishou.android.model.music.Music;
import java.io.File;
import com.yxcorp.gifshow.music.utils.o;
import qkd.b;
import brd.g;
import wkd.b;
import com.yxcorp.gifshow.music.utils.a;
import t16.a;
import bed.z$a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.music.utils.a$a;

public class z implements g	// class@00042a
{
    public final boolean b;
    public final y c;

    public void z(y p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       File uFile = (this.b != null)? o.i(this.c.b.mMusic): o.f(this.c.b.mMusic);
       if (b.S(uFile)) {
          p0.onNext(uFile);
          p0.onComplete();
          return;
       }else {
          Object obj = b.a(-905856758);
          a uoa = new a("record", "taken_in_resource");
          TagInfo mMusic = this.c.b.mMusic;
          z tb = this.b;
          String str = (tb != null)? "": mMusic.mUrl;
          Music mSnippetUrls = (tb != null)? mMusic.mSnippetUrls: mMusic.mUrls;
          obj.i(uoa, mMusic, str, mSnippetUrls, new z$a(this, p0));
          return;
       }
    }
}
