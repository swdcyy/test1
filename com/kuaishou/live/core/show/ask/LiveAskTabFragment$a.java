package com.kuaishou.live.core.show.ask.LiveAskTabFragment$a;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import com.kuaishou.live.common.core.component.ask.LiveAskItemClickListener;
import p91.m;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import erd.g;
import ok.x;

public final class LiveAskTabFragment$a extends b	// class@0009b9
{
    public LiveAskItemClickListener d;
    public PagerSlidingTabStrip$d e;
    public m f;

    public void LiveAskTabFragment$a(PagerSlidingTabStrip$d p0,Class p1,Bundle p2,LiveAskItemClickListener p3,m p4){
       super(p0, p1, p2);
       this.d = p3;
       this.e = p0;
       this.f = p4;
    }
    public void d(int p0,Fragment p1){
       LiveAskTabFragment$a uoa = LiveAskTabFragment$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          a.p(p1, "fragment");
          LiveAskTabFragment$a td = this.d;
          Objects.requireNonNull(p1);
          if (!PatchProxy.applyVoidOneRefs(td, p1, LiveAskTabFragment.class, "11")) {
             p1.J = td;
             if (td != null) {
                td.f(p1.P);
             }
             if (td != null) {
                td.a(p1.Q);
             }
             if (td != null) {
                td.k(p1.R);
             }
          }
          p1.K = this.e;
          p1.L = this.f;
       }
       return;
    }
}
