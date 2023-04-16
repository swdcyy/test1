package com.yxcorp.gifshow.v3.mixed.timeline.j$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.mixed.timeline.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hwc.c;
import java.util.Objects;
import com.yxcorp.gifshow.v3.mixed.model.b;
import e17.i;
import com.yxcorp.gifshow.v3.mixed.MixImporterActivity;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$c;
import androidx.fragment.app.FragmentActivity;
import android.widget.Button;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;

public class j$a extends m	// class@00156e
{
    public final j c;

    public void j$a(j p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       c.c("CLICK_TRANSITION");
       j$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, j.class, "4") && tc.P8()) {
          if (!tc.x.x0(0x3ff0000000000000)) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1036f7);
          }else {
             j y = tc.y;
             if (y.Q == null) {
                y.Q = new TransitionEffectFragment();
             }
             tc.y.Q.eh(tc.x.c, false, tc.B, false, R.layout.arg_RES_7f0d0fd8, 0x7f0d162a);
             y = tc.y;
             y.Q.hh(R.id.container_other, y);
             tc.q.setVisibility(4);
             tc.r.setEnabled(false);
             tc.s.setEnabled(false);
             tc.t.setEnabled(false);
             tc.x.p.setValue(Boolean.TRUE);
             if (!PatchProxy.applyVoid(null, null, c.class, "1")) {
                c.a("click_transition");
             }
          }
       }
       return;
    }
}
