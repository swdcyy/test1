package nd9.h;
import erd.g;
import nd9.l;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import android.view.View;
import j8c.a;
import q87.c;
import oa0.a;
import java.lang.StringBuilder;
import w3b.r;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import tkd.b;
import tkd.d;
import uyb.c;
import ce9.l;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.f;
import android.content.Context;
import android.widget.TextView;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFaceShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFacePackage;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.MagicFaceIconTipMsg;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import lnc.i3;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class h implements g	// class@003140
{
    public final l b;

    public void h(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l h;
       int i;
       h tb = this.b;
       Objects.requireNonNull(tb);
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, ol, "8")) {
       }else if(p0.a != null && (p0.c == PanelShowEvent$PanelType.MAGIC && (p0.b == tb.c && PanelShowEvent.a(tb.e, p0)))){
          if (tb.x != null) {
             tb.x = false;
             tb.O = true;
             tb.h2();
             tb.s2();
             tb.K = false;
          }else {
             p0 = tb.s;
             if (p0 != null && (!p0.getVisibility() && tb.P == null)) {
                if (tb.O == null) {
                   p0 = tb.z;
                   if (!PatchProxy.applyVoidOneRefs(p0, tb, ol, "19")) {
                      String str2 = "face_cover";
                      if (p0 == null) {
                         Object[] objArray = new Object[false];
                         a.D().w(str2, "fillMagicDataByCover magicFace is null", objArray);
                      }else {
                         int i1 = a.Y();
                         if (tb.I <= i1) {
                            Object[] objArray1 = new Object[false];
                            a.D().w(str2, "fillMagicDataByCover mDirectlyUseMaxCount is "+tb.I+", selectCount is "+i1, objArray1);
                         }else {
                            r.a = tb.z;
                            if (!g.y(p0)) {
                               d.a(-314635782).Di(tb.d.d(l.i).b, p0);
                               RxBus.f.b(new f(tb.z, tb.e));
                            }
                            a.n1((i1 + true));
                         }
                      }
                   }
                }
                if (!PatchProxy.applyVoid(null, tb, ol, "26")) {
                   h = tb.o;
                   h.setPivotY((float)((h.getHeight() * 5) / 6));
                   PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[i]{0x3f800000,0x3f4ccccd}),PropertyValuesHolder.ofFloat("scaleY", new float[i]{0x3f800000,0x3f4ccccd}),PropertyValuesHolder.ofFloat("alpha", new float[i]{0x3f800000,0})};
                   i = 2;
                   ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tb.o, propertyValu);
                   objectAnimat.setInterpolator(new e());
                   objectAnimat.setDuration(300);
                   objectAnimat.start();
                }
                if (!PatchProxy.applyVoid(null, tb, ol, "22")) {
                   ol = tb.s;
                   if (ol != null && !ol.getVisibility()) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      ClientContent$MagicFaceShowPackage magicFaceSho = new ClientContent$MagicFaceShowPackage();
                      ClientContent$MagicFacePackage magicFacePac = new ClientContent$MagicFacePackage();
                      l z = tb.z;
                      String str = "";
                      String str1 = (z == null)? str: TextUtils.k(z.mId);
                      magicFacePac.id = str1;
                      z = tb.z;
                      if (z != null) {
                         MagicEmoji$MagicFace mMagicFaceIc = z.mMagicFaceIconTipMsg;
                         if (mMagicFaceIc != null) {
                            magicFacePac.showCoverTag = z.mShouldShowMagicFaceTip;
                            magicFacePac.strategyId = String.valueOf(mMagicFaceIc.mStrategyId);
                         }
                      }
                      z = tb.z;
                      if (z != null) {
                         MagicEmoji$MagicFace mRequestId = z.mRequestId;
                         if (mRequestId != null) {
                            magicFacePac.reqId = mRequestId;
                         }
                      }
                      ClientContent$MagicFacePackage[] magicFacePac1 = new ClientContent$MagicFacePackage[true];
                      magicFacePac1[0] = magicFacePac;
                      magicFaceSho.magicFacePackage = magicFacePac1;
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.magicFaceShowPackage = magicFaceSho;
                      uElementPack.action = 859;
                      uElementPack.type = 4;
                      uElementPack.name = "click_magic_face";
                      uElementPack.status = 1;
                      i3 oi3 = i3.f();
                      oi3.a("show_cover_tag", Boolean.valueOf(tb.G));
                      oi3.d("magic_face_id", magicFacePac.id);
                      oi3.d("operate_id", TextUtils.k(tb.F));
                      h = (tb.G != null)? tb.H: "0";
                      oi3.d("mark_id", h);
                      oi3.c("strategy_id", Integer.valueOf(tb.q));
                      h = tb.z;
                      if (h != null) {
                         str = h.mRequestId;
                      }
                      oi3.d("req_id", str);
                      uElementPack.params = oi3.e();
                      u1.M("", tb.e, 1, uElementPack, uContentPack, null);
                      tb.J = tb.z;
                   }
                }
                tb.K = false;
                tb.h2();
                tb.s2();
                tb.z = null;
             }
          label_01f3 :
             tb.O = true;
             tb.r2();
          }
       }
       return;
    }
}
