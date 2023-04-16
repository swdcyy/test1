package i6a.b$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import i6a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.ViewTreeObserver;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.ViewGroup;
import android.content.res.Resources;
import cw9.c;
import java.util.List;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelView;
import android.view.View$MeasureSpec;
import java.util.Collection;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsMeta$InterestLabel;
import java.lang.CharSequence;
import android.widget.TextView;
import s0d.f;
import s0d.e;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import i6a.a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.NullPointerException;

public final class b$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@00278a
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       b$c b;
       String str2;
       int i8;
       int i9;
       String str5;
       String str6;
       String str7;
       InterestLabelView c;
       b u1;
       String str9;
       View view;
       b obj = this;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoidWithListener(objArray, obj, b$c.class, str)) {
          return;
       }
       b.V8(obj.b).getViewTreeObserver().removeOnGlobalLayoutListener(obj);
       b = obj.b;
       Objects.requireNonNull(b);
       String str1 = "6";
       if (PatchProxy.applyVoidWithListener(objArray, b, b.class, str1)) {
          str2 = str;
       }else {
          b p = b.p;
          String str3 = "mRootView";
          if (p == null) {
             a.S(str3);
          }
          Context context = p.getContext();
          a.o(context, "fixedContext");
          int i = c.a(context.getResources(), R.dimen.arg_RES_7f070307);
          int i1 = c.a(context.getResources(), R.dimen.arg_RES_7f070295);
          int i2 = c.a(context.getResources(), R.dimen.arg_RES_7f070271);
          b u = b.u;
          if (u == null) {
             a.S("mLabelsContainerLayout");
          }
          u.removeAllViews();
          u = b.v;
          String str4 = "mLabelList";
          if (u == null) {
             a.S(str4);
          }
          InterestLabelView[] interestLabe = new InterestLabelView[u.size()];
          int i3 = View$MeasureSpec.makeMeasureSpec(-2, 0);
          int i4 = View$MeasureSpec.makeMeasureSpec(i, 0x40000000);
          b v = b.v;
          if (v == null) {
             a.S(str4);
          }
          int i5 = v.size();
          str2 = str;
          int i6 = 0;
          while (i6 < i5) {
             int i7 = i5;
             InterestLabelView interestLabe1 = new InterestLabelView(b.getContext());
             obj = b.v;
             if (obj == null) {
                a.S(str4);
             }
             InterestLabelsMeta$InterestLabel interestLabe2 = obj.get(i6);
             i8 = i1;
             InterestLabelsMeta$InterestLabel mText = interestLabe2.mText;
             i9 = i2;
             InterestLabelsMeta$InterestLabel mSelectedIco = interestLabe2.mSelectedIcon;
             str5 = str1;
             InterestLabelsMeta$InterestLabel mUnSelectedI = interestLabe2.mUnSelectedIcon;
             if (PatchProxy.applyVoidThreeRefsWithListener(mText, mSelectedIco, mUnSelectedI, interestLabe1, InterestLabelView.class, "5")) {
                str6 = str3;
                str7 = str4;
                i2 = 0;
             }else {
                str7 = str4;
                if (mText != null) {
                   c = interestLabe1.c;
                   if (c == null) {
                      a.S("mText");
                   }
                   c.setText(mText);
                }
                interestLabe1.d = mSelectedIco;
                interestLabe1.e = mUnSelectedI;
                e[] uoeArray = f.x().t(interestLabe1.d).w();
                str6 = str3;
                Fresco.getImagePipeline().prefetchToDiskCache(uoeArray[0], null, Priority.HIGH);
                i2 = 0;
                Fresco.getImagePipeline().prefetchToBitmapCache(uoeArray[i2], null);
                PatchProxy.onMethodExit(InterestLabelView.class, "5");
             }
             interestLabe1.setPadding(c.a(context.getResources(), R.dimen.arg_RES_7f0702b8), i2, c.a(context.getResources(), R.dimen.arg_RES_7f0702b8), i2);
             interestLabe1.setSelected(i2);
             interestLabe1.setLayoutParams(new FrameLayout$LayoutParams(-2, i));
             interestLabe1.measure(i3, i4);
             interestLabe1.setOnClickListener(new a(b, interestLabe2));
             interestLabe[i6] = interestLabe1;
             i6 = i6 + 1;
             str4 = str7;
             str3 = str6;
             i5 = i7;
             i1 = i8;
             i2 = i9;
             str1 = str5;
          }
          str5 = str1;
          str6 = str3;
          i8 = i1;
          i9 = i2;
          str7 = str4;
          obj = b.u;
          if (obj == null) {
             a.S("mLabelsContainerLayout");
          }
          int width = obj.getWidth();
          String str8 = "7";
          b obj1 = PatchProxy.applyWithListener(null, b, b.class, str8);
          if (obj1 != PatchProxyResult.class) {
             i3 = obj1.intValue();
          }else {
             obj1 = b.p;
             if (obj1 == null) {
                a.S(str6);
             }
             view = b.m8();
             a.o(view, "rootView");
             View view1 = b.m8();
             a.o(view1, "rootView");
             view1 = b.m8();
             a.o(view1, "rootView");
             PatchProxy.onMethodExit(b.class, str8);
             i3 = ((view.getHeight() - view1.getPaddingTop()) - view1.getPaddingBottom()) - n.c(obj1.getContext(), (float)300);
          }
          obj1 = b.v;
          if (obj1 == null) {
             a.S(str7);
          }
          i6 = obj1.size();
          int i10 = 0;
          ViewGroup$LayoutParams layoutParams = 1;
          i1 = 0;
          while (true) {
             if (i10 < i6) {
                object oobject = interestLabe[i10];
                if (oobject != null) {
                   if (layoutParams) {
                      layoutParams = oobject.getLayoutParams();
                      if (layoutParams != null) {
                         layoutParams.topMargin = i1;
                         u1 = b.u;
                         if (u1 == null) {
                            a.S("mLabelsContainerLayout");
                         }
                         u1.addView(oobject);
                         str9 = str5;
                         layoutParams = null;
                      }else {
                         PatchProxy.onMethodExit(b.class, str5);
                         throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                      }
                   }else {
                      str9 = str5;
                      int i11 = i10 - 1;
                      object oobject1 = interestLabe[i11];
                      if (oobject1 != null) {
                         int i12 = oobject1.getMeasuredWidth() + i9;
                         i2 = i12 + oobject.getMeasuredWidth();
                         if (i2 <= width) {
                            layoutParams = oobject.getLayoutParams();
                            if (layoutParams != null) {
                               layoutParams.topMargin = i1;
                               i2 = oobject1.getMeasuredWidth() + i9;
                               layoutParams.leftMargin = i2;
                               u1 = b.u;
                               if (u1 == null) {
                                  a.S("mLabelsContainerLayout");
                               }
                               u1.addView(oobject);
                               int i13 = i + i8;
                               i1 = i1 + i13;
                               layoutParams = 1;
                            }else {
                               PatchProxy.onMethodExit(b.class, str9);
                               throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                         }else {
                            i2 = i + i8;
                            i1 = i1 + i2;
                            ViewGroup$LayoutParams layoutParams1 = oobject.getLayoutParams();
                            if (layoutParams1 != null) {
                               layoutParams1.topMargin = i1;
                               b u2 = b.u;
                               if (u2 == null) {
                                  a.S("mLabelsContainerLayout");
                               }
                               u2.addView(oobject);
                            }else {
                               PatchProxy.onMethodExit(b.class, str9);
                               throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                         }
                      }
                   }
                }else {
                   str9 = str5;
                }
                if (i1 >= i3) {
                label_0267 :
                   b.B = true;
                   b.W8();
                   PatchProxy.onMethodExit(b.class, str9);
                   break ;
                }else {
                   i10 = i10 + 1;
                   str5 = str9;
                   i2 = 0;
                }
             }else {
                str9 = str5;
                goto label_0267 ;
             }
          }
       }
       this.b.X8();
       PatchProxy.onMethodExit(b$c.class, str2);
       return;
    }
}
