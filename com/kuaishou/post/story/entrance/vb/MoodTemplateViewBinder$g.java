package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$g;
import androidx.lifecycle.Observer;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import mq4.a;
import java.lang.Enum;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import java.lang.Boolean;
import g9c.a;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import com.yxcorp.gifshow.widget.FakePieLoadingView;
import crd.b;
import android.view.View;
import tyc.n1;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import tyc.m1;
import com.yxcorp.gifshow.widget.p;
import erd.g;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.RelativeLayout;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import mq4.f$b;

public final class MoodTemplateViewBinder$g implements Observer	// class@000b5f
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$g(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       MoodTemplateViewBinder s;
       MoodTemplateViewBinder$g b1;
       Object obj = this;
       Object obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MoodTemplateViewBinder$g.class, str)) {
       }else {
          int i = obj1.b();
          ListHolder$UpdateType updateType = obj1.e();
          if (updateType != null) {
             int i1 = a.b[updateType.ordinal()];
             FakePieLoadingView uFakePieLoad = 3;
             Object[] objArray = null;
             if (i1 != 1) {
                if (i1 == 2) {
                   if (a.g(obj1.d(), Integer.valueOf(4))) {
                      MoodTemplateViewBinder$g b = obj.b;
                      if (b.F != null) {
                         b.S.x0().setValue(Boolean.TRUE);
                         obj.b.F = false;
                      }
                      obj.b.D.M0();
                      obj.b.D.L0(obj1.c());
                      s = obj.b.s;
                      Objects.requireNonNull(s);
                      if (!PatchProxy.applyVoid(objArray, s, FakePieLoadingView.class, "3") && s.g != null) {
                         s.g = false;
                         FakePieLoadingView h = s.h;
                         if (h != null) {
                            h.dispose();
                         }
                         s.e = s.c;
                         s.invalidate();
                         s.postDelayed(new n1(s), s.d);
                      }
                   }else if(a.g(obj1.d(), Integer.valueOf(uFakePieLoad))){
                      s = obj.b.s;
                      Objects.requireNonNull(s);
                      if (!PatchProxy.applyVoid(objArray, s, FakePieLoadingView.class, str) && s.g == null) {
                         s.e = 0;
                         s.setVisibility(false);
                         s.g = true;
                         s.h = t.intervalRange(1, (s.c - 1), 0, s.d, TimeUnit.MILLISECONDS).observeOn(a.c()).subscribe(new m1(s), p.b);
                      }
                   }
                   Object[] objArray1 = new Object[false];
                   a.D().w("MoodTemplateViewBinder", "mMoodTemplateList change all payload:"+obj1.d(), objArray1);
                }
             }else {
                MoodTemplateUiData moodTemplate = obj1.c().get(i);
                if (a.g(obj1.d(), Integer.valueOf(true))) {
                   obj.b.S.A0(moodTemplate, false);
                }else if(a.g(obj1.d(), Integer.valueOf(2))){
                   i1 = a.a[moodTemplate.j().ordinal()];
                   if (i1 != 1) {
                      if (i1 != 2) {
                         if (i1 == uFakePieLoad) {
                            obj.b.K(moodTemplate);
                            if (!MoodTemplateViewModel.C0(obj.b.S, moodTemplate, false, 2, objArray)) {
                               b1 = obj.b;
                               b1.D.l0(b1.S.r0(moodTemplate));
                            }
                         }
                      }else if(moodTemplate.x()){
                         MoodTemplateViewBinder f = obj.b.f;
                         if (f != null && !f.getVisibility()) {
                         label_018f :
                            b1 = obj.b;
                            b1.D.l0(b1.S.r0(moodTemplate));
                         }
                      }
                      i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f1038e3));
                      goto label_018f ;
                   }else {
                      f$b uob = obj.b.x.findViewHolderForLayoutPosition(i);
                      if (uob != null) {
                         uob.a(moodTemplate.i());
                      }
                   }
                }
                Object[] objArray2 = new Object[false];
                a.D().w("MoodTemplateViewBinder", "mMoodTemplateList moodTemplateUiData:"+moodTemplate+", index:"+i+", "+"payload:"+obj1.d(), objArray2);
             }
          }
       }
       return;
    }
}
