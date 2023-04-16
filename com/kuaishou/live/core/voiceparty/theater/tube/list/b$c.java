package com.kuaishou.live.core.voiceparty.theater.tube.list.b$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.voiceparty.theater.tube.list.b;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterNormalAuthorInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import dx2.a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;

public class b$c extends m	// class@001a30
{
    public final VoicePartyTheaterNormalAuthorInfo c;
    public final b d;

    public void b$c(b p0,VoicePartyTheaterNormalAuthorInfo p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.c.mUserLink)) {
          b$c td = this.d;
          td.x.a(this.c.mUserLink, td.P8(td.r.getText()));
       }
       return;
    }
}
