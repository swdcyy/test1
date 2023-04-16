package com.kuaishou.live.core.show.liveprivate.a;
import erd.g;
import com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.library.widget.edittext.SettingPasswordEdit;
import android.content.Context;
import androidx.fragment.app.Fragment;
import xa2.c;
import com.yxcorp.gifshow.log.utils.b$a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.System;
import java.lang.Long;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class a implements g	// class@000c87
{
    public final LiveAudiencePrivatePasswordFragment b;
    public final long c;

    public void a(LiveAudiencePrivatePasswordFragment p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a tb = this.b;
       tb.q.a();
       ExceptionHandler.handleException(tb.getContext(), p0, new c(tb));
       b.c0(LiveLogTag.LIVE_TEA_PARTY, "checkApi£¬failed", "timeCost", Long.valueOf((System.currentTimeMillis() - this.c)));
    }
}
