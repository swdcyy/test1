package com.kuaishou.live.audience.course.e$d;
import com.kuaishou.live.audience.course.LiveCourseTrialEndFragment$a;
import com.kuaishou.live.audience.course.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s31.y;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import k2b.u1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public class e$d implements LiveCourseTrialEndFragment$a	// class@000c00
{
    public final e a;

    public void e$d(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$d.class, "1")) {
          return;
       }
       this.a.R8(true);
       this.a.t.c(true);
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$d.class, "2")) {
          return;
       }
       e t = this.a.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(objArray, t, y.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 1102;
          uElementPack.name = t.b;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = y.a(t.a);
          y.b(t.d);
          u1.u(1, uElementPack, uContentPack);
       }
       if (this.a.s.b().getActivity() != null) {
          this.a.s.b().getActivity().finish();
       }
       return;
    }
}
