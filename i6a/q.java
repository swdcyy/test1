package i6a.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementFeed;
import tl8.d;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementMeta;
import java.lang.CharSequence;
import i6a.q$a;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import i6a.q$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import ekd.m1;
import android.text.TextPaint;
import jl5.w;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class q extends PresenterV2	// class@0027ab
{
    public LinearLayout p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public InterestManagementFeed u;
    public PhotoDetailParam v;
    public BaseFragment w;

    public void q(){
       super();
    }
    public static final TextView P8(q p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("rightButton");
       }
       return p0;
    }
    public static final TextView R8(q p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("slideMoreText");
       }
       return p0;
    }
    public void E8(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, q.class, "3")) {
          return;
       }
       q tv = this.v;
       if (tv == null) {
          a.S("mDetailParam");
       }
       PhotoDetailParam mPhoto = tv.mPhoto;
       a.o(mPhoto, "mDetailParam.mPhoto");
       Object obj = mPhoto.getEntity().a(InterestManagementFeed.class);
       a.o(obj, "mDetailParam.mPhoto.enti¡­nagementFeed::class.java\)");
       this.u = obj;
       tv = this.q;
       if (tv == null) {
          a.S("mainTitle");
       }
       q tu = this.u;
       String str = "mInterestFeed";
       if (tu == null) {
          a.S(str);
       }
       InterestManagementFeed mInterestMan = tu.mInterestManagementMeta;
       InterestManagementMeta mTitle = (mInterestMan != null)? mInterestMan.mTitle: objArray;
       tv.setText(mTitle);
       tv = this.r;
       if (tv == null) {
          a.S("subTitle");
       }
       tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       mInterestMan = tu.mInterestManagementMeta;
       mTitle = (mInterestMan != null)? mInterestMan.mSubtitle: objArray;
       tv.setText(mTitle);
       tv = this.s;
       String str1 = "rightButton";
       if (tv == null) {
          a.S(str1);
       }
       q tu1 = this.u;
       if (tu1 == null) {
          a.S(str);
       }
       InterestManagementFeed mInterestMan1 = tu1.mInterestManagementMeta;
       InterestManagementMeta mJumpButtonT = (mInterestMan1 != null)? mInterestMan1.mJumpButtonText: objArray;
       tv.setText(mJumpButtonT);
       tv = this.s;
       if (tv == null) {
          a.S(str1);
       }
       tv.setOnClickListener(new q$a(this));
       tv = this.t;
       if (tv == null) {
          a.S("slideMoreText");
       }
       tu1 = this.u;
       if (tu1 == null) {
          a.S(str);
       }
       InterestManagementFeed mInterestMan2 = tu1.mInterestManagementMeta;
       if (mInterestMan2 != null) {
          objArray = mInterestMan2.mSlideMoreText;
       }
       tv.setText(objArray);
       q tt = this.t;
       if (tt == null) {
          a.S("slideMoreText");
       }
       tt.getViewTreeObserver().addOnGlobalLayoutListener(new q$b(this));
       PatchProxy.onMethodExit(q.class, "3");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, q.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.interest_main_title);
       a.o(view, "bindWidget\(rootView, R.id.interest_main_title\)");
       this.q = view;
       if (view == null) {
          a.S("mainTitle");
       }
       TextPaint paint = view.getPaint();
       a.o(paint, "mainTitle.paint");
       paint.setFakeBoldText(true);
       view = m1.f(p0, R.id.interest_sub_title);
       a.o(view, "bindWidget\(rootView, R.id.interest_sub_title\)");
       this.r = view;
       view = w.a(p0, R.id.interest_cards_container);
       a.o(view, "ViewBindUtils.bindWidget¡­interest_cards_container\)");
       this.p = view;
       view = m1.f(p0, R.id.interest_slide_up_more);
       a.o(view, "bindWidget\(rootView, R.id.interest_slide_up_more\)");
       this.t = view;
       p0 = m1.f(p0, R.id.interest_right_button);
       a.o(p0, "bindWidget\(rootView, R.id.interest_right_button\)");
       this.s = p0;
       if (p0 == null) {
          a.S("rightButton");
       }
       TextPaint paint1 = p0.getPaint();
       a.o(paint1, "rightButton.paint");
       paint1.setFakeBoldText(true);
       PatchProxy.onMethodExit(q.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, q.class, "1")) {
          return;
       }
       Object obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.v = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.w = obj;
       PatchProxy.onMethodExit(q.class, "1");
       return;
    }
}
