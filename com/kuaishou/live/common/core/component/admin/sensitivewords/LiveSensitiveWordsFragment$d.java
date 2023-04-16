package com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$d;
import erd.g;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ScrollView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordsResponse;
import java.util.Collection;
import g9c.a;

public class LiveSensitiveWordsFragment$d implements g	// class@000f4c
{
    public final LiveSensitiveWordsFragment b;

    public void LiveSensitiveWordsFragment$d(LiveSensitiveWordsFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSensitiveWordsFragment$d.class, "1")) {
       }else {
          this.b.n.setVisibility(0);
          this.b.o.setVisibility(8);
          this.b.p.setEnabled(true);
          this.b.s.L0(p0.a().mWords);
       }
       return;
    }
}
