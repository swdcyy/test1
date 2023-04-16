package com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$a;
import nsd.u;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$DialogStatus;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$f;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$g;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$e;
import android.widget.CheckBox;
import java.lang.String;
import kotlin.jvm.internal.a;
import ym8.f;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import xm8.g;
import android.app.Activity;
import java.lang.Object;
import java.util.Objects;
import k2b.e0;
import k2b.f3;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$b;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$c;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.Button;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$d;
import java.lang.Class;

public final class ProfileImageNextStepPresenter extends PresenterV2	// class@000c78
{
    public final ProfileImageNextStepPresenter$g A;
    public final ProfileImageNextStepPresenter$e B;
    public f p;
    public TextView q;
    public CheckBox r;
    public LinearLayout s;
    public KwaiImageView t;
    public KwaiImageView u;
    public Button v;
    public CheckBox w;
    public boolean x;
    public ProfileImageNextStepPresenter$DialogStatus y;
    public final ProfileImageNextStepPresenter$f z;
    public static final ProfileImageNextStepPresenter$a C;

    static {
       ProfileImageNextStepPresenter.C = new ProfileImageNextStepPresenter$a(null);
    }
    public void ProfileImageNextStepPresenter(){
       super();
       this.x = true;
       this.y = ProfileImageNextStepPresenter$DialogStatus.NOT_POP;
       this.z = new ProfileImageNextStepPresenter$f(this);
       this.A = new ProfileImageNextStepPresenter$g(this);
       this.B = new ProfileImageNextStepPresenter$e(this);
    }
    public static final CheckBox P8(ProfileImageNextStepPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mCheckbox");
       }
       return p0;
    }
    public static final f R8(ProfileImageNextStepPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mDelegate");
       }
       return p0;
    }
    public static final CheckBox S8(ProfileImageNextStepPresenter p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mDialogCheckbox");
       }
       return p0;
    }
    public void E8(){
       g a;
       ProfileImageNextStepPresenter tp = this.p;
       if (tp == null) {
          a.S("mDelegate");
       }
       boolean b = (tp.z() == ImageSelectSupplier$ImageSelectType.BACKGROUND.getValue())? true: false;
       this.x = b;
       a = g.a;
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       ProfileImageNextStepPresenter tr = this.r;
       if (tr == null) {
          a.S("mCheckbox");
       }
       Objects.requireNonNull(a);
       a.p(activity, "page");
       f3 uof3 = f3.l("", "UPLOAD_POST_PHOTO_BUTTON");
       uof3.m(a.b(tr.isChecked()));
       uof3.h(activity);
       activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       Objects.requireNonNull(a);
       a.p(activity, "page");
       f3.l("", "PREVIEW_PHOTO_BUTTON").h(activity);
       return;
    }
    public void doBindView(View p0){
       View view = m1.f(p0, R.id.cb_enable_post);
       a.o(view, "bindWidget\(rootView, R.id.cb_enable_post\)");
       this.r = view;
       view = m1.f(p0, R.id.btn_upload);
       a.o(view, "bindWidget\(rootView, R.id.btn_upload\)");
       this.q = view;
       if (view == null) {
          a.S("mBtnUpload");
       }
       view.setOnClickListener(new ProfileImageNextStepPresenter$b(this));
       view = m1.f(p0, R.id.preview_hint);
       a.o(view, "bindWidget\(rootView, R.id.preview_hint\)");
       this.s = view;
       if (view == null) {
          a.S("mPreviewHint");
       }
       view.setOnClickListener(new ProfileImageNextStepPresenter$c(this));
       view = m1.f(p0, R.id.avatar_image);
       a.o(view, "bindWidget\(rootView, R.id.avatar_image\)");
       this.t = view;
       view = m1.f(p0, R.id.bg_image);
       a.o(view, "bindWidget\(rootView, R.id.bg_image\)");
       this.u = view;
       view = m1.f(p0, R.id.dialog_finish_button);
       a.o(view, "bindWidget\(rootView, R.id.dialog_finish_button\)");
       this.v = view;
       if (view == null) {
          a.S("mDialogFinishButton");
       }
       view.setOnClickListener(new ProfileImageNextStepPresenter$d(this));
       p0 = m1.f(p0, R.id.dialog_checkbox);
       a.o(p0, "bindWidget\(rootView, R.id.dialog_checkbox\)");
       this.w = p0;
       return;
    }
    public void j8(){
       Object obj = this.q8(f.class);
       a.o(obj, "inject\(ProfilePostDelegate::class.java\)");
       this.p = obj;
    }
}
