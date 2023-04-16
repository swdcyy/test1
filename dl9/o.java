package dl9.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import android.view.View;
import hl9.t;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.utils.d;
import ek9.m1;
import q87.c;
import android.content.Context;
import com.yxcorp.gifshow.util.DateUtils;
import dl9.n;
import android.view.View$OnClickListener;
import crd.b;
import com.yxcorp.gifshow.comment.utils.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import ekd.m1;
import nx9.c;
import android.content.res.ColorStateList;
import lnc.a1;
import yk9.d;
import brd.y;
import com.yxcorp.gifshow.event.CommentsEvent;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;

public class o extends PresenterV2	// class@001f8f
{
    public View p;
    public View q;
    public View r;
    public View s;
    public View t;
    public QComment u;
    public y v;
    public d w;

    public void o(){
       super();
    }
    public void E8(){
       ConstraintLayout$LayoutParams layoutParams;
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "4")) {
          return;
       }
       u1.a(this);
       if (!PatchProxy.applyVoid(objArray, this, oo, "3") && (this.s == null || this.t == null)) {
          this.s = t.P8(this.m8(), 0x7f0a084d);
          this.t = t.P8(this.m8(), 0x7f0a35f3);
       }
       if (d.n(this.u)) {
          this.p.setVisibility(0);
          this.q.setVisibility(0);
          Object[] objArray1 = new Object[0];
          m1.C().t("show", "show mCreateTimeView", objArray1);
          String str = (this.u.getStatus() == 1)? this.getContext().getString(R.string.arg_RES_7f104666): DateUtils.w(this.getContext(), this.u.created());
          t.k9(this.p, str);
          this.X7(c.a(this.q, new n(this)));
          if (!PatchProxy.applyVoid(objArray, this, oo, "7")) {
             oo = this.u;
             if (oo == null || TextUtils.isEmpty(oo.mAuthorArea)) {
                this.r.setVisibility(8);
             }else {
                this.r.setVisibility(0);
                t.k9(this.r, this.u.mAuthorArea);
             }
          }
       }else {
          this.p.setVisibility(8);
          this.r.setVisibility(8);
          this.q.setVisibility(8);
       }
       oo = this.s;
       if (oo != null && (this.t != null && (oo.getVisibility() == 8 && !this.t.getVisibility()))) {
          layoutParams = this.p.getLayoutParams();
          layoutParams.i = this.t.getId();
          this.p.setLayoutParams(layoutParams);
       }else if(this.s != null && this.t != null){
          layoutParams = this.p.getLayoutParams();
          layoutParams.i = this.s.getId();
          this.p.setLayoutParams(layoutParams);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "8")) {
          return;
       }
       u1.b(this);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0854);
       this.q = m1.f(p0, 0x7f0a0884);
       this.r = m1.f(p0, 0x7f0a0849);
       int i = 0x7f0601fb;
       int i1 = 0x7f06081d;
       if (c.c()) {
          t.e9(this.p, a1.b(t.R8(this.getContext(), i1, i)));
          t.e9(this.r, a1.b(t.R8(this.getContext(), i1, i)));
          t.e9(this.q, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081c, 0x7f0601f6)));
          t.h9(this.q, false);
       }else {
          int i2 = 0x7f0601d9;
          if (c.d()) {
             t.e9(this.p, a1.b(t.R8(this.getContext(), i1, i)));
             t.e9(this.r, a1.b(t.R8(this.getContext(), i1, i)));
             t.e9(this.q, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081b, i2)));
             t.h9(this.q, true);
          }else {
             t.e9(this.p, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f060817, i2)));
             t.e9(this.r, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f060817, i2)));
             t.e9(this.q, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f0607cf, 0x7f0601ba)));
             t.h9(this.q, true);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.u = this.q8(QComment.class);
       this.w = this.q8(d.class);
       this.v = this.r8("COMMENT_REPLY_OBSERVER");
       return;
    }
    public void onEventMainThread(CommentsEvent p0){
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "5")) {
          return;
       }
       if (p0.c == CommentsEvent$Operation.ADD && !PatchProxy.applyVoid(null, this, oo, "6")) {
          if (d.n(this.u)) {
             this.p.setVisibility(0);
             String str = (this.u.getStatus() == 1)? this.getContext().getString(R.string.arg_RES_7f104666): DateUtils.w(this.getContext(), this.u.created());
             t.k9(this.p, str);
          }else {
             this.p.setVisibility(8);
          }
       }
       return;
    }
}
