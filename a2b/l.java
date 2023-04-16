package a2b.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;
import java.lang.Integer;
import w1b.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionItemFlipperView;
import x1b.a;
import java.util.List;
import android.view.View;
import ekd.m1;
import java.lang.Number;

public final class l extends PresenterV2	// class@00002d
{
    public a p;
    public NearbyHeaderFunctionEntranceView$a q;
    public int r;
    public HeaderFunctionCard s;
    public NearbyFunctionItemFlipperView t;

    public void l(){
       super();
    }
    public void E8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       String str = "5";
       if (!PatchProxy.applyVoid(objArray, this, ol, str)) {
          l ts = this.s;
          l ol1 = 1;
          if (ts == null || ts.mIsFromCache != ol1) {
             String str1 = String.valueOf((this.r + ol1));
             ol1 = this.s;
             Integer integer = (ol1 != null)? Integer.valueOf(ol1.mType): objArray;
             a.a(str1, str, String.valueOf(integer), false);
          }
       }
       l tt = this.t;
       if (tt == null) {
          a.S("mFunctionFlipper");
       }
       tt.setItemClickListener(this.q);
       if (!PatchProxy.applyVoid(objArray, this, ol, "4")) {
          ol = this.s;
          if (ol != null) {
             HeaderFunctionCard mCards = ol.mCards;
             if (mCards != null) {
                l tt1 = this.t;
                if (tt1 == null) {
                   a.S("mFunctionFlipper");
                }
                tt = this.p;
                if (tt == null) {
                   a.S("mAdapter");
                }
                tt1.setMItemWidth(tt.w);
                tt1 = this.t;
                if (tt1 == null) {
                   a.S("mFunctionFlipper");
                }
                a.o(mCards, "it");
                tt1.setData(mCards);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       a.p(p0, "view");
       p0 = m1.f(p0, R.id.function_flipper);
       a.o(p0, "ViewBindUtils.bindWidget¡­w, R.id.function_flipper\)");
       this.t = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.s = this.s8(HeaderFunctionCard.class);
       Object obj = this.r8("ADAPTER_POSITION");
       a.o(obj, "inject\(PageAccessIds.ADAPTER_POSITION\)");
       this.r = obj.intValue();
       obj = this.r8("ADAPTER");
       a.o(obj, "inject\(PageAccessIds.ADAPTER\)");
       this.p = obj;
       this.q = this.t8("nearby_header_NEARBY_HEAD_FUNCTION_ITEM_CALLBACK");
       return;
    }
}
