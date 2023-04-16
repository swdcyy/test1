package com.yxcorp.gifshow.relation.plugin.d;
import nx5.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import tkd.b;
import tkd.d;
import wu5.a;
import wkd.b;
import qac.d;
import androidx.fragment.app.FragmentActivity;
import brd.t;
import ibc.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kwai.live.gzone.accompanyplay.audience.a0;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.plugin.a;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.plugin.c;
import com.yxcorp.gifshow.relation.plugin.b;

public class d implements a	// class@00193a
{

    public void d(){
       super();
    }
    public void N0(Context p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, d.class, "1")) {
          return;
       }
       boolean b = false;
       boolean b1 = true;
       if (a.t().d("enableFansFollowListRN", b)) {
          if (!("follower_in_group").equalsIgnoreCase(p1) && ("following_in_group").equalsIgnoreCase(p1)) {
             b = 1;
          }
          d.a(0x6de3c81e).jo(p0, b);
       }else {
          b.a(0x1c906783).a(p0, b1).doOnNext(new a(p0, p1, p2, p3)).subscribe(Functions.d(), a0.b);
       }
       return;
    }
    public t Vt(GifshowActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x1c906783).a(p0, true).flatMap(a.b).subscribeOn(d.c).observeOn(d.a);
    }
    public t X9(GifshowActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x1c906783).a(p0, true).flatMap(c.b).subscribeOn(d.c).observeOn(d.a);
    }
    public boolean isAvailable(){
       return true;
    }
    public t jT(GifshowActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x1c906783).a(p0, true).flatMap(b.b).subscribeOn(d.c).observeOn(d.a);
    }
}
