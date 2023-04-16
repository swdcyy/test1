package com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$d;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import android.view.View;
import android.view.Window;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$e;
import com.yxcorp.utility.RomUtils;
import android.graphics.Point;
import java.lang.Math;
import android.widget.EditText;
import java.lang.Boolean;
import android.widget.GridView;
import android.os.Handler;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;

public class LiveAsrFloatEditorFragment$d implements Runnable	// class@000a93
{
    public final LiveAsrFloatEditorFragment b;

    public void LiveAsrFloatEditorFragment$d(LiveAsrFloatEditorFragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       LiveAsrFloatEditorFragment$d b;
       LiveAsrFloatEditorFragment$d b2;
       long l;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, LiveAsrFloatEditorFragment$d.class, "1")) {
          return;
       }
       FragmentActivity activity = obj.b.getActivity();
       if (activity != null && obj.b.getDialog() != null) {
          int i = obj.b.pi();
          int i1 = 2;
          int[] ointArray = new int[i1];
          if (!q.f(obj.b.M.mHotWords)) {
             obj.b.g1.getLocationOnScreen(ointArray);
          }else {
             obj.b.d1.getLocationOnScreen(ointArray);
          }
          Window window = obj.b.getDialog().getWindow();
          int height = window.getDecorView().getHeight();
          n.A(activity);
          int i2 = height - n.g(window).getHeight();
          LiveLogTag lIVE_ASR_INP = LiveLogTag.LIVE_ASR_INPUT;
          b.e0(lIVE_ASR_INP, "mPositionMonitorRunnable", "editorAreaTop", Integer.valueOf(i), "getEditorAreaHeight", Integer.valueOf(obj.b.oi()), "displayHeight", Integer.valueOf(height));
          b.c0(lIVE_ASR_INP, "mPositionMonitorRunnable", "mEditorLastPositionY", Integer.valueOf(obj.b.r1));
          b = obj.b;
          int i3 = 50;
          boolean i4 = 1;
          int i5 = 0;
          if (i == b.r1) {
             if (b.Oh() != null) {
                int[] ointArray1 = new int[i1];
                obj.b.d1.getLocationOnScreen(ointArray1);
                obj.b.Oh().a(ointArray1[i5], ointArray1[i4]);
             }
             i1 = n.n(obj.b.getContext());
             height = (height - i) - obj.b.oi();
             if (i1 < 0 || (RomUtils.o() || (RomUtils.s() && (i1 || (height > i2 || Math.abs(((height - i1) - n.r(obj.b.getContext()).y)) < 5))))) {
                i1 = height;
             }else {
                i2 = 0;
             }
             LiveAsrFloatEditorFragment$d b1 = obj.b;
             if (b1.Q != null) {
                b1.W0.requestLayout();
                obj.b.Q = i5;
             }
             b1 = obj.b;
             if (b1.y1 != null) {
                b1.W0.requestLayout();
                obj.b.y1 = i5;
             }
             b.d0(lIVE_ASR_INP, "mPositionMonitorRunnable", "keyboardSuspectedHeight", Integer.valueOf(i1), "contentOffset", Integer.valueOf(i2));
             b.f0(lIVE_ASR_INP, "mPositionMonitorRunnable", "mIsManualOpeningSoftInput", Boolean.valueOf(obj.b.P), "mAtFriends", Boolean.valueOf(obj.b.m1), "mShowEmoji", Boolean.valueOf(obj.b.t1), "mShowAsr", Boolean.valueOf(obj.b.u1));
             if (i1 > i2) {
                b2 = obj.b;
                b2.O = i1;
                b2.Vh(ointArray);
                b2 = obj.b;
                if (b2.P != null) {
                   b2.W0.requestLayout();
                   obj.b.P = false;
                   b.Z(lIVE_ASR_INP, "mPositionMonitorRunnable | mIsManualOpeningSoftInput = false !!!");
                }
                return;
             }else if(obj.b.f1.getVisibility() && obj.b.h1.getVisibility()){
                b2 = obj.b;
                if (b2.P == null) {
                   if (b2.M.mCancelWhenKeyboardHidden != null && (b2.m1 == null && (b2.t1 == null && b2.u1 == null))) {
                      b.Z(lIVE_ASR_INP, "mPositionMonitorRunnable | cancel");
                      obj.b.cancel();
                      return;
                   }else if(b2.t1 != null){
                      b.Z(lIVE_ASR_INP, "mPositionMonitorRunnable | showHideEmojiView");
                      b2 = obj.b;
                      b2.Q = true;
                      b2.ti(true);
                      b2 = obj.b;
                      b2.t1 = false;
                      l = 50;
                      b2.s1.postDelayed(obj, l);
                   }else {
                      i1 = true;
                      l = 50;
                   }
                   if (obj.b.u1 != null) {
                      b.Z(lIVE_ASR_INP, "mPositionMonitorRunnable | showHideAsrView");
                      b2 = obj.b;
                      b2.y1 = true;
                      b2.si(true);
                      b2 = obj.b;
                      b2.u1 = false;
                      b2.s1.postDelayed(obj, l);
                   }
                }else {
                label_01ec :
                   i1 = 1;
                }
             }else {
                goto label_01ec ;
             }
             b.d0(lIVE_ASR_INP, "mPositionMonitorRunnable", "x", Integer.valueOf(ointArray[0]), "y", Integer.valueOf(ointArray[1]));
             obj.b.Vh(ointArray);
             b.Z(lIVE_ASR_INP, "mPositionMonitorRunnable > stable");
          }else {
             l = i3;
             if ((b.oi() + i) >= height && obj.b.Lh() != null) {
                i4 = (obj.b.r1 != null)? true: false;
                b.c0(lIVE_ASR_INP, "mPositionMonitorRunnable | postEditTextPosition", "mEditorLastPositionY != 0", Boolean.valueOf(i4));
                LiveAsrFloatEditorFragment$d b3 = obj.b;
                i4 = (b3.r1 != null)? true: false;
                b3.Wh(ointArray, i4);
             }
             b2 = obj.b;
             b2.r1 = i;
             b2.s1.postDelayed(obj, l);
             b.Z(lIVE_ASR_INP, "mPositionMonitorRunnable > adjusting");
          }
       }
       return;
    }
}
