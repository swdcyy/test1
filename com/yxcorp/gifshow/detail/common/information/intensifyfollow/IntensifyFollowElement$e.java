package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$e;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import k2b.c2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class IntensifyFollowElement$e extends y0	// class@001413
{
    public final IntensifyFollowElement a;

    public void IntensifyFollowElement$e(IntensifyFollowElement p0){
       this.a = p0;
       super();
    }
    public void c(boolean p0){
       c2 uoc2 = c2.class;
       IntensifyFollowElement$e uoe = IntensifyFollowElement$e.class;
       String str = "1";
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, str)) {
          return;
       }
       IntensifyFollowElement$e ta = this.a;
       ta.D = true;
       if (ta.E != null) {
          QPhoto qPhoto = IntensifyFollowElement.o0(ta);
          BaseFragment uBaseFragmen = IntensifyFollowElement.n0(this.a);
          if (!PatchProxy.applyVoidTwoRefs(qPhoto, uBaseFragmen, null, uoc2, str)) {
             c2.h(qPhoto, uBaseFragmen, "");
          }
          qPhoto = IntensifyFollowElement.o0(this.a);
          uBaseFragmen = IntensifyFollowElement.n0(this.a);
          if (!PatchProxy.applyVoidTwoRefs(qPhoto, uBaseFragmen, null, uoc2, "7")) {
             c2.d(qPhoto, uBaseFragmen, "");
          }
       }
       return;
    }
    public void d(boolean p0){
       IntensifyFollowElement$e uoe = IntensifyFollowElement$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "2")) {
          return;
       }
       IntensifyFollowElement$e ta = this.a;
       ta.D = false;
       ta.I0();
       return;
    }
}
