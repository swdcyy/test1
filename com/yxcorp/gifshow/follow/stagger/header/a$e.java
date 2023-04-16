package com.yxcorp.gifshow.follow.stagger.header.a$e;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.follow.stagger.header.a;
import java.lang.Object;
import dha.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jb5.d;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import qvb.a;

public final class a$e implements Observer	// class@0011b0
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else if(p0 != null && (p0.a != null && (p0.b == null && p0.c == null))){
          p0 = this.b.u;
          if (p0 == null) {
             a.S("mHomeFollowFragment");
          }
          p0 = p0.Qh();
          a.o(p0, "mHomeFollowFragment.pageList");
          if (p0.isEmpty() || !this.b.Z8()) {
             this.b.a9();
          }
       }
    label_0042 :
       return;
    }
}
