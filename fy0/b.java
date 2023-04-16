package fy0.b;
import im8.g;
import k51.c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import java.util.ArrayList;
import xl8.b;
import java.lang.Integer;
import java.lang.Object;
import fy0.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ft5.b;
import fy0.i;
import android.view.ViewStub;
import ow0.a;
import fy0.j$a;
import com.kwai.robust.PatchProxyResult;
import fy0.a;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import com.kuaishou.live.core.basic.model.LiveActivityCommentConfig;
import wx0.a;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import hy0.y;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import ry1.b;
import com.kuaishou.live.core.basic.model.LivePayBulletResponse;
import android.text.SpannableStringBuilder;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import fy0.j;
import com.kwai.feature.api.live.service.show.comments.sendcomment.CustomerServiceCommentInfo;
import zf6.k;
import zf6.l;
import fq5.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import hy0.v;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import p91.m;
import by0.a;
import java.lang.Number;
import android.widget.EditText;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;
import fy0.e;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b extends c implements g	// class@0023ce
{
    public int p;
    public EmojiEditText q;
    public ViewStub r;
    public List s;
    public b t;
    public i u;
    public BaseEditorFragment v;
    public a0 w;
    public int x;
    public b$b y;
    public static String sLivePresenterClassName = "LiveAudienceCommentEditorPanelTabPresenter";

    public void b(BaseEditorFragment p0,int p1){
       super();
       this.s = new ArrayList();
       this.t = new b(Integer.valueOf(0));
       this.x = 0;
       this.y = new b$a(this);
       this.v = p0;
       if (p1) {
          this.x = p1;
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       this.w.Y1.Ii(false);
       this.u = new i(this.r);
       b tx = this.x;
       if (tx != null) {
          this.t.d(Integer.valueOf(tx));
          a.s(this.x);
          this.V8(false);
          this.x = 0;
       }
       return;
    }
    public j$a P8(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new j$a(p0, p1, this.t, new a(this));
    }
    public CharSequence R8(){
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uob, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = this.t.a().intValue();
       if (i != 2) {
          if (i != 3) {
             if (i != 4) {
                uob = this.v;
                if (uob != null) {
                   objArray = uob.M.mHintText;
                }
             }else {
                LiveActivityCommentConfig obj1 = PatchProxy.apply(objArray, this, uob, "11");
                if (obj1 != patchProxyRe) {
                   objArray = obj1;
                }else {
                   obj1 = a.a(this.w);
                   if (obj1 != null) {
                      if (this.w.Y1.Kl() && !TextUtils.x(obj1.mConsumedCommentEditorHintText)) {
                         objArray = obj1.mConsumedCommentEditorHintText;
                      }else if(!this.w.Y1.Kl() && !TextUtils.x(obj1.mUnconsumedCommentEditorHintText)){
                         objArray = obj1.mUnconsumedCommentEditorHintText;
                      }
                   }
                }
             }
          }else {
             objArray = a1.p(R.string.arg_RES_7f103485);
          }
       }else {
          uob = this.w;
          obj = PatchProxy.applyOneRefs(uob, objArray, y.class, "3");
          if (obj != patchProxyRe) {
             objArray = obj;
          }else if(uob == null){
             LiveTimeConsumingUserStatusResponse liveTimeCons = uob.b3.d0();
             if (liveTimeCons != null) {
                liveTimeCons = liveTimeCons.mLivePayBulletResponse;
                if (liveTimeCons != null) {
                   objArray = new SpannableStringBuilder(a1.r(0x7f101ef2, String.valueOf(liveTimeCons.getPrice())));
                   if (!TextUtils.x(liveTimeCons.getBulletHint())) {
                      objArray.append("\(");
                      objArray.append(liveTimeCons.getBulletHint());
                      objArray.append("\)");
                   }
                }
             }
          }
       }
       if (TextUtils.x(objArray)) {
          objArray = a1.p(R.string.arg_RES_7f103cec);
       }
       return objArray;
    }
    public boolean S8(int p0){
       Iterator obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.s.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (obj.next().e() == p0) {
             break ;
          }
       }
       return true;
    }
    public void V8(boolean p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "8")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       this.W8();
       int i = this.t.a().intValue();
       a0 y1 = this.w.Y1;
       b = false;
       boolean b1 = (i == 2)? true: false;
       y1.nn(b1);
       CustomerServiceCommentInfo uCustomerSer = this.w.Y1.mf();
       a uoa = 3;
       boolean b2 = (i == uoa)? true: false;
       uCustomerSer.setSelected(b2);
       y1 = this.w.Y1;
       LiveActivityCommentConfig liveActivity = 4;
       if (i == liveActivity) {
          b = true;
       }
       y1.Ii(b);
       ClientEvent$ElementPackage obj = null;
       if (i == liveActivity) {
          LiveActivityCommentConfig liveActivity1 = a.a(this.w);
          if (liveActivity1 != null && !TextUtils.x(liveActivity1.mCommentStickerUrl)) {
             b tu = this.u;
             String str = (k.d())? l.j(liveActivity1.mCommentStickerUrl): liveActivity1.mCommentStickerUrl;
             tu.a(str);
          }
       }else {
          this.u.a(obj);
       }
       if (p0) {
          a.s(i);
          ClientContent$LiveStreamPackage liveStreamPa = this.w.b().a();
          v ov = v.class;
          if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Integer.valueOf(i), obj, ov, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "COMMENT_TYPE_TAB";
             i3 oi31 = i3.f();
             oi31.d("select_tab", v.f(i));
             uElementPack.params = oi31.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
          if (i == uoa) {
             liveStreamPa = this.w.Z2.a();
             CustomerServiceCommentInfo mStyle = this.w.Y1.mf().mStyle;
             uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Integer.valueOf(mStyle), obj, uoa, "2")) {
                obj = new ClientEvent$ElementPackage();
                obj.action2 = "BUTTON_ASK_CS";
                i3 oi3 = i3.f();
                oi3.c("entrance_position", Integer.valueOf(mStyle));
                obj.params = oi3.e();
                a.b(liveStreamPa, obj);
             }
          }
       }
    label_0111 :
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       this.q.setHint(this.R8());
       this.q.requestLayout();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1b40);
       this.q = m1.f(p0, 0x7f0a0ca8);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.w = this.q8(a0.class);
       return;
    }
}
