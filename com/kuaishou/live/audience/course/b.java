package com.kuaishou.live.audience.course.b;
import tq5.a;
import com.kuaishou.live.audience.course.e;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import cz1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;
import com.kuaishou.live.common.course.model.QLiveCourse;
import d61.l0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.System;
import com.kuaishou.live.audience.course.LiveCourseClosedDialogFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import s31.y;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import k2b.u1;
import s31.f;

public final class b implements a	// class@000bfa
{
    public final e a;

    public void b(e p0){
       this.a = p0;
    }
    public final int onBackPressed(){
       QLiveCourse obj;
       boolean b;
       LiveCourseClosedDialogFragment liveCourseCl;
       b a = this.a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e u = a.u;
       a0 e = a.r.e;
       e c = a.C;
       int i = 0;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(u, e, Long.valueOf(c), null, a.class, "2");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(u != null && (!("").equals(u.mLessonId) && (!TextUtils.n(u.mLessonId, String.valueOf(l0.f("evaluated_lesson_id").b(Long.valueOf(0)))) && (e != null && (e.mAuthReason == null && (System.currentTimeMillis() - c) - 0x493e0 > 0))))){
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_0030 ;
       }
       if (b) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, a, e.class, "10")) {
             obj = a.u.mLessonId;
             if (PatchProxy.isSupport(LiveCourseClosedDialogFragment.class)) {
                liveCourseCl = PatchProxy.applyTwoRefs(obj, Boolean.FALSE, objArray, LiveCourseClosedDialogFragment.class, "2");
                if (liveCourseCl != patchProxyRe) {
                label_00b0 :
                   if (!liveCourseCl.isAdded()) {
                      liveCourseCl.show(a.s.b().getActivity().getSupportFragmentManager(), "live_course_close_dialog");
                      a0 c1 = a.r.c;
                      e u1 = a.u;
                      QLiveCourse mCourseId = u1.mCourseId;
                      obj = u1.mLessonId;
                      e w = a.w;
                      y oy = y.class;
                      int i1 = 3;
                      if (PatchProxy.isSupport(oy)) {
                         Object[] objArray1 = new Object[]{c1,mCourseId,obj,w,"course_quit"};
                         if (PatchProxy.applyVoid(objArray1, objArray, oy, "6")) {
                         label_0125 :
                            liveCourseCl.w = new f(a);
                         }
                      }
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action = 1216;
                      Object[] objArray2 = new Object[]{"course_quit",w,mCourseId,obj};
                      uElementPack.name = String.format("knowledge_SHOW_COURSE_EVALUATION_DIALOG_trigger=%s&channel=%s&courseId=%s&lessonId=%s", objArray2);
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = y.a(c1);
                      y.b(w);
                      u1.u0(4, uElementPack, uContentPack);
                      goto label_0125 ;
                   }
                }
             }
             liveCourseCl = new LiveCourseClosedDialogFragment();
             Bundle uBundle = new Bundle();
             uBundle.putString("livecourse_lessonid", obj);
             uBundle.putBoolean("livecourse_frompage", i);
             liveCourseCl.setArguments(uBundle);
             goto label_00b0 ;
          }
          i = 1;
       }
       return i;
    }
}
