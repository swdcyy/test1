package com.yxcorp.gifshow.v3.editor.sticker.y0$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.sticker.y0;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import wpc.k;
import a17.b$b;
import a17.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.sticker.e;
import aw9.z;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;

public class y0$a implements EditDecorationContainerView$b	// class@0012ef
{
    public final y0 a;

    public void y0$a(y0 p0){
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
       k.d(this, p0, p1);
    }
    public boolean d(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!(double)Math.round(p0.getStartTime()) - this.a.C.g() && p0 instanceof EditStickerBaseDrawer)? true: false;
       return b;
    }
    public boolean e(EditDecorationBaseDrawer p0){
       return k.b(this, p0);
    }
    public boolean f(EditDecorationBaseDrawer p0){
       return k.c(this, p0);
    }
}
