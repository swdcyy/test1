package com.kuaishou.live.common.course.model.QLiveCourse;
import java.io.Serializable;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.net.Uri;
import com.kuaishou.android.live.model.QLivePlayConfig;
import ekd.x0;
import android.net.Uri$Builder;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class QLiveCourse implements Serializable	// class@0017d7
{
    public String mCourseId;
    public String mCourseName;
    public String mLessonId;
    public String mLessonTitle;
    public static final long serialVersionUID = 0xc8f096bc3c349153;

    public void QLiveCourse(){
       super();
    }
    public static QLiveCourse fromIntent(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, QLiveCourse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.hasExtra("live_course")) {
          return SerializableHook.getSerializableExtra(p0, "live_course");
       }
       return QLiveCourse.parseUri(p0.getData());
    }
    public static QLiveCourse fromLivePlayConfig(QLivePlayConfig p0){
       QLivePlayConfig obj = null;
       QLiveCourse obj1 = PatchProxy.applyOneRefs(p0, obj, QLiveCourse.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0.mCourseId < 0) {
          return obj;
       }
       obj1 = new QLiveCourse();
       obj1.mCourseId = String.valueOf(p0.mCourseId);
       obj = p0.mLessonId;
       String str = (obj < 0)? "": String.valueOf(obj);
       obj1.mLessonId = str;
       return obj1;
    }
    public static QLiveCourse parseUri(Uri p0){
       QLiveCourse qLiveCourse = null;
       String obj = PatchProxy.applyOneRefs(p0, qLiveCourse, QLiveCourse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return qLiveCourse;
       }
       obj = x0.a(p0, "courseId");
       String str = x0.a(p0, "lessonId");
       String str1 = x0.a(p0, "courseName");
       String str2 = x0.a(p0, "lessonName");
       if (obj != null && str != null) {
          qLiveCourse = new QLiveCourse();
          qLiveCourse.mCourseId = obj;
          qLiveCourse.mLessonId = str;
          qLiveCourse.mCourseName = str1;
          qLiveCourse.mLessonTitle = str2;
       }
       return qLiveCourse;
    }
    public Uri appendToUri(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QLiveCourse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.buildUpon().appendQueryParameter("courseId", this.mCourseId).appendQueryParameter("courseName", this.mCourseName).appendQueryParameter("lessonId", this.mLessonId).appendQueryParameter("lessonName", this.mLessonTitle).build();
    }
    public boolean merge(QLiveCourse p0){
       boolean b;
       QLiveCourse obj = PatchProxy.applyOneRefs(p0, this, QLiveCourse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       if (!(p0.mCourseId).equals(this.mCourseId)) {
          this.mCourseId = p0.mCourseId;
          b = true;
       }
       if (!TextUtils.x(p0.mLessonId)) {
          this.mLessonId = p0.mLessonId;
       }
       if (!TextUtils.x(p0.mCourseName)) {
          this.mCourseName = p0.mCourseName;
       }
       if (!TextUtils.x(p0.mLessonTitle)) {
          this.mLessonTitle = p0.mLessonTitle;
       }
       return b;
    }
}
