package com.yxcorp.gifshow.detail.comment.limitcomment.g$a;
import qvb.q;
import com.yxcorp.gifshow.detail.comment.limitcomment.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.View;
import android.widget.TextView;
import qvb.p;
import com.yxcorp.gifshow.detail.comment.limitcomment.d;
import qvb.n0;
import com.yxcorp.gifshow.detail.model.response.CommentLimitResponse;

public class g$a implements q	// class@00137d
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, g$a.class, "2")) {
          return;
       }
       if (p0) {
          this.b.q.setVisibility(8);
          this.b.p.setEnabled(false);
       }
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
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          CommentLimitResponse uCommentLimi = this.b.t.c.L0();
          g$a tb = this.b;
          boolean b = false;
          CommentLimitResponse mSelectedcou = (uCommentLimi != null)? uCommentLimi.mSelectedcount: 0;
          tb.r = mSelectedcou;
          uCommentLimi = (uCommentLimi != null)? uCommentLimi.mTotalcount: 0;
          tb.s = uCommentLimi;
          g q = tb.q;
          int i = (uCommentLimi)? 0: 8;
          q.setVisibility(i);
          g$a tb1 = this.b;
          q = tb1.p;
          if (tb1.s != null) {
             b = true;
          }
          q.setEnabled(b);
       }
       return;
    }
}
