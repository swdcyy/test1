package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3;
import nwc.a;
import ei0.a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$b;
import nsd.u;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$keyboardOffsetLiveData$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$underTextPanelView$2;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$d;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$lifecycleEventObserver$1;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$c;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import android.app.Activity;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.AbsoluteLayout;
import qsd.d;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Float;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.Map;
import wpc.a0;
import t36.f;
import rod.d;
import t36.f$a;
import rod.c;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3;
import rod.m;
import mod.a;
import rod.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Math;
import fvc.c;
import java.lang.Integer;
import ynd.e$a;
import rod.e;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextV3Element;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.util.Objects;
import jod.f;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import pod.a;
import lod.b;
import lod.f;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import mn9.b;
import ynd.e;
import ynd.g$a;
import ynd.g;
import android.view.ViewGroup;
import ynd.f$a;
import ynd.f;
import androidx.fragment.app.c;
import java.lang.Number;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;

public abstract class TextMainBaseViewBinderV3 extends a implements a	// class@000c3f
{
    public final EditDecorationContainerViewV2 c;
    public final View d;
    public float e;
    public final p f;
    public final p g;
    public TextMainFragmentV3 h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public int m;
    public boolean n;
    public final View o;
    public ObjectAnimator p;
    public final TextMainBaseViewBinderV3$d q;
    public final LifecycleEventObserver r;
    public final TextMainBaseViewBinderV3$c s;
    public final Fragment t;
    public final boolean u;
    public final EditorDelegate v;
    public static final TextMainBaseViewBinderV3$b w;

    static {
       TextMainBaseViewBinderV3.w = new TextMainBaseViewBinderV3$b(null);
    }
    public void TextMainBaseViewBinderV3(View p0,Fragment p1,boolean p2,EditorDelegate p3){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p3, "delegate");
       super(p0);
       this.t = p1;
       this.u = p2;
       this.v = p3;
       View view = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.c = view;
       this.d = p0.findViewById(0x7f0a0ca0);
       this.f = s.c(TextMainBaseViewBinderV3$keyboardOffsetLiveData$2.INSTANCE);
       this.g = s.c(new TextMainBaseViewBinderV3$underTextPanelView$2(this));
       this.j = 0x3f800000;
       this.k = 0x3f800000;
       this.m = -1;
       p0 = p0.findViewById(R.id.preview);
       a.o(p0, "rootView.findViewById\(R.id.preview\)");
       this.o = p0;
       this.q = new TextMainBaseViewBinderV3$d(this);
       this.r = new TextMainBaseViewBinderV3$lifecycleEventObserver$1(this);
       this.s = new TextMainBaseViewBinderV3$c(this);
       f.l(p1).I0(p1.requireActivity(), this.L());
       this.L().observe(p1, new TextMainBaseViewBinderV3$a(this));
    }
    private final Rect F(){
       int[] ointArray;
       float f3;
       Rect obj = PatchProxy.apply(null, this, TextMainBaseViewBinderV3.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (this.U()) {
          obj = new Rect();
          this.c.getGlobalVisibleRect(obj);
       }else {
          int i1 = 1;
          int i2 = 2;
          if (this.V()) {
             ointArray = new int[i2];
             this.c.getLocationInWindow(ointArray);
             Rect rect = new Rect(ointArray[i], ointArray[i1], d.H0(((float)ointArray[i] + ((float)this.c.getWidth() * this.c.getScaleX()))), d.H0(((float)ointArray[i1] + ((float)this.c.getHeight() * this.c.getScaleY()))));
             Object[] objArray1 = new Object[i];
             a.D().w("TextMainBaseViewBinderV3", "singlePictureReEdit, containerRect="+rect+", "+"mContainerView.scaleX="+this.c.getScaleX()+", mContainerView.scaleY="+this.c.getScaleY()+", "+"mContainerView.width="+this.c.getWidth()+", mContainerView.height="+this.c.getHeight(), objArray1);
             obj = rect;
          }else {
             ointArray = new int[i2];
             this.c.getLocationInWindow(ointArray);
             Rect rect1 = new Rect(ointArray[i], ointArray[i1], d.H0(((float)ointArray[i] + ((float)this.c.getWidth() * this.o.getScaleX()))), d.H0(((float)ointArray[i1] + ((float)this.c.getHeight() * this.o.getScaleY()))));
             Object[] objArray2 = new Object[i];
             a.D().w("TextMainBaseViewBinderV3", "containerRect="+rect1, objArray2);
             float f = (float)rect1.width() / this.o.getScaleX();
             float f1 = (float)rect1.height() / this.o.getScaleY();
             Object[] objArray3 = new Object[i];
             a.D().w("TextMainBaseViewBinderV3", "mPreviewView.scaleX="+this.o.getScaleX()+", mPreviewView.scaleY="+this.o.getScaleY(), objArray3);
             objArray3 = new Object[i];
             a.D().w("TextMainBaseViewBinderV3", "adjustWidth="+f+", adjustHeight="+f1, objArray3);
             objArray3 = new Object[i];
             a.D().w("TextMainBaseViewBinderV3", "mPreviewView.pivotX="+this.o.getPivotX()+", mPreviewView.pivotY="+this.o.getPivotY(), objArray3);
             if (this.o.getPivotY() - (float)i <= 0) {
                i1 = 0;
             }
             float f2 = (i1)? (float)rect1.centerY() - (f1 / (float)i2): (float)rect1.top;
             if (i1) {
                f3 = (float)rect1.centerY();
                f1 = f1 / (float)i2;
             }else {
                f3 = (float)rect1.top;
             }
             f = f / (float)i2;
             obj = new Rect(d.H0(((float)rect1.centerX() - f)), d.H0(f2), d.H0(((float)rect1.centerX() + f)), d.H0((f3 + f1)));
          }
       }
       Object[] objArray = new Object[i];
       a.D().w("TextMainBaseViewBinderV3", "adjustContainerRect="+obj, objArray);
       return obj;
    }
    private final MutableLiveData L(){
       Object obj = PatchProxy.apply(null, this, TextMainBaseViewBinderV3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    private final boolean U(){
       Object obj = PatchProxy.apply(null, this, TextMainBaseViewBinderV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.v.getType() == Workspace$Type.LONG_PICTURE)? true: false;
       return b;
    }
    private final void Y(float p0,float p1,float p2,float p3){
       PropertyValuesHolder[] propertyValu2;
       if (PatchProxy.isSupport(TextMainBaseViewBinderV3.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, TextMainBaseViewBinderV3.class, "17")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("TextMainBaseViewBinderV3", "previewPullUpAnimation start = "+p0+" end = "+p1+' '+"scaleStart="+p2+", scaleEnd="+p3, objArray);
       TextMainBaseViewBinderV3 tp = this.p;
       float[] uofloatArray = new float[]{p0,p1};
       PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat("translationY", uofloatArray);
       PropertyValuesHolder float[] uofloatArray1 = new float[]{p2,p3};
       uofloatArray1 = PropertyValuesHolder.ofFloat("scaleX", uofloatArray1);
       float[] uofloatArray2 = new float[]{p2,p3};
       PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat("scaleY", uofloatArray2);
       int i1 = 3;
       if (tp == null) {
          propertyValu2 = new PropertyValuesHolder[i1];
          propertyValu2[i] = uofloatArray1;
          propertyValu2[1] = propertyValu1;
          propertyValu2[2] = propertyValu;
          tp = ObjectAnimator.ofPropertyValuesHolder(this.o, propertyValu2);
       }else if(tp.isRunning()){
          tp.cancel();
       }
       propertyValu2 = new PropertyValuesHolder[i1];
       propertyValu2[i] = uofloatArray1;
       propertyValu2[1] = propertyValu1;
       propertyValu2[2] = propertyValu;
       tp.setValues(propertyValu2);
       if (p0 - p1 > 0) {
          i = true;
       }
       this.n = i;
       tp.addListener(this.s);
       tp.setDuration(200);
       tp.start();
       this.p = tp;
       this.c.S0(p3);
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, TextMainBaseViewBinderV3.class, "6")) {
          return;
       }
       this.c.d(this.G());
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, TextMainBaseViewBinderV3.class, "7")) {
          return;
       }
       this.c.M(this.G());
       TextMainBaseViewBinderV3 tp = this.p;
       if (tp != null) {
          tp.removeListener(this.s);
       }
       return;
    }
    public final void D(){
       TextMainBaseViewBinderV3 tp;
       TextMainBaseViewBinderV3 textMainBase = TextMainBaseViewBinderV3.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, textMainBase, "22")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, textMainBase, "9")) {
          Object[] objArray1 = new Object[false];
          a.D().w("TextMainBaseViewBinderV3", "releaseTextPanelPopup", objArray1);
          tp = this.h;
          if (tp != null) {
             tp.dismiss();
             tp = this.h;
             if (tp != null) {
                Lifecycle lifecycle = tp.getLifecycle();
                if (lifecycle != null) {
                   lifecycle.removeObserver(this.r);
                }
             }
             this.h = objArray;
             f.p0(this.v.u(), a0.class).q0(new d(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, textMainBase, "19") && this.l != null) {
          this.Y(this.o.getTranslationY(), this.i, this.o.getScaleX(), this.j);
          if (!this.T() && !this.Z()) {
             tp = this.p;
             if (tp != null) {
                c uoc = PatchProxy.apply(objArray, this, textMainBase, "20");
                if (uoc != PatchProxyResult.class) {
                }else {
                   uoc = new c(this);
                }
                tp.addListener(uoc);
             }
          }
          this.i = 0;
          this.j = 0x3f800000;
          this.l = false;
       }
       return;
    }
    public final void E(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextMainBaseViewBinderV3.class, "10")) {
          return;
       }
       TextMainBaseViewBinderV3 th = this.h;
       if (th != null && !PatchProxy.applyVoid(objArray, th, TextMainFragmentV3.class, "15")) {
          Boolean tRUE = Boolean.TRUE;
          if (!a.g(th.uh().p0().getValue(), tRUE)) {
             th.uh().p0().setValue(tRUE);
          }
       }
       return;
    }
    public abstract DecorationContainerView$d G();
    public final EditorDelegate H(){
       return this.v;
    }
    public abstract a I();
    public abstract b J();
    public final Fragment K(){
       return this.t;
    }
    public abstract EditReduxViewModel M();
    public void N(boolean p0){
       TextMainBaseViewBinderV3 textMainBase = TextMainBaseViewBinderV3.class;
       if (PatchProxy.isSupport(textMainBase) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, textMainBase, "18")) {
          return;
       }
       if (p0) {
          Rect rect = this.F();
          int i = 0;
          if (this.U()) {
             int[] ointArray = new int[2];
             this.c.getLocationInWindow(ointArray);
             rect = new Rect(ointArray[i], ointArray[1], (ointArray[i] + this.c.getWidth()), (ointArray[1] + this.c.getHeight()));
          }
          Rect left = rect.left;
          if (left > null) {
             i = left;
          }
          this.c.setRestrictRect(new Rect(((int)(((float)(i - rect.left) / (float)rect.width()) * (float)this.c.getEditorRect().width()) + this.c.getEditorRect().left), ((int)(((float)(Math.max(n.A(this.t.requireContext()), rect.top) - rect.top) / (float)rect.height()) * (float)this.c.getEditorRect().height()) + this.c.getEditorRect().top), ((int)(((float)(Math.min(n.y(this.t.requireContext()), rect.right) - rect.left) / (float)rect.width()) * (float)this.c.getEditorRect().width()) + this.c.getEditorRect().left), ((int)(((float)(Math.min((this.m - c.a()), rect.bottom) - rect.top) / (float)rect.height()) * (float)this.c.getEditorRect().height()) + this.c.getEditorRect().top)));
       }else {
          this.c.setRestrictRect(null);
       }
       return;
    }
    public abstract b P();
    public abstract b Q();
    public abstract b R();
    public final void S(a p0,a p1){
       TextKeyboardDataViewModelV3 e;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextMainBaseViewBinderV3.class, "23")) {
          return;
       }
       a.p(p0, "newEditingState");
       a.p(p1, "lastEditingState");
       if (p0.b()) {
          this.D();
       }else if(p0.e() && !p1.e()){
          FragmentActivity activity = this.t.getActivity();
          a.m(activity);
          int i = 0x1020002;
          View view = activity.findViewById(i);
          a.o(view, "fragment.activity!!.find¡­ew>\(android.R.id.content\)");
          int height = view.getHeight();
          if (!PatchProxy.isSupport(TextMainBaseViewBinderV3.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(height), this, TextMainBaseViewBinderV3.class, "21")) {
             e$a uoa = e$a.class;
             if (!PatchProxy.isSupport(TextMainBaseViewBinderV3.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(height), this, TextMainBaseViewBinderV3.class, "8")) {
                int i1 = 0;
                Object[] objArray = new Object[i1];
                a.D().w("TextMainBaseViewBinderV3", "showTextPanelPopup", objArray);
                if (height > 0) {
                   TextMainBaseViewBinderV3 th = this.h;
                   if (th != null) {
                      th.Dh(height);
                   }else if(this.t.getActivity() == null){
                      f.p0(this.v.u(), a0.class).q0(e.a);
                      if (this.c.getSelectDrawer() instanceof NewEditTextV3Element) {
                         EditDecorationBaseDrawer selectDrawer = this.c.getSelectDrawer();
                         Objects.requireNonNull(selectDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextV3Element");
                         f keyboardData = selectDrawer.getKeyboardData();
                         ViewModel viewModel = ViewModelProviders.of(this.t.requireActivity()).get(TextKeyboardDataViewModelV3.class);
                         a.o(viewModel, "ViewModelProviders.of\(fr¡­aViewModelV3::class.java\)");
                         if (this.u == null && PostExperimentUtils.b0()) {
                            i1 = true;
                         }
                         e$a uoa1 = new e$a().c(new f(viewModel.p0(), 4)).d(new a(viewModel.r0())).b(new a(viewModel.o0()));
                         TextKeyboardDataViewModelV3 d = viewModel.d;
                         Objects.requireNonNull(uoa1);
                         Object obj = PatchProxy.applyOneRefs(d, uoa1, uoa, "5");
                         if (obj != PatchProxyResult.class) {
                            uoa1 = obj;
                         }else {
                            a.p(d, "textTemplateRepoV3NeedRequestNetwork");
                            uoa1.d = d;
                         }
                         e = viewModel.e;
                         Objects.requireNonNull(uoa1);
                         uoa = PatchProxy.applyOneRefs(e, uoa1, uoa, "4");
                         if (uoa != PatchProxyResult.class) {
                            uoa1 = uoa;
                         }else {
                            a.p(e, "designTemplateRepoV3NeedRequestNetwork");
                            uoa1.e = e;
                         }
                         e uoe = uoa1.a();
                         g$a uoa2 = new g$a();
                         uoa2.c(i1);
                         g og = uoa2.b(keyboardData).a();
                         FragmentActivity activity1 = this.t.getActivity();
                         a.m(activity1);
                         View view1 = activity1.findViewById(i);
                         i = PatchProxy.apply(null, this, TextMainBaseViewBinderV3.class, "3");
                         if (i == PatchProxyResult.class) {
                            i = this.g.getValue();
                         }
                         EditReduxViewModel uEditReduxVi = this.M();
                         Objects.requireNonNull(uEditReduxVi, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel<com.yxcrop.gifshow.v3.editor.decoration_v2.state.DecorationRootState>");
                         TextMainFragmentV3 textMainFrag = new TextMainFragmentV3(view1, i, new f$a().c(og).b(uoe).a(), this.u, height, uEditReduxVi, height, this.c);
                         this.h = v11;
                         v11.show(this.t.getChildFragmentManager(), "TextPanel");
                         TextMainBaseViewBinderV3 th1 = this.h;
                         if (th1 != null) {
                            Lifecycle lifecycle = th1.getLifecycle();
                            if (lifecycle != null) {
                               lifecycle.addObserver(this.r);
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public abstract boolean T();
    public boolean V(){
       return false;
    }
    public final boolean W(){
       return this.u;
    }
    public final boolean X(int p0){
       Rect obj;
       float f;
       int i2;
       Object[] objArray3;
       Object[] objArray5;
       EditDecorationBaseDrawer selectDrawer;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TextMainBaseViewBinderV3 textMainBase = TextMainBaseViewBinderV3.class;
       if (PatchProxy.isSupport(textMainBase)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, textMainBase, "12");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (this.h == null) {
          return this.l;
       }else {
          obj = this.F();
          if (PatchProxy.isSupport(textMainBase)) {
             Object[] obj1 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p0), this, textMainBase, "15");
             if (obj1 != patchProxyRe) {
                p0 = obj1.intValue();
             }else {
             label_0046 :
                boolean i = n.A(this.t.requireContext());
                int i1 = (p0 + i) >> true;
                StringBuilder str = "statusBarHeight="+i;
                Object[] objArray1 = new Object[0];
                a.D().w("TextMainBaseViewBinderV3", str+", textPanelTop="+p0+", "+"centerYOfRemainingSpace="+i1, objArray1);
                i = (this.c.getWidth() <= this.c.getHeight())? true: false;
                Object[] objArray2 = new Object[0];
                a.D().w("TextMainBaseViewBinderV3", "isVerticalPreview="+i+", w="+this.c.getWidth()+",h="+this.c.getHeight(), objArray2);
                if (i) {
                   obj1 = PatchProxy.applyOneRefs(obj, this, textMainBase, "14");
                   if (obj1 != patchProxyRe) {
                      i2 = obj1.intValue();
                   }else {
                      obj1 = null;
                      Object obj2 = PatchProxy.apply(obj1, this, textMainBase, "16");
                      if (obj2 != patchProxyRe) {
                         obj1 = obj2;
                      }else if(this.c.getSelectDrawer() instanceof NewEditTextBaseElement){
                         selectDrawer = this.c.getSelectDrawer();
                         Objects.requireNonNull(selectDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement<*>");
                         EditDecorationBaseDrawer uEditDecorat = selectDrawer;
                      }else {
                         selectDrawer = this.c.getSelectDrawer();
                         if (selectDrawer != null) {
                            ExceptionHandler.handleCaughtException(new RuntimeException("TextMainBaseViewBinderV3 "+selectDrawer.getClass()+" does not match EditTextBaseElement"));
                         }
                      }
                      if (obj1 != null) {
                         f = obj1.getMoveY();
                         Object[] objArray6 = new Object[0];
                         a.D().w("TextMainBaseViewBinderV3", "textCenterYRatio="+f, objArray6);
                         i2 = d.H0(((f * (float)obj.height()) + (float)obj.top));
                         objArray6 = new Object[0];
                         a.D().w("TextMainBaseViewBinderV3", "centerYOfText="+i2, objArray6);
                      }else {
                         i2 = -1;
                      }
                   }
                   if (i2 <= i1) {
                      objArray3 = new Object[0];
                      a.D().w("TextMainBaseViewBinderV3", "centerYOfText <= centerYOfRemainingSpace, offset=0", objArray3);
                   }else if(obj.bottom < p0){
                      objArray3 = new Object[0];
                      a.D().w("TextMainBaseViewBinderV3", "adjustContainerRect.bottom < textPanelTop, offset=0", objArray3);
                   }else {
                      i2 = i2 - i1;
                      Object[] objArray4 = new Object[0];
                      a.D().w("TextMainBaseViewBinderV3", "distanceOfCenter="+i2, objArray4);
                      if ((obj.bottom - i2) < p0) {
                         objArray5 = new Object[0];
                         a.D().w("TextMainBaseViewBinderV3", "move will let container bottom out of bound", objArray5);
                         i2 = obj.bottom - p0;
                      }else {
                         objArray5 = new Object[0];
                         a.D().w("TextMainBaseViewBinderV3", "move right now", objArray5);
                      }
                      p0 = i2;
                   }
                }else {
                   objArray5 = new Object[0];
                   a.D().w("TextMainBaseViewBinderV3", "adjustContainerRect.centerY\(\)="+obj.centerY(), objArray5);
                   if (obj.centerY() > i1) {
                      objArray3 = new Object[0];
                      a.D().w("TextMainBaseViewBinderV3", "horizontal move to centerYOfRemainingSpace", objArray3);
                      p0 = obj.centerY() - i1;
                   }else {
                      objArray3 = new Object[0];
                      a.D().w("TextMainBaseViewBinderV3", "horizontal not necessary to move", objArray3);
                   }
                }
                p0 = 0;
             }
          }else {
             goto label_0046 ;
          }
          Object[] objArray = new Object[0];
          a.D().w("TextMainBaseViewBinderV3", "offset = "+p0, objArray);
          objArray = new Object[0];
          a.D().w("TextMainBaseViewBinderV3", "mPreviewView.scaleX="+this.o.getScaleX(), objArray);
          objArray = new Object[0];
          a.D().w("TextMainBaseViewBinderV3", "mPreviewView.scaleY="+this.o.getScaleY(), objArray);
          if (p0 > 0 || this.o.getScaleX() - this.k) {
             if (this.l == null) {
                this.i = this.o.getTranslationY();
                this.j = this.o.getScaleX();
             }
             f = (p0 > 0)? this.o.getTranslationY() - (float)p0: this.o.getTranslationY();
             this.Y(this.o.getTranslationY(), f, this.o.getScaleX(), this.k);
             this.c.setTag(R.id.TAG_PREVIEW_ANIMATOR_ID, this.p);
             if (!this.T()) {
                TextMainBaseViewBinderV3 td = this.d;
                float alpha = (td != null)? td.getAlpha(): 0;
                this.e = alpha;
                td = this.d;
                if (td != null) {
                   td.setAlpha(0);
                }
             }
             return true;
          }else {
             return this.l;
          }
       }
    }
    public boolean Z(){
       return false;
    }
    public EditorFragmentBackPressedResult onBackPressed(){
       return EditorFragmentBackPressedResult.PASS_EVENT;
    }
}
