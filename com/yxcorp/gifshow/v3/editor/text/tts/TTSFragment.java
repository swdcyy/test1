package com.yxcorp.gifshow.v3.editor.text.tts.TTSFragment;
import hka.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.ArrayList;
import mvc.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.v3.editor.text.tts.TTSFragment$a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import java.util.Objects;
import faa.a;
import q87.c;
import kvc.e;
import mvc.g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.MediatorLiveData;
import mvc.h;
import mvc.f;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.text.tts.e$c;
import com.yxcorp.gifshow.v3.editor.text.tts.g;
import com.yxcorp.gifshow.v3.editor.text.tts.d;
import android.app.Application;
import o56.a;
import android.content.Context;
import jba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.TtsAudio$b;
import com.kuaishou.edit.draft.TtsAudio;
import com.google.protobuf.GeneratedMessageLite$Builder;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Tts;
import java.util.List;
import java.util.Iterator;
import ei0.a;
import lvc.s;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.v3.editor.text.tts.TTSFragment$b;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.kwai.video.stannis.Stannis;
import com.kwai.chat.sdk.signal.f;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
import j85.e;
import zt7.d;
import androidx.lifecycle.ViewModelStore;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;

public class TTSFragment extends BaseFragment implements a	// class@0014ed
{
    public k j;
    public View k;
    public ArrayList l;
    public c m;
    public g n;
    public i o;
    public TTSFragment$b p;
    public String q;

    public void TTSFragment(){
       super();
       this.l = new ArrayList();
    }
    public void ch(){
       TtsAudio$b uob;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TTSFragment.class, "5")) {
          return;
       }
       if (this.n == null) {
          i1.c(new RuntimeException("ttsFragment failed to attach presenter, mTtsDownloadManager = null"));
          return;
       }else {
          k ok1 = ViewModelProviders.of(this, new TTSFragment$a(this)).get(ok);
          this.j = ok1;
          Objects.requireNonNull(ok1);
          if (!PatchProxy.applyVoid(objArray, ok1, ok, "14")) {
             int i = 0;
             Object[] objArray1 = new Object[i];
             a.D().w("TTSViewModel", "onAttach", objArray1);
             ok1.p0();
             if (!PatchProxy.applyVoid(objArray, ok1, ok, "15")) {
                ok1.b.addSource(ok1.k.b, new g(ok1));
                ok1.b.addSource(ok1.k.c, new h(ok1));
                ok1.e.addSource(ok1.k.h, new f(ok1));
             }
             if (!PatchProxy.applyVoid(objArray, ok1, ok, "16")) {
                ok1.k.d.observeForever(ok1.p);
                ok1.k.e.observeForever(ok1.o);
                ok1.k.i.observeForever(ok1.q);
                ok1.k.g.observeForever(ok1.s);
                ok1.k.f.observeForever(ok1.r);
             }
             ok1.s0();
             ok = ok1.k;
             ok1 = ok1.m;
             Objects.requireNonNull(ok);
             e uoe = e.class;
             if (!PatchProxy.applyVoidOneRefs(ok1, ok, uoe, "2")) {
                Object[] objArray2 = new Object[i];
                a.D().w("TTSRepo", "onAttach: identifier = "+ok1, objArray2);
                ok.j.l(ok.u);
                d uod = new d(a.b());
                ok.k = uod;
                uod.h(ok.t);
                if (!PatchProxy.applyVoid(objArray, ok, uoe, "19") && !ok.d().D()) {
                   ok.d().c0();
                }
                a uoa1 = ok.d();
                ok.m = i;
                if (uoa1.v() == null) {
                   uob = TtsAudio.newBuilder();
                   uob.d(-1);
                   uob.b(-1);
                   uob.f(ok1);
                   uob.g(0x3f800000);
                   ok.c.setValue(uob.build());
                   ok.b.setValue(Boolean.FALSE);
                }else {
                   ok.p = uoa1.v().getApplyToAll();
                   ok.b.setValue(Boolean.valueOf(uoa1.v().getApplyToAll()));
                   Iterator iterator1 = uoa1.v().getTtsAudiosList().iterator();
                   while (iterator1.hasNext()) {
                      TtsAudio ttsAudio = iterator1.next();
                      if (ttsAudio.getTextIdentifier() != null && ok1.equals(ttsAudio.getTextIdentifier())) {
                         ok.c.setValue(ttsAudio);
                         ok.q = ttsAudio.getSpeakerId();
                         ok.r = ttsAudio.getLanguageType();
                         ok.s = ttsAudio.getVolume();
                         ok.m = true;
                      }
                   }
                   if (ok.m == null) {
                      uob = TtsAudio.newBuilder();
                      uob.d(-1);
                      uob.b(-1);
                      uob.f(ok1);
                      uob.g(0x3f800000);
                      ok.c.setValue(uob.build());
                      ok.b.setValue(Boolean.FALSE);
                   }
                }
             }
          }
       label_01d5 :
          Iterator iterator = this.l.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa instanceof s) {
                uoa.k = this.j;
             }
             uoa.B();
          }
          if (this.getActivity() instanceof GifshowActivity) {
             this.getActivity().F2(this);
          }
          return;
       }
    }
    public void dh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TTSFragment.class, "10")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          TTSFragment tp = this.p;
          if (tp != null) {
             tp.a();
             this.p = objArray;
          }
          e uoe = activity.getSupportFragmentManager().beginTransaction();
          uoe.y(R.anim.arg_RES_7f010133, 0x7f010134);
          uoe.s(this).m();
       }
       return;
    }
    public void eh(g p0){
       this.n = p0;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, TTSFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isVisible()) {
          return false;
       }
       this.dh();
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TTSFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TTSFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.c(p0, R.layout.arg_RES_7f0d04c4, p1, false);
       this.k = view;
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TTSFragment.class, "11")) {
          return;
       }
       super.onDestroyView();
       return;
    }
    public void onHiddenChanged(boolean p0){
       k k;
       if (PatchProxy.isSupport(TTSFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TTSFragment.class, "4")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (p0) {
          String str = "7";
          if (!PatchProxy.applyVoid(null, this, TTSFragment.class, str)) {
             Iterator iterator = this.l.iterator();
             while (iterator.hasNext()) {
                iterator.next().C();
             }
             if (this.getActivity() instanceof GifshowActivity) {
                this.getActivity().l3(this);
             }
             TTSFragment tj = this.j;
             if (tj != null) {
                if (!PatchProxy.applyVoid(null, tj, k.class, "23")) {
                   k = tj.k;
                   k n = tj.n;
                   Objects.requireNonNull(k);
                   e uoe = e.class;
                   if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(n), k, uoe, "3")) {
                      Object[] objArray = new Object[0];
                      a.D().w("TTSRepo", "onDetach: isSaveEdit = "+n, objArray);
                      k.b();
                      if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(n), k, uoe, "20")) {
                         if (n == null && k.d().D()) {
                            k.d().j();
                         }else if(n != null && k.d().D()){
                            k.d().f();
                         }
                      }
                      e k1 = k.k;
                      if (k1 != null) {
                         k1.h(null);
                         k1 = k.k;
                         Objects.requireNonNull(k1);
                         if (!PatchProxy.applyVoid(null, k1, d.class, str)) {
                            Object[] objArray1 = new Object[0];
                            a.D().w("TtsAuditionManager", "destroy: "+k1, objArray1);
                            k1.i();
                            k1.j();
                            k1.f.clearAllAudioBuffer();
                            k1.f.uninitStannisEngine(k1.g);
                            k1.f = null;
                            f.e().w(k1.e);
                            k1.a.p();
                            k1.a.a();
                            k1.a = null;
                            k1.e = null;
                            k1.l = null;
                            k1.i = null;
                            k1.c = null;
                            k1.b = null;
                         }
                         k.k = null;
                      }
                   }
                   tj.b.removeSource(tj.k.b);
                   tj.b.removeSource(tj.k.c);
                   tj.e.removeSource(tj.k.h);
                }
                this.j = null;
             }
             this.getViewModelStore().clear();
          }
       }else {
          this.ch();
       }
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TTSFragment.class, "6")) {
          return;
       }
       super.onPause();
       TTSFragment tj = this.j;
       if (tj != null) {
          Objects.requireNonNull(tj);
          if (!PatchProxy.applyVoid(objArray, tj, k.class, "21")) {
             Object[] objArray1 = new Object[0];
             a.D().w("TTSViewModel", "onPause", objArray1);
             tj.e.setValue(Boolean.FALSE);
             tj.r0();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.l.add(new s(this, p0, this.o.f().z()));
       this.ch();
       return;
    }
}
