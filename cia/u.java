package cia.u;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;

public final class u implements g	// class@000517
{
    public final String b;

    public void u(String p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c.f(KsLogFollowTag.FOLLOW_NIRVANA.appendTag("NirvanaDetailPageList"), "requestError", p0, "cursor", this.b);
    }
}
