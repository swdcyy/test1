package com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import xp5.i;
import ks5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gv1.h;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController$b;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantViewFlipper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import android.view.ViewGroup$LayoutParams;
import android.widget.ViewFlipper;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController$onCreate$$inlined$apply$lambda$1;
import msd.a;
import qrd.l1;
import android.view.View;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import ks5.h;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class TempPlayPendantFlipperViewController extends ViewController	// class@0016d8
{
    public final h j;
    public TempPlayPendantViewFlipper k;
    public final h l;
    public final LiveData m;
    public final i n;
    public final i o;

    public void TempPlayPendantFlipperViewController(LiveData p0,i p1,i p2){
       a.p(p0, "pendantItems");
       a.p(p1, "liveLogPackageProvider");
       a.p(p2, "topPendantEnterAnimationService");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.j = new h(p1);
       this.l = new TempPlayPendantFlipperViewController$b(this);
    }
    public static final TempPlayPendantViewFlipper V2(TempPlayPendantFlipperViewController p0){
       p0 = p0.k;
       if (p0 == null) {
          a.S("pendantViewFlipper");
       }
       return p0;
    }
    public void F2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TempPlayPendantFlipperViewController.class, "1")) {
          return;
       }
       TempPlayPendantViewFlipper tempPlayPend = new TempPlayPendantViewFlipper(this.D2(), objArray, 2, objArray);
       tempPlayPend.setLayoutParams(new ViewGroup$LayoutParams(-2, -1));
       tempPlayPend.setClipChildren(false);
       tempPlayPend.setOnPendantClickListener(new TempPlayPendantFlipperViewController$onCreate$$inlined$apply$lambda$1(this));
       this.k = tempPlayPend;
       this.R2(tempPlayPend);
       this.m.observe(this, new TempPlayPendantFlipperViewController$a(this));
       this.o.Ld(this.l);
       b.Z(LiveLogTag.LIVE_TOP_PENDANT, "LiveTempPlayPendantController TempPlayPendantFlipperViewController onCreate");
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TempPlayPendantFlipperViewController.class, "2")) {
          return;
       }
       this.o.Ld(objArray);
       b.Z(LiveLogTag.LIVE_TOP_PENDANT, "LiveTempPlayPendantController TempPlayPendantFlipperViewController onDestroy");
       return;
    }
}
