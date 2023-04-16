package com.yxcorp.plugin.setting.presenter.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.presenter.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.helper.j;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import ekd.m1;

public class h extends PresenterV2	// class@0008de
{
    public GifshowActivity p;
    public ViewGroup q;
    public TextView r;
    public TextView s;
    public View$OnClickListener t;

    public void h(){
       super();
       this.t = new h$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       this.r.setText(R.string.arg_RES_7f10018c);
       this.s.setVisibility(0);
       j.d(this.s, QCurrentUser.ME.isEnableLocalIntelligenceAlbum());
       this.q.setOnClickListener(this.t);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.getActivity();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       ViewGroup viewGroup = m1.f(p0, R.id.smart_album);
       this.q = viewGroup;
       this.r = m1.f(viewGroup, 0x7f0a0d6d);
       this.s = m1.f(this.q, 0x7f0a0d6a);
       return;
    }
}
