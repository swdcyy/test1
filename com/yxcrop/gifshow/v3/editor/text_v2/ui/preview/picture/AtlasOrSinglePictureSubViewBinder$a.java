package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import und.l;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.a;
import android.view.ViewGroup;
import wnd.d;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Integer;
import android.view.View;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.pic.PictureFakeView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$h;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;
import xld.c;
import xvc.b;

public final class AtlasOrSinglePictureSubViewBinder$a extends DecorationContainerView$e	// class@000b36
{
    public final AtlasOrSinglePictureSubViewBinder a;

    public void AtlasOrSinglePictureSubViewBinder$a(AtlasOrSinglePictureSubViewBinder p0){
       this.a = p0;
       super();
    }
    public final void A(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$a.class, "11")) {
          return;
       }
       this.a.M();
       if (p0 != null && (p0 instanceof NewEditTextBaseElement && this.a.F().o0().o() < 0)) {
          d.d(p0, this.a.D(), this.a.I(), this.a.J());
       }
    label_003d :
       return;
    }
    public void b(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$a.class, "8")) {
       }else {
          super.b(p0);
          this.z(p0);
       }
       return;
    }
    public void c(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$a.class, "7")) {
       }else {
          super.c(p0);
          this.A(p0);
       }
       return;
    }
    public void d(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AtlasOrSinglePictureSubViewBinder$a.class, "6")) {
       }else {
          super.d(p0, p1);
          if (p0 != null) {
             p1 = this.a.D();
             boolean b = this.a.I();
             boolean b1 = this.a.J();
             if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(b), Boolean.valueOf(b1), null, d.class, "3")) {
                a.p(p0, "element");
                if (!b && !b1) {
                   Log.b("FakeViewUtil", "deleteFakeView: "+p0.getLayerIndex());
                   int layerIndex = p0.getLayerIndex();
                   PictureFakeView pictureFakeV = (p1 != null)? p1.findViewWithTag(Integer.valueOf(layerIndex)): null;
                   if (pictureFakeV != null) {
                      p1.removeView(pictureFakeV);
                   }
                }
             }
          }
       }
       return;
    }
    public void h(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$a.class, "2")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.h(p0);
          d.d(p0, this.a.D(), this.a.I(), this.a.J());
          this.a.i.R();
       }
       return;
    }
    public void i(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$a.class, "9")) {
       }else {
          super.i(p0);
          this.A(p0);
       }
       return;
    }
    public void l(BaseDrawer p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, AtlasOrSinglePictureSubViewBinder$a.class, "3")) {
       }else {
          super.l(obj);
          if (obj != null) {
             d.b(obj, this.a.D(), false, this.a.I(), this.a.J(), 4, null);
          }
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$a.class, "4")) {
       }else {
          super.p(p0);
          this.a.M();
          if (p0 != null && (p0 instanceof NewEditTextBaseElement && this.a.F().o0().o() < 0)) {
             d.d(p0, this.a.D(), this.a.I(), this.a.J());
          }
       }
       return;
    }
    public void t(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AtlasOrSinglePictureSubViewBinder$a.class, "1")) {
       }else {
          super.t(p0, p1);
          this.a.M();
          if (p0 != null && (this.a.o.d(p0) && p0.isInitFromDraft())) {
             d.a(p0, this.a.D(), true, this.a.I(), this.a.J());
          }
       }
       return;
    }
    public void x(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$a.class, "10")) {
       }else {
          super.x(p0);
          this.z(p0);
       }
       return;
    }
    public void y(BaseDrawer p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, AtlasOrSinglePictureSubViewBinder$a.class, "5")) {
       }else {
          super.y(obj);
          if (obj != null) {
             DecorationMoveEndAction uDecorationM = new DecorationMoveEndAction(obj.getLayerIndex(), false, false, obj.getMoveX(), obj.getMoveY(), this.a.F().o0().w());
             this.a.F().t0(v8);
             if (obj instanceof NewEditTextBaseElement && this.a.F().o0().o() < 0) {
                d.b(obj, this.a.D(), false, this.a.I(), this.a.J(), 4, null);
             }
          }
       }
       return;
    }
    public final void z(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$a.class, "12")) {
          return;
       }
       if (p0 != null && (p0 instanceof NewEditTextBaseElement && this.a.F().o0().o() < 0)) {
          d.b(p0, this.a.D(), false, this.a.I(), this.a.J(), 4, null);
       }
    label_003c :
       return;
    }
}
