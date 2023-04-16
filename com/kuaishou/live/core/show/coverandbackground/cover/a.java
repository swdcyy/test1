package com.kuaishou.live.core.show.coverandbackground.cover.a;
import erd.g;
import com.kuaishou.live.core.show.coverandbackground.cover.b;
import java.lang.Object;
import com.kuaishou.live.core.show.coverandbackground.cover.LiveLastAuditedCoverResponse;
import java.util.Objects;
import java.util.List;
import s62.c;
import java.lang.Runnable;
import t45.c;

public final class a implements g	// class@000ae0
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mIsExist != null) {
          LiveLastAuditedCoverResponse mCoverUrls = p0.mCoverUrls;
          if (mCoverUrls != null && !mCoverUrls.isEmpty()) {
             tb.d = 0;
             tb.c = p0.mCoverUrls;
             c.a(new c(tb, p0));
             tb.g(0);
          label_002c :
             return;
          }
       }
       tb.a();
       goto label_002c ;
    }
}
