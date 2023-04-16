package dl9.g2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dl9.g2$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import hl9.t;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.comment.CommentConfig;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Float;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import qvb.i;
import com.kuaishou.android.model.mix.QComment;
import ekd.m1;
import al9.a;

public final class g2 extends PresenterV2	// class@001f64
{
    public QComment p;
    public a q;
    public ViewGroup r;
    public View s;
    public View t;
    public View u;
    public View v;
    public View w;
    public View x;
    public CommentConfig y;
    public static final g2$a z;

    static {
       g2.z = new g2$a(null);
    }
    public void g2(){
       super();
    }
    public void E8(){
       int i;
       ViewGroup$LayoutParams layoutParams;
       Object[] objArray1;
       g2 og2 = g2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og2, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og2, "3") && (this.t == null || (this.u == null || this.s == null))) {
          this.t = t.P8(this.m8(), 0x7f0a084d);
          this.u = t.P8(this.m8(), 0x7f0a35f3);
          this.s = t.P8(this.m8(), 0x7f0a0861);
       }
       g2 ty = this.y;
       if (ty == null) {
          a.S("mCommentConfig");
       }
       float f = 8.00f;
       if (ty.mEnableNewLikeDislikeUi != null) {
          if (this.R8()) {
             this.P8(f);
          }else {
             this.P8(0);
          }
       }else if(this.R8()){
          this.P8(16.00f);
       }else {
          this.P8(f);
       }
       if (!PatchProxy.applyVoid(objArray, this, og2, "5")) {
          ty = this.s;
          int i1 = (ty == null || ty.getVisibility())? a1.e(5.00f): a1.e(7.00f);
          g2 tt = this.t;
          if (tt != null) {
             layoutParams = tt.getLayoutParams();
             if (!layoutParams instanceof ConstraintLayout$LayoutParams) {
                layoutParams = objArray;
             }
             if (layoutParams != null) {
                layoutParams.setMargins(layoutParams.leftMargin, i1, layoutParams.rightMargin, layoutParams.bottomMargin);
                tt.setLayoutParams(layoutParams);
             }
          }
          tt = this.u;
          if (tt != null) {
             layoutParams = tt.getLayoutParams();
             if (!layoutParams instanceof ConstraintLayout$LayoutParams) {
                objArray1 = objArray;
             }
             if (objArray1 != null) {
                objArray1.setMargins(objArray1.leftMargin, i1, objArray1.rightMargin, objArray1.bottomMargin);
                tt.setLayoutParams(objArray1);
             }
          }
          tt = this.v;
          if (tt != null) {
             layoutParams = tt.getLayoutParams();
             if (!layoutParams instanceof ConstraintLayout$LayoutParams) {
                objArray1 = objArray;
             }
             if (objArray1 != null) {
                objArray1.setMargins(objArray1.leftMargin, i1, objArray1.rightMargin, objArray1.bottomMargin);
                tt.setLayoutParams(objArray1);
             }
          }
       }
    label_00ef :
       if (!PatchProxy.applyVoid(objArray, this, og2, "6")) {
          og2 = this.w;
          if (og2 == null) {
             a.S("mCommentBottom");
          }
          if (!og2.getVisibility()) {
             og2 = this.s;
             if (og2 == null || og2.getVisibility()) {
                og2 = this.t;
                if (og2 == null || og2.getVisibility()) {
                   og2 = this.u;
                   if (og2 == null || og2.getVisibility()) {
                      og2 = this.v;
                      if (og2 == null || og2.getVisibility()) {
                         i = a1.e(9.00f);
                      label_013e :
                         g2 tx = this.x;
                         if (tx == null) {
                            a.S("mCommentContent");
                         }
                         tx.setPadding(0, 0, 0, i);
                      }
                   }
                }
             }
             i = a1.e(10.00f);
             goto label_013e ;
          }
       }
       return;
    }
    public final void P8(float p0){
       g2 og2 = g2.class;
       if (PatchProxy.isSupport(og2) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, og2, "7")) {
          return;
       }
       String str = "mCommentFrame";
       if (this.r == null) {
          a.S(str);
       }
       og2 = this.r;
       if (og2 == null) {
          a.S(str);
       }
       g2 tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       int paddingLeft = tr.getPaddingLeft();
       g2 tr1 = this.r;
       if (tr1 == null) {
          a.S(str);
       }
       int paddingTop = tr1.getPaddingTop();
       g2 tr2 = this.r;
       if (tr2 == null) {
          a.S(str);
       }
       og2.setPadding(paddingLeft, paddingTop, tr2.getPaddingRight(), a1.e(p0));
       return;
    }
    public final boolean R8(){
       g2 obj = PatchProxy.apply(null, this, g2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       String str = "mCommentPageList";
       if (obj == null) {
          a.S(str);
       }
       List items = obj.getItems();
       g2 tp = this.p;
       if (tp == null) {
          a.S("mComment");
       }
       int i = items.indexOf(tp);
       tp = this.q;
       if (tp == null) {
          a.S(str);
       }
       int i1 = 1;
       if (i < (tp.getCount() - i1) && i >= 0) {
          tp = this.q;
          if (tp == null) {
             a.S(str);
          }
          QComment mType = tp.getItem((i + i1)).mType;
          if (mType != i1 && mType != 10) {
             i1 = false;
          }
          return i1;
       }else {
          return false;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g2.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.comment_frame);
       a.o(view, "ViewBindUtils.bindWidget¡­View, R.id.comment_frame\)");
       this.r = view;
       this.v = m1.f(p0, 0x7f0a3fdc);
       view = m1.f(p0, R.id.layout_comment_content);
       a.o(view, "ViewBindUtils.bindWidget¡­d.layout_comment_content\)");
       this.x = view;
       p0 = m1.f(p0, R.id.layout_comment_bottom);
       a.o(p0, "ViewBindUtils.bindWidget¡­id.layout_comment_bottom\)");
       this.w = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g2.class, "1")) {
          return;
       }
       Object obj = this.q8(QComment.class);
       a.o(obj, "inject\(QComment::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_PAGE_LIST");
       a.o(obj, "inject\(PageAccessIds.DETAIL_PAGE_LIST\)");
       this.q = obj;
       obj = this.q8(CommentConfig.class);
       a.o(obj, "inject\(CommentConfig::class.java\)");
       this.y = obj;
       return;
    }
}
