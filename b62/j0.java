package b62.j0;
import gi2.d;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import hi2.b;
import hi2.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import gi2.f;
import hi2.g;
import java.lang.Integer;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import yb7.a;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.drawable.GradientDrawable;
import u52.t;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import gi2.c;
import gi2.e;
import java.lang.Boolean;
import j62.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import p91.m;
import ekd.m1;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketGiftSendView;
import lnc.a1;
import java.util.Objects;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.f0;
import l12.d;
import va1.f0;
import dx1.b;
import u52.y;

public class j0 extends c implements d	// class@000343
{
    public View A;
    public TextView B;
    public View C;
    public View D;
    public PathLoadingView E;
    public View F;
    public LiveConditionRedPacketGiftSendView G;
    public KwaiImageView H;
    public KwaiImageView I;
    public KwaiImageView J;
    public KwaiImageView K;
    public KwaiImageView L;
    public t p;
    public a q;
    public m r;
    public LiveConditionRedPacketPanelOwnerInfoView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public TextView y;
    public RecyclerView z;
    public static String sLivePresenterClassName = "LiveConditionRedPacketResultBasePresenter";

    public void j0(){
       super();
    }
    public void B3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j0.class, "5")) {
          return;
       }
       LiveConditionRedPacketInfo liveConditio = this.n6();
       if (liveConditio != null && liveConditio.z != null) {
          b uob = this.W0(liveConditio);
          if (uob == null) {
             return;
          }else {
             this.R8(8);
             this.y4(this.H, uob.c);
             b g = uob.g;
             if (g != null) {
                this.y4(this.I, g.a);
             }
             Integer integer = uob.f();
             if (integer != null) {
                this.t.setTextColor(integer.intValue());
                this.u.setTextColor(integer.intValue());
                this.v.setTextColor(integer.intValue());
                this.w.setTextColor(integer.intValue());
             }
             int[] ointArray = PatchProxy.apply(objArray, uob, b.class, "4");
             if (ointArray != PatchProxyResult.class) {
             }else {
                ointArray = CollectionsKt___CollectionsKt.F5(uob.k);
             }
             if (!a.b(ointArray)) {
                Drawable background = this.F.getBackground();
                if (background instanceof GradientDrawable) {
                   background.setColors(ointArray);
                }
             }
          }
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "2")) {
          return;
       }
       this.r = this.p.a;
       this.B3();
       return;
    }
    public void H7(KwaiImageView p0,TextView p1,LiveRedPacketResourcePathConstant p2){
       c.b(this, p0, p1, p2);
    }
    public void I4(KwaiImageView p0,List p1){
       e.d(this, p0, p1);
    }
    public void N4(KwaiImageView p0,KwaiImageView p1){
       c.a(this, p0, p1);
    }
    public boolean P8(){
       LiveConditionRedPacketInfo obj = PatchProxy.apply(null, this, j0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.q.a != 45) {
          return this.r.e();
       }
       obj = this.n6();
       if (obj == null) {
          return false;
       }
       String str = TextUtils.k(QCurrentUser.me().getId());
       obj = obj.e;
       String str1 = (obj != null)? TextUtils.k(obj.mId): "";
       return TextUtils.n(str, str1);
    }
    public void R5(KwaiImageView p0,List p1){
       e.e(this, p0, p1);
    }
    public void R7(KwaiImageView p0,List p1,int p2){
       e.c(this, p0, p1, p2);
    }
    public void R8(int p0){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj0, "4")) {
          return;
       }
       LiveConditionRedPacketInfo liveConditio = this.n6();
       if (liveConditio != null && liveConditio.z != null) {
          this.A.setVisibility(8);
       }else {
          this.A.setVisibility(p0);
       }
       return;
    }
    public void S4(KwaiImageView p0,List p1){
       e.a(this, p0, p1);
    }
    public b W0(LiveConditionRedPacketInfo p0){
       return c.c(this, p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "3")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1b94);
       this.H = m1.f(p0, 0x7f0a1b88);
       this.J = m1.f(p0, 0x7f0a1b65);
       this.K = m1.f(p0, 0x7f0a1b64);
       this.J.setVisibility(8);
       this.K.setVisibility(8);
       this.t = m1.f(p0, 0x7f0a1b9c);
       this.u = m1.f(p0, 0x7f0a1b9b);
       this.v = m1.f(p0, 0x7f0a1b9a);
       this.w = m1.f(p0, 0x7f0a1b8e);
       this.x = m1.f(p0, 0x7f0a1b96);
       this.y = m1.f(p0, 0x7f0a1b95);
       this.z = m1.f(p0, 0x7f0a1b97);
       this.A = m1.f(p0, 0x7f0a1b8f);
       this.B = m1.f(p0, 0x7f0a1b93);
       this.C = m1.f(p0, 0x7f0a1b90);
       this.E = m1.f(p0, 0x7f0a1b92);
       this.D = m1.f(p0, 0x7f0a1b89);
       this.F = m1.f(p0, 0x7f0a1b99);
       this.G = m1.f(p0, 0x7f0a1b8d);
       j0 ts = this.s;
       int i = a1.a(R.color.arg_RES_7f060ceb);
       Objects.requireNonNull(ts);
       if (!PatchProxy.isSupport(LiveConditionRedPacketPanelOwnerInfoView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), ts, LiveConditionRedPacketPanelOwnerInfoView.class, "5")) {
          ts.c.setTextColor(i);
       }
       this.I = m1.f(p0, 0x7f0a1b91);
       f0.i(this.t, this.getContext());
       this.L = m1.f(p0, 0x7f0a1b8c);
       f0.a(this.H, LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_BACKGROUND);
       f0.a(this.L, LiveRedPacketResourcePathConstant.LIVE_CONDITION_RED_PACKET_RESULT_NETWORK_ERROR);
       f0.a(this.I, LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_INNER_PAGE_BACKGROUND);
       return;
    }
    public b getRedPacketSimpleExtra(){
       return c.d(this);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       this.p = this.q8(t.class);
       this.q = this.q8(a.class);
       return;
    }
    public LiveConditionRedPacketInfo n6(){
       Object obj = PatchProxy.apply(null, this, j0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.d(this.p, this.q);
    }
    public void y2(LiveConditionRedPacketInfo p0,m p1,String p2){
       c.e(this, p0, p1, p2);
    }
    public void y4(KwaiImageView p0,List p1){
       e.b(this, p0, p1);
    }
}
