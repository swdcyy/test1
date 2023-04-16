package com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment$a;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;

public class MagicFaceFragment$a implements SmoothSlidingTabStrip$a	// class@001bb0
{
    public final MagicFaceFragment a;

    public void MagicFaceFragment$a(MagicFaceFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MagicFaceFragment$a.class, "1")) {
          return;
       }
       MagicFaceFragment$a ta = this.a;
       if (ta.C != null && ta.getView() != null) {
          ta = this.a;
          ta.nh(ta.getView());
       }
       MagicFaceFragment h = this.a.H;
       if (h != null) {
          h.k(this);
       }
       return;
    }
}
