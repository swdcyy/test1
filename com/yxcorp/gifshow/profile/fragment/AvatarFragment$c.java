package com.yxcorp.gifshow.profile.fragment.AvatarFragment$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.View;
import ekd.m1;
import k3c.g;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import t3c.g;

public class AvatarFragment$c extends PresenterV2	// class@0012fe
{
    public User p;
    public boolean q;
    public g r;
    public TextView s;

    public void AvatarFragment$c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, AvatarFragment$c.class, "3")) {
          return;
       }
       int i = 8;
       if (this.p.isBanned()) {
          this.s.setVisibility(i);
          return;
       }else if(this.q != null){
          String str = ": ";
          int i1 = 0x7f101c19;
          int i2 = 0;
          if (!TextUtils.x(this.p.getKwaiId())) {
             this.s.setVisibility(i2);
             this.s.setText(this.l8().getString(i1)+str+this.p.getKwaiId());
             return;
          }else if(!TextUtils.x(this.p.getId())){
             this.s.setVisibility(i2);
             this.s.setText(this.l8().getString(i1)+str+this.p.getId());
             return;
          }
       }
       this.s.setVisibility(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment$c.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1699);
       m1.a(p0, new g(this), R.id.kwai_id_copy);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AvatarFragment$c.class, "1")) {
          return;
       }
       this.p = this.r8("user");
       this.q = this.r8("showKwaiId").booleanValue();
       this.r = this.r8("editLogger");
       return;
    }
}
