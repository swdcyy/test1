package bfd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jp.a;
import nfd.r3;
import vb5.a;
import com.kuaishou.android.model.mix.CoverMeta;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.t0;
import java.lang.Integer;
import android.text.SpannableStringBuilder;
import com.yxcorp.gifshow.util.span.CustomTypefaceSpan;
import android.graphics.Typeface;
import lnc.a1;
import android.widget.TextView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends PresenterV2	// class@00025b
{
    public CoverMeta p;
    public QPhoto q;
    public LiveStreamModel r;
    public BaseFragment s;
    public Typeface t;
    public KBoxItem u;
    public KwaiImageView v;
    public TextView w;
    public View x;
    public View y;

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          ImageRequest[] imageRequest = b.b(this.p, r3.m(a.c), new a(170));
          if (imageRequest.length) {
             d uod = Fresco.newDraweeControllerBuilder();
             uod.y(this.v.getController());
             uod.u(imageRequest);
             AbstractDraweeController uAbstractDra = uod.e();
             this.v.setController(uAbstractDra);
             this.v.setVisibility(0);
          }
       }
       if (this.u.mType == 6) {
          if (!PatchProxy.applyVoid(objArray, this, uoa, "4") && this.r != null) {
             int i = 8;
             View[] viewArray = new View[]{this.y};
             n.Z(i, viewArray);
             viewArray = new View[]{this.w};
             n.Z(i, viewArray);
             View[] viewArray1 = new View[]{this.x};
             n.Z(i, viewArray1);
          }
       }else {
          this.P8(this.r.mAudienceCount);
       }
       if (this.q.getUser() != null) {
          this.q.getUser().startSyncWithFragment(this.s.m());
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.v.setVisibility(8);
       return;
    }
    public final void P8(String p0){
       View[] viewArray;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       int i = 8;
       if (this.r != null) {
          viewArray = new View[]{this.y};
          n.Z(i, viewArray);
          viewArray = new View[]{this.w};
          n.Z(i, viewArray);
          viewArray = new View[]{this.x};
          n.Z(i, viewArray);
          return;
       }else if(!TextUtils.x(p0) && this.u.mType != 13){
          if (t0.a(p0)) {
             try{
                i1 = Integer.parseInt(p0);
             }catch(java.lang.NumberFormatException e0){
                i1 = 0;
             }
             if (i1 <= 0) {
                viewArray = new View[]{this.y};
                n.Z(0, viewArray);
                viewArray = new View[]{this.w};
                n.Z(i, viewArray);
                viewArray = new View[]{this.x};
                n.Z(i, viewArray);
                return;
             }
          }
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(p0);
          spannableStr.setSpan(new CustomTypefaceSpan("", this.t), 0, p0.length(), 17);
          spannableStr.append(a1.p(R.string.arg_RES_7f100f3f));
          viewArray = new View[]{this.y};
          n.Z(i, viewArray);
          viewArray = new View[]{this.w};
          n.Z(0, viewArray);
          viewArray = new View[]{this.x};
          n.Z(0, viewArray);
          this.w.setText(spannableStr);
       }else {
          viewArray = new View[]{this.y};
          n.Z(0, viewArray);
          viewArray = new View[]{this.w};
          n.Z(i, viewArray);
          viewArray = new View[]{this.x};
          n.Z(i, viewArray);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a0f91);
       this.w = m1.f(p0, 0x7f0a1934);
       this.x = m1.f(p0, 0x7f0a1935);
       this.y = m1.f(p0, 0x7f0a3665);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(CoverMeta.class);
       this.q = this.r8("SEARCH_AUTO_PLAY_PHOTO");
       this.r = this.q8(LiveStreamModel.class);
       this.s = this.r8("FRAGMENT");
       this.t = this.r8("SEARCH_PLAY_FONT_ALTE");
       this.u = this.q8(KBoxItem.class);
       return;
    }
}
