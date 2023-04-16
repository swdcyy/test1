package ond.d$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import ond.d;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.List;
import kotlin.Pair;
import java.lang.Number;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.c;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import xld.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Rect;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import lwc.h;
import java.lang.Float;
import kotlin.collections.CollectionsKt__CollectionsKt;
import und.l;
import com.yxcrop.gifshow.v3.editor.text_v2.action.pic.PictureUpdatePositionAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import wnd.b;
import kotlin.jvm.internal.a;
import wnd.a;
import java.lang.Runnable;
import ekd.k1;

public final class d$a extends DecorationContainerView$e	// class@002026
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void t(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "1")) {
       }else {
          super.t(p0, p1);
          if (p0 != null) {
             p1 = this.a;
             Objects.requireNonNull(p1);
             if (!PatchProxy.applyVoidOneRefs(p0, p1, d.class, "12") && !p0.getIdentifyList().isEmpty()) {
                int i = p1.E(p0).component1().intValue();
                if (i >= 0) {
                   p1.L(p0, i);
                }
             }
             this.a.e.C0(p0);
          }
       }
       return;
    }
    public void y(BaseDrawer p0){
       Pair pair1;
       int i2;
       int i3;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
       }else {
          super.y(p0);
          if (p0 != null) {
             String str = "LongPictureSubViewBinder";
             Log.b(str, "onSingleFingerMoveEnd: "+p0.getMoveX()+' '+p0.getMoveY());
             double d = (double)p0.getMoveY();
             if (d - null >= 0 && d - 0x3ff0000000000000 <= 0) {
                DecorationMoveEndAction uDecorationM = new DecorationMoveEndAction(p0.getLayerIndex(), false, p0.isSticker(), p0.getMoveX(), p0.getMoveY(), this.a.c.o0().w());
                this.a.c.t0(v8);
             }else if(p0 instanceof NewEditTextBaseElement){
                d$a ta = this.a;
                Objects.requireNonNull(ta);
                d uod = d.class;
                if (!PatchProxy.applyVoidOneRefs(p0, ta, uod, "8")) {
                   Log.b(str, "handleCrossPicture");
                   if (!p0.getIdentifyList().isEmpty()) {
                      Pair pair = ta.E(p0);
                      int i = pair.component1().intValue();
                      String str1 = pair.component2();
                      List list = ta.c.o0().j();
                      if (i >= 0) {
                         int i1 = 0;
                         float f = (float)i1;
                         if (p0.getMoveY() - f <= 0 || (i != (list.size() - 1) && (p0.getMoveY() - f >= 0 || i))) {
                            if (PatchProxy.isSupport(uod)) {
                               pair1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(i), ta, uod, "9");
                               if (pair1 != PatchProxyResult.class) {
                               }else {
                               label_00fa :
                                  BaseDrawer mEditRect = p0.mEditRect;
                                  Integer integer = null;
                                  if (p0.getMoveY() - f > 0) {
                                     i2 = ta.c.o0().j().size();
                                     f = (p0.getMoveY() - (float)1) * (float)mEditRect.height();
                                     i3 = i;
                                     int i4 = i2 - 1;
                                     while (i3 < i4) {
                                        i3 = i3 + 1;
                                        float f2 = (float)ta.I(ta.d.u0(i3)).c;
                                        if (f - integer >= 0 && (f - f2 <= 0 || i3 == i4)) {
                                           break ;
                                        }
                                        f = f - f2;
                                     }
                                     pair1 = new Pair(Integer.valueOf(i3), Float.valueOf((f / (float)ta.I(ta.d.u0(i3)).c)));
                                  }else {
                                     float f3 = (- p0.getMoveY()) * (float)mEditRect.height();
                                     i3 = i;
                                     while (i3 > 0) {
                                        i3 = i3 - 1;
                                        f = (float)ta.I(ta.d.u0(i3)).c;
                                        if (f3 - integer >= 0 && (f3 - f <= 0 || !i3)) {
                                           break ;
                                        }
                                        f3 = f3 - f;
                                     }
                                     pair1 = new Pair(Integer.valueOf(i3), Float.valueOf(((float)1 - (f3 / (float)ta.I(ta.d.u0(i3)).c))));
                                  }
                               }
                            }else {
                               goto label_00fa ;
                            }
                            i2 = pair1.component1().intValue();
                            float f1 = pair1.component2().floatValue();
                            Log.b(str, "newIndex: "+i2+", oldIndex: "+i+", newMoveY: "+f1);
                            p0.setAssetProportion(((ta.d.p0(i2) * (float)ta.d.v0(i2).b) / (float)ta.I(ta.d.v0(i2)).b));
                            String str2 = list.get(i2);
                            String[] stringArray = new String[]{str2};
                            list = CollectionsKt__CollectionsKt.P(stringArray);
                            str2 = ta.G(str2, ta.c);
                            if (str2 != null) {
                               if (str2.length() > 0) {
                                  i1 = 1;
                               }
                               if (i1) {
                                  list.add(str2);
                               }
                            }
                            Log.b(str, "oldIdentify: "+str1+" newIdentify: "+list);
                            ta.L(p0, i2);
                            ta.c.t0(new PictureUpdatePositionAction(p0.getLayerIndex(), p0.getMoveX(), f1, list));
                         }
                      }
                   }
                }
                this.a.e.C0(p0);
                if (p0 instanceof NewEditTextElement) {
                   d c = this.a.c;
                   if (!PatchProxy.applyVoidTwoRefs(p0, c, null, b.class, "7")) {
                      a.p(p0, "element");
                      a.p(c, "viewModel");
                      p0.checkNeedGenerateFile();
                      p0.generateDecorationBitmap();
                      k1.r(new a(c, p0), 0);
                   }
                }
             }
          }
       }
       return;
    }
}
