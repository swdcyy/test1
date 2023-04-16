package com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment;
import voc.y;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.util.ArrayList;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$addTextButton$2;
import msd.a;
import qrd.p;
import qrd.s;
import crd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import t45.d;
import brd.z;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$b;
import erd.a;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$c;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$d;
import erd.g;
import crd.b;
import voc.x;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import java.util.HashMap;
import java.lang.Throwable;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import e17.i;
import com.yxcorp.gifshow.util.PostUtils;
import ooc.h1;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$a;
import android.view.View$OnClickListener;
import java.util.Set;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import pnd.b;
import pnd.a;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$e;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$f;
import com.yxcorp.utility.Log;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;

public final class ReEditTextFragment extends BaseEditorFragment implements y	// class@000b58
{
    public final List G;
    public final p H;
    public AttrAnimProgressFragment I;
    public final a J;
    public HashMap K;

    public void ReEditTextFragment(){
       super();
       this.G = new ArrayList();
       this.H = s.c(new ReEditTextFragment$addTextButton$2(this));
       this.J = new a();
    }
    public final void Ah(){
       if (PatchProxy.applyVoid(null, this, ReEditTextFragment.class, "8")) {
          return;
       }
       BaseEditorFragment tt = this.t;
       String str = "mEditorDelegate";
       a.o(tt, str);
       c uoc = tt.N();
       a.o(uoc, "mEditorDelegate.workspaceDraft");
       a uoa = uoc.W0();
       if (uoa != null) {
          uoa.f();
       }
       BaseEditorFragment tt1 = this.t;
       a.o(tt1, str);
       c uoc1 = tt1.N();
       this.J.c(DraftFileManager.E().j0(uoc1, false).observeOn(d.a).doAfterTerminate(new ReEditTextFragment$b(this)).subscribe(ReEditTextFragment$c.b, new ReEditTextFragment$d(this)));
       return;
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, ReEditTextFragment.class, "10")) {
          return;
       }
       Iterator iterator = this.G.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReEditTextFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ReEditTextFragment.class, null);
       return objectsByTag;
    }
    public String getTitle(){
       String obj = PatchProxy.apply(null, this, ReEditTextFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getString(R.string.arg_RES_7f104c2a);
       a.o(obj, "getString\(R.string.text\)");
       return obj;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, ReEditTextFragment.class, "9")) {
          return;
       }
       Iterator iterator = this.G.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       return;
    }
    public void o4(){
       x.h(this);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReEditTextFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d04c3, p1, false);
       this.q = view;
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ReEditTextFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       this.J.dispose();
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, ReEditTextFragment.class, "15")) {
       }else {
          ReEditTextFragment tK = this.K;
          if (tK != null) {
             tK.clear();
          }
       }
       return;
    }
    public final void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReEditTextFragment.class, "11")) {
          return;
       }
       ReEditTextFragment tI = this.I;
       if (tI != null && tI.isAdded() == true) {
          tI = this.I;
          a.m(tI);
          tI.dismiss();
       }
       i.a(R.style.arg_RES_7f110668, 0x7f103678);
       PostUtils.D("ReEditTextFragment", "save failed", p0);
       this.yh();
       return;
    }
    public void onRestart(){
       x.i(this);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReEditTextFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.G.add(new h1(this, p0));
       p0 = p0.findViewById(R.id.ll_edit_text_update_layout_root);
       a.o(p0, "view.findViewById<View>\(¡­_text_update_layout_root\)");
       p0.setVisibility(0);
       p0 = this.zh();
       a.o(p0, "addTextButton");
       p0.setVisibility(0);
       this.zh().setOnClickListener(new ReEditTextFragment$a(this));
       this.qh().add(this);
       this.fh();
       BaseEditorFragment tt = this.t;
       a.o(tt, "mEditorDelegate");
       c uoc = tt.N();
       a.o(uoc, "mEditorDelegate.workspaceDraft");
       a uoa = uoc.W0();
       if (uoa != null) {
          uoa.c0();
       }
       return;
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, ReEditTextFragment.class, "6")) {
          return;
       }
       x.a(this);
       BaseEditorFragment tt = this.t;
       a.o(tt, "mEditorDelegate");
       c uoc = tt.N();
       a.o(uoc, "mEditorDelegate.workspaceDraft");
       a uoa = uoc.W0();
       if (uoa != null) {
          uoa.j();
       }
       this.yh();
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReEditTextFragment.class, "5")) {
          return;
       }
       x.j(this);
       AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
       this.I = uAttrAnimPro;
       uAttrAnimPro.setCancelable(false);
       ReEditTextFragment tI = this.I;
       String str = "mEditorDelegate";
       if (tI != null) {
          BaseEditorFragment tt = this.t;
          a.o(tt, str);
          BaseFragment uBaseFragmen = tt.q();
          a.o(uBaseFragmen, "mEditorDelegate.previewFragment");
          tI.show(uBaseFragmen.getChildFragmentManager(), "ReEditTextFragment");
       }
       BaseEditorFragment tt1 = this.t;
       a.o(tt1, str);
       c uoc = tt1.N();
       if (DraftUtils.y(uoc) - DraftUtils.s(uoc) > 0) {
          ReEditTextFragment tJ = this.J;
          String str1 = "workspaceDraft";
          a.o(uoc, str1);
          t ot = PatchProxy.applyOneRefs(uoc, objArray, b.class, "1");
          if (ot != PatchProxyResult.class) {
          }else {
             a.p(uoc, str1);
             ot = t.create(new a(uoc));
             a.o(ot, "Observable.create { emit¡­r.runTask\(encodeInfo\)\n  }");
          }
          tJ.c(ot.subscribe(new ReEditTextFragment$e(this, uoc), new ReEditTextFragment$f(this)));
       }else {
          this.Ah();
       }
       return;
    }
    public final void yh(){
       if (PatchProxy.applyVoid(null, this, ReEditTextFragment.class, "12")) {
          return;
       }
       Log.b("ReEditTextFragment", "cancelFinishActivity");
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          activity.setResult(0);
          activity.finish();
          activity.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       }
       return;
    }
    public void z2(){
       x.c(this);
    }
    public final View zh(){
       Object obj = PatchProxy.apply(null, this, ReEditTextFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.H.getValue();
    }
}
