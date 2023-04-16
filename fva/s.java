package fva.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import com.kwai.robust.PatchProxyResult;
import jva.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.TextView;
import java.lang.CharSequence;
import fva.q;
import java.util.Locale;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import fva.s$a;
import android.view.View$OnClickListener;

public final class s extends PresenterV2	// class@002a2b
{
    public HotSpotItem p;
    public h q;
    public final HotSpotModel r;
    public final HotSpotFragment s;

    public void s(HotSpotModel p0,HotSpotFragment p1){
       a.p(p1, "page");
       super();
       this.r = p0;
       this.s = p1;
    }
    public static final HotSpotItem P8(s p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("data");
       }
       return p0;
    }
    public void E8(){
       Locale cHINESE;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       s tq = this.q;
       if (tq == null) {
          a.S("binding");
       }
       Objects.requireNonNull(tq);
       h oh1 = PatchProxy.apply(null, tq, oh, "1");
       if (oh1 != patchProxyRe) {
       }else {
          oh1 = tq.c;
          if (oh1 == null) {
             a.S("title");
          }
       }
       tq = this.p;
       if (tq == null) {
          a.S("data");
       }
       oh1.setText(tq.mKeyWord);
       tq = this.q;
       if (tq == null) {
          a.S("binding");
       }
       tq.n1().setVisibility(0);
       tq = this.p;
       if (tq == null) {
          a.S("data");
       }
       HotSpotItem mHotWordType = tq.mHotWordType;
       String str = "Locale.CHINESE";
       if (mHotWordType != 1) {
          if (mHotWordType != 2) {
             tq = this.q;
             if (tq == null) {
                a.S("binding");
             }
             tq.n1().setVisibility(8);
          }else {
             tq = this.q;
             if (tq == null) {
                a.S("binding");
             }
             cHINESE = Locale.CHINESE;
             a.o(cHINESE, str);
             tq.n1().setText(q.a.a(cHINESE, R.string.arg_RES_7f102f5f));
             tq = this.q;
             if (tq == null) {
                a.S("binding");
             }
             tq.n1().setTextColor(a1.a(R.color.arg_RES_7f0607d6));
          }
       }else {
          tq = this.q;
          if (tq == null) {
             a.S("binding");
          }
          cHINESE = Locale.CHINESE;
          a.o(cHINESE, str);
          tq.n1().setText(q.a.a(cHINESE, R.string.arg_RES_7f104d63));
          tq = this.q;
          if (tq == null) {
             a.S("binding");
          }
          tq.n1().setTextColor(a1.a(R.color.arg_RES_7f0607c5));
       }
       tq = this.p;
       if (tq == null) {
          a.S("data");
       }
       if (!TextUtils.x(tq.mTime)) {
          tq = this.p;
          if (tq == null) {
             a.S("data");
          }
          mHotWordType = tq.mTime;
       }else {
          tq = this.p;
          if (tq == null) {
             a.S("data");
          }
          if (!TextUtils.x(tq.mAuthorName)) {
             tq = this.p;
             if (tq == null) {
                a.S("data");
             }
             mHotWordType = tq.mAuthorName;
          }else {
             String str1 = "";
          }
       }
       s tq1 = this.q;
       if (tq1 == null) {
          a.S("binding");
       }
       Objects.requireNonNull(tq1);
       h oh2 = PatchProxy.apply(null, tq1, oh, "5");
       if (oh2 != patchProxyRe) {
       }else {
          oh2 = tq1.e;
          if (oh2 == null) {
             a.S("time");
          }
       }
       oh2.setText(mHotWordType);
       tq = this.q;
       if (tq == null) {
          a.S("binding");
       }
       Objects.requireNonNull(tq);
       oh = PatchProxy.apply(null, tq, oh, "7");
       if (oh != patchProxyRe) {
       }else {
          oh = tq.f;
          if (oh == null) {
             a.S("times");
          }
       }
       s tp = this.p;
       if (tp == null) {
          a.S("data");
       }
       oh.setText(tp.mShowCount);
       tp = this.q;
       if (tp == null) {
          a.S("binding");
       }
       tp.l1().setOnClickListener(new s$a(this));
       return;
    }
    public final HotSpotModel R8(){
       return this.r;
    }
    public final HotSpotFragment S8(){
       return this.s;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       Object obj = this.q8(HotSpotItem.class);
       a.o(obj, "inject\(HotSpotItem::class.java\)");
       this.p = obj;
       obj = this.q8(h.class);
       a.o(obj, "inject\(HotSpotTodayListItem::class.java\)");
       this.q = obj;
       return;
    }
}
