package bjc.h;
import com.yxcorp.gifshow.share.widget.d;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import uo7.k;
import com.yxcorp.gifshow.share.widget.d$e;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.share.model.ShareWechatMomentsChooseConfig;
import java.lang.reflect.Type;
import java.lang.Object;
import android.view.View;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.content.res.Resources;
import com.yxcorp.gifshow.share.model.ShareWechatMomentsChooseConfig$Config;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mhc.e2;
import yic.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import djc.k;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import mhc.j2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e17.i;
import com.kwai.sharelib.exception.ForwardCancelException;
import java.lang.Throwable;
import com.yxcorp.gifshow.widget.SectorProgressView;
import bjc.h$c;
import bjc.h$a;
import bjc.h$b;
import io.reactivex.subjects.PublishSubject;

public class h extends d	// class@00048a
{
    public View K;
    public final k L;
    public TextView M;
    public SectorProgressView N;
    public boolean O;
    public final d$e P;
    public PresenterV2 Q;
    public final ShareWechatMomentsChooseConfig R;

    public void h(Context p0,QPhoto p1,String p2,k p3,d$e p4){
       super(p0, p1, p2, "WECHAT_MOMENT");
       this.O = false;
       this.R = a.t().getValue("shareWechatMomentsChooseConfig", ShareWechatMomentsChooseConfig.class, null);
       this.L = p3;
       this.P = p4;
    }
    public static void C(View p0,TextView p1,boolean p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, h.class, "18")) {
          return;
       }
       if (p2) {
          p0.setEnabled(true);
          p1.setTextColor(p0.getContext().getResources().getColor(R.color.arg_RES_7f061fbd));
       }else {
          p0.setEnabled(false);
          p1.setTextColor(p0.getContext().getResources().getColor(R.color.arg_RES_7f0607cf));
       }
       return;
    }
    public final void D(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       this.N.setVisibility(8);
       return;
    }
    public final void E(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, h.class, "5")) {
          this.M.setText(R.string.arg_RES_7f10465f);
          h tR = this.R;
          if (tR != null) {
             ShareWechatMomentsChooseConfig mVideoConfig = tR.mVideoConfig;
             if (!TextUtils.x(mVideoConfig.mActionTitle)) {
                this.M.setText(mVideoConfig.mActionTitle);
             }
          }
       }
       this.D();
       if (!PatchProxy.applyVoid(objArray, this, h.class, "6")) {
          this.M.setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f0802e3, 0, 0, 0);
       }
       h.C(this.K, this.M, true);
       return;
    }
    public void j(e2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "13")) {
          return;
       }
       this.x = true;
       super.j(p0);
       int i = p0.a();
       if (i == 0x7f0a05d2) {
          this.v("PRIVATE_USER_WECHAT_TIMELINE");
       }else if(i == 0x7f0a2c07){
          this.v("PRIVATE_MORE_WECHAT_TIMELINE");
       }else if(i == 0x7f0a391c){
          this.v("DOWNLOAD_SHARE_WECHAT_TIMELINE");
          g.d(this.p, this.L, 2);
       }else if(i == 0x7f0a38e9){
          this.v("IMAGE_SHARE_WECHAT_TIMELINE");
       }
       return;
    }
    public int n(){
       return 0x7f0d02ca;
    }
    public int r(){
       Object obj = PatchProxy.apply(null, this, h.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (d.J - a1.d(0x7f070268));
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       if (this.A >= 5) {
          this.o.setMaxHeight((int)(float)((double)((this.l.getResources().getDimension(R.dimen.arg_RES_7f0702cc) + this.l.getResources().getDimension(R.dimen.arg_RES_7f070319)) + (this.l.getResources().getDimension(R.dimen.arg_RES_7f07031d) + this.l.getResources().getDimension(R.dimen.arg_RES_7f07028d))) + ((double)this.l.getResources().getDimension(R.dimen.arg_RES_7f07032a) * 5.50f)));
       }else {
          super.t();
       }
       return;
    }
    public void v(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "17")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = TextUtils.k(p0);
       i3 oi3 = i3.f();
       oi3.d("is_wx_limit", "TRUE");
       oi3.d("source", this.w);
       uElementPack.params = oi3.e();
       d tp = this.p;
       QPhoto mEntity = (tp != null)? tp.mEntity: null;
       j2.f(1, "DOWNLOAD_SHARE_POPUP", uElementPack, mEntity);
       return;
    }
    public void w(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "12")) {
          return;
       }
       super.w();
       h tQ = this.Q;
       if (tQ != null && tQ.R1()) {
          this.Q.destroy();
          this.Q = objArray;
       }
       if (this.O == null && this.x == null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f1004c5);
       }
       if (!PatchProxy.applyVoid(objArray, this, h.class, "16")) {
          this.v("CANCEL_SHARE_WECHAT_TIMELINE");
          if (this.x == null) {
             g.e(this.p, this.L, 2, new ForwardCancelException());
          }
       }
       return;
    }
    public void x(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "11")) {
          return;
       }
       super.x();
       if (!PatchProxy.applyVoid(objArray, this, h.class, "15")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "WECHAT_TIMELINE_LIMIT_POPUP";
          i3 oi3 = i3.f();
          oi3.d("is_wx_limit", "TRUE");
          oi3.d("source", this.w);
          uElementPack.params = oi3.e();
          d tp = this.p;
          if (tp != null) {
             objArray = tp.mEntity;
          }
          j2.h(4, "DOWNLOAD_SHARE_POPUP", uElementPack, objArray);
       }
       return;
    }
    public void y(){
       TextView textView;
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       super.y();
       this.M = this.n.findViewById(0x7f0a391b);
       this.N = this.n.findViewById(0x7f0a0c1a);
       this.K = this.n.findViewById(0x7f0a391c);
       h.C(this.K, this.M, false);
       if (this.O != null) {
          this.E();
       }
       h tR = this.R;
       if (tR != null) {
          ShareWechatMomentsChooseConfig mVideoConfig = tR.mVideoConfig;
          if (!TextUtils.x(mVideoConfig.mOtherTitle)) {
             textView.setText(mVideoConfig.mOtherTitle);
          }
       }
       return;
    }
    public void z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "10")) {
          return;
       }
       h$c uoc = new h$c(objArray);
       this.Q = uoc;
       uoc.f(this.n);
       objArray = new Object[]{new h$b(this.L, this.p, this.r, this.P)};
       this.Q.i(objArray);
       return;
    }
}
