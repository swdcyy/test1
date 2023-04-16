package com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.breakpoint.a;
import rc9.a;
import com.yxcorp.gifshow.camera.record.breakpoint.BreakpointIndicator;
import android.widget.RelativeLayout;
import rc9.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchSeekBarDragPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoSeekBarDragPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class BreakpointPanel$b extends m	// class@000db5
{
    public final BreakpointPanel c;

    public void BreakpointPanel$b(BreakpointPanel p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreakpointPanel$b.class, "1")) {
          return;
       }
       BreakpointPanel$b tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, BreakpointPanel.class, "7")) {
          BreakpointPanel h = tc.h;
          Objects.requireNonNull(h);
          if (!PatchProxy.applyVoid(objArray, h, a.class, "20")) {
             a p = h.p;
             p.c = p.d;
             p.f = -1;
             h.v.a();
             p = h.s;
             if (p != null) {
                p.requestLayout();
             }
             a r = h.r;
             Objects.requireNonNull(r);
             if (!PatchProxy.applyVoid(objArray, r, h.class, "2")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.name = "timing_stop";
                uElementPack.action = 1353;
                ClientContent$BatchSeekBarDragPackage uBatchSeekBa = new ClientContent$BatchSeekBarDragPackage();
                ClientContent$PhotoSeekBarDragPackage photoSeekBar = new ClientContent$PhotoSeekBarDragPackage();
                photoSeekBar.endTime = (long)r.a.p.c;
                ClientContent$PhotoSeekBarDragPackage[] photoSeekBar1 = new ClientContent$PhotoSeekBarDragPackage[]{photoSeekBar};
                uBatchSeekBa.seekBarDragPackage = photoSeekBar1;
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.batchSeekBarPackage = uBatchSeekBa;
                u1.u(1, uElementPack, uContentPack);
             }
          }
          tc.a();
       }
       return;
    }
}
