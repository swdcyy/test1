package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$f;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.b;

public final class IntensifyFollowElement$f implements g	// class@001414
{
    public final IntensifyFollowElement b;

    public void IntensifyFollowElement$f(IntensifyFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement$f.class, "1")) {
       }else if(p0.intValue() > 0){
          this.b.b0();
       }else {
          this.b.c0();
       }
       return;
    }
}
