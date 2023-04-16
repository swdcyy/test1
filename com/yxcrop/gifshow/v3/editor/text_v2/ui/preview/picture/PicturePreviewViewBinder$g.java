package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$g;
import nwc.g;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder;
import java.lang.Object;
import nwc.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import und.l;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.c;
import snd.a;
import java.lang.Boolean;
import android.graphics.RectF;
import lnc.a1;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.widget.RelativeLayout;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class PicturePreviewViewBinder$g implements g	// class@000b4c
{
    public final PicturePreviewViewBinder a;

    public void PicturePreviewViewBinder$g(PicturePreviewViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(m p0){
       float f6;
       float f7;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, PicturePreviewViewBinder$g.class, "1")) {
          return;
       }
       String str = "previewTransformParam";
       a.p(obj1, str);
       Log.b("PicturePreviewViewBinder", "setTransformRect: "+p0.d()+' '+p0.c()+' '+p0.a());
       EditDecorationContainerViewV2 uEditDecorat = obj.a.S();
       BaseEditorPreviewContainerLayout uBaseEditorP = obj.a.P.J();
       a.o(uBaseEditorP, "delegate.previewContainer");
       boolean b = obj.a.u0().o0().G();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(uEditDecorat, uBaseEditorP, p0, Boolean.valueOf(b), null, a.class, "1")) {
          a.p(uEditDecorat, "containerView");
          a.p(uBaseEditorP, "previewContainerLayout");
          a.p(obj1, str);
          int i = p0.d();
          long l = p0.a();
          RectF originLayout = uBaseEditorP.getOriginLayoutRect();
          int i1 = a1.d(R.dimen.arg_RES_7f0703a1);
          float f = (originLayout.height() - (float)(i1 * 2)) - (float)i;
          float f1 = f / originLayout.width();
          float f2 = (float)uEditDecorat.getMeasuredHeight();
          float f3 = 0x3f800000;
          float f4 = (float)uEditDecorat.getMeasuredWidth();
          float f5 = (f2 * f3) / f4;
          if (i <= 0) {
             i = 0;
          }else if(f5 - f1 > 0){
             f3 = f / f2;
             f6 = (float)i1;
             f7 = originLayout.height();
          }else {
             f6 = (float)i1;
             f7 = originLayout.height();
          }
          f6 = f6 - ((f7 - f) / 2.00f);
          if (!uEditDecorat.getScaleY() - f3 && (!uEditDecorat.getScaleX() - f3 && (!uEditDecorat.getTranslationY() - i && (uEditDecorat.getPivotY() - (f2 / 2.00f) || uEditDecorat.getPivotX() - (f4 / 2.00f))))) {
             f2 = f2 / 2.00f;
             uEditDecorat.setPivotY(f2);
             f4 = f4 / 2.00f;
             uEditDecorat.setPivotX(f4);
             uEditDecorat.setScaleX(f3);
             uEditDecorat.setScaleY(f3);
             if (b) {
                uBaseEditorP.setPivotY(f2);
                uBaseEditorP.setPivotX(f4);
                uBaseEditorP.setScaleX(f3);
                uBaseEditorP.setScaleY(f3);
             }
             AnimatorSet tag = uEditDecorat.getTag(R.id.new_container_view_pull_animator);
             if (!tag instanceof AnimatorSet) {
                tag = null;
             }
             if (tag != null) {
                tag.cancel();
             }
             if (p0.c() && !b) {
                tag = new AnimatorSet();
                float[] uofloatArray = new float[]{uEditDecorat.getTranslationY(),i};
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uEditDecorat, "translationY", uofloatArray);
                a.o(objectAnimat, "containerViewAnimator");
                objectAnimat.setDuration(l);
                Animator[] uAnimatorArr = new Animator[]{objectAnimat};
                tag.playTogether(uAnimatorArr);
                tag.start();
                uEditDecorat.setTag(R.id.new_container_view_pull_animator, tag);
             }else if(b){
                uBaseEditorP.setTranslationY(i);
                uBaseEditorP.requestLayout();
                uBaseEditorP.invalidate();
             }
             uEditDecorat.setTranslationY(i);
             uEditDecorat.W();
             uEditDecorat.e0();
          }
       }
       return;
    }
    public void b(){
    }
    public void c(){
    }
}
