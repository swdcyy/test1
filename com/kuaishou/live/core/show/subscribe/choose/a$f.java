package com.kuaishou.live.core.show.subscribe.choose.a$f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.subscribe.choose.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.view.View;
import ekd.m1;

public class a$f extends PresenterV2	// class@0010d0
{
    public String p;
    public TextView q;
    public static String sLivePresenterClassName = "LiveAnchorSubscribeChoosePhotoListAdapter$TipsPresenter";

    public void a$f(){
       super();
    }
    public void a$f(a$a p0){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a$f.class, "3")) {
          return;
       }
       if (TextUtils.x(this.p)) {
          this.q.setVisibility(4);
       }else {
          this.q.setVisibility(0);
          this.q.setText(this.p);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a261d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$f.class, "2")) {
          return;
       }
       this.p = this.r8("KEY_RELATE_TIPS");
       return;
    }
}
