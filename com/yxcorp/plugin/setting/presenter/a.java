package com.yxcorp.plugin.setting.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.presenter.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.helper.j;
import android.view.View$OnClickListener;
import android.view.View;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ekd.m1;

public class a extends PresenterV2	// class@0008d5
{
    public TextView p;
    public View q;
    public TextView r;
    public GifshowActivity s;
    public View$OnClickListener t;

    public void a(){
       super();
       this.t = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.r.setText(R.string.arg_RES_7f1001b6);
       j.d(this.p, (QCurrentUser.ME.isAllowPushMyCommentsToOther() ^ 0x01));
       this.q.setOnClickListener(this.t);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.s = this.getActivity();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       p0 = m1.f(p0, R.id.push_my_comment);
       this.q = p0;
       this.p = m1.f(p0, 0x7f0a0d6a);
       this.r = m1.f(this.q, 0x7f0a0d6d);
       return;
    }
}
