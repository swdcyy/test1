package com.yxcorp.gifshow.reminder.mix.b;
import im8.g;
import com.yxcorp.gifshow.reminder.mix.ReminderMixFragment;
import java.lang.Object;
import wkd.b;
import gfc.f;
import kfc.a;
import lcc.n;
import tec.b;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.reminder.mix.a;
import io.reactivex.subjects.PublishSubject;
import lcc.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import occ.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import nfc.d;
import occ.h;
import ucc.a;
import kcc.i;
import okd.b;
import kcc.j;
import com.yxcorp.gifshow.reminder.ReminderTabHostFragment;
import nec.e;
import ncc.h;
import kcc.h;
import kcc.k;
import tec.s;
import java.util.Map;
import java.util.HashMap;

public final class b implements g	// class@001aed
{
    public final f b;
    public final a c;
    public final ReminderMixFragment d;
    public final d e;
    public j f;
    public i g;
    public k h;
    public final g i;
    public final PublishSubject j;
    public final PublishSubject k;
    public final PublishSubject l;
    public final PublishSubject m;
    public final FragmentCompositeLifecycleState n;
    public y o;
    public final a p;
    public a q;
    public a r;

    public void b(ReminderMixFragment p0){
       super();
       this.d = p0;
       this.b = b.a(-632202392);
       this.c = new a();
       this.e = new n(p0, Suppliers.a(new b(this)));
       this.i = a.b;
       this.j = PublishSubject.g();
       this.m = PublishSubject.g();
       this.p = new a();
       this.n = p0.Vg();
       this.k = PublishSubject.g();
       this.l = PublishSubject.g();
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.q == null) {
          this.q = new h(this.d, d.a(this.d.getArguments()));
       }
       return this.q;
    }
    public a b(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r == null) {
          this.r = new a(this.d);
       }
       return this.r;
    }
    public i c(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == null) {
          this.g = b.a(0x298930dc);
       }
       return this.g;
    }
    public j d(){
       ReminderTabHostFragment obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = b.a(-472698037);
          obj = e.d(this.d);
          if (obj != null) {
             this.f.f(obj.B.e());
          }
       }
       return this.f;
    }
    public k e(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          this.h = b.a(0x3e9f0a80);
       }
       return this.h;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new s());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
}
