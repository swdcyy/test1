package etb.j;
import erd.g;
import etb.n;
import java.lang.Object;
import com.yxcorp.gifshow.notice.box.event.NoticeBoxSettingEvent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import etb.l;
import java.lang.Iterable;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import etb.h;
import lnc.c3$a;
import lnc.c3;

public final class j implements g	// class@0027fd
{
    public final n b;

    public void j(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       if (TextUtils.n(tb.p, p0.mNoticeBoxId)) {
          c3.c(CollectionsKt___CollectionsKt.o2(tb.A, new l(p0)), new h(tb, p0));
       }
       return;
    }
}
