package al3.a;
import erd.g;
import al3.d;
import java.lang.Object;
import com.kuaishou.live.preview.item.model.LivePreviewPendantModel;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.preview.item.model.LivePreviewPendantModel$LivePreviewPendantKdsInfo;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView;
import z51.g;
import java.lang.Integer;
import al3.b;
import al3.c;
import msd.l;
import com.kuaishou.live.basic.tk.LiveTkItemManager;

public final class a implements g	// class@0000f2
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       boolean b1;
       boolean b2;
       a tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       LivePreviewLogTag lIVE_PREVIEW = LivePreviewLogTag.LIVE_PREVIEW_PENDANT;
       d c = tb.C;
       String str = (c == null)? "null": c.toString();
       b.d0(lIVE_PREVIEW, "receive pendant model", "currentModel", str, "new model", p0.toString());
       LivePreviewPendantModel obj = PatchProxy.applyOneRefs(p0, tb, uod, "8");
       b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(!TextUtils.x(p0.mPendantId)){
          obj = p0.mKdsInfo;
          if (obj != null && (!TextUtils.x(obj.mBundleId) && !TextUtils.x(p0.mKdsInfo.mKdsData))) {
             b1 = true;
          }
       }
       b1 = false;
       if (!b1) {
          b.Z(lIVE_PREVIEW, "pendantModel is invalid");
       }else {
          LivePreviewPendantModel obj1 = PatchProxy.applyOneRefs(p0, tb, uod, "7");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else {
             d c1 = tb.C;
             b2 = (c1 != null && (c1.mKdsInfo != null && (p0.mKdsInfo != null && (TextUtils.n(c1.mPendantId, p0.mPendantId) && TextUtils.n(tb.C.mKdsInfo.mBundleId, p0.mKdsInfo.mBundleId)))))? true: false;
          }
          if (!b2 || tb.A == null) {
             if (tb.A != null) {
                b = false;
             }
             b.c0(lIVE_PREVIEW, "render new pendant", "widgetView is null?", Boolean.valueOf(b));
             tb.W8();
             obj1 = p0.mKdsInfo;
             tb.y.b(new g(obj1.mBundleId, "live_preview_pendant", obj1.mKdsData, Integer.valueOf(-1)), new b(tb, p0), c.b);
          }else {
             b.Z(lIVE_PREVIEW, "has render same pendant, just update data");
             tb.A.c(p0.mKdsInfo.mKdsData, "");
          }
          tb.C = p0;
       }
       return;
    }
}
