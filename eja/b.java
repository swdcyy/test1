package eja.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import eja.b$a;
import nsd.u;
import eja.b$b;
import eja.b$c;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewStub;
import java.util.Objects;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.view.View$OnAttachStateChangeListener;
import android.graphics.Typeface;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import im8.f;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.yxcorp.gifshow.util.DateUtils;
import android.content.Context;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.text.Regex;
import android.text.TextPaint;
import xl8.d;
import y8c.a;
import brd.t;
import lnc.b9;
import eja.c;
import erd.o;
import eja.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Number;
import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class b extends PresenterV2	// class@0026b6
{
    public ViewStub A;
    public boolean B;
    public final View$OnClickListener C;
    public final View$OnAttachStateChangeListener D;
    public BaseFragment p;
    public PhotoMeta q;
    public f r;
    public CommonMeta s;
    public QPhoto t;
    public TextView u;
    public ImageView v;
    public View w;
    public ImageView x;
    public TextView y;
    public TextView z;
    public static final b$a E;

    static {
       b.E = new b$a(null);
    }
    public void b(){
       super();
       this.C = new b$b(this);
       this.D = new b$c(this);
    }
    public static final CommonMeta P8(b p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mCommonMeta");
       }
       return p0;
    }
    public static final QPhoto R8(b p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       boolean b;
       boolean b1;
       TextPaint paint;
       Object[] objArray1;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          View[] viewArray = new View[2];
          b tu = this.u;
          if (tu == null) {
             a.S("mRightBottomText");
          }
          viewArray[0] = tu;
          tu = this.v;
          if (tu == null) {
             a.S("mRightBottomTextIcon");
          }
          int i = 1;
          viewArray[i] = tu;
          int i1 = 8;
          n.Z(i1, viewArray);
          b tw = this.w;
          if (tw instanceof ViewStub) {
             Objects.requireNonNull(tw, "null cannot be cast to non-null type android.view.ViewStub");
             this.w = tw.inflate();
          }
          if (this.w != null) {
             String str = "sans-serif-medium";
             if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
                this.y = m1.f(this.w, 0x7f0a0fad);
                this.x = m1.f(this.w, 0x7f0a0fab);
                this.z = m1.f(this.w, 0x7f0a0f4b);
                tw = this.x;
                if (tw != null) {
                   tw.setOnClickListener(this.C);
                }
                tw = this.x;
                if (tw != null) {
                   tw.addOnAttachStateChangeListener(this.D);
                }
                tw = this.z;
                if (tw != null) {
                   tw.setTypeface(Typeface.create(str, 0));
                }
             }
             this.V8();
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoid(objArray, this, uob, "9")) {
                b ts = this.s;
                if (ts == null) {
                   a.S("mCommonMeta");
                }
                CommonMeta mCreated = ts.mCreated;
                Boolean obj = PatchProxy.apply(objArray, this, uob, "10");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else {
                   ts = this.s;
                   if (ts == null) {
                      a.S("mCommonMeta");
                   }
                   if (ts.mCreated > 0) {
                      ts = this.r;
                      obj = (ts != null)? ts.get(): objArray;
                      if (!a.g(obj, Boolean.TRUE)) {
                         ts = this.s;
                         if (ts == null) {
                            a.S("mCommonMeta");
                         }
                         CommonMeta mCoverCommon = ts.mCoverCommonTags;
                         CoverCommonTagsModel mAuthorRelat = (mCoverCommon != null)? mCoverCommon.mAuthorRelationTag: objArray;
                         if (mAuthorRelat != null) {
                            if (this.S8() - (float)386 > 0) {
                               if (this.S8() - (float)402 <= 0) {
                                  ts = this.s;
                                  if (ts == null) {
                                     a.S("mCommonMeta");
                                  }
                                  b = DateUtils.F(ts.getCreated());
                               }
                            }
                         }
                         b = true;
                      }
                   }
                label_0109 :
                   b = false;
                }
                if (!b) {
                   tw = this.y;
                   if (tw != null) {
                      tw.setVisibility(i1);
                   }
                }else {
                   String str1 = DateUtils.w(this.getContext(), mCreated);
                   obj = PatchProxy.applyOneRefs(str1, this, uob, "14");
                   if (obj != patchProxyRe) {
                      b1 = obj.booleanValue();
                   }else if(TextUtils.x(str1)){
                      b1 = false;
                   }else {
                      a.m(str1);
                      b1 = new Regex("[\\u4e00-\\u9fa5]+").containsMatchIn(str1);
                   }
                   if (b1) {
                      tw = this.y;
                      if (tw != null) {
                         tw.setTypeface(Typeface.DEFAULT);
                      }
                      tw = this.y;
                      if (tw != null) {
                         paint = tw.getPaint();
                         if (paint != null) {
                            paint.setFakeBoldText(i);
                         }
                      }
                   }else {
                      tw = this.y;
                      if (tw != null) {
                         paint = tw.getPaint();
                         if (paint != null) {
                            paint.setFakeBoldText(0);
                         }
                      }
                      tw = this.y;
                      if (tw != null) {
                         tw.setTypeface(Typeface.create(str, 0));
                      }
                   }
                label_0190 :
                   tw = this.y;
                   if (tw != null) {
                      tw.setVisibility(0);
                   }
                   tw = this.y;
                   if (tw != null) {
                      tw.setText(str1);
                   }
                }
             }
          label_019e :
             if (!PatchProxy.applyVoid(objArray, this, uob, "11")) {
                uob = this.q;
                if (uob != null) {
                   this.X7(b9.d(uob, this.p).distinctUntilChanged(c.b).subscribe(new d(this), Functions.d()));
                }
             }
          }
       }
    label_01c7 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tx = this.x;
       if (tx != null) {
          tx.removeOnAttachStateChangeListener(this.D);
       }
       return;
    }
    public final float S8(){
       Activity activity;
       Activity obj = PatchProxy.apply(null, this, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.getActivity();
       a.m(obj);
       a.o(obj, "activity!!");
       Resources resources = obj.getResources();
       if (resources != null) {
          DisplayMetrics uDisplayMetr = c.c(resources);
          if (uDisplayMetr != null) {
             activity = this.getActivity();
             a.m(activity);
             return ((float)n.k(activity) / ((float)uDisplayMetr.densityDpi / 160.00f));
          }
       }
       return 0;
    }
    public final void V8(){
       boolean b;
       ViewGroup$LayoutParams obj;
       int i;
       Object[] objArray1;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
          return;
       }
       b tq = this.q;
       String str = (tq != null)? TextUtils.N((long)tq.getLikeCount()): objArray;
       if (!TextUtils.x(str)) {
          b tq1 = this.q;
          tq1 = (tq1 != null && tq1.mShowLikeCount == 1)? 1: 0;
          if (tq1) {
             b = true;
          label_0033 :
             this.B = b;
             tq1 = this.x;
             if (tq1 != null) {
                obj = PatchProxy.apply(objArray, this, uob, "8");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                }else {
                   uob = this.q;
                   i = (uob != null && uob.isLiked() == true)? 0x7f080a0a: 0x7f080a07;
                }
                tq1.setImageResource(i);
             }
             if (this.B != null) {
                uob = this.w;
                obj = (uob != null)? uob.getLayoutParams(): objArray;
                if (obj instanceof ViewGroup$MarginLayoutParams) {
                   objArray = obj;
                }
                if (objArray != null) {
                   objArray.rightMargin = a1.d(0x7f070253);
                }
                uob = this.z;
                if (uob != null) {
                   uob.setVisibility(0);
                }
                uob = this.z;
                if (uob != null) {
                   uob.setText(str);
                }
             }else {
                uob = this.z;
                if (uob != null) {
                   uob.setVisibility(8);
                }
                uob = this.w;
                obj = (uob != null)? uob.getLayoutParams(): objArray;
                if (obj instanceof ViewGroup$MarginLayoutParams) {
                   objArray = obj;
                }
                if (objArray != null) {
                   objArray.rightMargin = a1.d(0x7f070334);
                }
             }
             return;
          }
       }
       b = false;
       goto label_0033 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a1741);
       this.w = m1.f(p0, 0x7f0a0fac);
       View view = m1.f(p0, R.id.right_bottom_text);
       a.o(view, "ViewBindUtils.bindWidget¡­, R.id.right_bottom_text\)");
       this.u = view;
       p0 = m1.f(p0, R.id.right_bottom_text_icon);
       a.o(p0, "ViewBindUtils.bindWidget¡­d.right_bottom_text_icon\)");
       this.v = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.q = this.s8(PhotoMeta.class);
       Object obj = this.q8(CommonMeta.class);
       a.o(obj, "inject\(CommonMeta::class.java\)");
       this.s = obj;
       this.p = this.t8("FRAGMENT");
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       this.r = this.w8("AD_MARK_SHOW_SUBJECT_VIEW");
       return;
    }
}
