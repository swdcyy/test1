package dl9.h1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.yxcorp.gifshow.comment.CommentConfig;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.View$MeasureSpec;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.content.Context;
import com.yxcorp.gifshow.comment.utils.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Long;
import java.lang.System;
import java.util.Calendar;
import java.util.TimeZone;
import androidx.constraintlayout.widget.Guideline;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;

public final class h1 extends PresenterV2	// class@001f67
{
    public CommentConfig p;
    public QComment q;
    public View r;
    public EmojiTextView s;
    public EmojiTextView t;
    public View u;
    public Guideline v;

    public void h1(){
       super();
    }
    public void E8(){
       boolean i;
       Activity activity;
       String obj;
       boolean b;
       h1 oh1 = h1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh1, "5")) {
          return;
       }
       h1 tr = this.r;
       if (tr == null) {
          a.S("mNameAndTagLayout");
       }
       ViewGroup$LayoutParams layoutParams = tr.getLayoutParams();
       if (!layoutParams instanceof ConstraintLayout$LayoutParams) {
          layoutParams = objArray;
       }
       if (layoutParams != null) {
          h1 tp = this.p;
          if (tp == null) {
             a.S("mCommentConfig");
          }
          i = (tp.mEnableNewLikeDislikeUi != null)? a1.d(R.dimen.arg_RES_7f070295): a1.d(R.dimen.arg_RES_7f07032a);
          layoutParams.setMarginEnd(i);
       }
       i = false;
       if (!PatchProxy.applyVoid(objArray, this, oh1, "3")) {
          tr = this.t;
          obj = "mReplyNameView";
          if (tr == null) {
             a.S(obj);
          }
          String str = "mNameView";
          if (!tr.getVisibility()) {
             activity = this.getActivity();
             a.m(activity);
             int i1 = n.k(activity);
             int i2 = View$MeasureSpec.makeMeasureSpec(i, i);
             h1 ts = this.s;
             if (ts == null) {
                a.S(str);
             }
             ts.measure(i2, i2);
             ts = this.t;
             if (ts == null) {
                a.S(obj);
             }
             ts.measure(i2, i2);
             h1 ts1 = this.s;
             if (ts1 == null) {
                a.S(str);
             }
             i2 = ts1.getMeasuredWidth();
             ts = this.t;
             if (ts == null) {
                a.S(obj);
             }
             float f = (float)i1;
             if ((float)(i2 + ts.getMeasuredWidth()) - ((0x3f19999a * f) - (float)a1.e(20.00f)) > 0) {
                ts1 = this.s;
                if (ts1 == null) {
                   a.S(str);
                }
                i1 = (int)(f * 0.30f);
                ts1.setMaxWidth(i1);
                h1 tt = this.t;
                if (tt == null) {
                   a.S(obj);
                }
                tt.setMaxWidth(i1);
             }
          }else {
             tr = this.s;
             if (tr == null) {
                a.S(str);
             }
             int i3 = Integer.MAX_VALUE;
             tr.setMaxWidth(i3);
             tr = this.t;
             if (tr == null) {
                a.S(obj);
             }
             tr.setMaxWidth(i3);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oh1, "4")) {
          Context context = this.getContext();
          activity = this.getActivity();
          h1 tq = this.q;
          if (tq == null) {
             a.S("mComment");
          }
          obj = PatchProxy.applyThreeRefs(context, activity, tq, null, d.class, "37");
          if (obj != PatchProxyResult.class) {
             i = obj.booleanValue();
          }else {
             DisplayMetrics density = c.c(context.getResources()).density;
             if (!density) {
                density = 3.00f;
             }
             if (((float)n.k(activity) / density) - 0x43b40000 <= 0 && (tq != null && !DateUtils.F(tq.created()))) {
                long l = tq.created();
                d uod = d.class;
                if (PatchProxy.isSupport(uod)) {
                   Object obj1 = PatchProxy.applyOneRefs(Long.valueOf(l), objArray, uod, "38");
                   if (obj1 != PatchProxyResult.class) {
                      b = obj1.booleanValue();
                   }else {
                   label_0159 :
                      long l1 = System.currentTimeMillis();
                      b = (l - ((l1 - (((long)Calendar.getInstance().getTimeZone().getRawOffset() + l1) % 0x5265c00)) - 0xf731400) < 0)? true: false;
                   }
                }else {
                   goto label_0159 ;
                }
                if (b) {
                   i = true;
                }
             }
          }
       label_017e :
          if (i) {
             oh1 = this.u;
             if (oh1 == null) {
                a.S("mDynamicButtons");
             }
             ViewGroup$LayoutParams layoutParams1 = oh1.getLayoutParams();
             if (layoutParams1 instanceof ConstraintLayout$LayoutParams) {
                objArray = layoutParams1;
             }
             if (objArray != null) {
                objArray.leftMargin = n.c(this.getContext(), 8.00f);
             }
             oh1 = this.u;
             if (oh1 == null) {
                a.S("mDynamicButtons");
             }
             oh1.setLayoutParams(objArray);
          }
       }
       oh1 = this.p;
       if (oh1 == null) {
          a.S("mCommentConfig");
       }
       if (oh1.mEnableNewLikeDislikeUi != null) {
          oh1 = this.v;
          if (oh1 == null) {
             a.S("mGuideline");
          }
          oh1.setGuidelineEnd(a1.e(19.00f));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h1.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.detail_comment_name_and_tag_layout);
       a.o(p0, "ViewBindUtils.bindWidget¡­ment_name_and_tag_layout\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h1.class, "1")) {
          return;
       }
       View obj = this.q8(QComment.class);
       a.o(obj, "inject\(QComment::class.java\)");
       this.q = obj;
       obj = this.q8(CommentConfig.class);
       a.o(obj, "inject\(CommentConfig::class.java\)");
       this.p = obj;
       obj = m1.f(this.m8(), R.id.name);
       a.o(obj, "ViewBindUtils.bindWidget\(rootView, R.id.name\)");
       this.s = obj;
       obj = m1.f(this.m8(), R.id.reply_name);
       a.o(obj, "ViewBindUtils.bindWidget¡­ootView, R.id.reply_name\)");
       this.t = obj;
       obj = m1.f(this.m8(), R.id.dynamic_operation_buttons);
       a.o(obj, "ViewBindUtils.bindWidget¡­ynamic_operation_buttons\)");
       this.u = obj;
       obj = m1.f(this.m8(), R.id.guide_line);
       a.o(obj, "ViewBindUtils.bindWidget\(rootView,R.id.guide_line\)");
       this.v = obj;
       return;
    }
}
