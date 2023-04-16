package com.kuaishou.live.common.core.component.bottombubble.notices.multistate.LiveDoubleStateCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.CommentNoticeButton;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;

public class LiveDoubleStateCommentNoticeInfo extends LiveGenericCommentNoticeInfo	// class@000fe6
{
    public LiveCommentNoticeButtonInfo mClickedButton;
    public String mClickedDesc;
    public long mClickedDisplayDurationMs;
    public String mClickedSubTitle;

    public void LiveDoubleStateCommentNoticeInfo(){
       super();
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDoubleStateCommentNoticeInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       this.mClickedDesc = p0.clickedDesc;
       this.mClickedButton = LiveCommentNoticeButtonInfo.transformFromPb(p0.button);
       this.mClickedSubTitle = p0.clickedSubTitle;
       this.mClickedDisplayDurationMs = p0.clickedDisplayDurationMs;
       return;
    }
}
