package com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c;
import y8c.g;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c$a;
import ml8.c;

public class LiveSensitiveWordsFragment$c extends g	// class@000f4b
{
    public final LiveSensitiveWordsFragment w;

    public void LiveSensitiveWordsFragment$c(LiveSensitiveWordsFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       LiveSensitiveWordsFragment$c uoc = LiveSensitiveWordsFragment$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d14b3), new LiveSensitiveWordsFragment$c$a(this));
    }
}
