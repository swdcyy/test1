package f4b.g;
import erd.o;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.Object;
import java.lang.Throwable;
import s5b.b;
import java.lang.StringBuilder;
import java.lang.String;
import android.util.Log;
import q87.c;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import f4b.k;
import w46.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import brd.v;
import brd.g;
import brd.t;

public final class g implements o	// class@00289a
{
    public final MagicBusinessId b;

    public void g(MagicBusinessId p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       g tb = this.b;
       String str = "refresh_magic";
       b.D().z(str, "onErrorResumeNext, resume with cache "+Log.getStackTraceString(p0), p0);
       MagicEmojiResponse magicEmojiRe = k.d(tb);
       if (magicEmojiRe != null) {
          k.a(tb, magicEmojiRe);
       }else {
          b.D().e(str, "error, cache  null"+Log.getStackTraceString(p0), p0);
          if (!PatchProxy.applyVoidTwoRefs(tb, p0, null, k.class, "5")) {
             v ov = k.b.remove(tb);
             if (ov != null && !ov.isDisposed()) {
                ov.onError(p0);
             }
          }
       }
       return t.just(magicEmojiRe);
    }
}
