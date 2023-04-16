package com.kuaishou.live.audience.course.LiveCourseClosedDialogFragment$b;
import erd.g;
import com.kuaishou.live.audience.course.LiveCourseClosedDialogFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public class LiveCourseClosedDialogFragment$b implements g	// class@000bf4
{
    public final boolean b;
    public final LiveCourseClosedDialogFragment c;

    public void LiveCourseClosedDialogFragment$b(LiveCourseClosedDialogFragment p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCourseClosedDialogFragment$b.class, "1")) {
       }else {
          this.c.dismissAllowingStateLoss();
          if (this.b == null) {
             this.c.getActivity().finish();
          }
       }
       return;
    }
}
