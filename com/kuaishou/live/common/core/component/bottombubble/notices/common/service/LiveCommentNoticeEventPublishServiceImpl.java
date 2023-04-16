package com.kuaishou.live.common.core.component.bottombubble.notices.common.service.LiveCommentNoticeEventPublishServiceImpl;
import nc1.i;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.LiveCommentNoticeEventPublishServiceImpl$events$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import lp3.e;
import lp3.c;
import lp3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nc1.h;
import kotlin.jvm.internal.a;

public final class LiveCommentNoticeEventPublishServiceImpl implements i	// class@000f98
{
    public final p b;

    public void LiveCommentNoticeEventPublishServiceImpl(){
       super();
       this.b = s.c(LiveCommentNoticeEventPublishServiceImpl$events$2.INSTANCE);
    }
    public LiveData K3(){
       return this.r();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public MutableLiveData r(){
       Object obj = PatchProxy.apply(null, this, LiveCommentNoticeEventPublishServiceImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public void zo(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentNoticeEventPublishServiceImpl.class, "2")) {
          return;
       }
       a.p(p0, "event");
       this.r().setValue(p0);
       return;
    }
}
