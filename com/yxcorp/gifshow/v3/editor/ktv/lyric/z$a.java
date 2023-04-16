package com.yxcorp.gifshow.v3.editor.ktv.lyric.z$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z;
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
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import mwc.p;
import com.yxcorp.gifshow.v3.f;
import aw9.z;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;

public class z$a implements EditDecorationContainerView$b	// class@000fea
{
    public final z a;

    public void z$a(z p0){
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
       z obj = PatchProxy.applyOneRefs(p0, this, z$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.O;
       boolean b = false;
       if (obj != null && obj.getKaraokeType() != 1) {
          if (EditDecorationContainerView.t0(p0, this.a.G.g(), (- f.I((long)p.a().c()))) && p0 instanceof EditTextBaseElement) {
             b = true;
          }
          return b;
       }else if(EditDecorationContainerView.s0(p0, this.a.G.g()) && p0 instanceof EditTextBaseElement){
          b = true;
       }
       return b;
    }
    public boolean e(EditDecorationBaseDrawer p0){
       return k.b(this, p0);
    }
    public boolean f(EditDecorationBaseDrawer p0){
       return k.c(this, p0);
    }
}
