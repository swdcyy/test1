package com.yxcorp.gifshow.prettify.makeup.y$a;
import f1c.d;
import com.yxcorp.gifshow.prettify.makeup.y;
import java.lang.Object;
import com.yxcorp.gifshow.prettify.makeup.MakeupFragment;
import p0c.f;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import n1c.l;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import com.yxcorp.gifshow.prettify.makeup.l;
import com.yxcorp.gifshow.prettify.makeup.b0;
import android.view.ViewGroup;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$a;

public class y$a implements d	// class@0011a0
{
    public final y a;

    public void y$a(y p0){
       this.a = p0;
       super();
    }
    public MakeupFragment a(){
       return this.a.p;
    }
    public f b(){
       return this.a.q;
    }
    public View c(){
       return this.a.A;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, y$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.q.a();
    }
    public l e(){
       return this.a.G;
    }
    public void f(MakeupMaterial p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$a.class, "1")) {
          return;
       }
       if (!this.a.q.a()) {
          this.a.c9(p0);
       }
       return;
    }
    public View g(){
       return this.a.A;
    }
    public l h(){
       return this.a.E;
    }
    public b0 i(){
       return this.a.D;
    }
    public ViewGroup j(){
       return this.a.R;
    }
    public boolean k(){
       return this.a.K;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, y$a.class, "2")) {
          return;
       }
       this.a.V8(false);
       return;
    }
    public View m(){
       return this.a.H;
    }
    public PrettifyConfigView n(){
       return this.a.B;
    }
    public View o(){
       return this.a.z;
    }
    public MakeupGroup$a p(){
       Object obj = PatchProxy.apply(null, this, y$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.S8();
    }
}
