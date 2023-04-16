package com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$TkCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$TkCommentNoticeInfo$a;
import nsd.u;
import z51.g;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$TkCommentNoticeInfo$b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;
import z51.c;
import pp.c;
import z51.c$b;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import java.lang.Integer;

public final class LiveTkNoticeHandler$TkCommentNoticeInfo extends LiveCommentNoticeBaseInfo	// class@001014
{
    public g tkItemInfo;
    public static final LiveTkNoticeHandler$TkCommentNoticeInfo$a Companion;

    static {
       LiveTkNoticeHandler$TkCommentNoticeInfo.Companion = new LiveTkNoticeHandler$TkCommentNoticeInfo$a(null);
    }
    public void LiveTkNoticeHandler$TkCommentNoticeInfo(){
       super();
    }
    public final g getTkItemInfo(){
       return this.tkItemInfo;
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTkNoticeHandler$TkCommentNoticeInfo.class, "1")) {
          return;
       }
       a.p(p0, "scCommentNotice");
       super.parsePbRemains(p0);
       LiveTkNoticeHandler$TkCommentNoticeInfo$b tkCommentNot = LiveCommentNoticeBaseExtraInfo.parseExtraInfo(p0.extraInfo, LiveTkNoticeHandler$TkCommentNoticeInfo$b.class);
       if (tkCommentNot == null) {
          b.B(c.i.a(), "invalid extraInfo: "+p0.extraInfo);
          return;
       }else {
          String str = tkCommentNot.a();
          g og = (str == null || !str.length())? 1: null;
          if (!og) {
             String str1 = tkCommentNot.a();
             LiveTkNoticeHandler$TkCommentNoticeInfo$b viewKey = tkCommentNot.viewKey;
             if (viewKey == null) {
                viewKey = "bubble_view";
             }
             g og1 = new g(str1, viewKey, tkCommentNot.data, tkCommentNot.minBundleVer, null, null, 48, null);
             this.tkItemInfo = og;
          }
          return;
       }
    }
    public final void setTkItemInfo(g p0){
       this.tkItemInfo = p0;
    }
}
