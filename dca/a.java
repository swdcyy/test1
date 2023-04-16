package dca.a;
import voc.y;
import ei0.a;
import com.yxcorp.gifshow.v3.editor.i;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import dca.s;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxy;
import crd.b;
import xoc.d;
import java.util.Objects;
import android.animation.ObjectAnimator;
import th0.q;
import android.animation.TimeInterpolator;
import xoc.e;
import android.animation.Animator$AnimatorListener;
import java.util.concurrent.TimeUnit;
import brd.t;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import t45.d;
import brd.z;
import dca.a$a;
import dca.a$b;
import erd.g;
import android.os.Build$VERSION;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.g7;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingInitAction;
import brd.v;
import nsd.u;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import dca.a$c;
import android.view.View$OnClickListener;
import xoc.g;
import android.view.View$OnTouchListener;
import voc.x;
import android.widget.RelativeLayout;
import android.view.ViewParent;
import android.content.Context;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.widget.TextSwitcher;
import com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingImageChangeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import dca.b;
import android.widget.ViewSwitcher$ViewFactory;
import lnc.a1;
import java.lang.CharSequence;
import tvc.f;
import dca.d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class a extends a implements y	// class@001eed
{
    public TextView c;
    public View d;
    public TextSwitcher e;
    public AICutLoadingImageChangeView f;
    public LottieAnimationView g;
    public View h;
    public View i;
    public ConstraintLayout j;
    public final s k;
    public b l;
    public b m;
    public boolean n;
    public boolean o;
    public final i p;
    public final BaseEditorFragment q;

    public void a(i p0,View p1,BaseEditorFragment p2){
       a.p(p0, "editorHelperContract");
       a.p(p1, "rootView");
       a.p(p2, "fragment");
       super(p1);
       this.p = p0;
       this.q = p2;
       EditorDelegate uEditorDeleg = p0.f();
       a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
       ViewModel viewModel = ViewModelProviders.of(uEditorDeleg.q()).get(s.class);
       a.o(viewModel, "ViewModelProviders.of\(ed¡­ateViewModel::class.java\)");
       this.k = viewModel;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tl = this.l;
       if (tl != null) {
          tl.dispose();
       }
       tl = this.m;
       if (tl != null) {
          tl.dispose();
       }
       return;
    }
    public final void D(){
       d a;
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a = d.a;
       a tj = this.j;
       if (tj == null) {
          a.S("loadingLayout");
       }
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(tj, a, d.class, "2")) {
          a.p(tj, "view");
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tj, "alpha", new float[2]{0,0x3f800000});
          a.o(objectAnimat, "fadeIn");
          objectAnimat.setInterpolator(new q());
          objectAnimat.setDuration(300);
          objectAnimat.addListener(new e(tj));
          objectAnimat.start();
       }
       tj = this.d;
       if (tj == null) {
          a.S("progressView");
       }
       a.a(tj);
       this.l = t.interval(2, TimeUnit.SECONDS).compose(this.q.ge()).observeOn(d.a).subscribe(new a$a(this), a$b.b);
       return;
    }
    public final void E(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.n = true;
       this.D();
       this.F();
       if (Build$VERSION.SDK_INT >= 26) {
          a tg = this.g;
          if (tg == null) {
             a.S("lottieView");
          }
          tg.s();
       }
       EditorDelegate uEditorDeleg = this.p.f();
       a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
       if (!g7.a(uEditorDeleg.N())) {
          this.k.t0(new VideoTemplateLoadingInitAction(null, true, null));
       }
       return;
    }
    public final void F(){
       d a;
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a ti = this.i;
       String str = "editBtn";
       if (ti == null) {
          a.S(str);
       }
       ti.setOnClickListener(new a$c(this));
       a = d.a;
       View[] viewArray = new View[1];
       a ti1 = this.i;
       if (ti1 == null) {
          a.S(str);
       }
       int i = 0;
       viewArray[i] = ti1;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(viewArray, a, d.class, "1")) {
          a.p(viewArray, "views");
          for (; i < 1; i = i + 1) {
             object oobject = viewArray[i];
             if (oobject != null) {
                oobject.setOnTouchListener(new g(oobject));
             }
          }
       }
       ti = this.i;
       if (ti == null) {
          a.S(str);
       }
       ti.setVisibility(4);
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
       EditorDelegate uEditorDeleg;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       if (this.o == null && !PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          this.o = true;
          uEditorDeleg = this.p.f();
          a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
          RelativeLayout relativeLayo = uEditorDeleg.v();
          a.o(relativeLayo, "editorHelperContract.edi¡­viewFragmentContainerView");
          ViewParent parent = relativeLayo.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
          EditorDelegate uEditorDeleg1 = this.p.f();
          a.o(uEditorDeleg1, "editorHelperContract.editorDelegate");
          int i = (g7.a(uEditorDeleg1.N()))? 0x7f0d009f: 0x7f0d00a1;
          View view = a.a(this.q.getContext(), i);
          a.o(view, "KwaiLayoutInflater.infla¡­agment.context, layoutId\)");
          view.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
          parent.addView(view);
          View view1 = view.findViewById(R.id.progress_text);
          a.o(view1, "view.findViewById\(R.id.progress_text\)");
          this.c = view1;
          view1 = view.findViewById(R.id.progress_layout);
          a.o(view1, "view.findViewById\(R.id.progress_layout\)");
          this.d = view1;
          view1 = view.findViewById(R.id.ai_cut_tip_text);
          a.o(view1, "view.findViewById\(R.id.ai_cut_tip_text\)");
          this.e = view1;
          view1 = view.findViewById(R.id.asset_image);
          a.o(view1, "view.findViewById\(R.id.asset_image\)");
          this.f = view1;
          view1 = view.findViewById(R.id.lottie);
          a.o(view1, "view.findViewById\(R.id.lottie\)");
          this.g = view1;
          view1 = view.findViewById(R.id.new_progress_image_container);
          a.o(view1, "view.findViewById\(R.id.n¡­progress_image_container\)");
          this.h = view1;
          view1 = view.findViewById(R.id.edit_btn);
          a.o(view1, "view.findViewById\(R.id.edit_btn\)");
          this.i = view1;
          view = view.findViewById(R.id.aicut_loading_root_view);
          a.o(view, "view.findViewById\(R.id.aicut_loading_root_view\)");
          this.j = view;
          FragmentActivity uFragmentAct = this.q.requireActivity();
          a.o(uFragmentAct, "fragment.requireActivity\(\)");
          a te = this.e;
          String str = "descriptionView";
          if (te == null) {
             a.S(str);
          }
          te.setFactory(new b(uFragmentAct));
          a te1 = this.e;
          if (te1 == null) {
             a.S(str);
          }
          te1.setText(a1.p(R.string.arg_RES_7f100150));
          uEditorDeleg1 = this.p.f();
          a.o(uEditorDeleg1, "editorHelperContract.editorDelegate");
          this.k.r0().observe(this.q, new d(this, g7.a(uEditorDeleg1.N()), parent));
       }
       uEditorDeleg = this.p.f();
       a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
       if (!g7.a(uEditorDeleg.N()) && this.n == null) {
          this.E();
       }
       return;
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       x.a(this);
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       x.j(this);
    }
    public void z2(){
       x.c(this);
    }
}
