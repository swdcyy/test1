package c5b.e;
import a5b.a;
import c5b.e$a;
import nsd.u;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import c5b.c;
import c5b.d;
import java.util.concurrent.TimeUnit;
import c5b.e$b;
import erd.o;
import cjd.e;
import c5b.e$c;
import t45.d;
import brd.z;

public final class e implements a	// class@0004ba
{
    public final MagicBusinessId b;
    public final MagicEmojiPageConfig c;
    public static final e$a d;

    static {
       e.d = new e$a(null);
    }
    public void e(MagicBusinessId p0,MagicEmojiPageConfig p1){
       a.p(p0, "businessId");
       super();
       this.b = p0;
       this.c = p1;
    }
    public t a(String p0,int p1){
       d obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "searchKey");
       obj = c.b.a();
       MagicBusinessId mId = this.b.mId;
       e tc = this.c;
       MagicEmojiPageConfig mTaskId = (tc != null)? tc.mTaskId: null;
       t ot = obj.b(mId, p0, p1, mTaskId).timeout(3000, TimeUnit.MILLISECONDS).map(new e$b(p0)).map(new e()).flatMap(new e$c(this)).subscribeOn(d.c);
       a.o(ot, "MagicSearchApiManager\n  ¡­eOn\(KwaiSchedulers.ASYNC\)");
       return ot;
    }
}
