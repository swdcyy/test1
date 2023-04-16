package com.yxcorp.gifshow.v3.editor.sticker.p0$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.sticker.p0;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.view.MotionEvent;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class p0$b extends DecorationContainerView$e	// class@00127d
{
    public final p0 a;

    public void p0$b(p0 p0){
       this.a = p0;
       super();
    }
    public void k(BaseDrawer p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p0$b.class, "1")) {
       }else {
          super.k(p0, p1);
          this.a.R8();
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0$b.class, "2")) {
       }else {
          super.p(p0);
          this.a.R8();
       }
       return;
    }
    public boolean r(BaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p0$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = p0 instanceof EditStickerBaseDrawer;
       if (!b) {
          this.a.R8();
       }
       return b;
    }
}
