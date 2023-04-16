package com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$f;
import erd.g;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController;
import java.lang.Object;
import java.lang.Long;
import com.kuaishou.live.core.show.wishlist.LiveWishListEntryAnimateController;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import nn2.v1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import nn2.a;
import msd.a;
import java.lang.Boolean;
import com.kuaishou.live.core.show.wishlist.LiveWishListEntryAnimateController$State;
import android.widget.ViewFlipper;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.Number;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCWishListOpened;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$WishListEntry;
import nn2.v;
import android.content.Context;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import androidx.core.view.ViewGroupKt$b;
import android.view.View;
import nn2.z1;
import java.util.List;
import androidx.transition.Transition;
import nn2.n1;
import androidx.transition.Transition$f;
import nn2.b;
import android.view.View$OnClickListener;
import e3.l;

public final class LiveAudienceWishListPendentController$f implements g	// class@0012c7
{
    public final LiveAudienceWishListPendentController b;

    public void LiveAudienceWishListPendentController$f(LiveAudienceWishListPendentController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       LiveAudienceWishListPendentController$f b;
       int i;
       LiveAudienceWishListPendentController$f uof1;
       object oobject;
       int i1;
       Object obj = this;
       LiveWishListEntryAnimateController liveWishList = LiveWishListEntryAnimateController.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, LiveAudienceWishListPendentController$f.class, str)) {
       }else if(obj.b.i().get() == null){
          b.Z(LiveLogTag.LIVE_WISH_PENDANT, "[LiveAudienceWishListPendantController][startExpandAnimateCountdownTimer]: mActivityRef.get\(\) == null, presenter可能已经执行过unbind");
       }else {
          a uoa = obj.b.q();
          if (uoa != null && !uoa.f()) {
             b.Z(LiveLogTag.LIVE_WISH_PENDANT, "[LiveAudienceWishListPendantController][startExpandAnimateCountdownTimer]: \(mWishListPendantController?.isShowingPendant == false, \x5f\x02\x61\x02\x53\x02\x6c\x02\x67\x02\x5c\x02\x79\x02\x00");
          }else if(obj.b.M.invoke().booleanValue()){
             LiveAudienceWishListPendentController$f uof = (obj.b.N().a == LiveWishListEntryAnimateController$State.INIT)? 1: null;
             if (uof) {
                ViewFlipper viewFlipper = obj.b.m();
                if (viewFlipper != null) {
                   ViewGroup viewGroup = obj.b.n();
                   if (viewGroup != null) {
                      b = obj.b;
                      Objects.requireNonNull(b);
                      Iterator obj1 = PatchProxy.apply(null, b, LiveAudienceWishListPendentController.class, "7");
                      if (obj1 != PatchProxyResult.class) {
                         i = obj1.intValue();
                      }else {
                         LiveStreamMessages$SCWishListOpened sCWishListOp1 = b.p();
                         if (sCWishListOp1 != null) {
                            sCWishListOp1 = sCWishListOp1.wishEntry;
                            a.o(sCWishListOp1, "it.wishEntry");
                            i1 = sCWishListOp1.length;
                            int i2 = 0;
                            int i3 = 0;
                            while (true) {
                               if (i3 < i1) {
                                  object oobject1 = sCWishListOp1[i3];
                                  int i4 = i2 + 1;
                                  if (oobject1.currentCount - oobject1.expectCount < 0) {
                                     i = i2;
                                  }else {
                                     i3 = i3 + 1;
                                     i2 = i4;
                                     LiveStreamMessages$WishListEntry wishListEntr = null;
                                  }
                               }
                            }
                         }
                         uof1 = -1;
                         i = -1;
                      label_00b2 :
                         uof1 = (i == uof1 || obj.b.y())? 1: null;
                         if (!uof1) {
                            viewFlipper.setDisplayedChild(i);
                            uof1 = obj.b;
                            LiveStreamMessages$SCWishListOpened sCWishListOp = uof1.p();
                            if (sCWishListOp != null) {
                               sCWishListOp = sCWishListOp.wishEntry;
                               if (sCWishListOp != null) {
                                  oobject = sCWishListOp[i];
                               label_00d7 :
                                  uof1.H = oobject;
                                  if (obj.b.H == null) {
                                     b.Z(LiveLogTag.LIVE_WISH_PENDANT, "unCompletedWishIndex wishEntry is null");
                                  }else {
                                     viewFlipper.stopFlipping();
                                     LiveWishListEntryAnimateController liveWishList1 = obj.b.N();
                                     v ov = new v(obj);
                                     Objects.requireNonNull(liveWishList1);
                                     if (!PatchProxy.applyVoidOneRefs(ov, liveWishList1, liveWishList, "4")) {
                                        a.p(ov, "listener");
                                        liveWishList1.h = ov;
                                     }
                                     liveWishList1 = obj.b.N();
                                     Context context = viewFlipper.getContext();
                                     a.o(context, "it.context");
                                     LiveAudienceWishListPendentController k = obj.b.K;
                                     Objects.requireNonNull(liveWishList1);
                                     if (!PatchProxy.applyVoidThreeRefs(context, viewGroup, k, liveWishList1, LiveWishListEntryAnimateController.class, "2")) {
                                        a.p(context, "context");
                                        a.p(viewGroup, "root");
                                        a.p(k, "expandViewClickListener");
                                        liveWishList1.g = viewGroup;
                                        Iterator iterator = ViewGroupKt.b(viewGroup).iterator();
                                        obj1 = iterator;
                                        while (obj1.hasNext()) {
                                           View view = obj1.next();
                                           if (view instanceof ViewFlipper) {
                                              liveWishList1.d = view;
                                           }else {
                                              continue ;
                                           }
                                        }
                                        LiveWishListEntryAnimateController l = liveWishList1.l;
                                        Objects.requireNonNull(l);
                                        if (!PatchProxy.applyVoidOneRefs(viewGroup, l, z1.class, str)) {
                                           a.p(viewGroup, "container");
                                           l.a();
                                           l.b = viewGroup;
                                           int childCount = viewGroup.getChildCount();
                                           for (i1 = 0; i1 < childCount; i1 = i1 + 1) {
                                              View childAt = viewGroup.getChildAt(i1);
                                              a.o(childAt, "container.getChildAt\(i\)");
                                              l.a.add(childAt);
                                           }
                                        }
                                        liveWishList1.a().a(new n1(liveWishList1));
                                        liveWishList1.c(context).a().setOnClickListener(k);
                                        l ol = PatchProxy.applyTwoRefs(context, viewGroup, liveWishList1, liveWishList, "9");
                                        if (ol != PatchProxyResult.class) {
                                        }else {
                                           ol = new l(viewGroup, liveWishList1.c(context).a());
                                        }
                                        liveWishList1.e(ol, liveWishList1.a());
                                     }
                                     b uob = obj.b.N().b();
                                     if (uob != null) {
                                        uob.b(obj.b.H);
                                     }
                                  }
                               }
                            }
                            oobject = null;
                            goto label_00d7 ;
                         }
                      }
                      uof1 = -1;
                      goto label_00b2 ;
                   }
                }
             }
          }
       }
       return;
    }
}
