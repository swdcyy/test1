package com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$d$a;
import android.view.View$OnClickListener;
import ekd.m1;

public class MissUUserProfileAndNoticeFragment$d extends PresenterV2	// class@001a02
{
    public ViewStub p;
    public View q;

    public void MissUUserProfileAndNoticeFragment$d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MissUUserProfileAndNoticeFragment$d.class, "2")) {
          return;
       }
       if (this.q == null) {
          this.q = this.p.inflate();
       }
       this.q.setOnClickListener(new MissUUserProfileAndNoticeFragment$d$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MissUUserProfileAndNoticeFragment$d.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3295);
       return;
    }
}
