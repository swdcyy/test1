package dn1.c;
import java.lang.Runnable;
import dn1.d;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveHotspotSimpleInfo;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import ekd.r;
import android.widget.ImageView;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.view.View;
import com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper;
import android.widget.TextView;
import java.util.List;
import android.widget.ViewFlipper;
import com.kuaishou.live.widget.ShootMarqueeView;

public final class c implements Runnable	// class@001fcd
{
    public final d b;
    public final Boolean c;
    public final LiveHotspotSimpleInfo[] d;

    public void c(d p0,Boolean p1,LiveHotspotSimpleInfo[] p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       d b1;
       int i4;
       int i5;
       FixedEntranceViewController o;
       FixedEntranceViewController uFixedEntran = FixedEntranceViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       c tc = this.c;
       a.o(tc, "isCoreAnchorTemp");
       int i = 2;
       int i1 = 0x7f0604d9;
       int i2 = 0x7f060846;
       int i3 = 0;
       if (tc.booleanValue()) {
          d b = this.b.b;
          if (b.s == null) {
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoid(objArray, b, uFixedEntran, "8")) {
                i4 = r.b(b.D2(), i2);
                i5 = r.b(b.D2(), i1);
                o = b.o;
                if (o == null) {
                   a.S("coreAnchorTitle");
                }
                b.d3(i4, i5, o.getMeasuredWidth());
             }
             b1 = this.b.b;
             ImageView[] imageViewArr = new ImageView[]{FixedEntranceViewController.W2(b1)};
             View[] viewArray = new View[i];
             viewArray[i3] = FixedEntranceViewController.Z2(this.b.b);
             viewArray[1] = FixedEntranceViewController.Y2(this.b.b);
             b1.c3(CollectionsKt__CollectionsKt.r(imageViewArr), CollectionsKt__CollectionsKt.r(viewArray));
          }else if(!this.c.booleanValue()){
             b = this.b.b;
             if (b.s != null) {
                b.e3(this.d);
                b = this.b.b;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoid(objArray, b, uFixedEntran, "7")) {
                   i4 = r.b(b.D2(), i1);
                   i5 = r.b(b.D2(), i2);
                   o = b.p;
                   if (o == null) {
                      a.S("normalTitle");
                   }
                   b.d3(i4, i5, o.getMeasuredWidth());
                }
                b1 = this.b.b;
                View[] viewArray1 = new View[i];
                viewArray1[i3] = FixedEntranceViewController.Y2(b1);
                viewArray1[1] = FixedEntranceViewController.Z2(this.b.b);
                ImageView[] imageViewArr1 = new ImageView[]{FixedEntranceViewController.W2(this.b.b)};
                b1.c3(CollectionsKt__CollectionsKt.r(viewArray1), CollectionsKt__CollectionsKt.r(imageViewArr1));
                FixedEntranceViewController.Z2(this.b.b).d();
             }
          }
          LiveMarqueeTextFlipper liveMarqueeT = FixedEntranceViewController.Z2(this.b.b);
          Objects.requireNonNull(liveMarqueeT);
          if (!PatchProxy.applyVoid(objArray, liveMarqueeT, LiveMarqueeTextFlipper.class, "4")) {
             int childCount = liveMarqueeT.getChildCount();
             while (i3 < childCount) {
                View childAt = liveMarqueeT.getChildAt(i3);
                if (childAt instanceof ShootMarqueeView) {
                   childAt.y();
                }
                i3 = i3 + 1;
             }
             liveMarqueeT = liveMarqueeT.j;
             if (liveMarqueeT != null) {
                liveMarqueeT.y();
             }
          }
          this.b.b.e3(this.d);
          FixedEntranceViewController.Z2(this.b.b).d();
       }else {
          goto label_0087 ;
       }
       tc = this.c;
       a.o(tc, "isCoreAnchorTemp");
       this.b.b.s = tc.booleanValue();
       return;
    }
}
