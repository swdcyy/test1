package com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder$a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import mtc.b;
import java.lang.Enum;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.a;
import erd.r;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ktc.b;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import mtc.a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import kotlin.Pair;
import java.lang.StringBuilder;
import java.lang.Number;

public final class StickerElementViewBinder$a implements Observer	// class@001232
{
    public final StickerElementViewBinder b;

    public void StickerElementViewBinder$a(StickerElementViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       boolean b;
       Object[] objArray;
       StickerElementViewBinder$a tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerElementViewBinder$a.class, "1")) {
       }else {
          int i = p0.b();
          ListHolder$UpdateType updateType = p0.e();
          if (updateType != null) {
             int i1 = b.a[updateType.ordinal()];
             String str = "StickerElementViewBinder";
             int i2 = 0;
             b = true;
             if (i1 != b) {
                if (i1 != 2) {
                   if (i1 != 3) {
                      if (i1 == 4) {
                         objArray = new Object[i2];
                         a.D().w(str, "CHANGE_ALL", objArray);
                         EditDecorationContainerView uEditDecorat = this.b.E();
                         Objects.requireNonNull(uEditDecorat, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView<*, *>");
                         uEditDecorat.f0(a.b, p0.d());
                         Iterator iterator = p0.c().iterator();
                         while (iterator.hasNext()) {
                            EditStickerBaseDrawer uEditSticker = this.b.D(iterator.next(), b);
                            if (uEditSticker != null) {
                               if (a.g(p0.d(), Integer.valueOf(9)) && uEditSticker instanceof EditTagStickerElement) {
                                  tb = this.b;
                                  tb.e = b;
                                  tb.E().getViewTreeObserver().addOnPreDrawListener(new a(uEditSticker, uEditSticker, this, p0));
                               }else {
                                  tb = this.b;
                                  if (tb.e == null || !uEditSticker instanceof EditTagStickerElement) {
                                     tb.E().b0(uEditSticker, p0.d(), b);
                                  }
                               }
                            }
                         }
                         this.b.E().e0();
                      }
                   }else {
                      EditStickerBaseDrawer uEditSticker1 = this.b.D(p0.c().get(i), i2);
                      if (uEditSticker1 != null) {
                         this.b.E().Z(uEditSticker1, p0.d());
                         this.b.E().e0();
                      }
                   }
                }else {
                   p0 = p0.d();
                   Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, kotlin.Int>");
                   Object[] objArray1 = new Object[i2];
                   a.D().w(str, "REMOVE payload:"+p0, objArray1);
                   if (p0.getFirst().intValue() != 5) {
                      this.b.E().j0(p0.getSecond().intValue(), p0.getFirst());
                   }
                }
             }else {
                objArray = new Object[i2];
                a.D().w(str, "CHANGE editStickerUiData:"+p0.c().get(i), objArray);
             }
          }
       }
       return;
    }
}
