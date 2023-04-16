package com.kuaishou.live.ad.social.l$a;
import com.kuaishou.live.ad.social.l$b;
import com.kuaishou.live.ad.social.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import z61.l;
import androidx.lifecycle.MutableLiveData;

public class l$a implements l$b	// class@000a16
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       if (uoa.v == p0) {
          return;
       }
       uoa.v = p0;
       l x = uoa.x;
       x.mIsSelected = p0;
       uoa.w.setValue(x);
       l$a ta = this.a;
       l z = ta.z;
       z.mIsSelected = ta.v;
       ta.y.setValue(z);
       return;
    }
}
