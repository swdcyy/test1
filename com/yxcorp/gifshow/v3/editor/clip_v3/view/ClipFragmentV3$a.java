package com.yxcorp.gifshow.v3.editor.clip_v3.view.ClipFragmentV3$a;
import voc.y;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.ClipFragmentV3;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import opc.f;
import com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.RefreshTimelineAction;
import xvc.b;

public final class ClipFragmentV3$a implements y	// class@000e10
{
    public final ClipFragmentV3 b;

    public void ClipFragmentV3$a(ClipFragmentV3 p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       x.a(this);
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       x.j(this);
    }
    public void z2(){
       if (PatchProxy.applyVoid(null, this, ClipFragmentV3$a.class, "1")) {
          return;
       }
       x.c(this);
       ClipFragmentV3.yh(this.b).t0(new RefreshTimelineAction());
       return;
    }
}
