package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import q87.c;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import java.lang.Number;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import xld.a;
import java.lang.Integer;
import android.graphics.Rect;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import lwc.h;
import java.lang.Float;
import kotlin.collections.CollectionsKt__CollectionsKt;
import smd.d;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.StickerPictureUpdatePositionAction;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class StickerLongPictureSubViewBinder$a extends DecorationContainerView$e	// class@000ab6
{
    public final StickerLongPictureSubViewBinder a;

    public void StickerLongPictureSubViewBinder$a(StickerLongPictureSubViewBinder p0){
       this.a = p0;
       super();
    }
    public boolean r(BaseDrawer p0){
       return p0 instanceof NewEditStickerBaseDrawer;
    }
    public void y(BaseDrawer p0){
       Pair pair1;
       int i4;
       Rect rect1;
       int i7;
       Object[] objArray3;
       Object obj = this;
       Rect rect = p0;
       if (PatchProxy.applyVoidOneRefs(rect, obj, StickerLongPictureSubViewBinder$a.class, "1")) {
       }else {
          super.y(rect);
          if (rect != null) {
             String str = "LongPictureSubViewBinder";
             Log.b(str, "onSingleFingerMoveEnd: "+rect.getMoveX()+' '+rect.getMoveY());
             double d = (double)rect.getMoveY();
             if (d - null >= 0 && (d - 0x3ff0000000000000 > 0 && !rect instanceof NewTagStickerElement)) {
                StickerLongPictureSubViewBinder$a a = obj.a;
                Objects.requireNonNull(a);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                StickerLongPictureSubViewBinder stickerLongP = StickerLongPictureSubViewBinder.class;
                if (!PatchProxy.applyVoidOneRefs(rect, a, stickerLongP, "5")) {
                   int i = 0;
                   Object[] objArray = new Object[i];
                   a.D().w(str, "handleCrossPicture", objArray);
                   if (!rect.getIdentifyList().isEmpty()) {
                      Pair pair = PatchProxy.applyOneRefs(rect, a, stickerLongP, "9");
                      if (pair != patchProxyRe) {
                      }else {
                         List identifyList = rect.getIdentifyList();
                         a.o(identifyList, "identifyList");
                         pair = a.D(identifyList);
                      }
                      int i1 = pair.component1().intValue();
                      String str1 = pair.component2();
                      List list = a.c.o0().j();
                      if (i1 >= 0) {
                         float f = (float)i;
                         int i2 = 1;
                         if (rect.getMoveY() - f <= 0 || (i1 != (list.size() - i2) && (rect.getMoveY() - f >= 0 || i1))) {
                            if (PatchProxy.isSupport(stickerLongP)) {
                               pair1 = PatchProxy.applyTwoRefs(rect, Integer.valueOf(i1), a, stickerLongP, "6");
                               if (pair1 != patchProxyRe) {
                               }else {
                               label_00ec :
                                  Object[] objArray2 = new Object[i];
                                  a.D().w(str, "getCrossIndexAndMoveY: ", objArray2);
                                  BaseDrawer mEditRect = rect.mEditRect;
                                  String str3 = ", moveDistance: ";
                                  String str4 = "getCrossIndexAndMoveY: newIndex: ";
                                  int i6 = 0;
                                  if (rect.getMoveY() - f > 0) {
                                     objArray2 = new Object[i];
                                     a.D().w(str, "getCrossIndexAndMoveY: moveY > 0", objArray2);
                                     i = a.c.o0().j().size();
                                     f = (rect.getMoveY() - (float)i2) * (float)mEditRect.height();
                                     i7 = i1;
                                     i4 = i - 1;
                                     while (i7 < i4) {
                                        i7 = i7 + 1;
                                        float f4 = (float)a.G(a.d.u0(i7)).c;
                                        if (f - i6 >= 0 && (f - f4 <= 0 || i7 == i4)) {
                                           break ;
                                        }
                                        f = f - f4;
                                        StickerLongPictureSubViewBinder stickerLongP1 = 1;
                                     }
                                     objArray3 = new Object[0];
                                     a.D().w(str, str4+i7+str3+f, objArray3);
                                     pair1 = new Pair(Integer.valueOf(i7), Float.valueOf((f / (float)a.G(a.d.u0(i7)).c)));
                                  }else {
                                     float f5 = (- rect.getMoveY()) * (float)mEditRect.height();
                                     i7 = i1;
                                     while (i7 > 0) {
                                        i7 = i7 - 1;
                                        f = (float)a.G(a.d.u0(i7)).c;
                                        if (f5 - i6 >= 0 && (f5 - f <= 0 || !i7)) {
                                           break ;
                                        }
                                        f5 = f5 - f;
                                     }
                                     objArray3 = new Object[0];
                                     a.D().w(str, str4+i7+str3+f5, objArray3);
                                     pair1 = new Pair(Integer.valueOf(i7), Float.valueOf(((float)1 - (f5 / (float)a.G(a.d.u0(i7)).c))));
                                  }
                               }
                            }else {
                               goto label_00ec ;
                            }
                            i = pair1.component1().intValue();
                            float f1 = pair1.component2().floatValue();
                            Log.b(str, "newIndex: "+i+", oldIndex: "+i1+", newMoveY: "+f1);
                            rect.setAssetProportion(((a.d.p0(i) * (float)a.d.v0(i).b) / (float)a.G(a.d.v0(i)).b));
                            float f2 = rect.getAssetProportion() / rect.getAssetProportion();
                            String str2 = list.get(i);
                            String[] stringArray = new String[]{str2};
                            List list1 = CollectionsKt__CollectionsKt.P(stringArray);
                            str2 = a.E(str2, a.c);
                            if (str2 != null) {
                               i2 = (str2.length() > 0)? 1: 0;
                               if (i2) {
                                  list1.add(str2);
                               }
                            }
                            Log.b(str, "oldIdentify: "+str1+" newIdentify: "+list1);
                            if (!PatchProxy.isSupport(stickerLongP) || !PatchProxy.applyVoidTwoRefs(rect, Integer.valueOf(i), a, stickerLongP, "11")) {
                               int i3 = 0;
                               for (i4 = 0; i4 < i; i4 = i4 + 1) {
                                  i3 = i3 + a.G(a.d.u0(i4)).c;
                               }
                               StickerLongPictureSubViewBinder obj1 = PatchProxy.apply(null, a, stickerLongP, "13");
                               if (obj1 != patchProxyRe) {
                                  i4 = obj1.intValue();
                               }else {
                                  obj1 = a.g;
                                  a.o(obj1, "mPictureRV");
                                  RecyclerView$LayoutManager layoutManage = obj1.getLayoutManager();
                                  Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                  int i5 = layoutManage.i0();
                                  View view = layoutManage.findViewByPosition(i5);
                                  if (view != null) {
                                     a.o(view, "layoutManager.findViewBy\x20\x02iblePosition\) ?: return 0\x00");
                                     float f3 = - view.getY();
                                     for (i4 = 0; i4 < i5; i4 = i4 + 1) {
                                        f3 = f3 + (float)a.G(a.d.u0(i4)).c;
                                     }
                                     i4 = (int)f3;
                                  }else {
                                     i4 = 0;
                                  }
                               }
                               rect.setAdditionOffsetY((i3 - i4));
                               if (PatchProxy.isSupport(stickerLongP)) {
                                  rect1 = PatchProxy.applyOneRefs(Integer.valueOf(i), a, stickerLongP, "12");
                                  if (rect1 != patchProxyRe) {
                                     i = 0;
                                  label_0341 :
                                     rect.mEditRect = rect1;
                                     Object[] objArray1 = new Object[i];
                                     a.D().w(str, "updateElementByIndex: "+rect, objArray1);
                                  }
                               }
                               Size size = a.G(a.d.u0(i));
                               i = 0;
                               rect1 = new Rect(i, i, size.b, size.c);
                               goto label_0341 ;
                            }
                            StickerPictureUpdatePositionAction stickerPictu = new StickerPictureUpdatePositionAction(rect.getLayerIndex(), rect.getMoveX(), f1, f2, list1);
                            a.c.t0(str);
                         }
                      }
                   }
                }
             label_0372 :
                obj.a.e.C0(rect);
             }
          }
       }
       return;
    }
}
