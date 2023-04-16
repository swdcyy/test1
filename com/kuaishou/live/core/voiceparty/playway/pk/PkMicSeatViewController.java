package com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ss2.e;
import msd.t;
import brd.t;
import tu2.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import t45.d;
import brd.z;
import com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewController$a;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewController$1;
import msd.a;
import android.animation.Animator;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.animation.PropertyValuesHolder;
import lnc.a1;
import qt2.b;
import android.animation.ObjectAnimator;
import us2.d;
import android.content.Context;
import ts2.f;
import ts2.h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.FixGridLayoutManager;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import ou2.a;
import androidx.recyclerview.widget.RecyclerView$n;
import us2.a;
import androidx.lifecycle.LiveData;
import us2.b;
import ws2.b;
import android.app.Activity;
import com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewControllerKt;
import androidx.lifecycle.LifecycleOwner;
import jv2.a;
import android.view.ViewGroup;
import java.lang.Iterable;
import java.util.Iterator;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatPKFireAnimationController;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import ts2.a;

public final class PkMicSeatViewController extends ViewController	// class@001867
{
    public final MutableLiveData j;
    public final b k;
    public final e l;
    public final t m;
    public final t n;
    public final f o;

    public void PkMicSeatViewController(e p0,t p1,t p2,f p3){
       a.p(p0, "micSeatDataManager");
       a.p(p1, "micSeatPendantsFactory");
       a.p(p2, "teamInfo");
       a.p(p3, "pkAnimationDispatchService");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.j = mutableLiveD;
       this.k = p2.observeOn(d.a).subscribe(new PkMicSeatViewController$a(this));
       mutableLiveD.setValue(PkMicSeatViewController$1.INSTANCE);
    }
    public static Animator V2(PkMicSeatViewController p0,a p1,int p2,Object p3){
       Objects.requireNonNull(p0);
       ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(null, p0, PkMicSeatViewController.class, "4");
       if (objectAnimat != PatchProxyResult.class) {
       }else {
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{b.f((float)a1.e(100.00f), 0),b.a()};
          objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0.P2(), propertyValu);
          a.o(objectAnimat, "ObjectAnimator.ofPropert¡­l.inAlphaProperty\(\)\n    \)");
       }
       return objectAnimat;
    }
    public void F2(){
       b uob;
       Object obj = this;
       PkMicSeatViewController pkMicSeatVie = PkMicSeatViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, pkMicSeatVie, "1")) {
          return;
       }
       obj.Q2(R.layout.arg_RES_7f0d16da);
       d uod = new d(this.D2(), obj.l);
       Iterator obj1 = PatchProxy.applyOneRefs(uod, obj, pkMicSeatVie, "3");
       if (obj1 != PatchProxyResult.class) {
          uob = obj1;
       }else {
          View view = obj.A2(0x7f0a4503);
          view.setItemAnimator(objArray);
          FixGridLayoutManager uFixGridLayo = new FixGridLayoutManager(this.D2(), 2, -1, a1.d(0x7f07107b), 0, 16, null);
          view.setLayoutManager(obj1);
          view.addItemDecoration(new a());
          View view1 = obj.A2(0x7f0a44e9);
          view1.setItemAnimator(objArray);
          FixGridLayoutManager uFixGridLayo1 = new FixGridLayoutManager(this.D2(), 2, -1, a1.d(0x7f07107b), 0, 16, null);
          view1.setLayoutManager(obj1);
          view1.addItemDecoration(new a());
          LiveData liveData = b.a(uod);
          LiveData liveData1 = PkMicSeatViewControllerKt.a(liveData, obj.j, MicSeatTeam.YELLOW);
          LiveData liveData2 = PkMicSeatViewControllerKt.a(liveData, obj.j, MicSeatTeam.BLUE);
          b uob1 = new b(this, this.B2(), liveData1, view, liveData2, view1);
          uob = v9;
       }
       t ot = t.empty();
       a.o(ot, "Observable.empty\(\)");
       obj1 = obj.m.invoke(this, obj.l, uod, uob, ot, new a(uob, obj.A2(R.id.live_voice_party_pk_chat_view_emoji))).iterator();
       while (obj1.hasNext()) {
          obj.z2(obj1.next());
       }
       MicSeatPKFireAnimationController micSeatPKFir = new MicSeatPKFireAnimationController(obj.l, uod, uob, MicSeatStyle.PK, obj.o, obj.n);
       obj.z2(obj1);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, PkMicSeatViewController.class, "2")) {
          return;
       }
       this.k.dispose();
       this.l.d();
       return;
    }
}
