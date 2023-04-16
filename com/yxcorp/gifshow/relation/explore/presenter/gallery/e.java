package com.yxcorp.gifshow.relation.explore.presenter.gallery.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.c;
import xwb.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.RecoUser;
import k2b.e0;
import gbc.b;
import zf6.k;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import iac.t;
import java.lang.Runnable;
import lnc.a1;
import android.text.TextPaint;
import android.view.View;
import zf6.j;
import y8c.d;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.e$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.e$b;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.e$c;

public class e extends PresenterV2	// class@00183d
{
    public int A;
    public RecoUser p;
    public d q;
    public PublishSubject r;
    public PublishSubject s;
    public PymkGuideCard t;
    public KwaiImageView u;
    public KwaiImageView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public View z;
    public static final ContactPermissionHolder B;

    static {
       e.B = new ContactPermissionHolder(new b(new c()));
    }
    public void e(){
       super();
    }
    public void E8(){
       a$a uoa;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "2")) {
          return;
       }
       RecoUser mPymkGuideCa = this.p.mPymkGuideCard;
       this.t = mPymkGuideCa;
       if (mPymkGuideCa != null) {
          b.g(this.A, objArray);
          String str = ":ks-features:ft-social:relation";
          if (k.d() && !TextUtils.isEmpty(this.t.mDarkHeadUrl)) {
             uoa = a.d();
             uoa.b(str);
             uoa.d(ImageSource.ICON);
             this.u.M(this.t.mDarkHeadUrl, uoa.a());
          }else if(!TextUtils.isEmpty(this.t.mHeadUrl)){
             uoa = a.d();
             uoa.b(str);
             uoa.d(ImageSource.ICON);
             this.u.M(this.t.mHeadUrl, uoa.a());
          }
          uoa = a.d();
          uoa.b(str);
          uoa.d(ImageSource.ICON);
          this.v.M(this.t.mPhotoUrl, uoa.a());
          this.w.setText(this.t.mTitle);
          this.x.setText(this.t.mSubTitle);
          this.R8();
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       e.B.h(this.getActivity(), new t(this));
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       boolean b = true;
       if (e.B.d()) {
          this.y.setText(a1.p(R.string.arg_RES_7f1046e4));
          this.y.setBackgroundResource(R.drawable.arg_RES_7f0801b2);
          this.y.getPaint().setFakeBoldText(b);
          e ty = this.y;
          ty.setTextColor(j.d(ty, R.color.arg_RES_7f061fbb));
          this.s.onNext(Integer.valueOf(this.q.get()));
       }else {
          this.y.setText(a1.p(R.string.arg_RES_7f103ac5));
          this.y.getPaint().setFakeBoldText(b);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.u = p0.findViewById(0x7f0a0333);
       this.v = p0.findViewById(0x7f0a3041);
       this.w = p0.findViewById(0x7f0a3f2c);
       this.x = p0.findViewById(0x7f0a3bd1);
       TextView textView = p0.findViewById(R.id.follow_btn);
       this.y = textView;
       textView.setOnClickListener(new e$a(this));
       p0.setOnClickListener(new e$b(this));
       p0 = p0.findViewById(R.id.close_btn);
       this.z = p0;
       p0.setOnClickListener(new e$c(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("PYMK_ACCESS_IDSitem_data");
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.r8("PYMK_ACCESS_IDSclose_user");
       this.s = this.r8("PYMK_ACCESS_IDSfollowUser_position");
       this.A = this.r8("PYMK_ACCESS_IDSportal").intValue();
       return;
    }
}
