package com.yxcorp.gifshow.detail.fragments.milano.profile.d;
import ub.a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.f$a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.util.Log;
import java.lang.StringBuilder;
import k2b.u1;
import android.graphics.drawable.Animatable;
import bd.f;

public class d extends a	// class@001548
{
    public final f$a b;

    public void d(f$a p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "2")) {
          return;
       }
       p0 = (p1 != null)? Log.getStackTraceString(p1): "";
       u1.Q("MilanoProfileFeedAdp", "∑‚√ÊÕºº”‘ÿ ß∞‹"+p0);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "1");
    }
}
