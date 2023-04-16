package dr1.f$g;
import lf3.g;
import dr1.f;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveArenaLineChatStatistic;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.LiveArenaLineChatStatistic;
import java.lang.Long;
import lf3.f;

public final class f$g implements g	// class@002003
{
    public final f b;

    public void f$g(f p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       boolean b1;
       Object obj = this;
       SCLiveArenaLineChatStatistic obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, f$g.class, "1")) {
       }else {
          a.p(obj1, "arenaLineStatistic");
          f$g b = obj.b;
          Objects.requireNonNull(b);
          f uof = f.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, uof, "6")) {
             LiveArenaLineChatStatistic obj2 = PatchProxy.applyOneRefs(obj1, b, uof, "10");
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             }else if(!TextUtils.n(b.a, obj1.multiLineChatId)){
                b.T(f.s, "isStatisticValid, chatId not match", "current", b.a, "receive", obj1.multiLineChatId);
             }else if(!TextUtils.n(b.b, obj1.arenaLineChatId)){
                b.T(f.s, "isStatisticValid, arenaId not match", "current", b.b, "receive", obj1.arenaLineChatId);
             }else {
                obj2 = obj1.statistic.version;
                f c = b.c;
                LiveArenaLineChatStatistic liveArenaLin = null;
                LiveArenaLineChatStatistic version = (c != null)? c.version: liveArenaLin;
                if (obj2 - version < 0) {
                   List s = f.s;
                   if (c != null) {
                      liveArenaLin = c.version;
                   }
                   b.T(s, "isStatisticValid, version not valid", "current", Long.valueOf(liveArenaLin), "receive", Long.valueOf(obj1.statistic.version));
                }else {
                   b1 = true;
                }
             }
             b1 = false;
             if (b1) {
                obj1 = obj1.statistic;
                a.o(obj1, "scArenaLineStatistic.statistic");
                b.j(obj1);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
