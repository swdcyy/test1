package com.kuaishou.live.audience.course.LiveCourseClosedDialogFragment$a;
import t31.a$c;
import com.kuaishou.live.audience.course.LiveCourseClosedDialogFragment;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.Button;

public class LiveCourseClosedDialogFragment$a implements a$c	// class@000bf3
{
    public final LiveCourseClosedDialogFragment a;

    public void LiveCourseClosedDialogFragment$a(LiveCourseClosedDialogFragment p0){
       this.a = p0;
       super();
    }
    public void a(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCourseClosedDialogFragment$a.class, "1")) {
          return;
       }
       LiveCourseClosedDialogFragment$a ta = this.a;
       ta.v = p0;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, LiveCourseClosedDialogFragment.class, "11")) {
          LiveCourseClosedDialogFragment v = ta.v;
          if (v == null || v.size() <= 0) {
             ta.y.setEnabled(false);
          }else {
             ta.y.setEnabled(true);
          }
       }
       return;
    }
}
