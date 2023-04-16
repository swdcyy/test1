package com.yxcorp.gifshow.widget.EditorCropImageView$h;
import erd.g;
import com.yxcorp.gifshow.widget.EditorCropImageView;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;

public final class EditorCropImageView$h implements g	// class@001829
{
    public final EditorCropImageView b;
    public final boolean c;
    public final boolean d;

    public void EditorCropImageView$h(EditorCropImageView p0,boolean p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorCropImageView$h.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("EditorCropImageView", "showResetButton subscribe", objArray);
          this.b.l(this.c, this.d);
       }
       return;
    }
}
