package com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import java.lang.StringBuilder;
import android.content.Context;
import com.yxcorp.gifshow.util.DateUtils;
import android.view.View;
import ekd.m1;

public class MissUProfileAndNoticeAdapter$b extends PresenterV2	// class@0019e7
{
    public TextView p;
    public TextView q;
    public User r;

    public void MissUProfileAndNoticeAdapter$b(){
       super();
    }
    public void E8(){
       MissUProfileAndNoticeAdapter$b uob = MissUProfileAndNoticeAdapter$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       int i = 8;
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          if (TextUtils.x(this.r.mMissURecoText)) {
             this.q.setVisibility(i);
          }else {
             this.q.setVisibility(0);
             this.q.setText(this.r.mMissURecoText+" ¡¤ ");
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          this.p.setSingleLine();
          if (!this.r.mMissUTime) {
             this.p.setVisibility(i);
             this.p.setText("");
          }else {
             this.p.setVisibility(0);
             this.p.setText((DateUtils.w(this.getContext(), this.r.mMissUTime)).replaceAll("-", "/"));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MissUProfileAndNoticeAdapter$b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3ee1);
       this.q = m1.f(p0, 0x7f0a1013);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MissUProfileAndNoticeAdapter$b.class, "1")) {
          return;
       }
       this.r = this.q8(User.class);
       return;
    }
}
