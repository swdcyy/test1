package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$p$a;
import u07.u;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$p;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import lnc.a1;
import androidx.fragment.app.c;

public final class MoodTemplateViewBinder$p$a implements u	// class@000b6a
{
    public final MoodTemplateViewBinder$p b;

    public void MoodTemplateViewBinder$p$a(MoodTemplateViewBinder$p p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       FragmentActivity activity;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MoodTemplateViewBinder$p$a.class, "1")) {
          return;
       }
       a.p(p0, "ksDialog");
       a.p(p1, "view");
       if (this.b.b.S.y0()) {
          if (a1.i(this.b.b.E().getActivity())) {
             activity = this.b.b.E().getActivity();
             if (activity != null) {
                activity.finish();
             }
          }
       }else {
          activity = this.b.b.E().getActivity();
          if (activity != null) {
             c supportFragm = activity.getSupportFragmentManager();
             if (supportFragm != null) {
                supportFragm.popBackStack();
             }
          }
       }
       return;
    }
}
