package com.kuaishou.live.core.voiceparty.theater.tube.list.b$d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.voiceparty.theater.tube.list.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import dx2.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;

public class b$d extends m	// class@001a31
{
    public final b c;

    public void b$d(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
          return;
       }
       b$d tc = this.c;
       tc.x.f(tc.y, tc.P8(tc.t.getText()));
       return;
    }
}
