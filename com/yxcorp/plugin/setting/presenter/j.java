package com.yxcorp.plugin.setting.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.presenter.j$a;
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

public class j extends PresenterV2	// class@0008e1
{
    public GifshowActivity p;
    public ViewGroup q;
    public TextView r;
    public TextView s;
    public final View$OnClickListener t;

    public void j(){
       super();
       this.t = new j$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       this.r.setText(R.string.arg_RES_7f103e55);
       this.s.setVisibility(0);
       j.d(this.s, (QCurrentUser.ME.isDisableSmartAlbumTabs() ^ 0x01));
       this.q.setOnClickListener(this.t);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.getActivity();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       ViewGroup viewGroup = m1.f(p0, R.id.album_tabs);
       this.q = viewGroup;
       viewGroup.setVisibility(0);
       this.r = m1.f(this.q, 0x7f0a0d6d);
       this.s = m1.f(this.q, 0x7f0a0d6a);
       return;
    }
}
