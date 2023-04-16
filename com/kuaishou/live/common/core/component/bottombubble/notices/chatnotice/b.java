package com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.b;
import bq5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.LiveCommonChatNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.b$a;
import java.lang.Object;
import dp3.g;
import dp3.f;
import android.animation.Animator;
import bq5.a;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ag6.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.LiveCommonChatNoticeView;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.LiveCommonChatNoticeInfo$ExtraInfo;
import com.kuaishou.live.core.show.chat.model.LiveChatCommonNoticeConfig;
import ic1.d;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;

public class b implements b	// class@000f8d
{
    public final LiveCommonChatNoticeInfo b;
    public final b$a c;
    public int d;
    public LiveCommonChatNoticeView e;

    public void b(LiveCommonChatNoticeInfo p0,int p1,b$a p2){
       super();
       this.b = p0;
       this.d = p1;
       this.c = p2;
    }
    public void A(int p0){
       f.b(this, p0);
    }
    public Animator a(){
       return a.b(this);
    }
    public int b(){
       return a.f(this);
    }
    public void c(){
       f.c(this);
    }
    public Animator d(){
       return a.a(this);
    }
    public void e(){
       f.d(this);
    }
    public View getView(){
       return this.e;
    }
    public int h(){
       return 2;
    }
    public void i(LayoutInflater p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       LiveCommonChatNoticeView liveCommonCh = a.c(p0, R.layout.arg_RES_7f0d0a90, p1, false);
       this.e = liveCommonCh;
       LiveCommonChatNoticeInfo$ExtraInfo mChatGuideCo = (this.d == 1)? this.b.mExtraInfo.mChatGuideConfig: this.b.mExtraInfo.mApplyingChatConfig;
       liveCommonCh.c(mChatGuideCo);
       if (this.c != null) {
          this.e.setOnClickListener(new d(this));
       }
       return;
    }
    public int r(){
       return a.d(this);
    }
    public int z(){
       return a.e(this);
    }
}
