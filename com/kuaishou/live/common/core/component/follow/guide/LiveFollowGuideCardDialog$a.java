package com.kuaishou.live.common.core.component.follow.guide.LiveFollowGuideCardDialog$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.follow.guide.LiveFollowGuideCardDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rg1.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.t;
import bp6.a;
import sfc.a;
import erd.g;
import crd.b;

public class LiveFollowGuideCardDialog$a extends m	// class@001108
{
    public final LiveFollowGuideCardDialog c;

    public void LiveFollowGuideCardDialog$a(LiveFollowGuideCardDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFollowGuideCardDialog$a.class, "1")) {
          return;
       }
       LiveFollowGuideCardDialog e = this.c.E;
       if (e != null) {
          e.A3();
          if (!TextUtils.x(this.c.G) && this.c.getActivity() != null) {
             LiveFollowGuideCardDialog$a tc = this.c;
             tc.E.z3(tc.G, 20, tc.getActivity(), false).subscribe(new a(), new a());
          }
       }
       return;
    }
}
