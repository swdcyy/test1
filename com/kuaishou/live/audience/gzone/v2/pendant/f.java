package com.kuaishou.live.audience.gzone.v2.pendant.f;
import z31.b;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$PendantView;
import com.kuaishou.live.common.gzone.pendant.LiveGzonePendant;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.live.audience.gzone.v2.pendant.b;
import t02.a0;
import k67.l;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import dz1.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import k67.b;

public class f implements b	// class@000c43
{
    public final LiveGzonePendantViewPagerPresenter$PendantView a;
    public final LiveGzonePendant b;
    public final LiveGzonePendantViewPagerPresenter c;

    public void f(LiveGzonePendantViewPagerPresenter p0,LiveGzonePendantViewPagerPresenter$PendantView p1,LiveGzonePendant p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       int i = this.c.v.h(this.a);
       String str = null;
       a0 q1 = this.c.z.Q1;
       if (q1 != null) {
          str = q1.o("activity_h5_pendant_group");
       }
       a.j(this.c.y.a(), this.b.mPicName, i, str);
       a0 r1 = this.c.z.R1;
       if (r1 != null) {
          r1.bl("", LiveGzoneTabSource.UNION_H5_PENDANT);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       String str = null;
       a0 q1 = this.c.z.Q1;
       if (q1 != null) {
          str = q1.o("activity_h5_pendant_group");
       }
       a.n(this.c.y.a(), this.b.mPicName, this.c.v.h(this.a), str);
       return;
    }
}
