package com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c$a;
import nl8.p;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c$a$a;
import android.view.View$OnClickListener;

public class LiveSensitiveWordsFragment$c$a extends p	// class@000f4a
{
    public final LiveSensitiveWordsFragment$c i;

    public void LiveSensitiveWordsFragment$c$a(LiveSensitiveWordsFragment$c p0){
       this.i = p0;
       super();
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, LiveSensitiveWordsFragment$c$a.class, "1")) {
          return;
       }
       String str = this.t();
       this.q(R.id.tag_text).setText(str);
       this.q(R.id.tag_remove).setOnClickListener(new LiveSensitiveWordsFragment$c$a$a(this, str));
       return;
    }
}
