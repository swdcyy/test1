package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.google.common.collect.ImmutableMap$b;
import com.yxcorp.gifshow.detail.nonslide.toolbar.ToolbarAction;
import h99.b;
import java.lang.Object;
import h99.f;
import h99.i;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import b3a.e;
import im8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import g99.w;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import b3a.d;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import b3a.c;
import erd.o;
import g99.o;
import sfc.a;
import erd.g;
import crd.b;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Integer;
import android.view.ViewParent;
import b3a.h;
import androidx.lifecycle.LiveData;
import java.lang.Float;
import g99.a0;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends PresenterV2	// class@001ba9
{
    public QPhoto p;
    public a0 q;
    public BaseFragment r;
    public ViewGroup s;
    public final Map t;
    public final Map u;
    public w v;
    public t w;

    public void d(){
       super();
       this.t = new HashMap();
       ImmutableMap$b uob = new ImmutableMap$b();
       uob.c(ToolbarAction.BACK, new b());
       uob.c(ToolbarAction.MORE, new f());
       uob.c(ToolbarAction.SEARCH, new i());
       ImmutableMap immutableMap = uob.a();
       this.u = immutableMap;
       Iterator iterator = immutableMap.values().iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          if (uoe instanceof a) {
             this.W7(uoe);
          }
       }
       return;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "3")) {
          return;
       }
       this.v = ViewModelProviders.of(this.r).get(w.class);
       this.P8(d.a(this.p));
       d tp = this.p;
       t ot = PatchProxy.applyOneRefs(tp, objArray, d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else if(!tp.isMine()){
          ot = t.empty();
       }else {
          PhotoMeta photoMeta = tp.getPhotoMeta();
          ot = (photoMeta == null)? t.empty(): photoMeta.observable().map(new c(tp));
       }
       this.X7(ot.subscribe(new o(this), new a()));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.s = this.m8().findViewById(0x7f0a0096);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       Iterator iterator = this.t.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          ToolbarAction key = uEntry.getKey();
          View value = uEntry.getValue();
          if (!value.getVisibility()) {
             this.u.get(key).C(value);
          }
       }
       return;
    }
    public final void P8(List p0){
       ToolbarAction key;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "5")) {
          return;
       }
       Iterator iterator = this.t.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          key = uEntry.getKey();
          View value = uEntry.getValue();
          if (!value.getVisibility() && !p0.contains(key)) {
             this.u.get(key).C(value);
             value.setVisibility(8);
          }
       }
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 >= p0.size()) {
             return;
          }
          key = p0.get(i1);
          View view = this.t.get(key);
          if (view == null) {
             if (PatchProxy.isSupport(uod)) {
                view = PatchProxy.applyTwoRefs(Integer.valueOf(i1), key, this, uod, "6");
                if (view != PatchProxyResult.class) {
                label_00b6 :
                   this.t.put(key, view);
                }
             }
             d ts = this.s;
             e uoe = this.u.get(key);
             if (uoe != null) {
                View view1 = uoe.q(ts);
                if (view1.getParent() == null) {
                   ts.addView(view1);
                }
                h oh = uoe.I(view1);
                if (oh != null) {
                   d tv = this.v;
                   if (tv != null) {
                      oh.b(tv.s0().getValue().floatValue());
                   }
                   this.q.a(oh);
                }
                uoe.M(view1);
                view = view1;
                goto label_00b6 ;
             }else {
                break ;
             }
          }
          view.setVisibility(i);
          i1 = i1 + 1;
       }
       throw new IllegalArgumentException("unknown action "+key);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(a0.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.w = this.r8("FRAGMENT_RESUME_EVENT");
       return;
    }
}
