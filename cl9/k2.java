package cl9.k2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cl9.k2$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cl9.k2$b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import cl9.k2$c;
import android.view.View;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.comment.utils.d;
import java.lang.Integer;
import android.content.SharedPreferences;
import oe6.n;
import android.content.Context;
import i2b.a;
import android.widget.TextView;
import lnc.a1;
import android.text.SpannableString;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import android.text.style.StyleSpan;
import zf6.k;
import android.graphics.drawable.Drawable;

public final class k2 extends PresenterV2	// class@000641
{
    public TextView p;
    public View q;
    public RecyclerFragment r;
    public t s;
    public t t;
    public boolean u;
    public int v;
    public static final k2$a w;

    static {
       k2.w = new k2$a(null);
    }
    public void k2(){
       super(false, false);
    }
    public void k2(boolean p0,int p1){
       super();
       this.u = p0;
       this.v = p1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k2.class, "8")) {
          return;
       }
       if (!this.R8()) {
          return;
       }
       this.P8();
       k2 ts = this.s;
       if (ts == null) {
          a.S("mCommentShowPanelObservable");
       }
       g e = Functions.e;
       this.X7(ts.subscribe(new k2$b(this), e));
       ts = this.t;
       if (ts == null) {
          a.S("mCommentHidePanelObservable");
       }
       this.X7(ts.subscribe(new k2$c(this), e));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, k2.class, "13")) {
          return;
       }
       this.S8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k2.class, "12")) {
          return;
       }
       this.S8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, k2.class, "10")) {
          return;
       }
       k2 tq = this.q;
       if (tq != null) {
          tq.setVisibility(0);
          k2 tr = this.r;
          a.m(tr);
          tr.ia().P0(tq);
       }
       return;
    }
    public final boolean R8(){
       SharedPreferences sharedPrefer;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       k2 obj = PatchProxy.apply(objArray, this, k2.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.v;
       k2 tu = this.u;
       boolean b = false;
       if (PatchProxy.isSupport(d.class)) {
          Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(obj), Boolean.valueOf(tu), objArray, d.class, "32");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(tu != null && obj == 0x7602){
             sharedPrefer = 1;
          }else {
             sharedPrefer = null;
          }
          if (sharedPrefer && (n.b().getInt(d.b, b) < 3 && n.b().getBoolean("commentDenyOfflineKey", b))) {
             b = true;
          }
       }else {
          goto label_003a ;
       }
       return b;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, k2.class, "11")) {
          return;
       }
       k2 tq = this.q;
       if (tq != null) {
          k2 tr = this.r;
          a.m(tr);
          tr.ia().m1(tq);
       }
       return;
    }
    public void doBindView(View p0){
       int b;
       k2 ok2 = k2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok2, "6")) {
          return;
       }
       p0 = a.a(this.getContext(), R.layout.arg_RES_7f0d0795);
       this.q = p0;
       Object[] objArray = null;
       TextView textView = (p0 != null)? p0.findViewById(R.id.tv_comment_permission_text): objArray;
       this.p = textView;
       if (textView != null) {
          String str = a1.p(R.string.arg_RES_7f1007a8);
          SpannableString spannableStr = new SpannableString(str);
          a.o(str, "text");
          int i = StringsKt__StringsKt.i3(str, "£º", 0, false, 6, null);
          if (i < 0) {
             i = 2;
          }
          int i1 = 1;
          spannableStr.setSpan(new StyleSpan(i1), 0, i, 18);
          textView.setText(spannableStr);
          Object obj = PatchProxy.apply(objArray, this, ok2, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(k.d()){
             i1 = k.e();
          }
          b = i1;
          Drawable uDrawable = (b)? a1.f(R.drawable.arg_RES_7f0804e2): a1.f(R.drawable.arg_RES_7f0804e3);
          textView.setBackground(uDrawable);
          b = (b)? a1.a(R.color.arg_RES_7f0606e0): a1.a(R.color.arg_RES_7f06172d);
          textView.setTextColor(b);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k2.class, "5")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       Object obj = this.r8("COMMENT_SHOW_PANEL_OBSERVABLE");
       a.o(obj, "inject\(CommentAccessIds.¡­NT_SHOW_PANEL_OBSERVABLE\)");
       this.s = obj;
       obj = this.r8("COMMENT_HIDE_PANEL_OBSERVABLE");
       a.o(obj, "inject\(CommentAccessIds.¡­NT_HIDE_PANEL_OBSERVABLE\)");
       this.t = obj;
       return;
    }
}
