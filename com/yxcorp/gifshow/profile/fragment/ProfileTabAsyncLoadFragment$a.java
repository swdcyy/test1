package com.yxcorp.gifshow.profile.fragment.ProfileTabAsyncLoadFragment$a;
import nkc.c;
import com.yxcorp.gifshow.profile.fragment.ProfileTabAsyncLoadFragment;
import nkc.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mkc.b;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import k3c.u1;
import android.view.View$OnClickListener;

public class ProfileTabAsyncLoadFragment$a extends c	// class@001316
{
    public View h;
    public final ProfileTabAsyncLoadFragment i;

    public void ProfileTabAsyncLoadFragment$a(ProfileTabAsyncLoadFragment p0,d p1){
       this.i = p0;
       super(p1);
    }
    public View e(){
       Object obj = PatchProxy.apply(null, this, ProfileTabAsyncLoadFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          this.h = this.a.c(b.f.a);
       }
       return this.h;
    }
    public void k(boolean p0,Throwable p1){
       ProfileTabAsyncLoadFragment$a uoa = ProfileTabAsyncLoadFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       this.f();
       this.x();
       View view = this.c();
       KwaiEmptyStateView$a uoa1 = KwaiEmptyStateView.e();
       uoa1.k(R.drawable.arg_RES_7f080607);
       uoa1.p(new u1(this));
       uoa1.h(R.string.arg_RES_7f102f5d);
       uoa1.a(view);
       this.a.a(view);
       return;
    }
}
