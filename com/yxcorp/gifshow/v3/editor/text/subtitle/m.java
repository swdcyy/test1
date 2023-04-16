package com.yxcorp.gifshow.v3.editor.text.subtitle.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.subtitle.m$a;
import com.yxcorp.gifshow.v3.editor.text.subtitle.m$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.NullPointerException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.edit.draft.model.c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import androidx.lifecycle.ViewModel;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.widget.adv.model.f;
import voc.o;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import t36.f;
import dvc.n;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import faa.a;
import q87.c;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;

public class m extends PresenterV2	// class@0014a2
{
    public VideoSDKPlayerView A;
    public f B;
    public Observer C;
    public boolean D;
    public ArrayList E;
    public List F;
    public List G;
    public f H;
    public EditDecorationContainerView$b I;
    public s J;
    public c p;
    public a q;
    public o r;
    public f s;
    public BaseFragment t;
    public EditDecorationContainerView u;
    public c v;
    public MutableLiveData w;
    public AttrAnimProgressFragment x;
    public TextElementViewModel y;
    public h z;

    public void m(){
       super();
       this.v = PublishSubject.g();
       this.C = null;
       this.D = false;
       this.E = new ArrayList();
       this.F = null;
       this.G = null;
       this.I = new m$a(this);
       this.J = new m$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       a uoa = this.p.W0();
       this.q = uoa;
       if (uoa == null) {
          PostUtils.D("SubtitleAutoTextPresenter", "bind", new NullPointerException("mTextDraft == null"));
          return;
       }else {
          uoa.c0();
          this.y = ViewModelProviders.of(this.t).get(TextElementViewModel.class);
          this.z = f.l(this.t);
          this.s = this.r.d();
          this.u.setDelegate(this.I);
          this.H.d(this.J);
          n on = new n(this);
          this.C = on;
          this.w.observe(this.t, on);
          this.z.F0().observe(this.t, this.C);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "14")) {
          return;
       }
       this.w.removeObserver(this.C);
       this.z.F0().removeObserver(this.C);
       this.H.c(this.J);
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "10")) {
          return;
       }
       m tx = this.x;
       if (tx != null) {
          tx.dismiss();
          this.x = objArray;
       }
       objArray = new Object[0];
       a.D().w("SubtitleAutoTextPresenter", "hideProgressDialog", objArray);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a0a6c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.r8("WORKSPACE");
       this.r = this.r8("EDITOR_CONTEXT");
       this.A = this.r8("VIDEO_SDK_PLAYER_VIEW");
       this.t = this.r8("FRAGMENT");
       this.w = this.r8("EDIT_PREVIEW_INIT_LIVE_DATA");
       this.B = this.x8("EDITOR_MANAGER");
       this.H = this.r8("EDITOR_ITEM_LISTENERS");
       return;
    }
}
