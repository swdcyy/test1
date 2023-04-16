package com.kuaishou.live.core.show.subscribe.choose.a$e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.subscribe.choose.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribePhoto;
import qk2.i;
import java.util.Set;
import android.widget.TextView;
import android.view.View;
import qk2.h;
import android.view.View$OnClickListener;
import ekd.m1;

public class a$e extends PresenterV2	// class@0010cf
{
    public LiveAnchorSubscribePhoto p;
    public i q;
    public View r;
    public TextView s;
    public View t;
    public static String sLivePresenterClassName = "LiveAnchorSubscribeChoosePhotoListAdapter$SingleItemSelectPresenter";

    public void a$e(){
       super();
    }
    public void a$e(a$a p0){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a$e.class, "3")) {
          return;
       }
       a$e tq = this.q;
       Set set = tq.O3();
       int i = 0;
       if (tq.zd(this.p)) {
          this.s.setVisibility(i);
          this.r.setVisibility(4);
       }else {
          this.s.setVisibility(4);
          this.r.setVisibility(i);
       }
       this.t.setOnClickListener(new h(this, set, tq));
       float f = 0x3f800000;
       if (!set.isEmpty()) {
          tq = this.t;
          if (this.p.mIsSelected == null) {
             f = 0x3f000000;
          }
          tq.setAlpha(f);
       }else {
          this.t.setAlpha(f);
       }
       this.r.setSelected(this.p.mIsSelected);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "2")) {
          return;
       }
       this.t = p0;
       this.r = m1.f(p0, 0x7f0a2647);
       this.s = m1.f(p0, 0x7f0a18d8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$e.class, "1")) {
          return;
       }
       this.p = this.q8(LiveAnchorSubscribePhoto.class);
       this.q = this.r8("KEY_LISTENER");
       return;
    }
}
