package nmd.a;
import nmd.a$a;
import nsd.u;
import lnc.a1;
import java.lang.Object;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import com.yxcorp.gifshow.kuaishan.widget.KSProgressBar;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteStickerFeedUIData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteOptionFeedData;
import android.widget.EditText;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.widget.RelativeLayout$LayoutParams;
import java.lang.StringBuilder;
import android.widget.ProgressBar;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import android.view.View;
import android.view.View$OnClickListener;
import nmd.a$c;
import android.view.View$OnTouchListener;
import nmd.a$d;
import faa.a;
import q87.c;
import android.animation.ValueAnimator;
import nmd.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import nmd.e;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import java.lang.Float;
import nmd.a$e;
import java.lang.Runnable;
import ekd.k1;
import qsd.d;
import java.lang.Math;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import nmd.b;
import nmd.c;
import java.util.Collection;

public final class a	// class@001e4b
{
    public MultiVoteStickerFeedUIData a;
    public a$b b;
    public View c;
    public View d;
    public VoteTextView e;
    public VoteTextView f;
    public TextView g;
    public KSProgressBar h;
    public VoteTextView i;
    public TextView j;
    public KSProgressBar k;
    public VoteTextView l;
    public TextView m;
    public KSProgressBar n;
    public View o;
    public View p;
    public TextView q;
    public static final int r;
    public static final int s;
    public static final a$a t;

    static {
       a.t = new a$a(null);
       a.r = a1.d(0x7f070295);
       a.s = a1.d(0x7f07030d);
    }
    public void a(){
       super();
    }
    public final void a(TextView p0,VoteTextView p1,KSProgressBar p2,MultiVoteStickerFeedUIData p3,int p4){
       ViewGroup$LayoutParams obj1;
       ViewParent parent;
       String str;
       a uoa = a.class;
       int i = 0;
       int i1 = 2;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "9")) {
             return;
          }
       }
       Object obj = p3.getOptionList().get(p4);
       a.o(obj, "data.optionList[optionIndex]");
       boolean hasVotedByMe = p3.getHasVotedByMe();
       i1 = (p3.getPageSource() == i1)? 1: 0;
       p1.setCursorVisible(i);
       String optionConten = obj.getOptionContent();
       if (PatchProxy.isSupport(uoa)) {
          obj1 = PatchProxy.applyTwoRefs(optionConten, Integer.valueOf(p4), this, uoa, "13");
          if (obj1 != PatchProxyResult.class) {
             optionConten = obj1;
          }else if(!TextUtils.x(optionConten)){
             if (p4) {
                if (p4 != 1) {
                   str = a1.p(R.string.arg_RES_7f103b43);
                   a.o(str, "CommonUtil.string\(R.string.other\)");
                }else {
                   str = a1.p(R.string.arg_RES_7f103944);
                   a.o(str, "CommonUtil.string\(R.string.no\)");
                }
             }else {
                str = a1.p(R.string.arg_RES_7f10525d);
                a.o(str, "CommonUtil.string\(R.string.yes\)");
             }
             optionConten = str;
          }
       }else {
          goto label_0062 ;
       }
       p1.setText(optionConten);
       obj1 = p1.getLayoutParams();
       Objects.requireNonNull(obj1, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
       View$OnClickListener onClickListe = null;
       if (i1 && hasVotedByMe) {
          p0.setVisibility(i);
          a ta = this.a;
          if (ta != null) {
             i = ta.getOptionVotePercentage(p4);
          }
          p0.setText(String.valueOf(i)+"%");
          p2.setProgress(i);
          p1.setEndEllipseAvailability(1);
          p1.setMaxWidth(a1.d(R.dimen.arg_RES_7f070fd2));
          p1.setTranslationX(0);
          p0.setTranslationX(0);
          p0.setAlpha(0x3f800000);
          if (obj.getSelectedByMe()) {
             p1.setTextColor(a1.a(R.color.arg_RES_7f0618f3));
             p2.setProgressDrawable(a1.f(R.drawable.arg_RES_7f082449));
          }else {
             p1.setTextColor(a1.a(R.color.arg_RES_7f0618f2));
             p2.setProgressDrawable(a1.f(R.drawable.arg_RES_7f082448));
          }
          obj1.removeRule(13);
          obj1.addRule(15);
          obj1.addRule(9);
          p1.setLayoutParams(obj1);
          parent = p1.getParent();
          if (!parent instanceof View) {
             parent = onClickListe;
          }
          if (parent != null) {
             parent.setOnClickListener(onClickListe);
          }
       }else {
          p0.setVisibility(8);
          p2.setProgress(i);
          p1.setEndEllipseAvailability(i);
          p1.setMaxWidth(a1.d(R.dimen.arg_RES_7f070fd1));
          p1.setTextColor(a1.a(R.color.arg_RES_7f0618f2));
          obj1.removeRule(9);
          obj1.addRule(13);
          p1.setLayoutParams(obj1);
          if (i1) {
             p1.setOnTouchListener(new a$c(this, p3, p4));
             parent = p1.getParent();
             if (parent instanceof View) {
                onClickListe = parent;
             }
             if (onClickListe != null) {
                onClickListe.setOnClickListener(new a$d(this, p3, p4));
             }
          }
       }
       return;
    }
    public final void b(MultiVoteStickerFeedUIData p0,int p1){
       a a;
       d obj = this;
       a obj1 = p0;
       int i = p1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, uoa, "10")) {
          return;
       }
       String str = "MultiVoteStickerFeedViewHelper";
       int i1 = 0;
       if (!p0.getHasVotedByMe()) {
          int i2 = 2;
          if (p0.getPageSource() == i2) {
             Object[] objArray1 = new Object[i1];
             a.D().w(str, "onVoteOptionClicked with optionIndex="+i, objArray1);
             a = obj.a;
             if (a != null) {
                a.onOptionSelected(i);
                if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, uoa, "11")) {
                   Object obj2 = p0.getOptionList().get(i1);
                   a.o(obj2, "data.optionList[0]");
                   ValueAnimator obj3 = obj2;
                   int i3 = 1;
                   obj2 = p0.getOptionList().get(i3);
                   a.o(obj2, "data.optionList[1]");
                   Object obj4 = obj2;
                   obj2 = p0.getOptionList().get(i2);
                   a.o(obj2, "data.optionList[2]");
                   Object obj5 = obj2;
                   int optionVotePe = obj1.getOptionVotePercentage(i1);
                   int optionVotePe1 = obj1.getOptionVotePercentage(i3);
                   int optionVotePe2 = obj1.getOptionVotePercentage(i2);
                   obj1 = obj.f;
                   int i4 = (obj1 != null)? obj1.getWidth(): 0;
                   obj1 = obj.i;
                   int i5 = (obj1 != null)? obj1.getWidth(): 0;
                   obj1 = obj.l;
                   int i6 = (obj1 != null)? obj1.getWidth(): 0;
                   ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i2]{0,0x3f800000});
                   a.o(valueAnimato, "animator");
                   valueAnimato.setDuration(250);
                   d uod = v9;
                   uoa = this;
                   Object obj6 = obj3;
                   int i7 = optionVotePe;
                   i1 = i4;
                   Object obj7 = obj4;
                   int i8 = optionVotePe1;
                   int i9 = i5;
                   Object obj8 = obj5;
                   obj = v9;
                   int i10 = optionVotePe2;
                   ValueAnimator valueAnimato1 = valueAnimato;
                   int i11 = i6;
                   uod = new d(uoa, obj6, i7, i1, obj7, i8, i9, obj8, i10, i11);
                   valueAnimato1.addUpdateListener(obj);
                   obj3 = valueAnimato1;
                   e uoe = new e(uoa, obj6, i7, i1, obj7, i8, i9, obj8, i10, i11, p1);
                   obj3.addListener(obj);
                   obj3.start();
                }
             }
             return;
          }
       }
       Object[] objArray = new Object[i1];
       a.D().A(str, "onVoteOptionClicked: cannot be clicked, optionIndex="+p1, objArray);
       return;
    }
    public final void c(boolean p0,int p1,TextView p2,VoteTextView p3,int p4,KSProgressBar p5,float p6,boolean p7){
       a uoa = a.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),p2,p3,Integer.valueOf(p4),p5,Float.valueOf(p6),Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "12")) {
             return;
          }
       }
       if (p2 == null || (p3 != null && p5 != null)) {
          int i2 = a1.d(R.dimen.arg_RES_7f070fd2);
          if (p4 <= i2) {
             i = 0;
          }
          if (p7) {
             int i3 = (p0)? a1.a(R.color.arg_RES_7f0618f3): a1.a(R.color.arg_RES_7f0618f2);
             p3.setTextColor(i3);
             p3.setMaxWidth(i2);
             if (i) {
                k1.r(new a$e(p3), 0);
             }
             Drawable uDrawable = (p0)? a1.f(R.drawable.arg_RES_7f082449): a1.f(R.drawable.arg_RES_7f082448);
             p5.setProgressDrawable(uDrawable);
             p2.setAlpha(0);
             p2.setVisibility(i1);
             p2.setText(String.valueOf(p1)+"%");
          }
          float f = 2.00f;
          if (i && p4 > p3.getWidth()) {
             i1 = Math.max(i1, d.H0(((float)(p4 - p3.getWidth()) / f)));
          }
          p6 = Math.max(0, Math.min(0x3f800000, p6));
          p3.setTranslationX((((Math.max(0, (((float)(NewVoteStickerDrawer.MULTI_VOTE_STICKER_LAYOUT_ORIGIN_WIDTH - p4) / f) - (float)a.r)) * p6) * 0xbf800000) - (float)i1));
          p2.setTranslationX(((float)a.s * (0x3f800000 - p6)));
          p2.setAlpha((p6 * p6));
          p5.setProgress((int)((float)p1 * p6));
       }
    label_00fd :
       return;
    }
    public final void d(MultiVoteStickerFeedUIData p0){
       a tg;
       a tf;
       a th;
       a this;
       a to;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
          return;
       }
       a.p(p0, "data");
       Object[] objArray = new Object[0];
       a.D().w("MultiVoteStickerFeedViewHelper", "updateView invoked with data = "+p0, objArray);
       this.a = p0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "8")) {
          if (TextUtils.x(p0.getQuestion())) {
             to = this.d;
             if (to != null) {
                to.setVisibility(4);
             }
          }else {
             to = this.e;
             if (to != null) {
                to.setVisibility(0);
             }
             to = this.e;
             if (to != null) {
                to.setEnabled(0);
             }
             to = this.e;
             if (to != null) {
                to.setCursorVisible(0);
             }
             to = this.e;
             if (to != null) {
                to.setText(p0.getQuestion());
             }
          }
       }
       MultiVoteStickerFeedUIData multiVoteSti = 8;
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "6")) {
          if (p0.getPageSource() != 2) {
             to = this.o;
             if (to != null) {
                to.setVisibility(multiVoteSti);
             }
          }else {
             to = this.o;
             if (to != null) {
                to.setVisibility(0);
             }
             to = this.o;
             if (to != null) {
                to.setOnClickListener(new b(this));
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "7")) {
          if (p0.isAuthor() && p0.getPageSource() == 2) {
             uoa = this.p;
             if (uoa != null) {
                uoa.setVisibility(0);
             }
             uoa = this.p;
             if (uoa != null) {
                uoa.setOnClickListener(new c(this));
             }
             uoa = this.q;
             if (uoa != null) {
                uoa.setText(a1.q(R.string.arg_RES_7f10513f, p0.getTotalVoteCount()));
             }
          }else {
             uoa = this.p;
             if (uoa != null) {
                uoa.setVisibility(multiVoteSti);
             }
             uoa = this.p;
             if (uoa != null) {
                uoa.setOnClickListener(null);
             }
          }
       }
       if (this.g != null && (this.f != null && (this.h != null && (p0.getOptionList().isEmpty() ^ 1)))) {
          uoa = this.f;
          if (uoa != null) {
             uoa.setVisibility(0);
          }
          tg = this.g;
          a.m(tg);
          tf = this.f;
          a.m(tf);
          th = this.h;
          a.m(th);
          this.a(tg, tf, th, p0, 0);
       }else {
          uoa = this.f;
          if (uoa != null) {
             uoa.setVisibility(multiVoteSti);
          }
       }
       if (this.j != null && (this.i != null && (this.k != null && p0.getOptionList().size() > 1))) {
          uoa = this.i;
          if (uoa != null) {
             uoa.setVisibility(0);
          }
          tg = this.j;
          a.m(tg);
          tf = this.i;
          a.m(tf);
          th = this.k;
          a.m(th);
          this.a(tg, tf, th, p0, 1);
       }else {
          uoa = this.i;
          if (uoa != null) {
             uoa.setVisibility(multiVoteSti);
          }
       }
       if (this.m != null && (this.l != null && (this.n != null && p0.getOptionList().size() > 2))) {
          uoa = this.l;
          if (uoa != null) {
             uoa.setVisibility(0);
          }
          this = this.m;
          a.m(this);
          tg = this.l;
          a.m(tg);
          tf = this.n;
          a.m(tf);
          this.a(this, tg, tf, p0, 2);
       }else {
          a tl = this.l;
          if (tl != null) {
             tl.setVisibility(multiVoteSti);
          }
       }
       return;
    }
}
