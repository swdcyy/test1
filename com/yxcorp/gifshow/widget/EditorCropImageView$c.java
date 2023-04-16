package com.yxcorp.gifshow.widget.EditorCropImageView$c;
import kxa.e;
import com.yxcorp.gifshow.widget.EditorCropImageView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import android.view.View;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.CropSelectionBoxView;
import com.yxcorp.gifshow.widget.EditorCropImageView$e;

public final class EditorCropImageView$c implements e	// class@001824
{
    public final EditorCropImageView a;

    public void EditorCropImageView$c(EditorCropImageView p0){
       this.a = p0;
       super();
    }
    public void b(float p0,float p1){
       if (PatchProxy.isSupport(EditorCropImageView$c.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, EditorCropImageView$c.class, "1")) {
          return;
       }
       this.a.e.invalidate();
       this.a.k(false, false);
       return;
    }
    public void c(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(EditorCropImageView$c.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, EditorCropImageView$c.class, "3")) {
          return;
       }
       this.a.e.invalidate();
       return;
    }
    public void f(boolean p0){
       EditorCropImageView$c uoc = EditorCropImageView$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       if (!p0) {
          this.a.e.k(false);
          this.a.g();
          EditorCropImageView j = this.a.j;
          if (j != null) {
             j.f();
          }
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, EditorCropImageView$c.class, "5")) {
          return;
       }
       this.a.e.k(false);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, EditorCropImageView$c.class, "4")) {
          return;
       }
       this.a.e.k(false);
       this.a.g();
       EditorCropImageView j = this.a.j;
       if (j != null) {
          j.f();
       }
       return;
    }
}
