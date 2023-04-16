package com.yxcorp.gifshow.widget.EditorCropImageView$d;
import kxa.g;
import com.yxcorp.gifshow.widget.EditorCropImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.EditorCropImageView$e;
import java.lang.Float;
import android.view.View;

public final class EditorCropImageView$d implements g	// class@001825
{
    public final EditorCropImageView a;

    public void EditorCropImageView$d(EditorCropImageView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, EditorCropImageView$d.class, "2")) {
          return;
       }
       this.a.g();
       EditorCropImageView j = this.a.j;
       if (j != null) {
          j.a();
       }
       return;
    }
    public void b(float p0,float p1,float p2){
       if (PatchProxy.isSupport(EditorCropImageView$d.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, EditorCropImageView$d.class, "1")) {
          return;
       }
       this.a.e.invalidate();
       return;
    }
}
