package fva.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xua.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import com.kwai.robust.PatchProxyResult;
import jva.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import fva.m$a;
import android.view.View$OnClickListener;
import fva.m$b;
import android.view.View$OnLongClickListener;

public final class m extends PresenterV2	// class@002a14
{
    public HotSpotItem p;
    public d q;
    public HotSpotFragment r;
    public final a s;

    public void m(a p0){
       a.p(p0, "adapter");
       super();
       this.s = p0;
    }
    public static final HotSpotItem P8(m p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("data");
       }
       return p0;
    }
    public static final HotSpotFragment R8(m p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("page");
       }
       return p0;
    }
    public void E8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       m tq = this.q;
       if (tq == null) {
          a.S("binding");
       }
       Objects.requireNonNull(tq);
       d uod1 = PatchProxy.apply(null, tq, uod, "1");
       if (uod1 != patchProxyRe) {
       }else {
          uod1 = tq.c;
          if (uod1 == null) {
             a.S("image");
          }
       }
       tq = this.p;
       if (tq == null) {
          a.S("data");
       }
       uod1.U(tq.mCoverUrl);
       tq = this.q;
       if (tq == null) {
          a.S("binding");
       }
       Objects.requireNonNull(tq);
       uod1 = PatchProxy.apply(null, tq, uod, "3");
       if (uod1 != patchProxyRe) {
       }else {
          uod1 = tq.d;
          if (uod1 == null) {
             a.S("title");
          }
       }
       tq = this.p;
       if (tq == null) {
          a.S("data");
       }
       uod1.setText(tq.mKeyWord);
       tq = this.q;
       if (tq == null) {
          a.S("binding");
       }
       Objects.requireNonNull(tq);
       uod1 = PatchProxy.apply(null, tq, uod, "5");
       if (uod1 != patchProxyRe) {
       }else {
          uod1 = tq.e;
          if (uod1 == null) {
             a.S("author");
          }
       }
       tq = this.p;
       if (tq == null) {
          a.S("data");
       }
       uod1.setText(tq.mAuthorName);
       tq = this.q;
       if (tq == null) {
          a.S("binding");
       }
       Objects.requireNonNull(tq);
       uod = PatchProxy.apply(null, tq, uod, "7");
       if (uod != patchProxyRe) {
       }else {
          uod = tq.f;
          if (uod == null) {
             a.S("time");
          }
       }
       m tp = this.p;
       if (tp == null) {
          a.S("data");
       }
       uod.setText(tp.mTime);
       tp = this.q;
       if (tp == null) {
          a.S("binding");
       }
       tp.l1().setOnClickListener(new m$a(this));
       tp = this.q;
       if (tp == null) {
          a.S("binding");
       }
       tp.l1().setOnLongClickListener(new m$b(this));
       return;
    }
    public final a S8(){
       return this.s;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       Object obj = this.q8(HotSpotItem.class);
       a.o(obj, "inject\(HotSpotItem::class.java\)");
       this.p = obj;
       obj = this.q8(d.class);
       a.o(obj, "inject\(HotSpotInterestCardItem::class.java\)");
       this.q = obj;
       obj = this.q8(HotSpotFragment.class);
       a.o(obj, "inject\(HotSpotFragment::class.java\)");
       this.r = obj;
       return;
    }
}
