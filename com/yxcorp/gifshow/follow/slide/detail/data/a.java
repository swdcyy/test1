package com.yxcorp.gifshow.follow.slide.detail.data.a;
import lnc.c2;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.follow.slide.detail.data.f;
import bia.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import kp.w1;
import java.util.List;
import kp.r1;
import com.yxcorp.gifshow.commoninsertcard.entity.d;

public final class a implements c2	// class@001105
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean accept(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "photo");
          b = (!k.a.contains(w1.r(p0.mEntity)) && (r1.k3(p0.mEntity) || d.a(p0.mEntity)))? 1: 0;
       }
       return (b ^ 1);
    }
}
