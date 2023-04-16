package com.yxcorp.gifshow.v3.editor.sticker.tag.a$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.sticker.tag.a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.PopupWindow;
import com.yxcorp.utility.n;
import android.view.Window;
import android.view.View;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;
import android.widget.AbsoluteLayout;
import java.lang.Math;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public class a$b implements Observer	// class@0012b4
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       a$b tb;
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else if(p0.intValue() > 0){
          EditDecorationBaseDrawer topElement = this.b.r.getTopElement();
          if (EditStickerBaseDrawer.isTagSticker(topElement) && topElement.mIsSelected != null) {
             int i = 0;
             int i1 = 0x7f070313;
             if (this.b.getActivity() != null) {
                tb = this.b;
                a = tb.A;
                if (a != null && tb.p != null) {
                   if (a.getWidth() <= 0) {
                      tb = this.b;
                      tb.A.setWidth(n.k(tb.getActivity()));
                   }
                   tb = this.b;
                   tb.A.showAtLocation(tb.getActivity().getWindow().getDecorView(), 48, i, (p0.intValue() - a1.d(i1)));
                }
             }
             tb = this.b;
             int i2 = p0.intValue() - a1.d(i1);
             Objects.requireNonNull(tb);
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                Rect obj = PatchProxy.applyTwoRefs(topElement, Integer.valueOf(i2), tb, uoa, "8");
                if (obj != PatchProxyResult.class) {
                   i = obj.booleanValue();
                }else {
                label_009e :
                   tb.w = tb.z.getTranslationY();
                   obj = new Rect();
                   topElement.getGlobalVisibleRect(obj);
                   Rect rect = new Rect();
                   tb.r.getGlobalVisibleRect(rect);
                   i2 = Math.min((obj.bottom - i2), (rect.bottom - i2));
                   if (i2 > 0) {
                      Object[] objArray = new Object[i];
                      a.D().w("StickerInputPresenter", "movePreviewViewIfNeeded, mCachedPreviewTranslationY = "+tb.w+", offset = "+i2+", textDrawerLayoutOutRect = "+obj+",  containerViewOutRect = "+rect, objArray);
                      tb.S8(tb.z.getTranslationY(), (tb.z.getTranslationY() - (float)(i2 + a1.e(20.00f))));
                      i = true;
                   }
                }
             }else {
                goto label_009e ;
             }
             tb.v = i;
          }
       }else {
          this.b.P8();
          p0 = this.b.A;
          if (p0 != null && p0.isShowing()) {
             this.b.A.dismiss();
          }
       }
       return;
    }
}
