package com.yxcorp.gifshow.v3.editor.text.b1$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.text.b1;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import wpc.k;
import a17.b$b;
import a17.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a17.c$a;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import java.util.List;
import java.util.Collections;
import huc.c1;
import huc.b1;
import a17.f;
import com.yxcorp.gifshow.v3.editor.text.b1$a$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import aw9.z;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import huc.b0;

public class b1$a implements EditDecorationContainerView$b	// class@0013a9
{
    public final b1 a;

    public void b1$a(b1 p0){
       this.a = p0;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       return k.a(this, p0);
    }
    public boolean b(EditDecorationBaseDrawer p0){
       return true;
    }
    public void c(b$b p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b1$a.class, "3")) {
          return;
       }
       if (this.a.getActivity() != null) {
          c$a uoa = new c$a(this.a.getActivity());
          uoa.l0(R.string.arg_RES_7f100cb6);
          uoa.j0(Collections.singletonList(new g(a1.p(R.string.arg_RES_7f100b5b), SheetItemStatus.Primary)));
          uoa.g0(R.string.cancel);
          uoa.i0(new c1(p0));
          uoa.d0(new b1(p1));
          f.a(uoa).Y(new b1$a$a(this));
       }
       return;
    }
    public boolean d(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b1$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.a.S8()) {
          if ((double)Math.round(p0.getStartTime()) - this.a.z.g() || !p0 instanceof EditTextBaseElement) {
             b = false;
          }
          return b;
       }else if(EditDecorationContainerView.s0(p0, this.a.z.g()) && p0 instanceof EditTextBaseElement){
          b = false;
       }
       return b;
    }
    public boolean e(EditDecorationBaseDrawer p0){
       return k.b(this, p0);
    }
    public boolean f(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b1$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof EditTextBaseElement) {
          return false;
       }
       if (p0.getEditTextBaseElementData().y0()) {
          return false;
       }
       return this.a.S.h(p0.getDecorationId());
    }
}
