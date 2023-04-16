package dl9.c;
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
import android.widget.TextView;
import nx9.c;
import hl9.t;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import java.util.Iterator;
import com.kuaishou.android.model.mix.QComment$CommentBottomTag;
import tyc.j0;
import android.content.Context;
import lnc.a1;
import android.widget.TextView$BufferType;
import com.yxcorp.gifshow.entity.QPhoto;
import dz5.e;
import java.lang.Iterable;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import dl9.c$a;
import android.text.TextPaint;
import com.yxcorp.utility.n;
import dl9.b;
import android.view.View$OnClickListener;
import crd.b;
import hl9.y;
import android.graphics.drawable.GradientDrawable;
import qrd.l1;
import android.graphics.drawable.Drawable;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class c extends PresenterV2	// class@001f52
{
    public d p;
    public RecyclerFragment q;
    public TextView r;
    public TextView s;
    public QComment t;
    public QPhoto u;

    public void c(){
       super();
    }
    public void E8(){
       boolean b;
       c t;
       Context context;
       c u;
       GradientDrawable gradientDraw;
       Object obj = this;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uoc, "8")) {
          return;
       }
       obj.P8(this.m8());
       SpannableStringBuilder obj1 = PatchProxy.apply(objArray, obj, uoc, "9");
       String str = "mComment";
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          u = obj.t;
          if (u == null) {
             a.S(str);
          }
          if (u.mCommentBottomTags != null) {
             u = obj.t;
             if (u == null) {
                a.S(str);
             }
             if (u.mCommentBottomTags.size()) {
                b = false;
             }
          }
          b = true;
       }
       if (b) {
          uoc = obj.r;
          if (uoc != null) {
             uoc.setVisibility(8);
          }
          uoc = obj.s;
          if (uoc != null) {
             uoc.setVisibility(8);
          }
          return;
       }else if(c.f() && (obj.r == null && obj.s == null)){
          t.l9(this.m8(), R.id.comment_bottom_tag);
          t.l9(this.m8(), R.id.reward_comment_tag);
          obj.P8(this.m8());
       }
    label_0084 :
       obj1 = new SpannableStringBuilder("");
       t = obj.t;
       if (t == null) {
          a.S(str);
       }
       Iterator iterator = t.mCommentBottomTags.iterator();
       String str1 = " ";
       String str2 = "reward_message";
       while (iterator.hasNext()) {
          QComment$CommentBottomTag uCommentBott = iterator.next();
          if (uCommentBott != null) {
             int i = a.g(uCommentBott.mTextKey, str2) ^ 1;
             if (!i || PatchProxy.applyVoidTwoRefs(obj1, uCommentBott, obj, uoc, "10")) {
                continue ;
             }else if(obj1.length() > 0){
                obj1.append(str1);
             }
             int i1 = obj1.length();
             obj1.append(uCommentBott.mText);
             j0 oj0 = new j0();
             c r = obj.r;
             if (r != null) {
                context = r.getContext();
                if (context != null) {
                label_00e2 :
                   if (t.W8(context)) {
                      oj0.b(this.g(), uCommentBott.mTextColor, a1.a(R.color.arg_RES_7f0601ba), 0, uCommentBott.mBgColor);
                   }else {
                      oj0.b(this.g(), uCommentBott.mTextColorNight, a1.a(R.color.arg_RES_7f060639), 0, uCommentBott.mBgColorNight);
                   }
                   int i2 = a1.d(0x7f0702ac) + oj0.o;
                   oj0.k = i2;
                   oj0.l = a1.d(0x7f0702ac);
                   oj0.p = 0;
                   obj1.setSpan(oj0, i1, obj1.length(), 33);
                }
             }
             context = this.getContext();
             goto label_00e2 ;
          }
       }
       uoc = (obj1.length() > 0)? 1: null;
       if (uoc) {
          uoc = obj.r;
          if (uoc != null) {
             uoc.setVisibility(0);
          }
          obj1.append(str1);
          uoc = obj.r;
          if (uoc != null) {
             uoc.setText(obj1, TextView$BufferType.SPANNABLE);
          }
       }
       uoc = obj.s;
       if (uoc != null) {
          u = obj.u;
          if (u == null) {
             a.S("mPhoto");
          }
          c uoc1 = (e.b(u))? uoc: objArray;
          if (uoc1 != null) {
             uoc = obj.t;
             if (uoc == null) {
                a.S(str);
             }
             QComment mCommentBott = uoc.mCommentBottomTags;
             if (mCommentBott != null) {
                Iterator iterator1 = mCommentBott.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      Object obj2 = iterator1.next();
                      if (a.g(obj2.mTextKey, str2)) {
                         objArray = obj2;
                      }
                   }
                   Object[] objArray1 = objArray;
                   if (objArray1 != null) {
                      uoc = obj.p;
                      if (uoc == null) {
                         a.S("mCommentLogger");
                      }
                      c t1 = obj.t;
                      if (t1 == null) {
                         a.S(str);
                      }
                      u = obj.q;
                      if (u == null) {
                         a.S("mFragment");
                      }
                      uoc.t(t1, f0.a(u, this.getActivity()));
                      c$a uoa = new c$a(uoc1, obj);
                      if (!PatchProxy.applyVoidThreeRefs(uoc1, objArray1, uoa, this, c.class, "12")) {
                         uoc1.setVisibility(0);
                         uoc1.setText(objArray1.mText);
                         TextPaint paint = uoc1.getPaint();
                         if (paint != null) {
                            paint.setFakeBoldText(1);
                         }
                         uoc1.setMinimumHeight(n.c(uoc1.getContext(), 13.00f));
                         uoc1.setTextSize(1, 9.00f);
                         obj.X7(y.a(uoc1, new b(obj, uoc1, uoa)));
                         int i3 = 0x7f070426;
                         if (t.W8(uoc1.getContext())) {
                            uoc1.setTextColor(objArray1.mTextColor);
                            gradientDraw = new GradientDrawable();
                            gradientDraw.setCornerRadius((float)a1.d(i3));
                            gradientDraw.setColor(objArray1.mBgColor);
                            uoc1.setBackground(gradientDraw);
                            break ;
                         }else {
                            uoc1.setTextColor(objArray1.mTextColorNight);
                            gradientDraw = new GradientDrawable();
                            gradientDraw.setCornerRadius((float)a1.d(i3));
                            gradientDraw.setColor(objArray1.mBgColorNight);
                            uoc1.setBackground(gradientDraw);
                            break ;
                         }
                      }
                   }
                }
             }
          }
       }
    label_0242 :
       return;
    }
    public final void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
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
    public final QPhoto R8(){
       c obj = PatchProxy.apply(null, this, c.class, "6");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.P8(p0);
       return;
    }
    public final int g(){
       Object obj = PatchProxy.apply(null, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.c(this.getContext(), 9.00f);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
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
