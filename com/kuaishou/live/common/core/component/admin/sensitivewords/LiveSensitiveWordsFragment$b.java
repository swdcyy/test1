package com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$b;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout$b;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cb1.c;
import cb1.b;
import brd.t;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$b$a;
import sfc.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import erd.g;
import crd.b;

public class LiveSensitiveWordsFragment$b implements SensitiveWordInputLayout$b	// class@000f47
{
    public final LiveSensitiveWordsFragment a;

    public void LiveSensitiveWordsFragment$b(LiveSensitiveWordsFragment p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSensitiveWordsFragment$b.class, "1")) {
          return;
       }
       b.b().o(this.a.ch(), p0).subscribe(new LiveSensitiveWordsFragment$b$a(this, p0), new a(a.a().a()));
       return;
    }
    public void b(String p0){
    }
}
