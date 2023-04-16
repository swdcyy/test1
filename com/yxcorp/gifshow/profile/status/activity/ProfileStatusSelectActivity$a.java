package com.yxcorp.gifshow.profile.status.activity.ProfileStatusSelectActivity$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Intent;
import com.yxcorp.gifshow.profile.status.activity.ProfileStatusSelectActivity;
import android.content.Context;
import java.lang.CharSequence;

public final class ProfileStatusSelectActivity$a	// class@0015ae
{

    public void ProfileStatusSelectActivity$a(){
       super();
    }
    public void ProfileStatusSelectActivity$a(u p0){
       super();
    }
    public static void b(ProfileStatusSelectActivity$a p0,GifshowActivity p1,String p2,int p3,Object p4){
       p0.a(p1, null);
    }
    public final void a(GifshowActivity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileStatusSelectActivity$a.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       Intent intent = new Intent(p0, ProfileStatusSelectActivity.class);
       String str = (p1 == null || !p1.length())? 1: null;
       if (!str) {
          intent.putExtra("profileStatusSelectTips", p1);
       }
       p0.startActivity(intent);
       return;
    }
}
