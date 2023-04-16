package com.gifshow.tuna.player.component.TunaPlayFragment;
import nj.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.ArrayList;
import nj.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;
import java.util.Iterator;
import java.util.List;
import nj.c;
import k2b.e0;
import com.gifshow.tuna.player.component.a;
import nj.g;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import nj.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.util.Objects;
import com.kwai.feed.player.ui.KwaiXfPlayerView;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import crd.a;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import com.kwai.framework.player.helper.f;
import com.kwai.framework.player.core.b;
import android.view.ViewStub;

public class TunaPlayFragment extends BaseFragment implements b	// class@0015e3
{
    public int j;
    public boolean k;
    public d l;
    public KwaiXfPlayerView m;
    public ViewStub n;
    public View o;
    public IVideoModel p;
    public List q;
    public Runnable r;
    public static final int s;

    public void TunaPlayFragment(){
       super();
       this.q = new ArrayList();
       this.r = new f(this);
    }
    public void P4(int p0){
       if (PatchProxy.isSupport(TunaPlayFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TunaPlayFragment.class, "9")) {
          return;
       }
       TunaPlayFragment tj = this.j;
       if (tj == p0 && this.k == null) {
          k1.m(this.r);
          k1.r(this.r, 0);
       }else if(tj != p0 && (this.k == null || PatchProxy.applyVoid(null, this, TunaPlayFragment.class, "11"))){
          this.k = false;
          Iterator iterator = this.q.iterator();
          while (iterator.hasNext()) {
             iterator.next().m0();
          }
       }
       return;
    }
    public e0 c(){
       return this;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, TunaPlayFragment.class, "12")) {
          return;
       }
       this.q.add(new a());
       return;
    }
    public int dc(){
       return 0;
    }
    public void dh(g p0){
       p0.a = this;
       p0.b = this.m;
       p0.c = this.p;
       p0.d = this.o;
    }
    public g eh(){
       Object obj = PatchProxy.apply(null, this, TunaPlayFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g();
    }
    public Activity getActivity(){
       return super.getActivity();
    }
    public int getPosition(){
       return this.j;
    }
    public boolean isSelected(){
       return this.k;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaPlayFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.p == null) {
          FragmentActivity activity = this.getActivity();
          if (activity != null && !activity.isFinishing()) {
             activity.finish();
          }
       }
       TunaPlayFragment tl = this.l;
       if (tl != null) {
          tl.Oc(this);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TunaPlayFragment.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.a(this.getContext(), 0x7f0d051b);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, TunaPlayFragment.class, "3")) {
          return;
       }
       super.onDestroy();
       TunaPlayFragment tl = this.l;
       if (tl != null) {
          tl.jf(this);
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TunaPlayFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       TunaPlayFragment tm = this.m;
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(objArray, tm, KwaiXfPlayerView.class, "2")) {
          tm.d.x();
          tm.n.d();
          KwaiXfPlayerView f = tm.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoid(objArray, f, KwaiXfControlPanel.class, "17")) {
             f.i.d();
             KwaiXfControlPanel j = f.j;
             if (j != null) {
                j.b();
             }
             f.y(f.c);
          }
          tm.h(tm.c);
          k1.m(tm.s);
       }
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().onRelease();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, TunaPlayFragment.class, "7")) {
          return;
       }
       super.onStart();
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, TunaPlayFragment.class, "8")) {
          return;
       }
       super.onStop();
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().I();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaPlayFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.m = p0.findViewById(0x7f0a0b43);
       this.n = p0.findViewById(0x7f0a0950);
       int i = this.dc();
       if (i > 0) {
          this.n.setLayoutResource(i);
          this.o = this.n.inflate();
       }
       this.ch();
       g og = this.eh();
       this.dh(og);
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(og);
       }
       return;
    }
}
