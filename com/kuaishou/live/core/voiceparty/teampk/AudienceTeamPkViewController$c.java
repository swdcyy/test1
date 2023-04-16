package com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zv2.a;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.fragment.app.c;
import lp3.e;
import androidx.fragment.app.KwaiDialogFragment;

public final class AudienceTeamPkViewController$c implements View$OnClickListener	// class@001919
{
    public final AudienceTeamPkViewController b;

    public void AudienceTeamPkViewController$c(AudienceTeamPkViewController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTeamPkViewController$c.class, "1")) {
          return;
       }
       this.b.W2();
       AudienceTeamPkViewController$c tb = this.b;
       if (tb.P != null) {
          AudienceTeamPkViewController$c tb1 = this.b;
          tb.s = a.a.a(tb.D2(), tb1.B, tb1.P);
       }
       return;
    }
}
