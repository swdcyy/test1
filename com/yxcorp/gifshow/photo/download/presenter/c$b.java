package com.yxcorp.gifshow.photo.download.presenter.c$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.photo.download.presenter.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import fxb.a;
import androidx.fragment.app.DialogFragment;

public class c$b extends m	// class@000ee0
{
    public final c c;

    public void c$b(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       c$b tc = this.c;
       a.g(tc.y, "CLOSE", TextUtils.n("SCALE_CLEAN_CONTROLLER", tc.A));
       this.c.w.dismiss();
       return;
    }
}
