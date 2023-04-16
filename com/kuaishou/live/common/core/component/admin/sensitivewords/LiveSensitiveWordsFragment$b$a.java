package com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$b$a;
import erd.g;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$b;
import java.lang.String;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout;
import g9c.a;
import android.widget.ScrollView;

public class LiveSensitiveWordsFragment$b$a implements g	// class@000f46
{
    public final String b;
    public final LiveSensitiveWordsFragment$b c;

    public void LiveSensitiveWordsFragment$b$a(LiveSensitiveWordsFragment$b p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSensitiveWordsFragment$b$a.class, "1")) {
       }else {
          this.c.a.p.a();
          this.c.a.s.J0(0, this.b);
          this.c.a.n.scrollTo(0, 0);
       }
       return;
    }
}
