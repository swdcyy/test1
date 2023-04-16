package b89.a$d;
import android.text.style.ClickableSpan;
import b89.a;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import b89.a$b;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import dkc.b;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import gw8.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.CommonParams;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.t0;

public final class a$d extends ClickableSpan	// class@00038f
{
    public final a b;
    public final String c;
    public final String d;

    public void a$d(a p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       a.p(p0, "widget");
       int i = 0;
       a$d uod = (!this.c.length())? 1: null;
       if (uod) {
          return;
       }else {
          a b = this.b.b;
          if (b != null) {
             b.a(this.c);
          }
          uod = this.b;
          a e = uod.e;
          a$d td = this.d;
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidTwoRefs(e, td, uod, a.class, "3")) {
             ClientContent$TagPackage tagPackage = b.d(td);
             ActivityInfo uActivityInf = a.a(tagPackage.name);
             ClientContent$KsOrderInfoPackage ksOrderInfoP = null;
             ActivityInfo mKsOrderId = (uActivityInf != null)? uActivityInf.mKsOrderId: ksOrderInfoP;
             mKsOrderId = (mKsOrderId == null || !mKsOrderId.length())? 1: 0;
             if (!mKsOrderId) {
                ksOrderInfoP = l0.a(uActivityInf.mKsOrderId);
             }
             CommonParams uCommonParam = b.e(e.getEntity(), "", TextUtils.I(td), 21);
             Pair[] pairArray = new Pair[]{r0.a("tag_type", "FRAME_ANCHOR")};
             Map map = t0.j0(pairArray);
             if ((uod.f).length() > 0) {
                i = 1;
             }
             if (i) {
                map.put("tag_area", uod.f);
             }
             b.t(e, "topic_tag", tagPackage, uCommonParam, ksOrderInfoP, map);
          }
          return;
       }
    }
}
