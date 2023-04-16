package com.yxcorp.plugin.setting.utils.b$b;
import x07.b;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.setting.http.response.KnockedDialogInfo;
import java.lang.reflect.Type;
import yfd.c;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiImageView;
import ekd.m1;
import com.yxcorp.utility.n;
import java.lang.Math;
import android.widget.ImageView;
import com.kwai.framework.model.user.User;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.UpBizFt;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class b$b extends b	// class@000931
{

    public void b$b(int p0){
       super(p0);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int this;
       View obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       KnockedDialogInfo knockedDialo = c.a(KnockedDialogInfo.class);
       if (knockedDialo != null && !q.f(knockedDialo.getUsers())) {
          KwaiImageView[] kwaiImageVie = new KwaiImageView[]{m1.f(obj, 0x7f0a14e0),m1.f(obj, 0x7f0a14df),m1.f(obj, 0x7f0a14de)};
          obj = m1.f(view, R.id.avatar_list_layout);
          obj.setVisibility(0);
          this = 2;
          obj.setVisibility(0);
          View[] viewArray = new View[]{kwaiImageVie[0],kwaiImageVie[1],kwaiImageVie[this],m1.f(view, 0x7f0a130c)};
          n.Z(8, viewArray);
          int i = 0;
          while (i < Math.min(knockedDialo.getUsers().size(), 3)) {
             if (knockedDialo.getUsers().get(i) != null) {
                kwaiImageVie[i].setVisibility(0);
                a$a this1 = a.d();
                this1.b(":ks-features:ft-platform:setting");
                this1.f(UpBizFt.FT_Social);
                kwaiImageVie[i].X(knockedDialo.getUsers().get(i).mAvatars, this1.a());
             }
             i = i + 1;
          }
       }
       return view;
    }
}
