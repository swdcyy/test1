package com.kuaishou.live.audience.course.e$c;
import ds5.c;
import com.kuaishou.live.audience.course.e;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.course.model.QLiveCourse;
import s31.y;
import java.lang.Throwable;

public class e$c implements c	// class@000bff
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
          return;
       }
       e$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, e.class, "6")) {
          tb.v = p0.mExtraInfo;
          QLiveCourse qLiveCourse = QLiveCourse.fromLivePlayConfig(p0);
          if (qLiveCourse == null && tb.u != null) {
             tb.u = null;
             tb.W8();
          }else if(qLiveCourse != null){
             tb.t.d(qLiveCourse.mCourseId, qLiveCourse.mLessonId);
             e u = tb.u;
             if (u == null) {
                tb.u = qLiveCourse;
             }else {
                u.merge(qLiveCourse);
             }
             QLivePlayConfig mAuthReason = p0.mAuthReason;
             if (mAuthReason == null || mAuthReason == 1) {
                tb.W8();
             }else if(mAuthReason == 2){
                tb.V8((long)p0.mCourseTrialRemainDuration);
             }else if(mAuthReason == 3 || mAuthReason == 4){
                tb.V8(0);
             }
          }
       }
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
