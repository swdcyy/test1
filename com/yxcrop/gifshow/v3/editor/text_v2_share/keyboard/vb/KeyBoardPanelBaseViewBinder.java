package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
import nwc.a;
import ei0.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$b;
import nsd.u;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$keyboardOffsetLiveData$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$e;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$lifecycleEventObserver$1;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$d;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import android.app.Activity;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment;
import iod.a;
import android.graphics.Rect;
import android.widget.AbsoluteLayout;
import qsd.d;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import ynd.c;
import mod.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import java.util.Objects;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Math;
import fvc.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import android.widget.EditText;
import android.text.Editable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextV3Element;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import java.lang.Integer;
import java.lang.Number;
import android.widget.RelativeLayout;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$c;
import erd.r;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Float;
import android.animation.PropertyValuesHolder;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.Map;
import wpc.a0;
import t36.f;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$g;
import t36.f$a;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$h;
import jod.f;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lod.n;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import lod.f;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import ynd.e$a;
import mn9.b;
import ynd.e;
import ynd.g$a;
import ynd.g;
import ynd.f$a;
import ynd.f;
import wnd.b;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditEndAction;
import xvc.b;

public abstract class KeyBoardPanelBaseViewBinder extends a implements a	// class@000bc8
{
    public final EditDecorationContainerViewV2 c;
    public final View d;
    public float e;
    public final p f;
    public TextKeyboardFragment g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public int l;
    public final View m;
    public ObjectAnimator n;
    public final KeyBoardPanelBaseViewBinder$e o;
    public final LifecycleEventObserver p;
    public final KeyBoardPanelBaseViewBinder$d q;
    public final KeyBoardPanelBaseViewBinder$f r;
    public final Fragment s;
    public final boolean t;
    public final boolean u;
    public final EditorDelegate v;
    public static final KeyBoardPanelBaseViewBinder$b w;

    static {
       KeyBoardPanelBaseViewBinder.w = new KeyBoardPanelBaseViewBinder$b(null);
    }
    public void KeyBoardPanelBaseViewBinder(View p0,Fragment p1,boolean p2,boolean p3,EditorDelegate p4){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p4, "delegate");
       super(p0);
       this.s = p1;
       this.t = p2;
       this.u = p3;
       this.v = p4;
       View view = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.c = view;
       this.d = p0.findViewById(0x7f0a0ca0);
       this.f = s.c(KeyBoardPanelBaseViewBinder$keyboardOffsetLiveData$2.INSTANCE);
       this.i = 0x3f800000;
       this.j = 0x3f800000;
       this.l = -1;
       this.m = p0.findViewById(0x7f0a31cc);
       this.o = new KeyBoardPanelBaseViewBinder$e(this);
       this.p = new KeyBoardPanelBaseViewBinder$lifecycleEventObserver$1(this);
       this.q = new KeyBoardPanelBaseViewBinder$d(this);
       f.l(p1).I0(p1.requireActivity(), this.M());
       this.M().observe(p1, new KeyBoardPanelBaseViewBinder$a(this));
       this.r = new KeyBoardPanelBaseViewBinder$f(this);
    }
    private final MutableLiveData M(){
       Object obj = PatchProxy.apply(null, this, KeyBoardPanelBaseViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    private final boolean W(){
       Object obj = PatchProxy.apply(null, this, KeyBoardPanelBaseViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.v.getType() == Workspace$Type.LONG_PICTURE)? true: false;
       return b;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, KeyBoardPanelBaseViewBinder.class, "3")) {
          return;
       }
       this.c.d(this.G());
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, KeyBoardPanelBaseViewBinder.class, "4")) {
          return;
       }
       this.c.M(this.G());
       KeyBoardPanelBaseViewBinder tn = this.n;
       if (tn != null) {
          tn.removeListener(this.c.getMPullUpContainerAnimationListener());
       }
       return;
    }
    public final void D(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KeyBoardPanelBaseViewBinder.class, "9")) {
          return;
       }
       KeyBoardPanelBaseViewBinder tg = this.g;
       if (tg != null && !PatchProxy.applyVoid(objArray, tg, TextKeyboardFragment.class, "16")) {
          TextKeyboardFragment q = tg.q;
          if (q == null) {
             a.S("mTextKeyboardViewModel");
          }
          Boolean tRUE = Boolean.TRUE;
          if (!a.g(q.o0().getValue(), tRUE)) {
             TextKeyboardFragment q1 = tg.q;
             if (q1 == null) {
                a.S("mTextKeyboardViewModel");
             }
             q1.o0().setValue(tRUE);
          }
       }
    label_0045 :
       return;
    }
    public final Rect E(){
       int[] ointArray;
       float f3;
       Rect obj = PatchProxy.apply(null, this, KeyBoardPanelBaseViewBinder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.m == null) {
          return new Rect();
       }
       int i = 0;
       if (this.W()) {
          obj = new Rect();
          this.c.getGlobalVisibleRect(obj);
       }else {
          int i1 = 1;
          int i2 = 2;
          if (this.X()) {
             ointArray = new int[i2];
             this.c.getLocationInWindow(ointArray);
             Rect rect = new Rect(ointArray[i], ointArray[i1], d.H0(((float)ointArray[i] + ((float)this.c.getWidth() * this.c.getScaleX()))), d.H0(((float)ointArray[i1] + ((float)this.c.getHeight() * this.c.getScaleY()))));
             Object[] objArray1 = new Object[i];
             a.D().w("KeyBoardPanelBaseViewBinder", "singlePictureReEdit, containerRect="+rect+", "+"mContainerView.scaleX="+this.c.getScaleX()+", mContainerView.scaleY="+this.c.getScaleY()+", "+"mContainerView.width="+this.c.getWidth()+", mContainerView.height="+this.c.getHeight(), objArray1);
             obj = rect;
          }else {
             ointArray = new int[i2];
             this.c.getLocationInWindow(ointArray);
             Rect rect1 = new Rect(ointArray[i], ointArray[i1], d.H0(((float)ointArray[i] + ((float)this.c.getWidth() * this.m.getScaleX()))), d.H0(((float)ointArray[i1] + ((float)this.c.getHeight() * this.m.getScaleY()))));
             Object[] objArray2 = new Object[i];
             a.D().w("KeyBoardPanelBaseViewBinder", "containerRect="+rect1, objArray2);
             float f = (float)rect1.width() / this.m.getScaleX();
             float f1 = (float)rect1.height() / this.m.getScaleY();
             Object[] objArray3 = new Object[i];
             a.D().w("KeyBoardPanelBaseViewBinder", "mPreviewView.scaleX="+this.m.getScaleX()+", mPreviewView.scaleY="+this.m.getScaleY(), objArray3);
             objArray3 = new Object[i];
             a.D().w("KeyBoardPanelBaseViewBinder", "adjustWidth="+f+", adjustHeight="+f1, objArray3);
             objArray3 = new Object[i];
             a.D().w("KeyBoardPanelBaseViewBinder", "mPreviewView.pivotX="+this.m.getPivotX()+", mPreviewView.pivotY="+this.m.getPivotY(), objArray3);
             if (this.m.getPivotY() - (float)i <= 0) {
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
       a.D().w("KeyBoardPanelBaseViewBinder", "adjustContainerRect="+obj, objArray);
       return obj;
    }
    public abstract c F();
    public abstract DecorationContainerView$d G();
    public final EditorDelegate H(){
       return this.v;
    }
    public abstract a I();
    public EditDecorationBaseDrawer J(){
       Object[] objArray = null;
       EditDecorationBaseDrawer obj = PatchProxy.apply(objArray, this, KeyBoardPanelBaseViewBinder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c.getSelectDrawer() instanceof NewEditTextElement) {
          obj = this.c.getSelectDrawer();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement");
          objArray = obj;
       }else {
          obj = this.c.getSelectDrawer();
          if (obj != null) {
             ExceptionHandler.handleCaughtException(new RuntimeException("KeyBoardPanelBaseViewBinder "+obj.getClass()+" does not match EditTextBaseElement"));
          }
       }
       return objArray;
    }
    public abstract c K();
    public final Fragment L(){
       return this.s;
    }
    public final EditDecorationContainerViewV2 N(){
       return this.c;
    }
    public abstract EditReduxViewModel P();
    public String Q(){
       return null;
    }
    public void R(boolean p0){
       KeyBoardPanelBaseViewBinder keyBoardPane = KeyBoardPanelBaseViewBinder.class;
       if (PatchProxy.isSupport(keyBoardPane) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, keyBoardPane, "16")) {
          return;
       }
       if (p0) {
          Rect rect = this.E();
          int i = 0;
          if (this.W()) {
             int[] ointArray = new int[2];
             this.c.getLocationInWindow(ointArray);
             rect = new Rect(ointArray[i], ointArray[1], (ointArray[i] + this.c.getWidth()), (ointArray[1] + this.c.getHeight()));
          }
          Rect left = rect.left;
          if (left > null) {
             i = left;
          }
          this.c.setRestrictRect(new Rect(((int)(((float)(i - rect.left) / (float)rect.width()) * (float)this.c.getEditorRect().width()) + this.c.getEditorRect().left), ((int)(((float)(Math.max(n.A(this.s.requireContext()), rect.top) - rect.top) / (float)rect.height()) * (float)this.c.getEditorRect().height()) + this.c.getEditorRect().top), ((int)(((float)(Math.min(n.y(this.s.requireContext()), rect.right) - rect.left) / (float)rect.width()) * (float)this.c.getEditorRect().width()) + this.c.getEditorRect().left), ((int)(((float)(Math.min((this.l - c.a()), rect.bottom) - rect.top) / (float)rect.height()) * (float)this.c.getEditorRect().height()) + this.c.getEditorRect().top)));
       }else {
          this.c.setRestrictRect(null);
       }
       return;
    }
    public View$OnClickListener S(){
       return null;
    }
    public abstract c T();
    public void U(a p0,a p1){
       EditDecorationBaseDrawer uEditDecorat;
       EditText focusEditTex;
       Editable text;
       Object[] objArray;
       float f;
       Object[] obj2;
       int i5;
       Object[] objArray5;
       KeyBoardPanelBaseViewBinder keyBoardPane = KeyBoardPanelBaseViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, keyBoardPane, "18")) {
          return;
       }
       a.p(p0, "newEditingState");
       a.p(p1, "lastEditingState");
       int i = 16;
       int i1 = 1;
       if (p0.f() && !p1.f()) {
          uEditDecorat = this.J();
          if (uEditDecorat instanceof NewEditTextElement) {
             focusEditTex = uEditDecorat.getTextDrawerLayout().getFocusEditText();
             text = focusEditTex.getText();
             if (text != null) {
                focusEditTex.setSelection(text.length());
             }
             uEditDecorat.mGuideLineEnabled = false;
          }
          if (uEditDecorat instanceof NewEditTextV3Element) {
             uEditDecorat.mGuideLineEnabled = false;
          }
          if (uEditDecorat instanceof NewEditStickerBaseDrawer) {
             focusEditTex = uEditDecorat.getFocusEditText();
             if (focusEditTex != null) {
                text = focusEditTex.getText();
                if (text != null) {
                   focusEditTex.setSelection(text.length());
                }
             }
             EditDecorationBaseDrawer uEditDecorat1 = uEditDecorat;
             if (uEditDecorat1.isHorizontalMoveEnable()) {
                uEditDecorat.disableAction(i1);
             }
             if (uEditDecorat1.isVerticalMoveEnable()) {
                uEditDecorat.disableAction(i);
             }
          }
          this.a0();
          this.f0(p0.c());
          int i2 = p0.c() - c.a();
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (PatchProxy.isSupport(keyBoardPane)) {
             Rect obj = PatchProxy.applyOneRefs(Integer.valueOf(i2), this, keyBoardPane, "10");
             if (obj != patchProxyRe) {
                i1 = obj.booleanValue();
             }else if(this.m == null){
                if (this.J() == null) {
                   objArray = new Object[false];
                   a.D().w("KeyBoardPanelBaseViewBinder", "focus element is null", objArray);
                }else {
                   obj = this.E();
                   if (PatchProxy.isSupport(keyBoardPane)) {
                      Object obj1 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(i2), this, keyBoardPane, "13");
                      if (obj1 != patchProxyRe) {
                         i2 = obj1.intValue();
                      }else {
                      label_00e1 :
                         boolean i3 = n.A(this.s.requireContext());
                         int i4 = (i2 + i3) >> i1;
                         StringBuilder str = "statusBarHeight="+i3;
                         Object[] objArray2 = new Object[false];
                         a.D().w("KeyBoardPanelBaseViewBinder", str+", textPanelTop="+i2+", "+"centerYOfRemainingSpace="+i4, objArray2);
                         i3 = (this.c.getWidth() <= this.c.getHeight())? true: false;
                         Object[] objArray3 = new Object[false];
                         a.D().w("KeyBoardPanelBaseViewBinder", "isVerticalPreview="+i3+", w="+this.c.getWidth()+",h="+this.c.getHeight(), objArray3);
                         if (i3) {
                            obj2 = PatchProxy.applyOneRefs(obj, this, keyBoardPane, "12");
                            if (obj2 != patchProxyRe) {
                               i5 = obj2.intValue();
                            }else {
                               uEditDecorat = this.J();
                               if (uEditDecorat != null) {
                                  if (this.W()) {
                                     Rect rect = new Rect();
                                     if (uEditDecorat instanceof NewEditTextElement) {
                                        uEditDecorat.getTextDrawerLayout().getGlobalVisibleRect(rect);
                                     }else if(uEditDecorat instanceof NewEditStickerBaseDrawer){
                                        EditText focusEditTex1 = uEditDecorat.getFocusEditText();
                                        if (focusEditTex1 != null) {
                                           focusEditTex1.getGlobalVisibleRect(rect);
                                        }
                                     }
                                     i5 = rect.centerY();
                                  }else {
                                     f = uEditDecorat.getMoveY();
                                     objArray5 = new Object[false];
                                     a.D().w("KeyBoardPanelBaseViewBinder", "textCenterYRatio="+f, objArray5);
                                     i5 = d.H0(((f * (float)obj.height()) + (float)obj.top));
                                  }
                                  objArray5 = new Object[false];
                                  a.D().w("KeyBoardPanelBaseViewBinder", "centerYOfText="+i5, objArray5);
                               }else {
                                  i5 = -1;
                               }
                            }
                            if (i5 <= i4) {
                               objArray = new Object[false];
                               a.D().w("KeyBoardPanelBaseViewBinder", "centerYOfText <= centerYOfRemainingSpace, offset=0", objArray);
                            }else if(obj.bottom < i2){
                               objArray = new Object[false];
                               a.D().w("KeyBoardPanelBaseViewBinder", "adjustContainerRect.bottom < textPanelTop, offset=0", objArray);
                            }else {
                               i5 = i5 - i4;
                               Object[] objArray4 = new Object[false];
                               a.D().w("KeyBoardPanelBaseViewBinder", "distanceOfCenter="+i5, objArray4);
                               if ((obj.bottom - i5) < i2) {
                                  obj2 = new Object[false];
                                  a.D().w("KeyBoardPanelBaseViewBinder", "move will let container bottom out of bound", obj2);
                                  i5 = obj.bottom - i2;
                               }else {
                                  obj2 = new Object[false];
                                  a.D().w("KeyBoardPanelBaseViewBinder", "move right now", obj2);
                               }
                               i2 = i5;
                            }
                         }else {
                            obj2 = new Object[false];
                            a.D().w("KeyBoardPanelBaseViewBinder", "adjustContainerRect.centerY\(\)="+obj.centerY(), obj2);
                            if (obj.centerY() > i4) {
                               objArray = new Object[false];
                               a.D().w("KeyBoardPanelBaseViewBinder", "horizontal move to centerYOfRemainingSpace", objArray);
                               i2 = obj.centerY() - i4;
                            }else {
                               objArray = new Object[false];
                               a.D().w("KeyBoardPanelBaseViewBinder", "horizontal not necessary to move", objArray);
                            }
                         }
                         i2 = 0;
                      }
                   }else {
                      goto label_00e1 ;
                   }
                   Object[] objArray1 = new Object[false];
                   a.D().w("KeyBoardPanelBaseViewBinder", "offset = "+i2, objArray1);
                   objArray1 = new Object[false];
                   a.D().w("KeyBoardPanelBaseViewBinder", "mPreviewView.scaleX="+this.m.getScaleX(), objArray1);
                   objArray1 = new Object[false];
                   a.D().w("KeyBoardPanelBaseViewBinder", "mPreviewView.scaleY="+this.m.getScaleY(), objArray1);
                   if (i2 >= 0 || this.m.getScaleX() - this.j) {
                      this.h = this.m.getTranslationY();
                      this.i = this.m.getScaleX();
                      f = (i2 > 0)? this.m.getTranslationY() - (float)i2: this.m.getTranslationY();
                      this.b0(this.m.getTranslationY(), f, this.m.getScaleX(), this.j);
                      this.c.setTag(R.id.TAG_PREVIEW_ANIMATOR_ID, this.n);
                      if (!this.V()) {
                         KeyBoardPanelBaseViewBinder td = this.d;
                         float alpha = (td != null)? td.getAlpha(): 0;
                         this.e = alpha;
                         td = this.d;
                         if (td != null) {
                            td.setAlpha(0);
                         }
                      }
                   }
                }
             }
             i1 = false;
          }else {
             goto label_00a8 ;
          }
          this.k = i1;
       }else if(!p0.f() && p1.f()){
          List list = this.c.o0(KeyBoardPanelBaseViewBinder$c.b);
          a.o(list, "focusElementList");
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             uEditDecorat = iterator.next();
             if (uEditDecorat instanceof NewEditStickerBaseDrawer) {
                uEditDecorat.enableAction(i);
                uEditDecorat.enableAction(i1);
             }else if(uEditDecorat instanceof NewEditTextElement || uEditDecorat instanceof NewEditTextV3Element){
                uEditDecorat.mGuideLineEnabled = i1;
             }
          }
          this.Z();
          this.d0();
          this.c0();
       }else if(p0.f() && (p1.f() && p0.c() != p1.c())){
          this.f0(p0.c());
       }
       return;
    }
    public abstract boolean V();
    public boolean X(){
       return false;
    }
    public final boolean Y(){
       return this.t;
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, KeyBoardPanelBaseViewBinder.class, "8")) {
          return;
       }
       this.c.L0();
       return;
    }
    public void a0(){
       if (PatchProxy.applyVoid(null, this, KeyBoardPanelBaseViewBinder.class, "7")) {
          return;
       }
       this.c.N0();
       return;
    }
    public final void b0(float p0,float p1,float p2,float p3){
       PropertyValuesHolder[] propertyValu2;
       if (PatchProxy.isSupport(KeyBoardPanelBaseViewBinder.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, KeyBoardPanelBaseViewBinder.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KeyBoardPanelBaseViewBinder", "previewPullUpAnimation start = "+p0+" end = "+p1+' '+"scaleStart="+p2+", scaleEnd="+p3, objArray);
       KeyBoardPanelBaseViewBinder tn = this.n;
       int i = 2;
       float[] uofloatArray = new float[i];
       uofloatArray[0] = p0;
       uofloatArray[1] = p1;
       PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat("translationY", uofloatArray);
       PropertyValuesHolder float[] uofloatArray1 = new float[i];
       uofloatArray1[0] = p2;
       uofloatArray1[1] = p3;
       uofloatArray1 = PropertyValuesHolder.ofFloat("scaleX", uofloatArray1);
       float[] uofloatArray2 = new float[i];
       uofloatArray2[0] = p2;
       uofloatArray2[1] = p3;
       PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat("scaleY", uofloatArray2);
       int i1 = 3;
       if (tn == null) {
          propertyValu2 = new PropertyValuesHolder[i1];
          propertyValu2[0] = uofloatArray1;
          propertyValu2[1] = propertyValu1;
          propertyValu2[i] = propertyValu;
          tn = ObjectAnimator.ofPropertyValuesHolder(this.m, propertyValu2);
       }else if(tn.isRunning()){
          tn.cancel();
       }
       propertyValu2 = new PropertyValuesHolder[i1];
       propertyValu2[0] = uofloatArray1;
       propertyValu2[1] = propertyValu1;
       propertyValu2[i] = propertyValu;
       tn.setValues(propertyValu2);
       this.c.setPullUp(this.I().f());
       this.c.setPullUpTranslationY((p1 - p0));
       this.c.getAnimationEndCallbacks().add(this.q);
       tn.removeListener(this.c.getMPullUpContainerAnimationListener());
       tn.addListener(this.c.getMPullUpContainerAnimationListener());
       tn.setDuration(200);
       tn.start();
       this.n = tn;
       this.c.S0(p3);
       return;
    }
    public final void c0(){
       if (PatchProxy.applyVoid(null, this, KeyBoardPanelBaseViewBinder.class, "17")) {
          return;
       }
       KeyBoardPanelBaseViewBinder tm = this.m;
       if (tm == null) {
          return;
       }
       if (this.k != null) {
          this.b0(tm.getTranslationY(), this.h, this.m.getScaleX(), this.i);
          if (!this.V() && !this.e0()) {
             this.c.getAnimationEndCallbacks().add(this.r);
             tm = this.n;
             if (tm != null) {
                tm.removeListener(this.c.getMPullUpContainerAnimationListener());
             }
             tm = this.n;
             if (tm != null) {
                tm.addListener(this.c.getMPullUpContainerAnimationListener());
             }
          }
       label_0057 :
          this.h = 0;
          this.i = 0x3f800000;
          this.k = false;
       }
       return;
    }
    public void d0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KeyBoardPanelBaseViewBinder.class, "6")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("KeyBoardPanelBaseViewBinder", "releaseTextPanelPopup", objArray1);
       KeyBoardPanelBaseViewBinder tg = this.g;
       if (tg == null) {
          return;
       }
       if (tg != null) {
          tg.dismiss();
       }
       tg = this.g;
       if (tg != null) {
          Lifecycle lifecycle = tg.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this.p);
          }
       }
       this.g = objArray;
       f.p0(this.v.u(), a0.class).q0(new KeyBoardPanelBaseViewBinder$g(this));
       return;
    }
    public boolean e0(){
       return false;
    }
    public void f0(int p0){
       KeyBoardPanelBaseViewBinder keyBoardPane = KeyBoardPanelBaseViewBinder.class;
       if (PatchProxy.isSupport(keyBoardPane) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, keyBoardPane, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("KeyBoardPanelBaseViewBinder", "showTextPanelPopup", objArray);
       if (p0 <= 0) {
          return;
       }
       keyBoardPane = this.g;
       if (keyBoardPane != null) {
          if (keyBoardPane != null && (!PatchProxy.isSupport(TextKeyboardFragment.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), keyBoardPane, TextKeyboardFragment.class, "17") && keyBoardPane.u != p0))) {
             keyBoardPane.u = p0;
             Dialog dialog = keyBoardPane.getDialog();
             if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                   WindowManager$LayoutParams attributes = window.getAttributes();
                   a.o(attributes, "attr");
                   keyBoardPane.uh(attributes);
                   window.setAttributes(attributes);
                }
             }
          }
          return;
       }else if(this.s.getActivity() == null){
          return;
       }else {
          f.p0(this.v.u(), a0.class).q0(KeyBoardPanelBaseViewBinder$h.a);
          if (this.c.getSelectDrawer() instanceof NewEditTextElement) {
             EditDecorationBaseDrawer selectDrawer = this.c.getSelectDrawer();
             Objects.requireNonNull(selectDrawer, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement");
             f keyboardData = selectDrawer.getKeyboardData();
             ViewModel viewModel = ViewModelProviders.of(this.s.requireActivity()).get(TextKeyboardDataViewModelV3.class);
             a.o(viewModel, "ViewModelProviders.of\(fr¡­aViewModelV3::class.java\)");
             boolean b = (this.t == null && PostExperimentUtils.b0())? true: false;
             g$a uoa = new g$a();
             uoa.c(b);
             TextKeyboardFragment textKeyboard = new TextKeyboardFragment();
             this.g = textKeyboard;
             keyboardData = new f$a().c(uoa.b(keyboardData).a()).b(new e$a().c(new f(viewModel.p0(), i)).d(new n(viewModel.q0(), i)).b(new n(viewModel.q0(), i)).a()).a();
             if (!PatchProxy.applyVoidOneRefs(keyboardData, textKeyboard, TextKeyboardFragment.class, "2")) {
                a.p(keyboardData, "<set-?>");
                textKeyboard.p = keyboardData;
             }
             keyBoardPane = this.g;
             if (keyBoardPane != null) {
                keyBoardPane.u = p0;
             }
             if (keyBoardPane) {
                keyBoardPane.s = b.a;
             }
             if (keyBoardPane) {
                keyBoardPane.show(this.s.getChildFragmentManager(), "TextPanel");
             }
             KeyBoardPanelBaseViewBinder tg = this.g;
             if (tg != null) {
                Lifecycle lifecycle = tg.getLifecycle();
                if (lifecycle != null) {
                   lifecycle.addObserver(this.p);
                }
             }
          }
       label_0153 :
          return;
       }
    }
    public EditorFragmentBackPressedResult onBackPressed(){
       KeyBoardPanelBaseViewBinder obj = PatchProxy.apply(null, this, KeyBoardPanelBaseViewBinder.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj != null) {
          Dialog dialog = obj.getDialog();
          if (dialog != null && dialog.isShowing() == true) {
             this.P().t0(new TextEditEndAction());
             return EditorFragmentBackPressedResult.INTERCEPT_EVENT;
          }
       }
       return EditorFragmentBackPressedResult.PASS_EVENT;
    }
}
