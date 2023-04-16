package com.kuaishou.live.audience.component.push.LiveAudiencePushFragment$a;
import lc2.k;
import com.kuaishou.live.audience.component.push.LiveAudiencePushFragment;
import java.lang.Object;
import com.kuaishou.live.core.show.model.LiveFreshAuthorResponse;
import com.kuaishou.live.core.basic.model.LiveStartInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.modifycover.a;
import java.io.File;
import com.kuaishou.live.audience.component.push.LiveAudiencePushCoverLayout;
import lm6.g;
import android.widget.FrameLayout;
import android.view.View;
import t02.a0;
import com.kwai.video.waynelive.LivePlayerController;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import gxc.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import v21.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class LiveAudiencePushFragment$a implements k	// class@000bc8
{
    public final LiveAudiencePushFragment a;

    public void LiveAudiencePushFragment$a(LiveAudiencePushFragment p0){
       this.a = p0;
       super();
    }
    public void a(LiveFreshAuthorResponse p0){
    }
    public void b(LiveStartInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudiencePushFragment$a.class, "1")) {
          return;
       }
       String str = TextUtils.k(p0.mTitle);
       if (!TextUtils.x(str)) {
          this.a.c.b(str);
       }
       return;
    }
    public void c(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudiencePushFragment$a.class, "3")) {
          return;
       }
       this.a.c.setLiveCover(p0);
       return;
    }
    public void d(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudiencePushFragment$a.class, "5")) {
          return;
       }
       this.a.f.setVisibility(8);
       this.a.g.findViewById(R.id.live_audience_full_screen_fragment_shape).setVisibility(8);
       if (!this.a.i.E.isPlaying()) {
          this.a.i.E.startPlay();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveAudiencePushFragment$a.class, "4")) {
          return;
       }
       if (this.a.getActivity() != null) {
          LiveAudiencePushFragment$a ta = this.a;
          if (ta.f != null) {
             ta.m = qa.s(b.class, LoadPolicy.DIALOG).R(new o(this), Functions.d());
          }
       }
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudiencePushFragment$a.class, "2")) {
          return;
       }
       this.a.c.setCaption(p0);
       return;
    }
}
