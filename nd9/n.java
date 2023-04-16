package nd9.n;
import erd.g;
import nd9.o;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import bd.f;
import java.lang.Object;
import java.lang.Long;
import nd9.l;
import bd.b;
import com.facebook.imagepipeline.image.a;
import android.graphics.Bitmap;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFacePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFaceShowPackage;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.MagicFaceIconTipMsg;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import lnc.i3;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import com.yxcorp.gifshow.camera.record.base.d;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class n implements g	// class@003152
{
    public final o b;
    public final MagicEmoji$MagicFace c;
    public final f d;

    public void n(o p0,MagicEmoji$MagicFace p1,f p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       boolean b;
       String str2;
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       p0 = l.class;
       o c = tb.c;
       if (c.L == null) {
       }else {
          c.L = false;
          c.z = tc;
          if (td instanceof b && !td.isClosed()) {
             tb.c.A = td.g();
          }
          int i = tb.c.g2() + 1;
          c = tb.c;
          if (c.M != null) {
             c.n2(i);
             o c1 = tb.c;
             Objects.requireNonNull(c1);
             if (!PatchProxy.applyVoid(null, c1, p0, "23")) {
                l s = c1.s;
                if (s != null && !s.getVisibility()) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   ClientContent$MagicFacePackage magicFacePac = new ClientContent$MagicFacePackage();
                   ClientContent$MagicFaceShowPackage magicFaceSho = new ClientContent$MagicFaceShowPackage();
                   l z = c1.z;
                   String str = "";
                   String str1 = (z == null)? str: TextUtils.k(z.mId);
                   magicFacePac.id = str1;
                   magicFacePac.index = 0;
                   z = c1.z;
                   if (z != null) {
                      MagicEmoji$MagicFace mMagicFaceIc = z.mMagicFaceIconTipMsg;
                      if (mMagicFaceIc != null) {
                         magicFacePac.showCoverTag = z.mShouldShowMagicFaceTip;
                         magicFacePac.strategyId = String.valueOf(mMagicFaceIc.mStrategyId);
                      }
                   }
                   z = c1.z;
                   if (z != null) {
                      MagicEmoji$MagicFace mRequestId = z.mRequestId;
                      if (mRequestId != null) {
                         magicFacePac.reqId = mRequestId;
                      }
                   }
                   ClientContent$MagicFacePackage[] magicFacePac1 = new ClientContent$MagicFacePackage[]{magicFacePac};
                   magicFaceSho.magicFacePackage = magicFacePac1;
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.magicFaceShowPackage = magicFaceSho;
                   uElementPack.name = "show_magic_face_cover";
                   uElementPack.action = 426;
                   uElementPack.type = 4;
                   i3 oi3 = i3.f();
                   oi3.a("show_cover_tag", Boolean.valueOf(c1.G));
                   oi3.d("operate_id", TextUtils.k(c1.F));
                   oi3.d("magic_face_id", magicFacePac.id);
                   s = (c1.G != null)? c1.H: "0";
                   oi3.d("mark_id", s);
                   oi3.c("strategy_id", Integer.valueOf(c1.q));
                   s = c1.E;
                   b = (s != null && s.mAutoApplyMagicFace != null)? true: false;
                   oi3.a("is_auto_use", Boolean.valueOf(b));
                   s = c1.z;
                   if (s != null) {
                      str = s.mRequestId;
                   }
                   oi3.d("req_id", str);
                   uElementPack.params = oi3.e();
                   u1.D0("", c1.f, 7, uElementPack, uContentPack, null);
                }
             }
             tb.c.M = false;
          }
          o c2 = tb.c;
          Objects.requireNonNull(c2);
          if (!PatchProxy.applyVoid(null, c2, p0, "24")) {
             c2.p2(1);
          }
       }
       return;
    }
}
