package com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$c;
import t4b.l$b$a;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import t4b.k;
import com.yxcorp.gifshow.camera.record.base.d;
import ce9.l;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import r5b.e;

public final class MagicMultiInputTextController$c implements l$b$a	// class@000e3d
{
    public final MagicMultiInputTextController a;

    public void MagicMultiInputTextController$c(MagicMultiInputTextController p0){
       this.a = p0;
       super();
    }
    public void a(List p0,List p1){
       l a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicMultiInputTextController$c.class, "1")) {
          return;
       }
       a.p(p0, "showList");
       a.p(p1, "extendList");
       MagicMultiInputTextController n = this.a.n;
       if (n != null) {
          n.g(p0);
       }
       n = this.a.n;
       if (n != null) {
          n.f(p1);
       }
       this.a.f2(p0, false);
       a = this.a.d.d(l.i).a;
       SimpleMagicFace mId = (a != null)? a.mId: null;
       if (mId == null) {
          mId = "";
       }
       e.f(mId, "");
       return;
    }
}
