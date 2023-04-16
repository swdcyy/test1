package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$commentAreaAdapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2;
import fq1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z11.a;
import android.view.ViewGroup;
import t02.a0;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$commentAreaAdapter$2$1;
import p91.m;
import dq5.b;
import g81.c;
import msd.l;

public final class LiveAudienceMultiChatPresenterV2$commentAreaAdapter$2 extends Lambda implements a	// class@000b9c
{
    public final LiveAudienceMultiChatPresenterV2 this$0;

    public void LiveAudienceMultiChatPresenterV2$commentAreaAdapter$2(LiveAudienceMultiChatPresenterV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$commentAreaAdapter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveAudienceMultiChatPresenterV2 w = this.this$0.w;
       if (w == null) {
          a.S("liveBasicContext");
       }
       View view = this.this$0.m8();
       a.o(view, "rootView");
       a0 w1 = LiveAudienceMultiChatPresenterV2.Y8(this.this$0).W;
       a.o(w1, "livePlayCallerContext.mLiveCommentsBizService");
       a0 h = LiveAudienceMultiChatPresenterV2.Y8(this.this$0).H;
       a.o(h, "livePlayCallerContext.mLiveCommentsService");
       a uoa = new a(w, view, LiveAudienceMultiChatPresenterV2.W8(this.this$0).e(), w1, h, LiveAudienceMultiChatPresenterV2$commentAreaAdapter$2$1.INSTANCE);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
