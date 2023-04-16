package com.yxcorp.gifshow.profile.fragment.AvatarFragment$b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import mz6.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import k3c.d;
import android.content.DialogInterface$OnClickListener;
import k3c.c;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import t3c.g;

public class AvatarFragment$b$a extends m	// class@0012f9
{
    public final AvatarFragment$b c;

    public void AvatarFragment$b$a(AvatarFragment$b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment$b$a.class, "1")) {
          return;
       }
       AvatarFragment$b$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, AvatarFragment$b.class, "6")) {
          b uob = new b(tc.getActivity());
          int[] ointArray = new int[]{AvatarFragment$b.B};
          uob.j(ointArray);
          uob.l(new d(tc));
          uob.k(new c(tc));
          uob.q();
          tc.s.e();
       }
       return;
    }
}
