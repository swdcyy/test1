package com.yxcorp.gifshow.detail.fragments.milano.profile.g$a;
import df5.b;
import com.yxcorp.gifshow.detail.fragments.milano.profile.g;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import java.util.Objects;
import c95.c;
import android.view.View;
import android.widget.TextView;
import le5.f;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.content.res.Configuration;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import z0a.l;
import android.view.View$OnClickListener;
import df5.a;

public class g$a implements b	// class@00154c
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       g$a ta = this.a;
       if (ta.q != null) {
          g s = ta.s;
          if (s != null && s.getUser() != null) {
             ta = this.a;
             g.k(ta.q, ta.s.getUser(), HeadImageSize.SMALL);
          }
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, g.class, "3")) {
          if (ta.u.i != null) {
             ta.P8(ta.r, 8);
             ta.P8(ta.p, 8);
          }else {
             int i = 0;
             ta.P8(ta.r, i);
             ta.P8(ta.p, i);
             if (ta.r != null) {
                g s1 = ta.s;
                if (s1 != null && s1.getUser() != null) {
                   s1 = ta.r;
                   i = (ta.s.getUser().isMale())? 0x7f104c85: 0x7f104c84;
                   s1.setText(i);
                   if (!f.o()) {
                      if (a.b().getResources().getConfiguration().fontScale - 0x3fa00000 >= 0) {
                         ta.r.setText(R.string.arg_RES_7f103bfd);
                      }else if(a.b().getResources().getConfiguration().fontScale - 0x3f800000 > 0){
                         ta.r.setTextSize(2, 11.00f);
                      }
                   }else if(QCurrentUser.me().isLogined() && TextUtils.n(ta.s.getUser().mId, QCurrentUser.me().getId())){
                      ta.r.setText(R.string.arg_RES_7f1037f1);
                   }
                }
             }
          label_00e9 :
             ta.p.setOnClickListener(new l(ta));
          }
       }
       return;
    }
    public void b(QPhoto p0){
       this.a.s = p0;
    }
    public void c(QPhoto p0){
       a.c(this, p0);
    }
}
