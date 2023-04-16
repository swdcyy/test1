package nmd.v;
import yld.l;
import nwc.a;
import ei0.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import smd.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.widget.TextView;
import com.kuaishou.edit.draft.Workspace$Type;
import fmd.a;
import nmd.v$f;
import nmd.v$m;
import nmd.v$d;
import nmd.v$g;
import nmd.v$h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import android.widget.Button;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ooc.j0;
import androidx.lifecycle.ViewModel;
import t36.f;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c$a;
import java.util.Map;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.graphics.Point;
import nmd.v$a;
import java.lang.Runnable;
import nmd.v$b;
import android.widget.AbsoluteLayout;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import nmd.v$c;
import mmd.a;
import nmd.v$e;
import t36.f$a;
import nmd.v$i;
import mmd.b;
import mod.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditEndAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import wnd.j;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.util.List;
import android.graphics.Rect;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.action.GenerateInteractStickerFileAction;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import rmd.c;
import tvc.e;
import nmd.v$j;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import android.widget.EditText;
import com.yxcorp.gifshow.decoration.widget.f$a;
import com.yxcorp.gifshow.decoration.widget.f$b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerLibraryCloseAction;
import rmd.e;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import rmd.f;
import umd.c;
import u2.f;
import xld.a;
import java.lang.Integer;
import android.view.View$OnClickListener;
import nmd.a0;
import android.text.Editable;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import nmd.b0;
import nmd.c0;
import nmd.d0;
import nmd.e0;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import nmd.v$k;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import nmd.v$l;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerStateAction;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import android.app.Activity;
import wnd.b;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;

public abstract class v extends a implements l, a	// class@001e86
{
    public final View$OnClickListener A;
    public final v$m B;
    public final v$d C;
    public final v$g D;
    public final v$h E;
    public final View F;
    public final Fragment G;
    public final EditorDelegate H;
    public final d I;
    public final h c;
    public final EditDecorationContainerViewV2 d;
    public final View e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final View j;
    public final View k;
    public float l;
    public final View m;
    public final View n;
    public final View o;
    public final View p;
    public View q;
    public Button r;
    public View s;
    public ValueAnimator t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final a z;

    public void v(View p0,Fragment p1,EditorDelegate p2,d p3){
       a.p(p0, "rootView");
       a.p(p1, "previewFragment");
       a.p(p2, "delegate");
       a.p(p3, "viewModel");
       super(p0);
       this.F = p0;
       this.G = p1;
       this.H = p2;
       this.I = p3;
       h oh = f.l(p1);
       a.o(oh, "EditUtils.getEditorPrevi¡­iewModel\(previewFragment\)");
       this.c = oh;
       View view = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.d = view;
       this.e = p0.findViewById(0x7f0a3e13);
       this.f = p0.findViewById(0x7f0a3e4c);
       this.g = p0.findViewById(0x7f0a3c06);
       this.h = p0.findViewById(0x7f0a3b6b);
       this.i = p0.findViewById(0x7f0a3e06);
       this.j = p0.findViewById(0x7f0a141a);
       this.k = p0.findViewById(0x7f0a0ca0);
       this.m = p0.findViewById(0x7f0a2b4e);
       this.n = p0.findViewById(0x7f0a318f);
       this.o = p0.findViewById(0x7f0a2dc7);
       this.p = p0.findViewById(0x7f0a00ab);
       this.x = true;
       this.y = f.E(p2.getType());
       this.z = new a(p3, false);
       this.A = new v$f(this);
       this.B = new v$m(this);
       this.C = new v$d(this);
       this.D = new v$g(this);
       this.E = new v$h(this);
    }
    public void B(){
       Object[] objArray1;
       PostRadioGroupWithIndicator postRadioGro;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v.class, "1")) {
          return;
       }
       this.w = DraftUtils.o(this.H.N());
       FragmentActivity activity = this.G.getActivity();
       if (!activity instanceof EditorActivity) {
          activity = objArray;
       }
       if (activity != null) {
          AbsEditorActivityViewBinder uAbsEditorAc = activity.N3();
          if (uAbsEditorAc != null) {
             View view = uAbsEditorAc.D();
          label_0033 :
             this.q = view;
             activity = this.G.getActivity();
             if (!activity instanceof EditorActivity) {
                objArray1 = objArray;
             }
             if (objArray1 != null) {
                uAbsEditorAc = objArray1.N3();
                if (uAbsEditorAc != null) {
                   postRadioGro = uAbsEditorAc.C();
                label_0050 :
                   this.s = postRadioGro;
                   activity = this.G.getActivity();
                   if (!activity instanceof EditorActivity) {
                      objArray1 = objArray;
                   }
                   if (objArray1 != null) {
                      uAbsEditorAc = objArray1.N3();
                      if (uAbsEditorAc != null) {
                         objArray = uAbsEditorAc.B();
                      }
                   }
                   this.r = objArray;
                   this.d.d(this.C);
                   int i = 0;
                   this.d.setVisibility(i);
                   v tj = this.j;
                   if (tj != null) {
                      tj.setVisibility(i);
                   }
                   ViewModelProviders.of(this.G.requireActivity()).get(j0.class).o0().d(this.D);
                   f.o0(this.V(), this.H.u(), c$a.class);
                   return;
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
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v.class, "2")) {
          return;
       }
       this.d.setDelegate(objArray);
       this.d.M(this.C);
       this.d.setVisibility(8);
       f.t0(this.V(), this.H.u(), c$a.class);
       ViewModelProviders.of(this.G.requireActivity()).get(j0.class).o0().d(this.D);
       return;
    }
    public final void D(TextView p0,Point p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "19")) {
          return;
       }
       if (p1 == null || p0 == null) {
          Object[] objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "bottomCenterPoint = "+p1+", tipView = "+p0+' ', objArray);
          return;
       }else {
          this.E(p0, p1);
          p0.postDelayed(new v$a(p0), 5000);
          this.d.post(new v$b(this));
          return;
       }
    }
    public final void E(TextView p0,Point p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "20")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "adjustAndShowTip: ";
       a.D().w("StickerPreviewBaseViewBinder", str, objArray);
       if (p1 != null && p0 != null) {
          int[] ointArray = new int[2];
          p0.getLocationOnScreen(ointArray);
          int i1 = (p1.x - (p0.getWidth() / 2)) - ointArray[i];
          int i2 = (p1.y - p0.getHeight()) - ointArray[1];
          Object[] objArray1 = new Object[i];
          a.D().w("StickerPreviewBaseViewBinder", str+i1+", "+i2+", "+p0.getTranslationX()+", "+p0.getTranslationY(), objArray1);
          p0.setTranslationX((p0.getTranslationX() + (float)i1));
          p0.setTranslationY((p0.getTranslationY() + (float)i2));
          p0.post(new v$c(p0));
       }
       return;
    }
    public abstract a F();
    public final void G(){
       if (PatchProxy.applyVoid(null, this, v.class, "29")) {
          return;
       }
       this.H.j().s0(v$e.a);
       return;
    }
    public final void H(){
       if (PatchProxy.applyVoid(null, this, v.class, "30")) {
          return;
       }
       this.H.j().s0(v$i.a);
       return;
    }
    public final void I(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, v.class, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("StickerPreviewBaseViewBinder", "endTextEditor", objArray);
       if (this.a0().y().g()) {
          objArray1 = new Object[i];
          a.D().w("StickerPreviewBaseViewBinder", "endTextEditor, send TextEditEndAction", objArray1);
          this.I.t0(new TextEditEndAction());
       }else {
          objArray1 = new Object[i];
          a.D().w("StickerPreviewBaseViewBinder", "endTextEditor, hide keyboard", objArray1);
          j.a.e(this.G, this.d);
       }
       return;
    }
    public final void J(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "25")) {
          return;
       }
       this.K(p0, false);
       return;
    }
    public final void K(EditDecorationBaseDrawer p0,boolean p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ov, "26")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("StickerPreviewBaseViewBinder", "generateStickerBitmap: ", objArray);
       if (!p0 instanceof NewEditStickerBaseDrawer) {
          return;
       }
       NewEditStickerBaseDrawer newEditStick = p0;
       if (newEditStick.isNeedGenerateBitmap() || p0.mDecorationBitmap == null) {
          if (this.y != null && p0 instanceof NewVoteStickerDrawer) {
             p0.generateDecorationBitmap(this.L(newEditStick.getAttachIdentifierList()));
          }else {
             p0.generateDecorationBitmap();
          }
          if (p0.isInteractSticker() && p0.mDecorationBitmap != null) {
             int i = this.d.getEditorRect().width();
             if (p1) {
                NewEditStickerBaseDrawer newEditStick1 = p0;
                GenerateInteractStickerFileAction generateInte = new GenerateInteractStickerFileAction(newEditStick1, this.N(newEditStick1.getAttachIdentifierList()), this.L(newEditStick1.getAttachIdentifierList()), i, this.y, c.d(newEditStick1.getElementData(), c.a.b(newEditStick1.getEditStickerType(), newEditStick1.getEditStickerSubType()), (float)i), this.I.o0().w());
                this.I.t0(newEditStick);
             }else {
                k1.r(new v$j(this, p0, i), 0);
             }
          }
          p0.setNeedGenerateBitmap(0);
       }
       return;
    }
    public abstract float L(List p0);
    public abstract int M(List p0);
    public abstract Size N(List p0);
    public final EditDecorationContainerViewV2 P(){
       return this.d;
    }
    public final boolean Q(){
       return this.w;
    }
    public final TextView R(){
       return this.h;
    }
    public final TextView S(){
       return this.g;
    }
    public final TextView T(){
       return this.i;
    }
    public final TextView U(){
       return this.f;
    }
    public abstract c$a V();
    public final Fragment W(){
       return this.G;
    }
    public final h X(){
       return this.c;
    }
    public final a Y(){
       return this.z;
    }
    public EditDecorationContainerView$b Z(){
       return null;
    }
    public abstract b a0();
    public final d b0(){
       return this.I;
    }
    public final boolean c0(){
       List obj = PatchProxy.apply(null, this, v.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d.getDecorationDrawerList();
       a.o(obj, "mContainerView.decorationDrawerList");
       Iterator iterator = obj.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          EditDecorationBaseDrawer uEditDecorat = iterator.next();
          if (uEditDecorat instanceof NewVoteStickerDrawer) {
             break ;
          }else if(uEditDecorat instanceof NewRelayStickerDrawer){
             return true;
          }
       }
       return true;
    }
    public final boolean d0(){
       List obj = PatchProxy.apply(null, this, v.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d.getDecorationDrawerList();
       a.o(obj, "mContainerView.decorationDrawerList");
       Iterator iterator = obj.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next() instanceof NewTagStickerElement) {
             break ;
          }
       }
       return true;
    }
    public abstract boolean e0();
    public boolean f0(){
       Object obj = PatchProxy.apply(null, this, v.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.I.o0().B();
    }
    public final boolean g0(){
       return this.y;
    }
    public void h(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "10")) {
          return;
       }
       ov = this.m;
       a.o(ov, "mMergeEditPostLayout");
       float f = 0x3f800000;
       float f1 = (p0)? 0x3f800000: 0;
       ov.setAlpha(f1);
       ov = this.n;
       a.o(ov, "mPostButtonV2");
       ov.setClickable(p0);
       ov = this.o;
       a.o(ov, "mNextStepButton");
       ov.setClickable(p0);
       ov = this.p;
       String str = "mActionRecycleView";
       a.o(ov, str);
       float f2 = (p0)? 0x3f800000: 0;
       ov.setAlpha(f2);
       ov = this.p;
       a.o(ov, str);
       ov.setEnabled(p0);
       ov = this.q;
       if (ov != null) {
          f1 = (p0)? 0x3f800000: 0;
          ov.setAlpha(f1);
       }
       ov = this.q;
       if (ov != null) {
          View view = ov.findViewById(R.id.left_btn_container);
          if (view != null) {
             view.setClickable(p0);
          }
       }
       ov = this.s;
       if (ov != null) {
          f1 = (p0)? 0x3f800000: 0;
          ov.setAlpha(f1);
       }
       ov = this.s;
       if (ov != null) {
          ov.setEnabled(p0);
       }
       ov = this.r;
       if (ov != null) {
          ov.setClickable(p0);
       }
       ov = this.r;
       if (ov != null) {
          if (!p0) {
             f = 0;
          }
          ov.setAlpha(f);
       }
       return;
    }
    public final void h0(){
       if (PatchProxy.applyVoid(null, this, v.class, "15")) {
          return;
       }
       EditDecorationContainerView$b uob = this.Z();
       if (uob != null) {
          this.d.setDelegate(uob);
       }
       this.h(false);
       v tk = this.k;
       float alpha = (tk != null)? tk.getAlpha(): 0;
       this.l = alpha;
       tk = this.k;
       if (tk != null) {
          tk.setAlpha(0);
       }
       return;
    }
    public final void i0(){
       if (PatchProxy.applyVoid(null, this, v.class, "16")) {
          return;
       }
       this.h(true);
       v tk = this.k;
       if (tk != null) {
          tk.setAlpha(this.l);
       }
       return;
    }
    public final void j0(EditDecorationBaseDrawer p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "6")) {
          return;
       }
       a.p(p1, "state");
       Object[] objArray = new Object[0];
       a.D().w("StickerPreviewBaseViewBinder", "onMoveScaleRotateActionEnd", objArray);
       this.u = false;
       if (p1.y().f() && p0 instanceof NewEditStickerBaseDrawer) {
          EditText focusEditTex = p0.getFocusEditText();
          if (focusEditTex != null) {
             focusEditTex.requestFocus();
          }
       }
       this.n0(true);
       return;
    }
    public final void k0(EditDecorationBaseDrawer p0,b p1){
       v ov = v.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ov, "5")) {
          return;
       }
       a.p(p1, "state");
       Object[] objArray = new Object[0];
       a.D().w("StickerPreviewBaseViewBinder", "onMoveScaleRotateActionStart", objArray);
       this.u = true;
       if (!PatchProxy.applyVoid(null, this, ov, "28")) {
          objArray = new Object[0];
          a.D().w("StickerPreviewBaseViewBinder", "initStickerSafeAreaInfo: ", objArray);
          f$a uoa = new f$a();
          uoa.b(0);
          uoa.a(0);
          uoa.d(0);
          this.d.X(uoa, null);
       }
       if (p1.y().f() && p0 instanceof NewEditStickerBaseDrawer) {
          EditText focusEditTex = p0.getFocusEditText();
          if (focusEditTex != null) {
             focusEditTex.clearFocus();
          }
       }
       if (this.I.o0().B()) {
          this.I.t0(new StickerLibraryCloseAction());
       }
       this.n0(0);
       return;
    }
    public void l0(b p0,b p1){
       Object[] objArray;
       v te;
       v ov = v.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ov, "12")) {
          return;
       }
       String str = "newState";
       a.p(p0, str);
       String str1 = "lastState";
       a.p(p1, str1);
       List list = p1.i();
       List list1 = p0.i();
       if (a.g(list, list1) ^ 1) {
          f uof = new f(this.d, this.G, this.y, list1, list, this.E);
          h.b(new e(list1, list)).e(v12);
       }
       int i = p0.o();
       boolean i1 = p1.o();
       if (PatchProxy.isSupport(ov) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), this, ov, "11") && i != i1)) {
          if (i == -1) {
             this.d.S(0);
          }else {
             EditDecorationBaseDrawer selectDrawer2 = this.d.getSelectDrawer();
             if (selectDrawer2 == null || selectDrawer2.getLayerIndex() != i) {
                this.d.z0(i, 0);
             }
          }
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, ov, "13")) {
          a.p(p0, str);
          a.p(p1, str1);
          String str2 = "StickerPreviewBaseViewBinder";
          if (p0.y().f() && !p1.y().f()) {
             objArray = new Object[0];
             a.D().w(str2, "enter edit, add finish button listener", objArray);
             this.d.setDelegate(this.Z());
             this.e.setOnClickListener(this.A);
             te = this.e;
             a.o(te, "mEditFinishButton");
             te.setVisibility(0);
             this.d.O0(1, 0);
             this.d.setMEnableHideDecorationView(0);
             if (!this.f0()) {
                this.n0(0);
             }
             this.d.post(new a0(this));
          }else if(!p0.y().f() && p1.y().f()){
             Object[] objArray1 = new Object[0];
             a.D().w(str2, "exist edit, remove finish button listener", objArray1);
             if (this.d.getSelectDrawer() != null) {
                EditDecorationBaseDrawer selectDrawer = this.d.getSelectDrawer();
                a.m(selectDrawer);
                a.o(selectDrawer, "mContainerView.selectDrawer!!");
                this.J(selectDrawer);
             }
             objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, ov, "17")) {
                EditDecorationBaseDrawer selectDrawer1 = this.d.getSelectDrawer();
                if (selectDrawer1 != null && selectDrawer1 instanceof NewEditStickerBaseDrawer) {
                   EditText focusEditTex = selectDrawer1.getFocusEditText();
                   if (focusEditTex != null && focusEditTex.hasFocus()) {
                      focusEditTex.clearFocus();
                      a.o(focusEditTex, "editText");
                      focusEditTex.setFocusable(0);
                      focusEditTex.setFocusableInTouchMode(0);
                   }
                }
             }
             Iterator iterator = this.d.getDecorationDrawerList().iterator();
             while (iterator.hasNext()) {
                EditDecorationBaseDrawer uEditDecorat = iterator.next();
                a.o(uEditDecorat, "drawer");
                EditText obj = PatchProxy.applyOneRefs(uEditDecorat, this, ov, "14");
                if (obj != PatchProxyResult.class) {
                   i1 = obj.booleanValue();
                }else if(uEditDecorat instanceof NewTagStickerElement){
                   obj = uEditDecorat.getFocusEditText();
                   if (obj != null) {
                      Editable text = obj.getText();
                      if (text != null) {
                         CharSequence uCharSequenc = StringsKt__StringsKt.o5(text);
                         if (uCharSequenc != null) {
                            uCharSequenc = (!uCharSequenc.length())? 1: 0;
                            if (uCharSequenc == 1) {
                            label_01cd :
                               i1 = true;
                            }
                         }
                      }
                   }
                }else if(uEditDecorat instanceof NewRelayStickerDrawer){
                   NewStickerElementData elementData = uEditDecorat.getElementData();
                   Objects.requireNonNull(elementData, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData");
                   String str3 = elementData.W0();
                   Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.CharSequence");
                   if (!(StringsKt__StringsKt.o5(str3).toString()).length()) {
                      goto label_01cd ;
                   }
                }
                i1 = false;
                if (i1) {
                   this.d.post(new b0(this, uEditDecorat));
                }
             }
             if (this.y != null || (!this.f0() && !p0.s())) {
                this.d.post(new c0(this));
             }
             this.e.setOnClickListener(objArray);
             te = this.e;
             a.o(te, "mEditFinishButton");
             te.setVisibility(8);
             this.d.post(new d0(this));
             this.d.O0(0, 0);
             if (!this.f0()) {
                this.n0(1);
                this.d.setMEnableHideDecorationView(1);
             }
             this.d.post(new e0(this));
          }
       }
       return;
    }
    public final void m0(boolean p0){
       this.x = p0;
    }
    public final void n0(boolean p0){
       Object[] objArray;
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "7")) {
          return;
       }
       String str = "StickerPreviewBaseViewBinder";
       if (this.f0()) {
          objArray = new Object[0];
          a.D().w(str, "inSubPage, do not animator", objArray);
          return;
       }else if(this.e0()){
          objArray = new Object[0];
          a.D().w(str, "inEditMode, do not animator", objArray);
          return;
       }else {
          Object[] objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, this, ov, "9")) {
             ov = this.t;
             if (ov != null) {
                ov.cancel();
             }
             this.t = objArray1;
          }
          int i = 0;
          int i1 = (p0)? 0: 0x3f800000;
          if (p0) {
             i = 0x3f800000;
          }
          float f = (p0)? 0x3fc00000: 2.50f;
          float[] uofloatArray = new float[]{i1,i};
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray).setDuration(200);
          this.t = valueAnimato;
          if (valueAnimato != null) {
             valueAnimato.setInterpolator(new DecelerateInterpolator(f));
             valueAnimato.addUpdateListener(new v$k(this, f, p0));
             valueAnimato.addListener(new v$l(this, f, p0));
             valueAnimato.start();
          }
          return;
       }
    }
    public void o0(){
       c a;
       if (PatchProxy.applyVoid(null, this, v.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("StickerPreviewBaseViewBinder", "startTextEditor", objArray);
       this.I.t0(new UpdatePlayerStateAction(0, UpdateTo.BOTH));
       a = c.a;
       v tG = this.G;
       EditDecorationBaseDrawer selectDrawer = this.d.getSelectDrawer();
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(tG, selectDrawer, a, c.class, "16")) {
          a.p(tG, "fragment");
          FragmentActivity activity = tG.getActivity();
          a.m(activity);
          View view = activity.findViewById(0x1020002);
          a.o(view, "fragment.activity!!.find¡­ew>\(android.R.id.content\)");
          b.c(view.getHeight());
          if (selectDrawer != null && selectDrawer instanceof NewEditStickerBaseDrawer) {
             selectDrawer.enterEditingMode();
          }
       }
       return;
    }
    public EditorFragmentBackPressedResult onBackPressed(){
       Object obj = PatchProxy.apply(null, this, v.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d.R();
       return EditorFragmentBackPressedResult.PASS_EVENT;
    }
    public void x(a p0,a p1){
       this.l0(p0, p1);
    }
}
