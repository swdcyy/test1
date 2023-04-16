package com.yxcorp.gifshow.v3.editor.sticker.tag.a$c;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.sticker.tag.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.MotionEvent;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;

public class a$c extends DecorationContainerView$e	// class@0012b5
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void d(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$c.class, "2")) {
       }else {
          super.d(p0, p1);
          this.a.P8();
       }
       return;
    }
    public void h(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "4")) {
       }else {
          super.h(p0);
          p0.setAcceptTouchEvent(true);
       }
       return;
    }
    public void k(BaseDrawer p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$c.class, "3")) {
       }else {
          super.k(p0, p1);
          this.a.P8();
       }
       return;
    }
    public void l(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "6")) {
       }else {
          super.l(p0);
          p0.setAcceptTouchEvent(false);
          a$c ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "12") && (p0 instanceof EditTagStickerElement && (p0.getContent()).isEmpty())) {
             ta.r.g0(p0);
          }
       label_003a :
          this.a.P8();
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "7")) {
       }else {
          super.p(p0);
          p0.sendCancelEvent();
          p0.setAcceptTouchEvent(false);
          this.a.P8();
       }
       return;
    }
    public boolean r(BaseDrawer p0){
       return p0 instanceof EditStickerBaseDrawer;
    }
    public void t(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$c.class, "1")) {
       }else {
          super.t(p0, p1);
          this.a.V8(true, p0);
       }
       return;
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "5")) {
       }else {
          super.v(p0);
          this.a.V8(false, p0);
       }
       return;
    }
    public void y(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "8")) {
       }else {
          super.y(p0);
          p0.setAcceptTouchEvent(true);
       }
       return;
    }
}
