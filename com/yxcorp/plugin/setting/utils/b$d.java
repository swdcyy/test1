package com.yxcorp.plugin.setting.utils.b$d;
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
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.plugin.setting.http.response.KnockedDialogInfo;
import java.lang.reflect.Type;
import yfd.c;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import java.lang.Math;
import com.kwai.framework.model.user.User;
import lu7.f;
import android.widget.ImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.UpBizFt;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lnc.a1;
import java.lang.CharSequence;
import android.view.ViewTreeObserver;
import com.yxcorp.plugin.setting.utils.b$d$a;
import android.view.ViewTreeObserver$OnPreDrawListener;

public class b$d extends b	// class@000934
{

    public void b$d(int p0){
       super(p0);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       List obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       m1.f(view, R.id.top_tips_content).setText(R.string.arg_RES_7f1046d4);
       m1.f(view, R.id.middle_tips_content).setText(R.string.arg_RES_7f1046d5);
       View view1 = m1.f(view, R.id.bottom_tips);
       KnockedDialogInfo knockedDialo = c.a(KnockedDialogInfo.class);
       int i = 8;
       if (knockedDialo != null && !q.f(knockedDialo.getUsers())) {
          obj = knockedDialo.getUsers();
          int i1 = 3;
          KwaiImageView[] kwaiImageVie = new KwaiImageView[i1];
          View view2 = m1.f(view1, R.id.avatar_list_layout);
          kwaiImageVie[0] = m1.f(view2, 0x7f0a14e0);
          int i2 = 1;
          kwaiImageVie[i2] = m1.f(view2, 0x7f0a14df);
          int i3 = 2;
          kwaiImageVie[i3] = m1.f(view2, 0x7f0a14de);
          view2.setVisibility(0);
          View[] viewArray = new View[]{kwaiImageVie[0],kwaiImageVie[i2],kwaiImageVie[i3],m1.f(view, 0x7f0a130c)};
          n.Z(i, viewArray);
          String str = "";
          int i4 = 0;
          while (i4 < Math.min(obj.size(), i1)) {
             if (knockedDialo.getUsers().get(i4) != null) {
                if (str.length() > 0) {
                   str = str+"¡¢";
                }
                str = str+f.c(obj.get(i4));
                kwaiImageVie[i4].setVisibility(0);
                a$a uoa = a.d();
                uoa.b(":ks-features:ft-platform:setting");
                uoa.f(UpBizFt.FT_Social);
                kwaiImageVie[i4].X(obj.get(i4).mAvatars, uoa.a());
             }
             i4 = i4 + 1;
          }
          TextView textView = m1.f(view1, R.id.bottom_tips_content);
          str = a1.r(R.string.arg_RES_7f1010b2, str);
          textView.setText(str);
          textView.getViewTreeObserver().addOnPreDrawListener(new b$d$a(this, textView, str, m1.f(view1, R.id.bottom_tips_content2)));
       }else {
          view1.setVisibility(i);
       }
       return view;
    }
}
