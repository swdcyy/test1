package com.yxcorp.gifshow.v3.editor.cover.q0$h;
import com.yxcorp.gifshow.v3.widget.g$b;
import com.yxcorp.gifshow.v3.editor.cover.q0;
import java.lang.Object;
import x59.g;
import com.kuaishou.edit.draft.AssetSegment;
import vba.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vba.h;

public class q0$h implements g$b	// class@000ec2
{
    public final q0 a;

    public void q0$h(q0 p0){
       this.a = p0;
       super();
    }
    public g a(){
       return this.a.f1;
    }
    public g b(AssetSegment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q0$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.V0.f(p0);
    }
}
