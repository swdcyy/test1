package com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.AudioRecorderFragment;
import ml8.d;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import i2b.a;
import java.util.Objects;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.AudioRecorderFragment$a;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.i;
import androidx.fragment.app.KwaiDialogFragment;
import android.content.DialogInterface;
import crd.b;
import lnc.b9;
import nsc.u;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import com.yxcorp.gifshow.util.PermissionUtils;
import nsc.s;
import erd.g;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import psc.c;
import psc.e;
import psc.g;
import psc.j;
import psc.m;
import psc.p;
import osc.b;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.c;
import nsc.b;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import nsc.d;
import erd.a;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.e;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.b;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.c;
import nsc.f;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.d;

public class AudioRecorderFragment extends BottomSheetFragment implements d	// class@001133
{
    public g A;
    public ViewGroup z;
    public static final int B;

    public void AudioRecorderFragment(){
       super();
       this.A = new g(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudioRecorderFragment.class, "1")) {
          return;
       }
       ViewGroup viewGroup = p0.findViewById(R.id.record_layout);
       this.z = viewGroup;
       viewGroup.setBackgroundColor(this.getResources().getColor(R.color.arg_RES_7f0609db));
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudioRecorderFragment.class, "9")) {
          return;
       }
       this.yh(n.k(this.getActivity()));
       super.onActivityCreated(p0);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudioRecorderFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCanceledOnTouchOutside(false);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AudioRecorderFragment.class, "10");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d00e0, p1, false);
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AudioRecorderFragment.class, "18")) {
          return;
       }
       AudioRecorderFragment tA = this.A;
       if (tA != null) {
          Objects.requireNonNull(tA);
          if (!PatchProxy.applyVoid(objArray, tA, g.class, "5")) {
             tA.j.unbind();
             tA.j.destroy();
          }
       }
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AudioRecorderFragment.class, "17")) {
          return;
       }
       AudioRecorderFragment tA = this.A;
       if (tA != null) {
          Objects.requireNonNull(tA);
          if (!PatchProxy.applyVoid(objArray, tA, g.class, "6")) {
             g k = tA.k;
             if (k != null) {
                k.e();
             }
             g l = tA.l;
             if (l != null) {
                l.a();
             }
          }
       }
       super.onDestroyView();
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudioRecorderFragment.class, "19")) {
          return;
       }
       AudioRecorderFragment tA = this.A;
       if (tA != null) {
          Objects.requireNonNull(tA);
          if (!PatchProxy.applyVoidOneRefs(p0, tA, g.class, "7")) {
             g k = tA.k;
             if (k != null) {
                k.onDismiss(p0);
                tA.k.e();
                tA.k = null;
             }
             b9.a(tA.m);
          }
       }
       super.onDismiss(p0);
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AudioRecorderFragment.class, "16")) {
          return;
       }
       AudioRecorderFragment tA = this.A;
       if (tA != null) {
          Objects.requireNonNull(tA);
          if (!PatchProxy.applyVoid(objArray, tA, g.class, "4") && tA.o == null) {
             tA.b();
             g h = tA.h;
             h.d(2);
             tA.b.onNext(h);
          }
       }
       super.onPause();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AudioRecorderFragment.class, "13")) {
          return;
       }
       super.onResume();
       PermissionUtils.f(this.getActivity(), "android.permission.RECORD_AUDIO").subscribe(new s(this));
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AudioRecorderFragment.class, "12")) {
          return;
       }
       super.onStart();
       if (this.getDialog() != null && !PatchProxy.applyVoid(objArray, this, AudioRecorderFragment.class, "14")) {
          Window window = this.getDialog().getWindow();
          if (window != null) {
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.dimAmount = 0;
             window.setAttributes(attributes);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AudioRecorderFragment.class, "11")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       AudioRecorderFragment tA = this.A;
       if (tA != null) {
          Objects.requireNonNull(tA);
          g og = g.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tA, og, "1")) {
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, tA, og, "8")) {
                PresenterV2 presenterV2 = new PresenterV2();
                tA.j = presenterV2;
                presenterV2.U7(new c());
                tA.j.U7(new e());
                tA.j.U7(new g());
                tA.j.U7(new j());
                tA.j.U7(new m());
                tA.j.U7(new p());
             }
             tA.j.f(p0);
             Object[] objArray1 = new Object[]{tA.i,tA};
             tA.j.i(objArray1);
             if (!PatchProxy.applyVoid(objArray, tA, og, "2")) {
                if (tA.d.i()) {
                   g h = tA.h;
                   h.i = true;
                   h.e(1);
                   h.b((long)(tA.d.a() * 0x408f400000000000));
                }
                if (!q.f(tA.d.e()) && !q.f(tA.d.c())) {
                   if (tA.i.getActivity() == null) {
                      i1.c(new RuntimeException("AudioRecord, failed to restore segment info, activity = null"));
                   }else {
                      AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
                      uAttrAnimPro.setCancelable(0);
                      uAttrAnimPro.show(tA.i.getActivity().getSupportFragmentManager(), "AudioRecord");
                      tA.a(t.fromCallable(new b(tA)).subscribeOn(d.c).observeOn(d.a).doAfterTerminate(new d(uAttrAnimPro)).subscribe(Functions.d(), e.b));
                   }
                }
             }
          label_011b :
             tA.a(tA.b.subscribe(new b(tA), c.b));
             tA.a(tA.c.subscribe(new f(tA), d.b));
          }
       }
       return;
    }
}
