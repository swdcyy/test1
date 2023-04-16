package com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$e;
import sfc.a;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment;
import android.content.Context;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ScrollView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout;

public class LiveSensitiveWordsFragment$e extends a	// class@000f4d
{
    public final LiveSensitiveWordsFragment c;

    public void LiveSensitiveWordsFragment$e(LiveSensitiveWordsFragment p0,Context p1){
       this.c = p0;
       super(p1);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSensitiveWordsFragment$e.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.n.setVisibility(8);
       this.c.o.setVisibility(0);
       this.c.p.setEnabled(true);
       return;
    }
}
