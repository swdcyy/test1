package i6a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i6a.b$a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import i6a.b$b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsFeed;
import tl8.d;
import android.view.ViewTreeObserver;
import i6a.b$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsMeta;
import java.util.Collection;
import java.lang.CharSequence;
import android.widget.TextView;
import i6a.b$d;
import android.view.View$OnClickListener;
import android.widget.Button;
import java.lang.NullPointerException;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsMeta$InterestLabel;
import com.google.gson.JsonObject;
import qrd.l1;
import i6a.k;
import java.lang.Integer;
import k2b.e0;
import java.lang.StringBuilder;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.density.KwaiFixedConstraintLayout;
import com.yxcorp.widget.selector.view.SelectShapeButton;
import android.text.TextPaint;

public final class b extends PresenterV2	// class@00278c
{
    public boolean A;
    public boolean B;
    public boolean C;
    public final b$a D;
    public KwaiFixedConstraintLayout p;
    public TextView q;
    public TextView r;
    public TextView s;
    public SelectShapeButton t;
    public FrameLayout u;
    public List v;
    public PhotoDetailParam w;
    public InterestLabelsFeed x;
    public BaseFragment y;
    public SlidePlayViewModel z;

    public void b(){
       super();
       this.D = new b$a(this);
    }
    public static final PhotoDetailParam P8(b p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mDetailParam");
       }
       return p0;
    }
    public static final BaseFragment R8(b p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final List S8(b p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mLabelList");
       }
       return p0;
    }
    public static final FrameLayout V8(b p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mLabelsContainerLayout");
       }
       return p0;
    }
    public void E8(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, b.class, "3")) {
          return;
       }
       b ty = this.y;
       String str = "mFragment";
       if (ty == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(ty.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
       this.z = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       b ty1 = this.y;
       if (ty1 == null) {
          a.S(str);
       }
       slidePlayVie.P(ty1, this.D);
       ty = this.y;
       if (ty == null) {
          a.S(str);
       }
       Fragment parentFragme = ty.getParentFragment();
       if (parentFragme != null) {
          parentFragme.Vg().i().subscribe(new b$b(this), Functions.e);
          this.B = false;
          ty = this.w;
          if (ty == null) {
             a.S("mDetailParam");
          }
          PhotoDetailParam mPhoto = ty.mPhoto;
          a.o(mPhoto, "mDetailParam.mPhoto");
          Object obj = mPhoto.getEntity().a(InterestLabelsFeed.class);
          a.o(obj, "mDetailParam.mPhoto.enti¡­stLabelsFeed::class.java\)");
          this.x = obj;
          str = "mInterestFeed";
          if (obj == null) {
             a.S(str);
          }
          if (obj == null) {
             PatchProxy.onMethodExit(b.class, "3");
             return;
          }else {
             ty = this.u;
             if (ty == null) {
                a.S("mLabelsContainerLayout");
             }
             ty.getViewTreeObserver().addOnGlobalLayoutListener(new b$c(this));
             ty1 = this.x;
             if (ty1 == null) {
                a.S(str);
             }
             this.v = new ArrayList(ty1.mInterestLabelsMeta.mInterestEntityList);
             ty = this.q;
             if (ty == null) {
                a.S("mMainTitle");
             }
             ty1 = this.x;
             if (ty1 == null) {
                a.S(str);
             }
             InterestLabelsFeed mInterestLab = ty1.mInterestLabelsMeta;
             InterestLabelsMeta mTitle = (mInterestLab != null)? mInterestLab.mTitle: objArray;
             ty.setText(mTitle);
             ty = this.r;
             if (ty == null) {
                a.S("mSubTitle");
             }
             ty1 = this.x;
             if (ty1 == null) {
                a.S(str);
             }
             mInterestLab = ty1.mInterestLabelsMeta;
             mTitle = (mInterestLab != null)? mInterestLab.mSubtitle: objArray;
             ty.setText(mTitle);
             ty = this.s;
             if (ty == null) {
                a.S("mSlideMoreText");
             }
             ty1 = this.x;
             if (ty1 == null) {
                a.S(str);
             }
             InterestLabelsFeed mInterestLab1 = ty1.mInterestLabelsMeta;
             if (mInterestLab1 != null) {
                objArray = mInterestLab1.mSlideMoreText;
             }
             ty.setText(objArray);
             b tt = this.t;
             if (tt == null) {
                a.S("mButton");
             }
             tt.setOnClickListener(new b$d(this));
             PatchProxy.onMethodExit(b.class, "3");
             return;
          }
       }else {
          PatchProxy.onMethodExit(b.class, "3");
          throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
       }
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "4")) {
          return;
       }
       b tz = this.z;
       if (tz == null) {
          a.S("mSlidePlayViewModel");
       }
       b ty = this.y;
       if (ty == null) {
          a.S("mFragment");
       }
       tz.D(ty, this.D);
       PatchProxy.onMethodExit(b.class, "4");
       return;
    }
    public final void W8(){
       k b;
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "9")) {
          return;
       }
       if (this.A != null && this.B != null) {
          ArrayList uArrayList = new ArrayList();
          b tv = this.v;
          if (tv == null) {
             a.S("mLabelList");
          }
          Iterator iterator = tv.iterator();
          while (iterator.hasNext()) {
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("option_name", iterator.next().mText);
             uArrayList.add(jsonObject);
          }
          b = k.b;
          b tw = this.w;
          if (tw == null) {
             a.S("mDetailParam");
          }
          QPhoto photo = tw.getPhoto();
          a.o(photo, "mDetailParam.photo");
          BaseFeed entity = photo.getEntity();
          a.o(entity, "mDetailParam.photo.entity");
          b ty = this.y;
          if (ty == null) {
             a.S("mFragment");
          }
          b.d(entity, ty, Integer.valueOf(b.a()), uArrayList);
       }
       PatchProxy.onMethodExit(b.class, "9");
       return;
    }
    public final void X8(){
       InterestLabelsFeed mInterestLab;
       b tt;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, b.class, "5")) {
          return;
       }
       b tv = this.v;
       if (tv == null) {
          a.S("mLabelList");
       }
       Iterator iterator = tv.iterator();
       b uob = null;
       int i = 0;
       while (iterator.hasNext()) {
          if (iterator.next().mIsSelected != null) {
             i = i + 1;
          }
       }
       String str = "mInterestFeed";
       if (i > 0) {
          uob = this.t;
          if (uob == null) {
             a.S("mButton");
          }
          StringBuilder str1 = "";
          b tx = this.x;
          if (tx == null) {
             a.S(str);
          }
          mInterestLab = tx.mInterestLabelsMeta;
          if (mInterestLab != null) {
             objArray = mInterestLab.mSubmitButtonText;
          }
          uob.setText(str1+objArray+0xff08+i+0xff09);
          tt = this.t;
          if (tt == null) {
             a.S("mButton");
          }
          tt.setAlpha(0x3f800000);
          tt = this.t;
          if (tt == null) {
             a.S("mButton");
          }
          tt.setEnabled(true);
       }else {
          b tt1 = this.t;
          if (tt1 == null) {
             a.S("mButton");
          }
          b tx1 = this.x;
          if (tx1 == null) {
             a.S(str);
          }
          mInterestLab = tx1.mInterestLabelsMeta;
          if (mInterestLab != null) {
             objArray = mInterestLab.mSubmitButtonText;
          }
          tt1.setText(objArray);
          tt = this.t;
          if (tt == null) {
             a.S("mButton");
          }
          tt.setAlpha(0x3f000000);
          tt = this.t;
          if (tt == null) {
             a.S("mButton");
          }
          tt.setEnabled(uob);
       }
       PatchProxy.onMethodExit(b.class, "5");
       return;
    }
    public void doBindView(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.interest_labels_root);
       a.o(view, "bindWidget\(rootView, R.id.interest_labels_root\)");
       this.p = view;
       view = m1.f(p0, R.id.interest_labels_button);
       a.o(view, "bindWidget\(rootView, R.id.interest_labels_button\)");
       this.t = view;
       if (view == null) {
          a.S("mButton");
       }
       TextPaint paint = view.getPaint();
       a.o(paint, "mButton.paint");
       b = true;
       paint.setFakeBoldText(b);
       view = m1.f(p0, R.id.interest_labels_container);
       a.o(view, "bindWidget\(rootView, R.i¡­nterest_labels_container\)");
       this.u = view;
       view = m1.f(p0, R.id.interest_main_title);
       a.o(view, "bindWidget\(rootView, R.id.interest_main_title\)");
       this.q = view;
       if (view == null) {
          a.S("mMainTitle");
       }
       paint = view.getPaint();
       a.o(paint, "mMainTitle.paint");
       paint.setFakeBoldText(b);
       view = m1.f(p0, R.id.interest_sub_title);
       a.o(view, "bindWidget\(rootView, R.id.interest_sub_title\)");
       this.r = view;
       p0 = m1.f(p0, R.id.interest_slide_up_more);
       a.o(p0, "bindWidget\(rootView, R.id.interest_slide_up_more\)");
       this.s = p0;
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.w = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.y = obj;
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
