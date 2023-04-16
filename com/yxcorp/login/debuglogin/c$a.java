package com.yxcorp.login.debuglogin.c$a;
import k1d.e;
import com.yxcorp.login.debuglogin.c;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$PendingCategory;
import com.yxcorp.login.loginaction.LoginHelper;
import java.lang.Integer;

public class c$a implements e	// class@001aae
{
    public final ProgressFragment a;
    public final int b;
    public final c c;

    public void c$a(c p0,ProgressFragment p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(LoginUserResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       this.a.dismiss();
       this.c.q.l0(this.b);
       LoginHelper.g(this.c.getActivity(), p0, false, null, "other", false);
       return;
    }
    public void b(int p0,String p1){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, c$a.class, "1")) {
          return;
       }
       this.a.dismiss();
       return;
    }
    public void c(int p0){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, c$a.class, "3")) {
          return;
       }
       this.a.dismiss();
       return;
    }
}
