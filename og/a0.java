package og.a0;
import erd.o;
import qm6.b$a;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import java.lang.Object;
import android.util.Pair;
import com.kuaishou.android.model.music.Music;
import pm6.m;
import com.yxcorp.gifshow.music.utils.o;
import java.util.concurrent.TimeUnit;
import com.kuaishou.android.model.music.MusicType;
import java.io.File;
import java.lang.String;
import com.yxcorp.gifshow.media.util.c;
import og.l;
import java.lang.Long;
import java.lang.Integer;
import q87.c;
import kqb.g0;
import com.yxcorp.gifshow.model.Lyrics;
import java.util.List;
import lnc.r5;
import android.graphics.Bitmap;
import org.json.JSONObject;
import e16.b;
import android.net.Uri;
import ekd.w0;
import com.kwai.feature.post.api.music.data.MusicSource;

public final class a0 implements o	// class@00278d
{
    public final int b;
    public final b$a c;
    public final JsCameraCallbackParams$Param d;

    public void a0(int p0,b$a p1,JsCameraCallbackParams$Param p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       long l2;
       long l3;
       long l4;
       a0 uoa0 = this;
       a0 c = uoa0.c;
       a0 d = uoa0.d;
       Pair pair = p0;
       Pair first = pair.first;
       int i = 0;
       Bitmap uBitmap = null;
       int i1 = (o.l(first, m.b(uoa0.b), i))? uBitmap: o.h(first);
       long l = o.h(first);
       long l1 = TimeUnit.MINUTES.toMillis(1);
       Music mType = first.mType;
       if (mType == MusicType.SOUNDTRACK || mType == MusicType.LIP) {
          l1 = (long)c.i(pair.second.getPath());
          Object[] objArray = new Object[]{Long.valueOf(l1),Integer.valueOf(first.mType.getValue())};
          Object[] objArray1 = new Object[i];
          l.D().w("PostVideoHelper", String.format("use origin duration =%d, type=%d", objArray), objArray1);
          l2 = l1;
          l3 = uBitmap;
          l4 = l3;
       }else {
          l2 = l1;
          l4 = i1;
          l3 = l;
       }
       Lyrics lyrics = new g0().b(first.mLyrics);
       if (lyrics != null) {
          Lyrics mLines = lyrics.mLines;
          if (mLines != null && !mLines.isEmpty()) {
             lyrics = o.a(lyrics, l3, l2);
          label_0095 :
             return c.B(w0.c(pair.second)).P(first).X(d.mNeedMusicDownloadIndicator).U(MusicSource.TAG).T(b.a(first, l4, l2, 1).toString()).V(l4).R(l2).I(lyrics).H(l3).Q(r5.b().c(o.c(first)));
          }
       }
       lyrics = null;
       goto label_0095 ;
    }
}
