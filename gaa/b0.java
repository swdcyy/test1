package gaa.b0;
import io.reactivex.g;
import gaa.h0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.android.model.music.Music;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import android.util.Pair;
import java.lang.Integer;
import brd.g;
import com.yxcorp.gifshow.music.utils.a;
import com.yxcorp.gifshow.model.CDNUrl;
import gaa.c;
import gaa.i0;
import com.yxcorp.gifshow.music.utils.a$a;

public final class b0 implements g	// class@002426
{
    public final h0 b;
    public final QPhoto c;

    public void b0(h0 p0,QPhoto p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       b0 tb = this.b;
       b0 tc = this.c;
       h0 c = tb.c;
       String str = PatchProxy.applyOneRefs(c, null, h0.class, "17");
       if (str != PatchProxyResult.class) {
       }else {
          str = "source_photo_"+c.getId();
       }
       String str1 = b.a(0x5f2ddeb4).g(str, String.class);
       if (!TextUtils.x(str1) && new File(str1).exists()) {
          p0.onNext(new Pair(new File(str1), Integer.valueOf(100)));
          p0.onComplete();
       }else {
          b.a(-905856758).g(tb.c, "", c.c(tc), new i0(tb, str, p0));
       }
       return;
    }
}
