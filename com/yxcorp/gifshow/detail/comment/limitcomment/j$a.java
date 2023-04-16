package com.yxcorp.gifshow.detail.comment.limitcomment.j$a;
import qvb.q;
import com.yxcorp.gifshow.detail.comment.limitcomment.j;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kwai.library.widget.button.SlipSwitchButton;
import qvb.p;
import com.yxcorp.gifshow.detail.comment.limitcomment.d;
import qvb.n0;
import com.yxcorp.gifshow.detail.model.response.CommentLimitResponse;

public class j$a implements q	// class@001382
{
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, j$a.class, "2")) {
          return;
       }
       j$a tb = this.b;
       tb.p.setOnSwitchChangeListener(tb.s);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, j$a.class, "1")) {
          return;
       }
       if (p0) {
          CommentLimitResponse uCommentLimi = this.b.q.c.L0();
          j p = this.b.p;
          uCommentLimi = (uCommentLimi != null)? uCommentLimi.mFutureFriendsVisible: false;
          p.setSwitch(uCommentLimi);
          j$a tb = this.b;
          tb.p.setOnSwitchChangeListener(tb.s);
       }
       return;
    }
}
