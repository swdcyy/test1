package com.yxcorp.gifshow.v3.editor.sticker.c1$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.sticker.c1;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import wpc.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.sticker.e;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import aw9.z;
import itc.k3;
import a17.b$b;
import a17.b$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;

public class c1$a implements EditDecorationContainerView$b	// class@00121b
{
    public final c1 a;

    public void c1$a(c1 p0){
       this.a = p0;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       return k.a(this, p0);
    }
    public boolean b(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c1$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = k3.f(p0.getLayerIndex(), this.a.C.i());
       boolean b = (uAnimatedSub != null && uAnimatedSub.renderType())? true: false;
       return b;
    }
    public void c(b$b p0,b$a p1){
       k.d(this, p0, p1);
    }
    public boolean d(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c1$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (EditDecorationContainerView.s0(p0, this.a.C.g()) && p0 instanceof EditStickerBaseDrawer)? true: false;
       return b;
    }
    public boolean e(EditDecorationBaseDrawer p0){
       return k.b(this, p0);
    }
    public boolean f(EditDecorationBaseDrawer p0){
       return k.c(this, p0);
    }
}
