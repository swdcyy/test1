package g59.a$a;
import erd.g;
import com.yxcorp.gifshow.model.ReportAdLogActionParam;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;
import vq4.h;

public final class a$a implements g	// class@0023f2
{
    public final ReportAdLogActionParam b;

    public void a$a(ReportAdLogActionParam p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          c f = p0.F;
          a$a tb = this.b;
          f.C = tb.mElementType;
          f.b = tb.mItemClickType;
          f.w1 = tb.mItemClickAction;
          f.c = tb.mItemCloseType;
          f.P = tb.mCardCloseType;
          ReportAdLogActionParam mItemId = tb.mItemId;
          String str = "";
          if (mItemId == null) {
             mItemId = str;
          }
          f.J0 = mItemId;
          mItemId = tb.mItemIdList;
          if (mItemId != null) {
             str = mItemId;
          }
          f.w3 = str;
          p0.M = tb.mDisplayIndex;
          f.B0 = tb.mAdLiveShopLinkJumpType;
          f.A0 = tb.mAdLiveItemImpressionType;
          f.i2 = tb.mButtonStyle;
          f.g2 = tb.mBusinessAccessType;
          f.p0 = tb.mLiveRoomPattern;
          f.I = tb.mNegativeSource;
          f.J = tb.mNegativeType;
          f.J3 = tb.mSimplifiedLiveRoomType;
          f.z0 = tb.mAdLiveShopClickType;
          f.X2 = tb.mBusinessSceneType;
       }
       return;
    }
}
