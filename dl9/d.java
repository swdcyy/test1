package dl9.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.QComment;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.android.model.mix.QComment$CommentBottomTag;
import com.yxcorp.gifshow.entity.QPhoto;
import dz5.e;
import java.util.Collection;
import android.widget.TextView;
import nx9.c;
import hl9.t;
import android.view.View$OnClickListener;
import java.util.Iterator;
import java.lang.Iterable;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import dl9.d$b;
import java.lang.CharSequence;
import android.text.TextPaint;
import android.content.Context;
import com.yxcorp.utility.n;
import dl9.d$a;
import crd.b;
import hl9.y;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import qrd.l1;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class d extends PresenterV2	// class@001f58
{
    public d p;
    public RecyclerFragment q;
    public TextView r;
    public TextView s;
    public QComment t;
    public QPhoto u;
    public boolean v;

    public void d(boolean p0){
       super();
       this.v = p0;
    }
    public void E8(){
       boolean b;
       QComment$CommentBottomTag uCommentBott;
       d tr;
       Object[] objArray1;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "9")) {
          return;
       }
       this.R8(this.m8());
       QComment obj = PatchProxy.apply(objArray, this, uod, "8");
       String str = "mPhoto";
       int i = 1;
       String str1 = "mComment";
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          uod = this.t;
          if (uod == null) {
             a.S(str1);
          }
          obj = uod.mCommentBottomTags;
          uCommentBott = (obj != null)? CollectionsKt___CollectionsKt.p2(obj): objArray;
          if (uCommentBott == null) {
             uod = this.u;
             if (uod == null) {
                a.S(str);
             }
             if (e.b(uod)) {
                uod = this.t;
                if (uod == null) {
                   a.S(str1);
                }
                obj = uod.mCommentBottomTags;
                if (obj == null || (obj.isEmpty() ^ i) != i) {
                label_005e :
                   b = false;
                }
             }else {
                goto label_005e ;
             }
          }
          b = true;
       }
       if (!b) {
          uod = this.r;
          if (uod != null) {
             uod.setVisibility(8);
          }
          uod = this.s;
          if (uod != null) {
             uod.setVisibility(8);
          }
          return;
       }else if(c.f() && (this.r == null && this.s == null)){
          t.l9(this.m8(), R.id.comment_bottom_tag);
          t.l9(this.m8(), R.id.reward_comment_tag);
          this.R8(this.m8());
       }
    label_009d :
       uod = this.t;
       if (uod == null) {
          a.S(str1);
       }
       obj = uod.mCommentBottomTags;
       String str2 = "reward_message";
       if (obj != null) {
          uCommentBott = CollectionsKt___CollectionsKt.p2(obj);
          if (uCommentBott != null) {
             if (!(i ^ a.g(uCommentBott.mTextKey, str2))) {
                objArray1 = objArray;
             }
             if (uCommentBott != null) {
                tr = this.r;
                if (tr != null) {
                   this.P8(tr, uCommentBott, objArray);
                }
             }
          }
       }
       uod = this.s;
       if (uod != null) {
          tr = this.u;
          if (tr == null) {
             a.S(str);
          }
          if (!e.b(tr)) {
             objArray1 = objArray;
          }
          if (uod != null) {
             d tt = this.t;
             if (tt == null) {
                a.S(str1);
             }
             QComment mCommentBott = tt.mCommentBottomTags;
             if (mCommentBott != null) {
                Iterator iterator = mCommentBott.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Object obj1 = iterator.next();
                      if (a.g(obj1.mTextKey, str2)) {
                         objArray = obj1;
                      }
                   }
                   if (objArray != null) {
                      d tp = this.p;
                      if (tp == null) {
                         a.S("mCommentLogger");
                      }
                      tt = this.t;
                      if (tt == null) {
                         a.S(str1);
                      }
                      tr = this.q;
                      if (tr == null) {
                         a.S("mFragment");
                      }
                      tp.t(tt, f0.a(tr, this.getActivity()));
                      this.P8(uod, objArray, new d$b(uod, this));
                      break ;
                   }
                }
             }
          }
       }
       return;
    }
    public final void P8(TextView p0,QComment$CommentBottomTag p1,View$OnClickListener p2){
       GradientDrawable gradientDraw;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "10")) {
          return;
       }
       p0.setVisibility(0);
       p0.setText(p1.mText);
       TextPaint paint = p0.getPaint();
       if (paint != null) {
          paint.setFakeBoldText(true);
       }
       p0.setMinimumHeight(n.c(p0.getContext(), 13.00f));
       p0.setTextSize(true, 9.00f);
       if (p2 == null) {
          p0.setOnClickListener(null);
       }else {
          this.X7(y.a(p0, new d$a(this, p0, p2)));
       }
       int i = 0x7f070426;
       if (this.v != null) {
          p0.setTextColor(p1.mTextColorNight);
          gradientDraw = new GradientDrawable();
          gradientDraw.setCornerRadius((float)a1.d(i));
          gradientDraw.setColor(p1.mBgColorNight);
          p0.setBackground(gradientDraw);
          return;
       }else if(t.W8(p0.getContext())){
          p0.setTextColor(p1.mTextColor);
          gradientDraw = new GradientDrawable();
          gradientDraw.setCornerRadius((float)a1.d(i));
          gradientDraw.setColor(p1.mBgColor);
          p0.setBackground(gradientDraw);
       }else {
          p0.setTextColor(p1.mTextColorNight);
          gradientDraw = new GradientDrawable();
          gradientDraw.setCornerRadius((float)a1.d(i));
          gradientDraw.setColor(p1.mBgColorNight);
          p0.setBackground(gradientDraw);
       }
       return;
    }
    public final void R8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       if (this.r != null && this.s != null) {
          return;
       }
       this.r = t.P8(p0, 0x7f0a084d);
       this.s = t.P8(p0, 0x7f0a35f3);
       t.a9(this.r);
       t.a9(this.s);
       return;
    }
    public final QPhoto S8(){
       d obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.R8(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Object obj = this.q8(QComment.class);
       a.o(obj, "inject\(QComment::class.java\)");
       this.t = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.u = obj;
       obj = this.q8(d.class);
       a.o(obj, "inject\(CommentLogger::class.java\)");
       this.p = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.q = obj;
       return;
    }
}
