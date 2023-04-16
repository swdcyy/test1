package ced.z1;
import io.reactivex.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.h0;
import java.lang.Object;
import brd.v;
import com.kuaishou.android.model.music.Music;
import java.io.File;
import com.yxcorp.gifshow.music.utils.o;
import qkd.b;
import brd.g;
import uy5.a;
import java.lang.String;
import q87.c;
import wkd.b;
import com.yxcorp.gifshow.music.utils.a;
import t16.a;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.plugin.search.result.hashtag.presenters.h0$a;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.music.utils.a$a;

public final class z1 implements g	// class@000594
{
    public final h0 b;
    public final boolean c;

    public void z1(h0 p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       z1 tb = this.b;
       z1 tc = this.c;
       File uFile = (tc != null)? o.i(tb.t): o.f(tb.t);
       if (b.S(uFile)) {
          p0.onNext(uFile);
          p0.onComplete();
          Object[] objArray = new Object[0];
          a.C().y("TagMusicPreDownloadPresenter", "文件已存在，不用重复下载，直接成功", objArray);
       }else {
          Object obj = b.a(-905856758);
          a uoa = new a("record", "taken_in_resource");
          uoa.c(DownloadTask$DownloadTaskType.PRE_DOWNLOAD);
          h0 t = tb.t;
          String str = (tc != null)? "": t.mUrl;
          String str1 = str;
          Music mSnippetUrls = (tc != null)? t.mSnippetUrls: t.mUrls;
          obj.i(uoa, t, str1, mSnippetUrls, new h0$a(new WeakReference(p0)));
       }
       return;
    }
}
