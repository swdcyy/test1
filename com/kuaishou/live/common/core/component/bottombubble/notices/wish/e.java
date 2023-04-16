package com.kuaishou.live.common.core.component.bottombubble.notices.wish.e;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.f;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeView;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.d;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import lp3.c;
import lp3.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import pd1.e;
import erd.g;

public final class e implements View$OnClickListener	// class@001021
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, f.class, "3")) {
       }else if(tb.j.a() == null){
          f j = tb.j;
          Objects.requireNonNull(j);
          ClientContent$LiveStreamPackage liveStreamPa = PatchProxy.apply(objArray, j, d.class, "4");
          if (liveStreamPa != PatchProxyResult.class) {
          }else {
             liveStreamPa = j.a.a(i.class).a();
          }
          a.c(liveStreamPa, String.valueOf(tb.j.a().mNoticeType), tb.j.a().mBizId, tb.j.a().getLogExtraInfo());
          long l = 1;
          tb.h = tb.h + l;
          long l1 = tb.i + l;
          tb.i = l1;
          tb.p0(tb.j.a(), l1);
          j = tb.k;
          if (j == null || j.isDisposed()) {
             tb.k = t.interval(0, 1500, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new e(tb));
          }
       }
       return;
    }
}
