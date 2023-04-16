package com.kwai.live.gzone.guess.kshell.widget.LiveGzoneBaseDialogFragment$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.guess.kshell.widget.LiveGzoneBaseDialogFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hka.a;

public class LiveGzoneBaseDialogFragment$a implements View$OnClickListener	// class@000d7a
{
    public final LiveGzoneBaseDialogFragment b;

    public void LiveGzoneBaseDialogFragment$a(LiveGzoneBaseDialogFragment p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneBaseDialogFragment$a.class, "1")) {
          return;
       }
       this.b.onBackPressed();
       return;
    }
}
