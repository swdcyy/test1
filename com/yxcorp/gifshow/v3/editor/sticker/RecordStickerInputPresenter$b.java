package com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import android.widget.EditText;
import android.text.Editable;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;
import android.widget.AbsoluteLayout;
import qsd.d;
import java.lang.Number;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import itc.x;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.e;
import android.animation.TimeInterpolator;
import itc.y;
import android.view.animation.LinearInterpolator;
import itc.z;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;

public final class RecordStickerInputPresenter$b implements Observer	// class@0011fd
{
    public final RecordStickerInputPresenter b;

    public void RecordStickerInputPresenter$b(RecordStickerInputPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       RecordStickerInputPresenter$b b;
       Object[] objArray1;
       float[] obj3;
       Object[] objArray2;
       float f;
       float f1;
       Object[] objArray4;
       float f3;
       float f4;
       Object obj = this;
       RecordStickerInputPresenter obj1 = p0;
       RecordStickerInputPresenter recordSticke = RecordStickerInputPresenter.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, RecordStickerInputPresenter$b.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "RecordStickerInputPresenter";
          a.D().w(str, "keyboardOffset="+obj1, objArray);
          RecordStickerInputPresenter q = obj.b.q;
          if (obj1 != null && q == obj1.intValue()) {
             obj.b.P8().T();
          }else {
             String str1 = null;
             if (obj1.intValue() > 0) {
                b = obj.b;
                if (b.q == null) {
                   if (b.P8().getSelectDrawer() != null) {
                      EditDecorationBaseDrawer selectDrawer = obj.b.P8().getSelectDrawer();
                      EditText focusEditTex = (selectDrawer != null)? selectDrawer.getFocusEditText(): str1;
                      if (focusEditTex != null) {
                         focusEditTex.setSelection(focusEditTex.getText().length());
                      }
                      a.o(obj1, "keyboardOffset");
                      obj.b.q = obj1.intValue();
                      obj.b.P8().N0();
                      b = obj.b;
                      int i1 = obj1.intValue();
                      Objects.requireNonNull(b);
                      PatchProxyResult patchProxyRe = PatchProxyResult.class;
                      String str2 = 1;
                      if (PatchProxy.isSupport(recordSticke)) {
                         EditDecorationBaseDrawer obj2 = PatchProxy.applyOneRefs(Integer.valueOf(i1), b, recordSticke, "5");
                         if (obj2 != patchProxyRe) {
                            i = obj2.booleanValue();
                         }else {
                         label_00bf :
                            obj2 = b.R8();
                            if (obj2 == null || !b.W8(obj2)) {
                               objArray1 = new Object[i];
                               a.D().w(str, "focus element is null", objArray1);
                            }else if(b.w != null){
                               Rect rect = PatchProxy.apply(str1, b, recordSticke, "12");
                               int i2 = 2;
                               if (rect != patchProxyRe) {
                               }else {
                                  int[] ointArray = new int[i2];
                                  b.B.getLocationInWindow(ointArray);
                                  Rect rect1 = new Rect(ointArray[i], ointArray[str2], d.H0(((float)ointArray[i] + ((float)b.B.getWidth() * b.B.getScaleX()))), d.H0(((float)ointArray[str2] + ((float)b.B.getHeight() * b.B.getScaleY()))));
                                  objArray4 = new Object[i];
                                  a.D().w(str, "containerRect="+rect1, objArray4);
                                  f1 = (float)rect1.width() / b.B.getScaleX();
                                  float f2 = (float)rect1.height() / b.B.getScaleY();
                                  Object[] objArray6 = new Object[i];
                                  a.D().w(str, "containerView.scaleX="+b.B.getScaleX()+", containerView.scaleY="+b.B.getScaleY(), objArray6);
                                  objArray6 = new Object[i];
                                  a.D().w(str, "adjustWidth="+f1+", adjustHeight="+f2, objArray6);
                                  objArray6 = new Object[i];
                                  a.D().w(str, "containerView.pivotX="+b.B.getPivotX()+", containerView.pivotY="+b.B.getPivotY(), objArray6);
                                  i2 = (b.B.getPivotY() - (float)i > 0)? 1: 0;
                                  if (i2) {
                                     f3 = (float)rect1.centerY() - (f2 / (float)2);
                                  }else {
                                     int i5 = 2;
                                     f3 = (float)rect1.top;
                                  }
                                  if (i2) {
                                     f4 = (float)rect1.centerY();
                                     f2 = f2 / (float)2;
                                  }else {
                                     f4 = (float)rect1.top;
                                  }
                                  f1 = f1 / (float)2;
                                  rect = new Rect(d.H0(((float)rect1.centerX() - f1)), d.H0(f3), d.H0(((float)rect1.centerX() + f1)), d.H0((f4 + f2)));
                                  objArray4 = new Object[i];
                                  a.D().w(str, "adjustContainerRect="+rect, objArray4);
                               }
                               if (PatchProxy.isSupport(recordSticke)) {
                                  obj3 = PatchProxy.applyTwoRefs(rect, Integer.valueOf(i1), b, recordSticke, "11");
                                  if (obj3 != patchProxyRe) {
                                     i1 = obj3.intValue();
                                  }else {
                                  label_0252 :
                                     Context context = b.getContext();
                                     a.m(context);
                                     int i3 = n.A(context);
                                     int i4 = ((rect.top + i1) >> 1) - i3;
                                     StringBuilder str3 = "statusBarHeight="+i3;
                                     Object[] objArray3 = new Object[i];
                                     a.D().w(str, str3+", textPanelTop="+i1+", "+"centerYOfRemainingSpace="+i4, objArray3);
                                     if (i4 <= 0) {
                                        i1 = 0;
                                     }else {
                                        objArray4 = new Object[i];
                                        a.D().w(str, "w="+b.B.getWidth()+",h="+b.B.getHeight(), objArray4);
                                        EditDecorationBaseDrawer obj4 = PatchProxy.applyOneRefs(rect, b, recordSticke, "13");
                                        if (obj4 != patchProxyRe) {
                                           i1 = obj4.intValue();
                                        }else {
                                           obj4 = b.R8();
                                           if (obj4 != null) {
                                              f = obj4.getMoveY();
                                              objArray4 = new Object[i];
                                              a.D().w(str, "textCenterYRatio="+f, objArray4);
                                              i1 = d.H0(((f * (float)rect.height()) + (float)rect.top));
                                              Object[] objArray5 = new Object[i];
                                              a.D().w(str, "centerYOfText="+i1, objArray5);
                                           }else {
                                              i1 = -1;
                                           }
                                        }
                                        i1 = i1 - i4;
                                        objArray2 = new Object[i];
                                        a.D().w(str, "distanceOfCenter="+i1, objArray2);
                                     }
                                  }
                               }else {
                                  goto label_0252 ;
                               }
                               objArray2 = new Object[i];
                               a.D().w(str, "offset = "+i1, objArray2);
                               b.v = obj2;
                               b.s = obj2.getMoveX() * (float)b.B.getWidth();
                               b.t = obj2.getMoveY() * (float)b.B.getHeight();
                               f = (float)i1;
                               f1 = (obj2.getMoveY() * (float)b.B.getHeight()) - f;
                               if (b.d9() && b.x != null) {
                                  obj2.setMoveX(0x3f000000);
                                  obj2.setMoveY((obj2.getMoveY() - ((f * 0x3f800000) / (float)b.B.getHeight())));
                                  if (!PatchProxy.applyVoid(null, b, recordSticke, "8")) {
                                     objArray1 = new Object[i];
                                     a.D().s(str, "previewScaleUpAnimation\(\) called", objArray1);
                                     if (b.W8(b.v)) {
                                        obj1 = b.y;
                                        obj3 = new float[]{0x3f4ccccd,b.u};
                                        ValueAnimator valueAnimato = ValueAnimator.ofFloat(obj3);
                                        ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x3f733333});
                                        if (obj1 != null && obj1.isRunning()) {
                                           obj1.cancel();
                                        }
                                        AnimatorSet uAnimatorSet = new AnimatorSet();
                                        valueAnimato.addUpdateListener(new x(b));
                                        a.o(valueAnimato, "scaleAnim");
                                        valueAnimato.setInterpolator(new e());
                                        valueAnimato1.addUpdateListener(new y(b));
                                        a.o(valueAnimato1, "alphaAnim");
                                        valueAnimato1.setInterpolator(new LinearInterpolator());
                                        uAnimatorSet.addListener(new z(b));
                                        uAnimatorSet.setDuration(250);
                                        Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
                                        i = 1;
                                        uAnimatorSet.playTogether(uAnimatorArr);
                                        uAnimatorSet.start();
                                        b.y = uAnimatorSet;
                                     }
                                  }
                                  i = true;
                               }else {
                                  i = true;
                                  b.b9((obj2.getMoveX() * (float)b.B.getWidth()), ((float)b.B.getWidth() * 0x3f000000), (obj2.getMoveY() * (float)b.B.getHeight()), f1);
                               }
                               b.B.setTag(R.id.RECORD_TAG_PREVIEW_ANIMATOR_ID, b.y);
                            }
                         }
                      }else {
                         goto label_00bf ;
                      }
                      b.w = i;
                      obj.b.Y8();
                   }
                }
             }
             if (!obj1.intValue()) {
                b = obj.b;
                if (b.q > null) {
                   b.q = obj1.intValue();
                   if (obj.b.P8().getSelectDrawer() != null) {
                      obj.b.P8().R();
                   }
                   obj.b.P8().L0();
                   RecordStickerInputPresenter$b b1 = obj.b;
                   Objects.requireNonNull(b1);
                   if (!PatchProxy.applyVoid(null, b1, recordSticke, "10")) {
                      recordSticke = b1.v;
                      if (recordSticke == null) {
                         objArray1 = new Object[i];
                         a.D().w(str, "previewResumeAnimation mCachedFocusElement is null", objArray1);
                      }else if(b1.w != null){
                         a.m(recordSticke);
                         RecordStickerInputPresenter v = b1.v;
                         a.m(v);
                         b1.b9((recordSticke.getMoveX() * (float)b1.B.getWidth()), b1.s, (v.getMoveY() * (float)b1.B.getHeight()), b1.t);
                         b1.s = 0;
                         b1.t = 0;
                         b1.w = i;
                      }
                   }
                   obj.b.X8();
                }
             }
          }
       }
       return;
    }
}
