package com.yxcorp.gifshow.v3.editor.segment.r$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.segment.r;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.post.api.util.PostPermission;
import android.content.Context;
import com.kwai.feature.post.api.util.PostPermissionUtils;
import java.util.List;
import java.util.Collections;
import brd.t;
import etc.g;
import com.yxcorp.gifshow.v3.editor.segment.q;
import erd.g;
import crd.b;
import java.util.Objects;
import crd.a;

public class r$a extends m	// class@0011de
{
    public final r c;

    public void r$a(r p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "1")) {
          return;
       }
       Activity activity = this.c.getActivity();
       if (activity == null) {
          return;
       }
       PostPermission aLBUM = PostPermission.ALBUM;
       if (!PostPermissionUtils.c(activity, aLBUM)) {
          b uob = PostPermissionUtils.e(activity, Collections.singletonList(aLBUM), false).subscribe(new g(this, activity), q.b);
          r$a tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(uob, tc, r.class, "5")) {
             r b = tc.B;
             if (b == null || b.isDisposed()) {
                tc.B = new a();
             }
             tc.B.c(uob);
          }
       }else {
          this.c.P8();
       }
       return;
    }
}
