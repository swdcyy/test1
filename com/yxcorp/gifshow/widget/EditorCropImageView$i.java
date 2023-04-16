package com.yxcorp.gifshow.widget.EditorCropImageView$i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class EditorCropImageView$i implements g	// class@00182a
{
    public static final EditorCropImageView$i b;

    static {
       EditorCropImageView$i.b = new EditorCropImageView$i();
    }
    public void EditorCropImageView$i(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorCropImageView$i.class, "1")) {
       }else {
          PostUtils.D("EditorCropImageView", "showResetButton error", p0);
       }
       return;
    }
}
