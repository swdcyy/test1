package com.yxcorp.gifshow.detail.comment.limitcomment.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.comment.limitcomment.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import qvb.q;
import com.yxcorp.gifshow.detail.comment.limitcomment.d;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.detail.comment.limitcomment.e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.comment.limitcomment.f;
import android.view.View$OnTouchListener;

public class g extends PresenterV2	// class@00137e
{
    public TextView p;
    public View q;
    public int r;
    public int s;
    public d t;
    public final q u;

    public void g(){
       super();
       this.u = new g$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.p.setEnabled(false);
       this.t.d(this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.t.e(this.u);
       return;
    }
    public final String P8(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return "";
       }
       return (((p0.toString()).replace("[", "")).replace("]", "")).replaceAll(" ", "");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a4269);
       this.q = m1.f(p0, 0x7f0a04a4);
       m1.a(p0, new e(this), R.id.tv_selectall_confirm_comment_limit);
       this.p.setOnTouchListener(f.b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.t = this.r8("COMMENT_LIMIT_CONTROLLER");
       return;
    }
}
