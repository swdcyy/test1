package com.yxcorp.gifshow.relation.feed.presenter.a$d;
import pac.a;
import com.yxcorp.gifshow.relation.feed.presenter.a;
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
import i2b.a;
import android.widget.TextView;
import g9c.a;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.relation.feed.presenter.a$d$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.feed.presenter.a$d$b;

public class a$d extends a	// class@0018a4
{
    public final a d;

    public void a$d(a p0){
       this.d = p0;
       super();
    }
    public View c(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       boolean b = false;
       View view = a.l(p2, R.layout.arg_RES_7f0d0430, b, 1);
       TextView textView = view.findViewById(R.id.reduce_user);
       RecoUser recoUser = this.d.C.N0(b);
       if (recoUser != null) {
          if (TextUtils.n("F", recoUser.mUser.mSex)) {
             textView.setText(R.string.arg_RES_7f1003a1);
          }
          textView.setOnClickListener(new a$d$a(this, recoUser));
          view.findViewById(R.id.reduce_card).setOnClickListener(new a$d$b(this, recoUser));
       }
       return view;
    }
}
