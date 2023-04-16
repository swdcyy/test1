package hha.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import yga.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hha.c;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import java.lang.StringBuilder;
import com.kwai.framework.deviceid.i;
import java.lang.System;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import o56.f;
import za5.a;
import gha.p;
import android.net.Uri;
import java.lang.Boolean;
import com.kwai.feature.api.feed.home.kcubehome.HomeTabUriMatcher;
import on5.p;

public class b	// class@001759
{
    public c a;
    public final List b;
    public boolean c;
    public boolean d;

    public void b(){
       super();
       this.b = new ArrayList();
    }
    public synchronized void a(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (this.i() && !this.b.contains(Integer.valueOf(p0))) {
          c.j(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowVisitSourceManagerImpl"), "addVisitSource", "source", String.valueOf(p0));
          this.b.add(Integer.valueOf(p0));
       }
       return;
    }
    public synchronized c b(BaseFragment p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.g(p0);
       if (this.i()) {
          if (!q.f(this.b) || p0.Vg().c()) {
             c uoc = new c();
             this.a = uoc;
             uoc.a = i.f()+System.currentTimeMillis();
             i = 1;
             if (this.b.contains(Integer.valueOf(i))) {
                uoc.b = i;
             }else {
                i = 2;
                if (this.b.contains(Integer.valueOf(i))) {
                   uoc.b = i;
                }else {
                   i = 3;
                   uoc.b = (this.b.contains(Integer.valueOf(i)))? i: 4;
                }
             }
          }else {
             return null;
          }
       }
       return this.a;
    }
    public synchronized String c(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i()) {
          this.a = this.b(p0);
       }
       return this.d();
    }
    public synchronized String d(){
       b ta = this.a;
       if (ta != null) {
          return ta.a;
       }
       return "";
    }
    public synchronized String e(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i()) {
          this.a = this.b(p0);
       }
       return this.f();
    }
    public synchronized String f(){
       b obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return String.valueOf(obj.b);
       }
       return "";
    }
    public synchronized final void g(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       if (!f.b(p0.getActivity())) {
          return;
       }
       if (a.o0(p0.getActivity()).q0() == 2 && this.c != null) {
          if (this.d != null) {
             this.a(1);
             this.d = false;
          }
          this.a(2);
          this.c = false;
       }
       if (p.g(p0)) {
          this.a(3);
       }
       return;
    }
    public final boolean h(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return HomeTabUriMatcher.b.a(p0);
    }
    public final boolean i(){
       boolean b = (this.a == null)? true: false;
       return b;
    }
}
