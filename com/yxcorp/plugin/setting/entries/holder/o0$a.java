package com.yxcorp.plugin.setting.entries.holder.o0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.o0;
import com.yxcorp.plugin.setting.entries.holder.o0$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;

public class o0$a extends PresenterV2	// class@00087d
{
    public TextView p;
    public View$OnClickListener q;
    public final o0 r;

    public void o0$a(o0 p0){
       this.r = p0;
       super();
       this.q = new o0$a$a(this);
    }
    public void E8(){
       o0$a uoa = o0$a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "2")) {
          return;
       }
       this.p.setVisibility(0);
       boolean b = QCurrentUser.ME.isPrivateUser();
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoa, "9")) {
          if (b) {
             this.p.setText(R.string.arg_RES_7f1046fd);
          }else {
             this.p.setText(R.string.arg_RES_7f1046cf);
          }
       }
       this.m8().setOnClickListener(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
