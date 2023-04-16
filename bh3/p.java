package bh3.p;
import erd.g;
import bh3.s;
import java.lang.Object;
import bh3.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import zg3.c;
import zg3.c$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import bh3.s$d;
import lh3.b;
import java.lang.Throwable;
import bh3.s$c;
import jh3.a;

public final class p implements g	// class@0003c8
{
    public final s b;

    public void p(s p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       tb.j = p0.mChatId;
       a mTimeoutMs = p0.mTimeoutMs;
       s os = s.class;
       if (!PatchProxy.isSupport(os) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(mTimeoutMs), tb, os, "5") && mTimeoutMs - null > 0)) {
          c uoc = new c((int)mTimeoutMs);
          tb.g = uoc;
          uoc.a(tb.n);
          tb.g.c();
       }
       if (!TextUtils.isEmpty(p0.mAryaConfig)) {
          tb.b.o(p0.mAryaConfig, tb.d.a, p0.mChatId, p0.mSessionId);
       }
       s f = tb.f;
       if (f != null) {
          s d = tb.d;
          f.a(d.a, d.c, tb.i, p0.mExtraInfo, true, null);
       }
       s d1 = tb.d;
       tb.h.h(d1.a, d1.c, true, null);
       return;
    }
}
