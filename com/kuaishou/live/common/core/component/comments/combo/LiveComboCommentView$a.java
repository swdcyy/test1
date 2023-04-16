package com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView$a;
import android.os.Handler;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView$b;

public class LiveComboCommentView$a extends Handler	// class@001063
{
    public final LiveComboCommentView a;

    public void LiveComboCommentView$a(LiveComboCommentView p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboCommentView$a.class, "1")) {
          return;
       }
       if (p0.what == 66) {
          LiveComboCommentView$a ta = this.a;
          if (ta.i > 0 && (ta.m != null && ta.g == 1)) {
             ta = this.a;
             if ((System.currentTimeMillis() - ta.i) - 200 >= 0) {
                LiveComboCommentView j = ta.j;
                if (j != null) {
                   j.b(ta);
                }
                ta = this.a;
                ta.m = false;
                ta.i = 0;
             }
          }
       }
       return;
    }
}
