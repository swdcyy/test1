package id9.f;
import java.lang.Runnable;
import id9.t;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.File;
import java.lang.String;
import j80.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kqb.g0;
import com.yxcorp.gifshow.model.Lyrics;
import java.util.List;

public final class f implements Runnable	// class@0027ec
{
    public final t b;

    public void f(t p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       File uFile = t.i2(tb.p);
       if (uFile != null && uFile.exists()) {
          String str = g.d(uFile);
          if (!TextUtils.x(str)) {
             Lyrics lyrics = new g0().b(str);
             if (lyrics != null) {
                Lyrics mLines = lyrics.mLines;
                if (mLines != null && !mLines.isEmpty()) {
                   tb.r = lyrics;
                }
             }
          }
       }
       return;
    }
}
