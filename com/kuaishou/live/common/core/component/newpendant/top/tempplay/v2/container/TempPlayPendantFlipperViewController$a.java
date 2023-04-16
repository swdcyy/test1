package com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantFlipperViewController;
import java.lang.Object;
import gv1.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantViewFlipper;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ls5.a;
import java.util.Set;
import java.lang.Integer;
import java.lang.Boolean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.widget.ViewFlipper;
import java.lang.Number;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewParent;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import android.view.animation.Animation;
import com.kuaishou.android.live.log.LiveLogTag;
import trd.u;
import java.lang.CharSequence;
import msd.l;
import pp.c;
import com.kuaishou.android.live.log.b;
import gv1.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import ev1.a;

public final class TempPlayPendantFlipperViewController$a implements Observer	// class@0016d5
{
    public final TempPlayPendantFlipperViewController b;

    public void TempPlayPendantFlipperViewController$a(TempPlayPendantFlipperViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       Iterator iterator;
       int b;
       Object[] obj;
       Pair pair1;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, TempPlayPendantFlipperViewController$a.class, str)) {
       }else {
          TempPlayPendantViewFlipper tempPlayPend = TempPlayPendantFlipperViewController.V2(this.b);
          List list = p0.a();
          Objects.requireNonNull(tempPlayPend);
          if (!PatchProxy.applyVoidOneRefs(list, tempPlayPend, TempPlayPendantViewFlipper.class, "2")) {
             a.p(list, "pendantItemList");
             Pair pair = PatchProxy.applyOneRefs(list, tempPlayPend, TempPlayPendantViewFlipper.class, "3");
             Object[] objArray = null;
             int i = 0;
             if (pair != PatchProxyResult.class) {
             }else {
                ArrayList uArrayList1 = new ArrayList();
                Iterator iterator1 = list.iterator();
                while (iterator1.hasNext()) {
                   obj = iterator1.next();
                   int i2 = tempPlayPend.g.contains(obj) ^ true;
                   if (i2) {
                      uArrayList1.add(obj);
                   }
                }
                if (uArrayList1.isEmpty() ^ true) {
                   iterator1 = uArrayList1.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         obj = iterator1.next();
                         if (!tempPlayPend.i.contains(obj.getId())) {
                            continue ;
                         }
                      }else {
                         obj = objArray;
                      }
                      if (obj != null) {
                         tempPlayPend.stopFlipping();
                         pair = new Pair(Integer.valueOf(list.indexOf(obj)), Boolean.FALSE);
                      }else {
                         pair1 = new Pair(Integer.valueOf(list.indexOf(CollectionsKt___CollectionsKt.m2(uArrayList1))), Boolean.TRUE);
                      }
                   }
                }else {
                   a uoa = CollectionsKt___CollectionsKt.F2(tempPlayPend.g, tempPlayPend.getDisplayedChild());
                   if (uoa != null) {
                      b = list.indexOf(uoa);
                      if (b == -1) {
                         b = (tempPlayPend.getDisplayedChild() >= list.size())? 0: tempPlayPend.getDisplayedChild();
                         pair1 = new Pair(Integer.valueOf(b), Boolean.TRUE);
                      }else {
                         pair1 = new Pair(Integer.valueOf(b), Boolean.FALSE);
                      }
                   }else {
                      pair = new Pair(Integer.valueOf(i), Boolean.TRUE);
                   }
                }
                pair = pair1;
             }
             int i1 = pair.component1().intValue();
             b = pair.component2().booleanValue();
             tempPlayPend.g = list;
             if (b || list.size() <= 1) {
                tempPlayPend.stopFlipping();
             }
             if (!PatchProxy.applyVoid(objArray, tempPlayPend, TempPlayPendantViewFlipper.class, "6")) {
                tempPlayPend.removeAllViews();
                iterator = tempPlayPend.g.iterator();
                while (iterator.hasNext()) {
                   View view = iterator.next().b(tempPlayPend);
                   if (view.getParent() instanceof ViewGroup) {
                      ViewParent parent = view.getParent();
                      Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                      parent.removeView(view);
                   }
                   b.e(view, i, i);
                   float f = 0x3f800000;
                   view.setAlpha(f);
                   view.setScaleX(f);
                   view.setScaleY(f);
                   view.setVisibility(i);
                   tempPlayPend.addView(view);
                }
             }
             if (b && tempPlayPend.g.size() > 1) {
                tempPlayPend.startFlipping();
             }
             tempPlayPend.setInAnimation(objArray);
             tempPlayPend.setOutAnimation(objArray);
             tempPlayPend.setDisplayedChild(i1);
          }
          LiveLogTag lIVE_TOP_PEN = LiveLogTag.LIVE_TOP_PENDANT;
          list = p0.a();
          ArrayList uArrayList = new ArrayList(u.Y(list, 10));
          iterator = list.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getId());
          }
          b.c0(lIVE_TOP_PEN, "LiveTempPlayPendantController.updatePendantItems", "bizType list", CollectionsKt___CollectionsKt.V2(uArrayList, ";", null, null, 0, null, null, 62, null));
          TempPlayPendantFlipperViewController j = this.b.j;
          p0 = p0.a();
          Objects.requireNonNull(j);
          if (!PatchProxy.applyVoidOneRefs(p0, j, h.class, str)) {
             a.p(p0, "pendantList");
             if (j.a == null && p0.size() > 1) {
                a.b(j.c.a(), p0.size());
                b.c0(LiveLogTag.LIVE_TOP_PENDANT, "LiveTempPlayPendantController TempPlayPendantViewFlipperLogger logPendantShow", "pendant_num", Integer.valueOf(p0.size()));
                j.a = true;
             }
             j.b = p0;
          }
       }
       return;
    }
}
