package com.kuaishou.live.core.show.subscribe.choose.a$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.subscribe.choose.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.View;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribePhoto;
import qk2.g;
import qk2.i;
import android.view.View$OnClickListener;
import ekd.m1;
import qk2.a;

public class a$d extends PresenterV2	// class@0010ce
{
    public LiveAnchorSubscribePhoto p;
    public i q;
    public a r;
    public View s;
    public TextView t;
    public View u;
    public static String sLivePresenterClassName = "LiveAnchorSubscribeChoosePhotoListAdapter$MultiItemSelectPresenter";

    public void a$d(){
       super();
    }
    public void a$d(a$a p0){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "3")) {
          return;
       }
       this.t.setVisibility(4);
       this.s.setVisibility(0);
       this.s.setSelected(this.p.mIsSelected);
       this.u.setOnClickListener(new g(this, this.q));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       this.u = p0;
       this.s = m1.f(p0, 0x7f0a2647);
       this.t = m1.f(p0, 0x7f0a18d8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "2")) {
          return;
       }
       this.p = this.q8(LiveAnchorSubscribePhoto.class);
       this.q = this.r8("KEY_LISTENER");
       this.r = this.r8("KEY_CONTEXT");
       return;
    }
}
