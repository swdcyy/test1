package c7c.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.ViewStub;
import ekd.m1;
import android.widget.TextView;
import android.text.TextPaint;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.online.OnlineDotView;

public class q extends PresenterV2	// class@000551
{
    public KwaiImageView p;
    public View q;
    public ViewStub r;
    public CircleWithStrokeView s;
    public TextView t;
    public View u;
    public OnlineDotView v;
    public User w;
    public boolean x;
    public boolean y;

    public void q(){
       super(false);
    }
    public void q(boolean p0){
       super(p0, false);
    }
    public void q(boolean p0,boolean p1){
       super();
       this.x = p0;
       this.y = p1;
    }
    public void E8(){
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "4")) {
          return;
       }
       if (this.w.mIsLiving != null) {
          this.R8();
       }else if(PatchProxy.applyVoid(objArray, this, oq, "6")){
          View[] viewArray = new View[]{this.s,this.t,this.u};
          n.Z(8, viewArray);
       }
       return;
    }
    public void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "3")) {
          return;
       }
       if (this.y != null) {
          ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
          layoutParams.width = a1.d(0x7f070325);
          layoutParams.height = a1.d(0x7f070325);
          int i = 0x7f07034b;
          layoutParams.topMargin = a1.d(i);
          this.p.setLayoutParams(layoutParams);
          layoutParams = this.r.getLayoutParams();
          layoutParams.width = a1.d(0x7f07032c);
          layoutParams.height = a1.d(0x7f07032c);
          layoutParams.topMargin = a1.d(0x7f070329);
          this.r.setLayoutParams(layoutParams);
          p0 = m1.f(p0, R.id.reco_text_layout);
          if (p0 != null) {
             layoutParams = p0.getLayoutParams();
             layoutParams.bottomMargin = a1.d(i);
             p0.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, q.class, "5")) {
          return;
       }
       int i = 2;
       if (this.u == null) {
          View view = this.r.inflate();
          this.u = m1.f(view, 0x7f0a336d);
          TextView textView = m1.f(view, R.id.pymk_live_tip_text);
          this.t = textView;
          textView.getPaint().setFakeBoldText(true);
          ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
          FrameLayout$LayoutParams layoutParams1 = this.u.getLayoutParams();
          int i1 = (this.x != null)? 0x7f07033f: 0x7f070334;
          layoutParams1.width = layoutParams.width + a1.d(i1);
          layoutParams1.height = layoutParams.height + a1.d(i1);
          this.u.setLayoutParams(layoutParams1);
          if (layoutParams.width >= a1.d(0x7f070325)) {
             this.t.setTextSize(i, 10.00f);
             layoutParams = this.t.getLayoutParams();
             layoutParams.width = a1.d(0x7f070310);
             this.t.setLayoutParams(layoutParams);
          }
       }
       q tv = this.v;
       if (tv != null) {
          tv.setVisibility(8);
       }
       View[] viewArray = new View[]{this.s,this.t,this.u};
       n.Z(0, viewArray);
       viewArray = new View[true];
       viewArray[0] = this.q;
       n.Z(8, viewArray);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0333);
       this.q = m1.f(p0, 0x7f0a4479);
       View view = m1.f(p0, R.id.online_badge);
       if (view instanceof OnlineDotView) {
          this.v = view;
       }
       this.r = m1.f(p0, 0x7f0a3364);
       this.P8(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.w = this.q8(User.class);
       return;
    }
}
