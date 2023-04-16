package com.yxcorp.gifshow.relation.user.activity.PrivacyDialogRouterActivity$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.user.activity.PrivacyDialogRouterActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class PrivacyDialogRouterActivity$a implements PopupInterface$h	// class@0019df
{
    public final PrivacyDialogRouterActivity b;

    public void PrivacyDialogRouterActivity$a(PrivacyDialogRouterActivity p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(PrivacyDialogRouterActivity$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PrivacyDialogRouterActivity$a.class, "1")) {
          return;
       }
       if (p1) {
          this.b.finish();
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
