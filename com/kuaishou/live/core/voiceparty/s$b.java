package com.kuaishou.live.core.voiceparty.s$b;
import hu2.a;
import com.kuaishou.live.core.voiceparty.s;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewStub;
import androidx.core.view.ViewKt;

public class s$b implements a	// class@0018fb
{
    public View a;
    public final s b;

    public void s$b(s p0){
       this.b = p0;
       super();
    }
    public void a(boolean p0){
       s$b uob = s$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (p0 && this.a == null) {
          ViewStub viewStub = this.b.m8().findViewById(R.id.live_voice_party_gold_room_label);
          if (viewStub != null) {
             this.a = viewStub.inflate();
          }
       }
       uob = this.a;
       if (uob != null) {
          ViewKt.g(uob, p0);
       }
       return;
    }
}
