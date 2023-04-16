package lq1.e;
import lq1.f;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;

public final class e	// class@003003
{

    public static void a(f p0,BizEndReason p1){
       a.p(p1, "bizEndReason");
    }
    public static void b(f p0){
    }
    public static void c(f p0,SCLiveMultiLineChatOpened p1){
       a.p(p1, "scLineOpened");
    }
}
