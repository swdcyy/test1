package kod.a;
import nwc.a;
import ei0.a;
import kod.a$a;
import nsd.u;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.widget.TextView;
import kod.a$h;
import kod.a$m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import android.widget.Button;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$e;
import kod.a$o;
import android.view.View$OnTouchListener;
import android.graphics.Point;
import kod.a$b;
import java.lang.Runnable;
import kod.a$c;
import android.widget.AbsoluteLayout;
import kod.a$d;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import android.widget.EditText;
import kod.a$e;
import kod.a$f;
import t36.f;
import kod.a$g;
import t36.f$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import tvc.e;
import xld.a;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import kod.a$i;
import cq.a;
import q87.c;
import mod.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditEndAction;
import xvc.b;
import wnd.j;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import kotlin.Pair;
import java.lang.Float;
import aw9.c0;
import pwc.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.minecraft.model.nano.Minecraft$KSTextBox;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import kotlin.collections.ArraysKt___ArraysKt;
import com.kwai.video.minecraft.model.nano.Minecraft$KSTextBound;
import com.kwai.video.minecraft.model.nano.Minecraft$Vec2f;
import com.kwai.video.minecraft.model.nano.Minecraft$Vec3f;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import kod.a$j;
import kod.a$k;
import kod.a$l;
import java.lang.Integer;
import com.yxcorp.gifshow.decoration.widget.f$a;
import lnc.a1;
import com.yxcorp.gifshow.decoration.widget.f$b;
import kod.a$n;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import kod.a$p;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import kod.a$q;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerStateAction;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;

public abstract class a extends a implements a	// class@001809
{
    public final EditDecorationContainerViewV2 c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final View i;
    public final View j;
    public float k;
    public final View l;
    public final View m;
    public final View n;
    public final View o;
    public View p;
    public Button q;
    public View r;
    public ValueAnimator s;
    public final View t;
    public boolean u;
    public boolean v;
    public final View$OnClickListener w;
    public final BaseEditorFragment$e x;
    public final Fragment y;
    public final EditorDelegate z;
    public static final a$a A;

    static {
       a.A = new a$a(null);
    }
    public void a(View p0,Fragment p1,EditorDelegate p2){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "editorDelegate");
       super(p0);
       this.y = p1;
       this.z = p2;
       View view = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.c = view;
       this.d = p0.findViewById(0x7f0a3e13);
       this.e = p0.findViewById(0x7f0a3e4c);
       this.f = p0.findViewById(0x7f0a3c06);
       this.g = p0.findViewById(0x7f0a3b6b);
       this.h = p0.findViewById(0x7f0a3e06);
       this.i = p0.findViewById(0x7f0a141a);
       this.j = p0.findViewById(0x7f0a0ca0);
       this.l = p0.findViewById(0x7f0a2b4e);
       this.m = p0.findViewById(0x7f0a318f);
       this.n = p0.findViewById(0x7f0a2dc7);
       this.o = p0.findViewById(0x7f0a00ab);
       this.t = p0.findViewById(0x7f0a3e39);
       this.v = true;
       this.w = new a$h(this);
       this.x = new a$m(this);
    }
    public void B(){
       Object[] objArray1;
       PostRadioGroupWithIndicator postRadioGro;
       Button uButton;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       this.u = DraftUtils.o(this.z.N());
       FragmentActivity activity = this.y.getActivity();
       if (!activity instanceof EditorActivity) {
          activity = objArray;
       }
       if (activity != null) {
          AbsEditorActivityViewBinder uAbsEditorAc = activity.N3();
          if (uAbsEditorAc != null) {
             View view = uAbsEditorAc.D();
          label_0033 :
             this.p = view;
             activity = this.y.getActivity();
             if (!activity instanceof EditorActivity) {
                objArray1 = objArray;
             }
             if (objArray1 != null) {
                uAbsEditorAc = objArray1.N3();
                if (uAbsEditorAc != null) {
                   postRadioGro = uAbsEditorAc.C();
                label_0050 :
                   this.r = postRadioGro;
                   activity = this.y.getActivity();
                   if (!activity instanceof EditorActivity) {
                      objArray1 = objArray;
                   }
                   if (objArray1 != null) {
                      uAbsEditorAc = objArray1.N3();
                      if (uAbsEditorAc != null) {
                         uButton = uAbsEditorAc.B();
                      label_006d :
                         this.q = uButton;
                         EditDecorationContainerView$b uob = this.a0();
                         if (uob != null) {
                            this.c.setDelegate(uob);
                         }
                         this.c.d(this.N());
                         this.c.setVisibility(0);
                         this.f0();
                         if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
                            a td = this.d;
                            a.o(td, "mEditFinishButton");
                            ViewGroup$LayoutParams layoutParams = td.getLayoutParams();
                            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            layoutParams.setMargins(layoutParams.leftMargin, (n.A(this.y.requireContext()) + n.c(this.y.requireContext(), 8.00f)), layoutParams.rightMargin, layoutParams.bottomMargin);
                            a td1 = this.d;
                            a.o(td1, "mEditFinishButton");
                            td1.setLayoutParams(layoutParams);
                         }
                         if (!PatchProxy.applyVoid(objArray, this, uoa, "17")) {
                            uoa = this.y;
                            Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.BaseEditorFragment");
                            uoa.eh(this.x);
                         }
                         uoa = this.i;
                         if (uoa != null) {
                            uoa.setVisibility(0);
                         }
                         uoa = this.t;
                         if (uoa != null) {
                            uoa.setVisibility(0);
                         }
                         uoa = this.t;
                         if (uoa != null) {
                            uoa.setOnTouchListener(new a$o(this));
                         }
                         return;
                      }
                   }
                   uButton = objArray;
                   goto label_006d ;
                }
             }
             postRadioGro = objArray;
             goto label_0050 ;
          }
       }
       objArray1 = objArray;
       goto label_0033 ;
    }
    public void C(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       this.c.setDelegate(objArray);
       this.c.M(this.N());
       this.c.setVisibility(8);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "18")) {
          uoa = this.y;
          Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.BaseEditorFragment");
          uoa.th(this.x);
       }
       return;
    }
    public final void D(TextView p0,Point p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "23")) {
          return;
       }
       if (p1 == null || (p0 != null && p0.getVisibility() != 8)) {
          this.E(p0, p1);
          p0.postDelayed(new a$b(p0), 5000);
          this.c.post(new a$c(this));
       }
    label_002f :
       return;
    }
    public final void E(TextView p0,Point p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "24")) {
          return;
       }
       if (p1 != null && p0 != null) {
          int[] ointArray = new int[2];
          p0.getLocationOnScreen(ointArray);
          p0.setTranslationX((p0.getTranslationX() + (float)((p1.x - (p0.getWidth() / 2)) - ointArray[0])));
          p0.setTranslationY((p0.getTranslationY() + (float)((p1.y - p0.getHeight()) - ointArray[1])));
          p0.post(new a$d(p0));
       }
       return;
    }
    public final void F(){
       if (PatchProxy.applyVoid(null, this, a.class, "21")) {
          return;
       }
       EditDecorationBaseDrawer selectDrawer = this.c.getSelectDrawer();
       if (selectDrawer != null && selectDrawer instanceof NewEditTextElement) {
          EditText focusEditTex = selectDrawer.getTextDrawerLayout().getFocusEditText();
          if (focusEditTex.hasFocus()) {
             focusEditTex.clearFocus();
             focusEditTex.setFocusable(false);
             focusEditTex.setFocusableInTouchMode(false);
          }
       }
       return;
    }
    public final void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "26")) {
          return;
       }
       this.H();
       a ti = this.i;
       if (ti != null) {
          ti.setOnTouchListener(a$e.b);
       }
       this.c.postDelayed(new a$f(this), 500);
       return;
    }
    public final void H(){
       if (PatchProxy.applyVoid(null, this, a.class, "27")) {
          return;
       }
       this.c.Q(false);
       this.c.C(true);
       return;
    }
    public final void I(){
       if (PatchProxy.applyVoid(null, this, a.class, "30")) {
          return;
       }
       this.z.j().s0(a$g.a);
       return;
    }
    public final boolean J(){
       e obj = PatchProxy.apply(null, this, a.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Z().o0();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.decoration_v2.state.DecorationRootState");
       int i = obj.g();
       List decorationDr = this.c.getDecorationDrawerList();
       a.o(decorationDr, "mContainerView.decorationDrawerList");
       int i1 = 1;
       if ((decorationDr.isEmpty() ^ i1) && i > 0) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.c.getDecorationDrawerList().iterator();
          while (iterator.hasNext()) {
             EditDecorationBaseDrawer uEditDecorat = iterator.next();
             if (uEditDecorat instanceof NewEditTextElement) {
                uArrayList.add(uEditDecorat);
             }
          }
          if (uArrayList.size() >= i) {
             i = i - i1;
             this.c.w0(uArrayList.get(i));
             this.N().v(uArrayList.get(i));
          }
       }else {
          i1 = false;
       }
       return i1;
    }
    public final void K(){
       if (PatchProxy.applyVoid(null, this, a.class, "28")) {
          return;
       }
       this.c.Q(true);
       this.c.C(false);
       return;
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, a.class, "31")) {
          return;
       }
       this.z.j().s0(a$i.a);
       return;
    }
    public void M(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("TextPreviewBaseViewBinderV3", "endTextEditor", objArray);
       this.i0(i);
       if (this.P().g()) {
          objArray1 = new Object[i];
          a.D().w("TextPreviewBaseViewBinderV3", "endTextEditor, send TextEditEndAction", objArray1);
          this.Z().t0(new TextEditEndAction());
       }else {
          objArray1 = new Object[i];
          a.D().w("TextPreviewBaseViewBinderV3", "endTextEditor, hide keyboard", objArray1);
          j.a.e(this.y, this.c);
       }
       return;
    }
    public abstract DecorationContainerView$d N();
    public abstract a P();
    public final EditorDelegate Q(){
       return this.z;
    }
    public final Fragment R(){
       return this.y;
    }
    public final EditDecorationContainerViewV2 S(){
       return this.c;
    }
    public final boolean T(){
       return this.u;
    }
    public final boolean U(){
       return this.v;
    }
    public final TextView V(){
       return this.g;
    }
    public final TextView W(){
       return this.f;
    }
    public final TextView X(){
       return this.h;
    }
    public final TextView Y(){
       return this.e;
    }
    public abstract EditReduxViewModel Z();
    public EditDecorationContainerView$b a0(){
       return null;
    }
    public final Pair b0(String[] p0,float p1,NewTextBaseElementData p2){
       c0 obj;
       float this;
       Object[] objArray;
       a to;
       float f;
       Object[] objArray1;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), p2, this, a.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "ids");
       obj = this.z.O();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.player.EditorVideoPlayer");
       VideoSDKPlayerView videoSDKPlay = obj.a();
       a.o(videoSDKPlay, "\(editorDelegate.editorPl¡­orVideoPlayer\).playerView");
       this = 200.00f;
       if (videoSDKPlay.getPlayer() == null) {
          objArray = new Object[0];
          a.D().w("TextPreviewBaseViewBinderV3", "getTextBoxSize player is null", objArray);
          return new Pair(Float.valueOf(this), Float.valueOf(this));
       }else {
          Minecraft$KSTextBox[] compTextBoxe = videoSDKPlay.getPlayer().getCompTextBoxesWithCompTextClipIds(p0, p1);
          to = this.o;
          a.o(to, "mActionRecycleView");
          to = ((float)n.z(to.getContext()) * 0x3f800000) / (float)videoSDKPlay.getPlayer().mProject.projectOutputWidth();
          if (compTextBoxe != null) {
             double d = (!compTextBoxe.length)? Double.MIN_VALUE: 0;
             if (!d) {
                this = (float)(ArraysKt___ArraysKt.ob(compTextBoxe).outerBound().size().x() * ArraysKt___ArraysKt.ob(compTextBoxe).outerBound().localToWorldScaling().x()) * to;
                f = (float)(ArraysKt___ArraysKt.ob(compTextBoxe).outerBound().size().y() * ArraysKt___ArraysKt.ob(compTextBoxe).outerBound().localToWorldScaling().y()) * to;
                objArray1 = new Object[0];
                a.D().w("TextPreviewBaseViewBinderV3", "getTextBoxSize use new", objArray1);
             }else if(p2 != null){
                to = (float)0;
                if (p2.i() - to > 0 && p2.f() - to > 0) {
                   this = p2.i();
                   f = p2.f();
                   objArray1 = new Object[0];
                   a.D().w("TextPreviewBaseViewBinderV3", "getTextBoxSize use old", objArray1);
                }
             }
             objArray = new Object[0];
             a.D().w("TextPreviewBaseViewBinderV3", "getTextBoxSize no box", objArray);
             f = 200.00f;
          }else {
             goto label_00ed ;
          }
          return new Pair(Float.valueOf(this), Float.valueOf(f));
       }
    }
    public final void c0(a p0,a p1){
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "16")) {
          return;
       }
       a.p(p0, "newEditingState");
       a.p(p1, "lastEditingState");
       if (p0.f() && !p1.f()) {
          objArray = new Object[0];
          a.D().w("TextPreviewBaseViewBinderV3", "enter edit, add finish button listener", objArray);
          this.d.setOnClickListener(this.w);
          e uoe = this.Z().o0();
          Objects.requireNonNull(uoe, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.decoration_v2.state.DecorationRootState");
          if (PostExperimentUtils.G((uoe.u() ^ 1))) {
             uoe = this.d;
             a.o(uoe, "mEditFinishButton");
             uoe.setVisibility(8);
          }else {
             uoe = this.d;
             a.o(uoe, "mEditFinishButton");
             uoe.setVisibility(0);
          }
          this.c.O0(1, 0);
          if (!this.h0()) {
             this.q0(0);
          }
          this.c.post(new a$j(this));
       }else if(!p0.f() && p1.f()){
          objArray = new Object[0];
          a.D().w("TextPreviewBaseViewBinderV3", "exist edit, remove finish button listener", objArray);
          this.d.setOnClickListener(null);
          p0 = this.d;
          a.o(p0, "mEditFinishButton");
          p0.setVisibility(8);
          this.c.post(new a$k(this));
          this.c.O0(0, 0);
          if (!this.h0()) {
             this.q0(1);
          }
          this.c.post(new a$l(this));
       }
       return;
    }
    public final void d0(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "15")) {
          return;
       }
       if (p0 != p1) {
          if (p0 == -1) {
             this.c.S(false);
          }else {
             EditDecorationBaseDrawer selectDrawer = this.c.getSelectDrawer();
             if (selectDrawer == null || selectDrawer.getLayerIndex() != p0) {
                this.c.z0(p0, false);
             }
          }
       }
       return;
    }
    public final void e0(){
       if (PatchProxy.applyVoid(null, this, a.class, "25")) {
          return;
       }
       a te = this.e;
       if (te != null && !te.getVisibility()) {
          this.e.setVisibility(8);
       }
       te = this.h;
       if (te != null && !te.getVisibility()) {
          this.h.setVisibility(8);
       }
       te = this.f;
       if (te != null && !te.getVisibility()) {
          this.f.setVisibility(8);
       }
       return;
    }
    public final void f0(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       f$a uoa = new f$a();
       uoa.b(true);
       uoa.a(false);
       uoa.c(a1.p(R.string.arg_RES_7f105058));
       uoa.d(false);
       this.c.X(uoa, null);
       return;
    }
    public abstract boolean g0();
    public final void h(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "12")) {
          return;
       }
       float f = (p0)? 0x3f800000: 0;
       this.n0(f);
       this.p0(p0);
       return;
    }
    public boolean h0(){
       return false;
    }
    public final void i0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       this.z.j().s0(new a$n(p0));
       return;
    }
    public final void j0(){
       if (PatchProxy.applyVoid(null, this, a.class, "19")) {
          return;
       }
       EditDecorationContainerView$b uob = this.a0();
       if (uob != null) {
          this.c.setDelegate(uob);
       }
       this.h(false);
       a tj = this.j;
       float alpha = (tj != null)? tj.getAlpha(): 0;
       this.k = alpha;
       tj = this.j;
       if (tj != null) {
          tj.setAlpha(0);
       }
       return;
    }
    public final void k0(){
       if (PatchProxy.applyVoid(null, this, a.class, "20")) {
          return;
       }
       this.h(true);
       a tj = this.j;
       if (tj != null) {
          tj.setAlpha(this.k);
       }
       return;
    }
    public final void l0(EditDecorationBaseDrawer p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       a.p(p1, "state");
       if (!p0 instanceof NewEditTextElement) {
          return;
       }
       if (p1.f()) {
          p0.getTextDrawerLayout().getFocusEditText().requestFocus();
       }
       return;
    }
    public final void m0(EditDecorationBaseDrawer p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "8")) {
          return;
       }
       a.p(p1, "state");
       if (!p0 instanceof NewEditTextElement) {
          return;
       }
       this.f0();
       p0.getTextDrawerLayout().g();
       if (p1.f()) {
          p0.getTextDrawerLayout().getFocusEditText().clearFocus();
       }
       return;
    }
    public final void n0(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "13")) {
          return;
       }
       uoa = this.l;
       a.o(uoa, "mMergeEditPostLayout");
       uoa.setAlpha(p0);
       uoa = this.o;
       a.o(uoa, "mActionRecycleView");
       uoa.setAlpha(p0);
       uoa = this.p;
       if (uoa != null) {
          uoa.setAlpha(p0);
       }
       uoa = this.r;
       if (uoa != null) {
          uoa.setAlpha(p0);
       }
       return;
    }
    public final void o0(boolean p0){
       this.v = p0;
    }
    public EditorFragmentBackPressedResult onBackPressed(){
       Object obj = PatchProxy.apply(null, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c.R();
       return EditorFragmentBackPressedResult.PASS_EVENT;
    }
    public final void p0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "14")) {
          return;
       }
       uoa = this.m;
       a.o(uoa, "mPostButtonV2");
       uoa.setClickable(p0);
       uoa = this.n;
       a.o(uoa, "mNextStepButton");
       uoa.setClickable(p0);
       uoa = this.o;
       a.o(uoa, "mActionRecycleView");
       uoa.setEnabled(p0);
       uoa = this.p;
       if (uoa != null) {
          View view = uoa.findViewById(R.id.left_btn_container);
          if (view != null) {
             view.setClickable(p0);
          }
       }
       uoa = this.r;
       if (uoa != null) {
          uoa.setEnabled(p0);
       }
       uoa = this.q;
       if (uoa != null) {
          uoa.setClickable(p0);
       }
       return;
    }
    public final void q0(boolean p0){
       Object[] objArray;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "10")) {
          return;
       }
       String str = "TextPreviewBaseViewBinderV3";
       if (this.h0()) {
          objArray = new Object[0];
          a.D().w(str, "inSubPage, do not animator", objArray);
          return;
       }else if(this.g0()){
          objArray = new Object[0];
          a.D().w(str, "inEditMode, do not animator", objArray);
          return;
       }else {
          Object[] objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, this, uoa, "11")) {
             uoa = this.s;
             if (uoa != null) {
                uoa.cancel();
             }
             this.s = objArray1;
          }
          int i = 0;
          int i1 = (p0)? 0: 0x3f800000;
          if (p0) {
             i = 0x3f800000;
          }
          float f = (p0)? 0x3fc00000: 2.50f;
          float[] uofloatArray = new float[]{i1,i};
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray).setDuration(300);
          this.s = valueAnimato;
          if (valueAnimato != null) {
             valueAnimato.setInterpolator(new DecelerateInterpolator(f));
             valueAnimato.addUpdateListener(new a$p(this, f, p0));
             valueAnimato.addListener(new a$q(this, f, p0));
             valueAnimato.start();
          }
          return;
       }
    }
    public void r0(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextPreviewBaseViewBinderV3", "startTextEditor", objArray);
       this.i0(true);
       this.Z().t0(new UpdatePlayerStateAction(0, UpdateTo.BOTH));
       j.a.c(this.y, this.c.getSelectDrawer());
       return;
    }
}
