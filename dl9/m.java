package dl9.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Handler;
import com.yxcorp.gifshow.topic.c;
import rzc.c;
import jk9.b;
import java.lang.String;
import java.util.regex.Pattern;
import dl9.m$f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CaptionSearchInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import com.kuaishou.android.model.mix.QComment;
import tyc.s4;
import android.content.Context;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import dl9.m$a;
import tyc.s4$a;
import java.lang.Boolean;
import java.util.Map;
import fya.b;
import java.util.Objects;
import iya.e;
import java.lang.ref.WeakReference;
import dl9.g;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import jk9.a;
import com.yxcorp.gifshow.comment.config.CommentAtTailEasterEggConfig;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import jk9.c;
import dl9.m$b;
import com.yxcorp.gifshow.label.tag.hashtag.a;
import gya.f;
import dl9.m$c;
import eya.b;
import b89.a;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiTextView;
import dl9.f;
import b89.a$b;
import zf6.l;
import qkc.a;
import com.yxcorp.gifshow.topic.c$a;
import android.graphics.Typeface;
import oe6.b;
import dl9.h;
import com.yxcorp.gifshow.label.tag.hashtag.a$a;
import android.text.SpannableString;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.text.SpannableStringBuilder;
import dl9.i;
import com.yxcorp.gifshow.widget.textview.CommentTextView$a;
import com.yxcorp.gifshow.widget.textview.CommentTextView;
import dl9.j;
import erd.g;
import crd.b;
import brd.t;
import ll8.c$b;
import android.util.SparseIntArray;
import ync.a;
import nx9.c;
import lnc.a1;
import hl9.t;
import hl9.j0;
import android.animation.ValueAnimator;
import crd.a;
import androidx.recyclerview.widget.RecyclerView$r;
import rnc.i;
import android.text.Spannable;
import wzc.a;
import t45.d;
import brd.z;
import dl9.l;
import erd.o;
import dl9.k;
import android.text.style.StyleSpan;
import ak5.j;
import com.yxcorp.utility.n;
import android.view.View;
import java.util.regex.Matcher;
import lnc.i3;
import yca.a;
import com.kuaishou.android.model.mix.CashTag;
import fya.b$a;
import java.util.Iterator;
import fya.a;
import iya.a;
import android.text.style.ClickableSpan;
import fya.e;
import java.util.Collection;
import lnc.n3;
import java.lang.Throwable;
import q87.c;
import iya.e$a;
import java.util.ArrayList;
import iya.e$b;
import iya.d;
import iya.f;
import iya.e$c;
import com.yxcorp.gifshow.model.CDNUrl;
import kb.c;
import android.os.AsyncTask;
import kb.e;
import java.util.concurrent.Executor;
import android.text.StaticLayout;
import java.lang.Number;
import com.yxcorp.gifshow.comment.utils.d;
import java.lang.Math;
import android.text.TextPaint;
import android.text.Layout;
import com.kuaishou.android.model.mix.QComment$Label;
import android.widget.TextView$BufferType;
import k2b.u1;
import com.yxcorp.utility.RomUtils;
import ek9.k1;
import nk9.m;
import android.content.res.Resources;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Integer;
import ek9.o1;
import dl9.m$d;
import android.text.style.RelativeSizeSpan;
import k2b.e0;
import yk9.d;
import com.yxcorp.gifshow.comment.CommentConfig;
import tyc.j0;
import fya.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import com.kwai.component.stargateegg.log.StargateEggIntervalLogger;
import ekd.q;
import ek9.m1;
import dkc.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import dl9.m$e;
import ekd.m1;
import com.kuaishou.android.model.mix.QComment$a;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import brd.y;
import com.yxcorp.gifshow.comment.CommentParams;

public class m extends PresenterV2	// class@001f86
{
    public int A;
    public boolean B;
    public final Handler C;
    public boolean D;
    public float E;
    public float F;
    public final c G;
    public final c H;
    public int I;
    public int J;
    public a K;
    public b L;
    public b M;
    public s4 N;
    public CommentConfig O;
    public j0 P;
    public SpannableStringBuilder Q;
    public a R;
    public t S;
    public CommentParams T;
    public boolean U;
    public boolean V;
    public final b W;
    public f X;
    public Pattern Y;
    public Runnable Z;
    public View p;
    public CommentTextView q;
    public QComment r;
    public d s;
    public QPhoto t;
    public CommentsFragment u;
    public y v;
    public k1 w;
    public a x;
    public int y;
    public int z;

    public void m(){
       super();
       this.A = 3;
       this.C = new Handler();
       this.G = new c();
       this.H = new c();
       this.W = new b();
       this.Y = Pattern.compile("\(\\[[^]]*]\)");
       this.Z = new m$f(this);
    }
    public void m(boolean p0){
       super();
       this.A = 3;
       this.C = new Handler();
       this.G = new c();
       this.H = new c();
       this.W = new b();
       this.Y = Pattern.compile("\(\\[[^]]*]\)");
       this.Z = new m$f(this);
       this.U = p0;
    }
    public void E8(){
       boolean b;
       m q;
       s4 os4 = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       Object[] objArray = null;
       String str = "5";
       if (PatchProxy.applyVoid(objArray, os4, om, str)) {
          return;
       }
       m t = os4.t;
       if (t != null && (t.getCaptionSearchInfo() != null && os4.r.getEntity().mIsUserInfo != null)) {
          s4 os41 = new s4(os4.t);
          os4.N = os41;
          os41.c = true;
          os41.j(ContextCompat.getColor(os4.q.getContext(), R.color.arg_RES_7f0607c1));
          os4.N.k(new m$a(os4));
       }
    label_004a :
       b obj = PatchProxy.apply(objArray, os4, om, "4");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          t = os4.r;
          if (t != null) {
             QComment mCashTags1 = t.mCashTags;
             if (mCashTags1 != null && !mCashTags1.isEmpty()) {
                b = true;
             }
          }
          b = false;
       }
       String str1 = "2";
       String str2 = "1";
       if (b) {
          obj = new b();
          os4.M = obj;
          q = os4.q;
          QComment mCashTags = os4.r.mCashTags;
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidTwoRefs(q, mCashTags, obj, b.class, str1)) {
             b j = obj.j;
             Objects.requireNonNull(j);
             if (!PatchProxy.applyVoidOneRefs(q, j, e.class, str2)) {
                j.e = new WeakReference(q);
             }
             obj.a.putAll(mCashTags);
          }
          os4.M.h = new g(os4);
       }
       t = os4.W;
       RecyclerView recyclerView = os4.u.h0();
       m q1 = os4.q;
       m t1 = os4.t;
       m r = os4.r;
       q = os4.x;
       Objects.requireNonNull(t);
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[]{recyclerView,q1,t1,r,q};
          if (!PatchProxy.applyVoid(objArray, t, uob, str2)) {
          label_00e2 :
             a.p(recyclerView, "recyclerView");
             a.p(q1, "textView");
             a.p(t1, "photo");
             a.p(r, "comment");
             a.p(q, "easterEggCenter");
             if (q.d()) {
                CommentAtTailEasterEggConfig uCommentAtTa = q.c();
                if (uCommentAtTa != null) {
                   uCommentAtTa = uCommentAtTa.mEasterEggImageUrls;
                   if (uCommentAtTa != null) {
                   label_0111 :
                      c uoc1 = new c(recyclerView, q1, t1, r, q, uCommentAtTa);
                      t.a = uCommentAtTa;
                   }
                }
                List list = CollectionsKt__CollectionsKt.E();
                goto label_0111 ;
             }
          }
       }else {
          goto label_00e2 ;
       }
       a uoa = new m$b(os4).l(os4.t, 3);
       uoa.o(os4.J);
       uoa.m = true;
       t = os4.X;
       m obj1 = PatchProxy.applyOneRefs(t, uoa, a.class, str);
       if (obj1 != patchProxyRe) {
          uoa = obj1;
       }else {
          a r1 = uoa.r;
          if (r1 != null && !PatchProxy.applyVoid(null, r1, f.class, str1)) {
             r1.b.clear();
          }
          uoa.r = t;
       }
       os4.K = uoa;
       m$c uoc = new m$c(os4);
       uoc.e(os4.J);
       uoc.f(os4.z);
       uoc.d(true);
       uoc.n = 46;
       uoc.d = os4.r;
       os4.L = uoc;
       a uoa1 = new a(os4.t, "COMMENT_PANEL", false, 0, os4.J, os4.z);
       os4.R = uoc;
       os4.q.setKSTextDisplayHandler(null);
       os4.R.b(new f(os4));
       m g = os4.G;
       g.c(os4.J);
       g.e(new a(2));
       g.b(l.n(R.drawable.arg_RES_7f08073c, 0x7f08073d));
       g.d(true);
       Typeface typeface = os4.q.getTypeface();
       if (typeface != null) {
          int style = typeface.getStyle();
          os4.I = style;
          os4.K.p(style);
          os4.L.g(os4.I);
       }
       os4.D = false;
       if (os4.r.getEntity().mIsUserInfo != null) {
          os4.K.k(b.G());
          os4.K.n(new h(os4));
       }
       if (!PatchProxy.applyVoid(null, os4, om, "7")) {
          SpannableString spannableStr = new SpannableString(TextUtils.k(this.V8()));
          SpannableStringBuilder spannableStr1 = new SpannableStringBuilder();
          g = os4.r;
          obj1 = os4.q;
          if (!TextUtils.x(spannableStr1)) {
             spannableStr = new SpannableString(TextUtils.j(spannableStr1));
          }
          os4.R8(g, obj1, spannableStr, true);
       }
       os4.q.setOnMeasureListener(new i(os4));
       if (os4.U != null) {
          os4.X7(os4.S.subscribe(new j(os4)));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       Context context = this.q.getContext();
       SparseIntArray sparseIntArr = a.i(context, c$b.U3, new int[5]{'?','P',22,'Q',23});
       this.y = (c.c() || c.d())? t.R8(context, a1.a(0x7f06081d), a1.a(0x7f0601fb)): t.R8(context, a1.a(0x7f060817), a1.a(0x7f0601d9));
       this.J = sparseIntArr.get(22);
       this.z = sparseIntArr.get(23);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, m.class, "27")) {
          return;
       }
       j0.a();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "6")) {
          return;
       }
       this.q.setOnMeasureListener(null);
       this.q.setText("");
       m tM = this.M;
       String str = "3";
       if (tM != null) {
          Objects.requireNonNull(tM);
          if (!PatchProxy.applyVoid(null, tM, b.class, str)) {
             tM.a.clear();
             tM.j.c(true);
             tM.c.clear();
             tM.i = null;
          }
          this.M = null;
       }
       tM = this.N;
       if (tM != null) {
          tM.c = false;
          tM.e = null;
          tM.f = null;
          tM.h = null;
          tM.g = null;
          tM.j = null;
       }
       tM = this.W;
       Objects.requireNonNull(tM);
       if (!PatchProxy.applyVoid(null, tM, b.class, str)) {
          b a = tM.a;
          if (a != null && !PatchProxy.applyVoid(null, a, c.class, "2")) {
             c a1 = a.a;
             if (a1 != null) {
                a1.cancel();
             }
             a.a = null;
             a1 = a.b;
             if (a1 != null) {
                a1.dispose();
             }
             a.b = null;
             a.c();
             a.g.removeOnScrollListener(a.f);
          }
          tM.a = null;
       }
       return;
    }
    public final void P8(QComment p0,TextView p1,CharSequence p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "15")) {
          return;
       }
       this.R8(p0, p1, p2, false);
       return;
    }
    public final void R8(QComment p0,TextView p1,CharSequence p2,boolean p3){
       m k;
       int i;
       m m;
       b uob1;
       int b1;
       b obj2;
       int i2;
       int i3;
       String this;
       String str1;
       int i4;
       Iterator iterator;
       String str3;
       object oobject2;
       f[] uofArray;
       m om = this;
       QComment qComment = p0;
       TextView textView = p1;
       CharSequence uCharSequenc = p2;
       boolean b = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om1 = m.class;
       if (PatchProxy.isSupport(om1) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, m.class, "16")) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder(uCharSequenc);
       if (!this.d9(p0)) {
          i.j(spannableStr);
          List list = om.L.b(spannableStr);
          om.R.c(spannableStr);
          String str = this.V8();
          if (!PatchProxy.isSupport(om1) || !PatchProxy.applyVoidThreeRefs(spannableStr, Boolean.valueOf(p3), str, this, m.class, "17")) {
             k = om.N;
             if (k != null && !b) {
                k.i(spannableStr, str);
                om.N.f();
             }
          }
          k = om.K;
          if (a.a()) {
             Objects.requireNonNull(k);
             k ok = new k(this, p0, p1, p2, spannableStr, list, p3);
             om.X7(t.just(spannableStr).observeOn(d.c).map(new l(k)).observeOn(d.a).subscribe(om1));
          }else {
             k.j(spannableStr);
             om.Y8(qComment, textView, uCharSequenc, spannableStr);
             om.b9(list, b);
          }
          return;
       }else {
          i = spannableStr.length();
          b uob = 1;
          int i1 = 0;
          if (om.I == uob) {
             om.q.setTypeface(Typeface.DEFAULT);
             spannableStr.setSpan(new StyleSpan(om.I), i1, i, 18);
          }
          i.j(spannableStr);
          List list1 = om.L.b(spannableStr);
          om.R.c(spannableStr);
          om.e9(spannableStr);
          if (j.o().t()) {
             j.o().f(spannableStr, textView, (p1.getTextSize() - (float)n.c0(p1.getContext(), 2.00f)));
          }else if(om.Y.matcher(qComment.mComment).find() && om.B == null){
             i3 oi3 = i3.f();
             oi3.d("content", qComment.mComment);
             a.a("comment_content_emoji", "emoji_not_ready", oi3.e());
             om.B = uob;
          }
          m = om.M;
          if (m != null) {
             Objects.requireNonNull(m);
             uob1 = b.class;
             if (!PatchProxy.applyVoidOneRefs(spannableStr, m, uob1, "10")) {
                Matcher matcher = b.k.matcher(spannableStr);
                this = "DefaultCashTagHandler";
                while (matcher.find()) {
                   str1 = b.c(matcher);
                   CashTag uCashTag = m.a.get(str1);
                   String str2 = matcher.group();
                   if (uCashTag != null) {
                      Iterator obj3 = PatchProxy.applyOneRefs(uCashTag, m, uob1, "8");
                      if (obj3 != patchProxyRe) {
                      }else {
                         obj3 = m.c.iterator();
                         while (true) {
                            if (obj3.hasNext()) {
                               Iterator iterator1 = obj3;
                               obj3 = obj3.next();
                               if (!obj3.a.equals(uCashTag)) {
                                  obj3 = iterator1;
                               }
                            }else {
                               obj3 = null;
                            }
                         }
                      }
                      if (obj3 == null) {
                         obj3 = PatchProxy.applyThreeRefs(str1, uCashTag, str2, m, b.class, "11");
                         if (obj3 != patchProxyRe) {
                         }else {
                            obj3 = new b$a(null);
                            obj3.a = uCashTag;
                            obj3.b.add(m.b(uCashTag));
                            b$a b2 = obj3.b;
                            a uoa = PatchProxy.applyTwoRefs(str2, uCashTag, m, uob1, "12");
                            if (uoa != patchProxyRe) {
                            }else {
                               uoa = new a(m, uCashTag, str2);
                            }
                            b2.add(uoa);
                            b b3 = m.b;
                            if (b3 != null) {
                               obj3.b.addAll(b3.a(str1, uCashTag, uCashTag.mShowText));
                            }
                         }
                         if (obj3 == null) {
                         }else {
                            m.c.add(obj3);
                         }
                      }
                      iterator = obj3.b.iterator();
                      while (iterator.hasNext()) {
                         spannableStr.setSpan(iterator.next(), matcher.start(), matcher.end(), 33);
                      }
                      i4 = p1;
                   }
                   uob = 1;
                }
                str1 = "5";
                if (!PatchProxy.applyVoid(null, m, uob1, str1)) {
                   List list2 = m.d();
                   if (!list2.equals(m.i)) {
                      m.i = list2;
                      m.j.c = m.d();
                      obj2 = m.j;
                      Objects.requireNonNull(obj2);
                      e uoe = e.class;
                      e Object[] this1 = null;
                      if (!PatchProxy.applyVoid(this1, obj2, uoe, "2")) {
                         boolean b4 = false;
                         obj2.c(b4);
                         if (!PatchProxy.applyVoid(this1, obj2, uoe, "3")) {
                            this1 = obj2.a;
                            if (this1 != null) {
                               obj2.b = this1.getSpans(b4, this1.length(), e$a.class);
                            }else if(obj2.c != null){
                               ArrayList uArrayList1 = new ArrayList();
                               e$a[] Iterator this12 = obj2.c.iterator();
                               while (this12.hasNext()) {
                                  Object obj4 = this12.next();
                                  if (obj4 instanceof e$a) {
                                     uArrayList1.add(obj4);
                                  }
                               }
                               this12 = new e$a[0];
                               obj2.b = uArrayList1.toArray(this12);
                            }
                         }
                         e b5 = obj2.b;
                         if (b5 != null && b5.length) {
                            e$b uob2 = new e$b(null);
                            this1 = obj2.b;
                            int len = this1.length;
                            i1 = 0;
                            while (i1 < len) {
                               object oobject = this1[i1];
                               f[] data = oobject.getData();
                               b1 = data.length;
                               e uoe1 = this1;
                               for (int this11 = 0; this11 < b1; b1 = i6) {
                                  int i5 = len;
                                  object oobject1 = data[this11];
                                  int i6 = b1;
                                  if (PatchProxy.applyVoidThreeRefs(oobject1, oobject, uob2, obj2, e.class, "4") || (oobject1 == null || oobject.b(oobject1))) {
                                     str3 = str1;
                                     oobject2 = oobject;
                                     uofArray = data;
                                  }else {
                                     e$c uoc = new e$c(oobject1, oobject);
                                     oobject2 = oobject;
                                     uob2.a.add(uoc);
                                     ArrayList uArrayList = PatchProxy.applyOneRefs(oobject1, obj2, uoe, str1);
                                     if (uArrayList != patchProxyRe) {
                                        str3 = str1;
                                        uofArray = data;
                                     }else {
                                        uArrayList = new ArrayList();
                                        str3 = str1;
                                        f f = oobject1.f;
                                        uofArray = data;
                                        if (f != null && f.length > 0) {
                                           len = f.length;
                                           i4 = 0;
                                           while (i4 < len) {
                                              uArrayList.add(obj2.a(f[i4].getUrl()));
                                              i4 = i4 + 1;
                                              f = f;
                                           }
                                        }else {
                                           uArrayList.add(obj2.a(oobject1.a));
                                        }
                                     }
                                     uoc.a = uArrayList;
                                     if (!PatchProxy.applyVoidTwoRefs(uob2, uoc, obj2, uoe, "7")) {
                                        iterator = uoc.a.iterator();
                                        while (iterator.hasNext()) {
                                           c uoc1 = iterator.next();
                                           uoc1.f(new d(obj2, uoc, uob2, uoc1), AsyncTask.THREAD_POOL_EXECUTOR);
                                        }
                                     }
                                  }
                                  this11++;
                                  oobject = oobject2;
                                  str1 = str3;
                                  data = uofArray;
                                  len = i5;
                               }
                               i1 = i1 + 1;
                               this1 = uoe1;
                            }
                            obj2.d = uob2;
                         }
                      }
                   }else {
                      Object[] objArray = new Object[0];
                      n3.C().t(this, "already loads", objArray);
                   }
                }
                i1 = false;
             }
          }
          om.b9(list1, b);
          if (PatchProxy.isSupport(om1)) {
             if (!PatchProxy.applyVoidFourRefs(p1, p0, spannableStr, Boolean.valueOf(p3), this, m.class, "19")) {
             label_03a1 :
                Object obj = p1;
                if (obj) {
                   if (!b) {
                      StaticLayout obj1 = PatchProxy.applyTwoRefs(obj, spannableStr, om, om1, "20");
                      if (obj1 != patchProxyRe) {
                         i1 = obj1.booleanValue();
                         uob1 = 1;
                      }else {
                         obj1 = PatchProxy.applyTwoRefs(obj, spannableStr, om, om1, "23");
                         if (obj1 != patchProxyRe) {
                         }else {
                            m q = om.q;
                            obj2 = PatchProxy.applyOneRefs(obj, om, om1, "24");
                            if (obj2 != patchProxyRe) {
                               i2 = obj2.intValue();
                            }else if(p1.getMeasuredWidth() > 0){
                               i2 = p1.getMeasuredWidth();
                            }else {
                               i2 = a1.e(115.00f);
                            }
                            obj1 = d.g(q, spannableStr, i2);
                         }
                         if ((obj1.getLineWidth(Math.max((obj1.getLineCount() - 1), 0)) + (float)(int)Math.ceil((double)Layout.getDesiredWidth(om.X8(p1.getContext(), 1), p1.getPaint()))) - (float)p1.getMeasuredWidth() > 0) {
                            i1 = true;
                         }else {
                            i1 = false;
                         }
                      }
                      if (i1 && om.r.getCommentTopLabel() != null) {
                         spannableStr.append("\n");
                         b1 = false;
                      }else {
                         b1 = true;
                      }
                      spannableStr.append(om.X8(p1.getContext(), b1));
                   }
                   obj.setText(spannableStr, TextView$BufferType.SPANNABLE);
                   obj.setContentDescription(spannableStr);
                   obj.setHighlightColor(0);
                   if (RomUtils.q()) {
                      obj.setPadding(0, a1.e(0x3f800000), 0, 0);
                   }
                }
             }
          }else {
             i3 = 0;
             goto label_03a1 ;
          }
          return;
       }
    }
    public void S8(QComment p0,boolean p1){
       int i;
       int i1;
       int i5;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, om, "12")) {
          return;
       }
       k1 b = this.w.b;
       if (b != null) {
          b.c = false;
       }
       String str = this.l8().getString(R.string.arg_RES_7f1004d1);
       m tQ = this.Q;
       this.r.getEntity().mFormatCaption = tQ.toString();
       String obj = PatchProxy.apply(null, this, om, "11");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = new StringBuilder(this.q.getText());
          Layout layout = this.q.getLayout();
          int i2 = obj.length();
          try{
             i2 = layout.getLineEnd((this.A - 1));
             i2 = i2 - this.W8(i2);
          }catch(java.lang.Exception e4){
             Log.e("CommentContentPresenter", "getContentLastIndex: "+i2+","+obj, e4);
          }
          if (i2 > 0 && obj.length() > i2) {
             if (i.e(obj.charAt(i2))) {
                char c = obj.charAt(i2);
                char c1 = obj.charAt((i2 - 1));
                int i3 = 0;
                while (true) {
                   int i4 = i2 + i3;
                   if (i4 > 0) {
                      if ((Integer.toHexString(c)).compareTo("d800") >= 0 && ((Integer.toHexString(c)).compareTo("dbff") <= 0 && !(Integer.toHexString(c1)).equals("200D"))) {
                         i = i4 - 1;
                      }else {
                         i3 = i3 - 1;
                         i5 = i2 + i3;
                         c1 = obj.charAt(i5);
                         i5 = i5 - 1;
                         char c2 = c1;
                         c1 = obj.charAt(Math.max(false, i5));
                         c = c2;
                      }
                   }
                }
             }else {
                obj = obj.substring(Math.max(false, (i2 - 5)), (i2 + 1));
                i5 = obj.length() - 1;
                i1 = 0;
                while (true) {
                   if (i5 >= 0 && obj.charAt(i5) != ']') {
                      if (obj.charAt(i5) == '[') {
                         i = Math.max(false, ((i2 + i1) - 1));
                         break ;
                      }else {
                         i1 = i1 - 1;
                         i5 = i5 - 1;
                      }
                   }
                }
             }
             i = i2;
          }else {
             i = obj.length() - 1;
          }
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder(tQ.subSequence(false, Math.min(tQ.length(), (i + 1))));
       spannableStr.append("\x20\x02\x00");
       spannableStr.append("¡­");
       spannableStr.append("¡¡");
       spannableStr.append(str);
       i = (spannableStr.length() - str.length()) - 1;
       i1 = 33;
       spannableStr.setSpan(new o1(this.y, false, false), i, spannableStr.length(), i1);
       spannableStr.setSpan(new m$d(this, p0), i, spannableStr.length(), i1);
       spannableStr.setSpan(new RelativeSizeSpan(0x3f000000), ((spannableStr.length() - str.length()) - 1), (spannableStr.length() - str.length()), i1);
       this.P8(p0, this.q, spannableStr);
       p0.getEntity().mIsOpen = false;
       if (p1) {
          this.s.F(p0, 833, "stop_comment", p0.getId(), this.u);
       }
       this.a9();
       return;
    }
    public final String V8(){
       String obj = PatchProxy.apply(null, this, m.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = TextUtils.k(this.r.getComment());
       if (!this.d9(this.r)) {
          m tt = this.t;
          if (tt != null && tt.getCaptionSearchInfo() != null) {
             CaptionSearchInfo captionSearc = this.t.getCaptionSearchInfo();
             CaptionSearchInfo mSearchWordL = captionSearc.mSearchWordList;
             if (mSearchWordL != null && (!TextUtils.x(mSearchWordL.get(0)) && captionSearc.mCaptionSearchType != 2)) {
                obj = obj+" "+captionSearc.mSearchWordList.get(0);
             }
          }
       }
       if (this.O.mEnableShowCaptionTitle != null && (this.U != null && (!TextUtils.x(this.t.getCaptionTitle()) && (!TextUtils.x((this.t.getCaptionTitle()).trim()) && this.t.isImageType())))) {
          obj = (this.t.getCaptionTitle()).trim()+" "+obj;
       }
    label_00ae :
       return obj;
    }
    public final int W8(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       float f = this.q.getPaint().measureText("¡­¡¡"+this.l8().getString(R.string.arg_RES_7f1004d1));
       float f1 = (float)this.q.getMeasuredWidth() - this.q.getLayout().getLineWidth((this.A - 1));
       int i1 = 1;
       int i2 = 1;
       for (int i = p0 - 1; i >= 0 && (p0 >= 0 && (p0 >= i && this.q.getText().length() >= p0)); i = p0 - i2) {
          float f2 = this.q.getPaint().measureText(this.q.getText(), i, p0) + f1;
          if (f - f2 >= 0) {
             i2 = i2 + 1;
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
    label_008a :
       return (i1 + 1);
    }
    public final CharSequence X8(Context p0,boolean p1){
       SpannableStringBuilder obj;
       QComment$Label mLabelName;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, om, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       om = this.r;
       String str = "";
       if (om.mEmotionInfo == null && om.getCommentTopLabel() != null) {
          obj = new SpannableStringBuilder(str);
          if (p1) {
             obj.append(" ");
             obj.setSpan(new o1(a1.e(6.00f)), 0, 1, 33);
          }
          str = (TextUtils.x(this.r.getCommentTopLabel().mLabelName))? a1.p(R.string.arg_RES_7f104d63): this.r.getCommentTopLabel().mLabelName;
          obj.append(str);
          if (this.P == null) {
             j0 oj0 = new j0();
             this.P = oj0;
             oj0.b(a1.d(R.dimen.arg_RES_7f070f89), ContextCompat.getColor(p0, R.color.arg_RES_7f061f6c), ContextCompat.getColor(p0, R.color.arg_RES_7f061f6c), 0, ContextCompat.getColor(p0, R.color.arg_RES_7f060746));
          }
          obj.setSpan(this.P, p1, obj.length(), 33);
       }else {
          obj = new SpannableStringBuilder(str);
       }
       return obj;
    }
    public final void Y8(QComment p0,TextView p1,CharSequence p2,SpannableStringBuilder p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, m.class, "26")) {
          return;
       }
       this.e9(p3);
       if (!TextUtils.x(this.V8()) && (this.V8()).equals(p2.toString())) {
          p0.mFormatCaption = p3.toString();
       }
       if (j.o().t()) {
          j.o().f(p3, p1, (p1.getTextSize() - (float)n.c0(p1.getContext(), 2.00f)));
       }
       p1.setText(p3, TextView$BufferType.SPANNABLE);
       return;
    }
    public final boolean Z8(){
       k1 b = this.w.b;
       boolean b1 = (b != null && b.c != null)? true: false;
       return b1;
    }
    public final void a9(){
       m m;
       Iterator iterator;
       int i3;
       a[] spans;
       int len;
       int i4;
       object oobject;
       b$a uoa;
       ClientContent$TagShowPackage obj1;
       int i5;
       int i6;
       CashTag mType;
       ClientContent$ContentPackage uContentPack;
       ClientContent$TagPackage tagPackage;
       i3 oi3;
       CashTag tack;
       String str;
       String str1;
       ClientContent$TagPackage[] tagPackageAr;
       ClientEvent$ElementPackage uElementPack;
       i3 oi31;
       ClientEvent$ElementPackage uElementPack1;
       i3 oi32;
       Iterator iterator1;
       b$a uoa1;
       b$a uoa2;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, m.class, "13")) {
          return;
       }
       if (obj.M != null) {
          CharSequence text = obj.q.getText();
          Collection uCollection = obj.r.mCashTags.values();
          m = obj.M;
          m t = obj.t;
          QComment$CommentViewBindEntity mIsUserInfo = obj.r.getEntity().mIsUserInfo;
          boolean i = 2;
          int i1 = 1;
          int i2 = 0;
          if (PatchProxy.isSupport(d.class)) {
             Object[] objArray1 = new Object[]{text,uCollection,m,t,Boolean.valueOf(mIsUserInfo)};
             if (!PatchProxy.applyVoid(objArray1, objArray, d.class, "4")) {
             }
          }else {
          }
       }
    }
    public final void b9(List p0,boolean p1){
       m tr;
       int i;
       int i3;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, om, "28")) {
          return;
       }
       if (!p1) {
          m tW = this.W;
          tr = this.r;
          i = p0.size();
          m tx = this.x;
          Objects.requireNonNull(tW);
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(tr, Integer.valueOf(i), tx, tW, b.class, "2")) {
             a.p(tr, "comment");
             a.p(tx, "easterEggCenter");
             if (!tx.d() || (!tr.getStatus() && tr.getEntity().mIsLoggedAtTailEasterEggShow == null)) {
                tr.mIsLoggedAtTailEasterEggShow = true;
                CommentAtTailEasterEggConfig uCommentAtTa = tx.c();
                if (uCommentAtTa != null) {
                   String activityId = uCommentAtTa.getActivityId();
                   if (activityId != null) {
                      a.o(activityId, "it");
                      StargateEggIntervalLogger.e.e(activityId, "COMMENT_AT_IMAGE_TAIL", i);
                   }
                }
             }
          }
       }
       tr = this.r;
       if (tr.mTagShowed != null || (tr.equals(this.X.a()) && !q.f(this.X.b()))) {
          tr.mTagShowed = true;
          int i1 = 0;
          Object[] objArray = new Object[i1];
          String str = "SHOW_TAG";
          m1.C().w(str, "log show tag "+this.r.getComment()+" is low device "+a.a(), objArray);
          tr = this.t;
          List list = this.X.b();
          QComment$CommentViewBindEntity mIsUserInfo = this.r.getEntity().mIsUserInfo;
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(tr, list, p0, Boolean.valueOf(mIsUserInfo), null, b.class, "51")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = str;
             i3 oi3 = i3.f();
             String str1 = (mIsUserInfo != null)? "COMMENT_PANEL": "COMMENT_PANEL_MACHINE_RECO";
             oi3.d("tag_area", str1);
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tr.mEntity);
             ClientContent$TagShowPackage tagShowPacka = new ClientContent$TagShowPackage();
             int i2 = list.size();
             ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[i2];
             for (i = 0; i < i2; i = i + 1) {
                tagPackageAr[i] = list.get(i);
             }
             tagShowPacka.tagPackage = tagPackageAr;
             uContentPack.tagShowPackage = tagShowPacka;
             ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
             uContentPack.batchUserPackage = uBatchUserPa;
             ClientContent$UserPackage[] userPackageA = PatchProxy.applyOneRefs(p0, null, b.class, "52");
             if (userPackageA != PatchProxyResult.class) {
             }else {
                i2 = p0.size();
                ClientContent$UserPackage[] userPackageA1 = new ClientContent$UserPackage[i2];
                for (; i1 < i2; i1 = i1 + 1) {
                   userPackageA1[i1] = new ClientContent$UserPackage();
                   i3 = p0.get(i1).mPosition + true;
                   userPackageA1[i1].index = i3;
                   userPackageA1[i1].identity = p0.get(i1).getId();
                }
                userPackageA = userPackageA1;
             }
             uBatchUserPa.userPackage = userPackageA;
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.elementPackage = uElementPack;
             showEvent.contentPackage = uContentPack;
             b.a(0x4b316083).W0(null, showEvent, null);
          }
       }
       return;
    }
    public void c9(QComment p0,boolean p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, om, "14")) {
          return;
       }
       String str = this.V8()+"¡¡"+this.l8().getString(0x7f100f8b);
       SpannableString spannableStr = new SpannableString(str);
       this.L.b(spannableStr);
       int i = 33;
       spannableStr.setSpan(new o1(this.y, 0, 0), (this.V8()).length(), str.length(), i);
       spannableStr.setSpan(new m$e(this, p0), (this.V8()).length(), str.length(), i);
       spannableStr.setSpan(new RelativeSizeSpan(0x3f000000), (this.V8()).length(), ((this.V8()).length() + 1), i);
       this.P8(p0, this.q, spannableStr);
       p0.getEntity().mIsOpen = true;
       if (p1) {
          this.s.F(p0, 832, "spread_comment", p0.getId(), this.u);
       }
       this.a9();
       return;
    }
    public final boolean d9(QComment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0.isSub()) {
          if (!p0.mParent.created() || !p0.created()) {
             b = false;
          }
          return b;
       }else if(p0.created()){
          b = false;
       }
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0846);
       this.p = m1.f(p0, 0x7f0a0873);
       return;
    }
    public final void e9(SpannableStringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "18")) {
          return;
       }
       this.G.f(p0);
       if (this.r.mTagShowStatusEntity.e == null) {
          this.G.a();
          p0.e = true;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.r = this.q8(QComment.class);
       this.s = this.q8(d.class);
       this.t = this.q8(QPhoto.class);
       this.u = this.r8("FRAGMENT");
       this.v = this.r8("COMMENT_REPLY_OBSERVER");
       this.S = this.r8("COMMENT_SHOW_PANEL_OBSERVABLE");
       this.T = this.q8(CommentParams.class);
       this.O = this.q8(CommentConfig.class);
       this.w = this.r8("COMMENT_STAT_PARAM");
       this.x = this.q8(a.class);
       this.X = new f(this.r);
       return;
    }
}
