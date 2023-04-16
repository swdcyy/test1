package ok1.h;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem;
import com.kuaishou.live.bottombar.component.widget.d;
import z1.a;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok1.g;
import msd.a;
import k51.b;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import z61.b;
import ok1.c;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Float;
import java.lang.Integer;
import android.widget.ImageView;
import java.lang.Boolean;
import ac.a;

public class h extends d implements LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem	// class@003524
{
    public final a k;
    public KwaiImageView l;
    public View m;

    public void h(a p0){
       super();
       this.k = p0;
    }
    public View C(Context p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b("LiveBottomBarGiftViewItem::createView", new g(this, p0, p1));
    }
    public void D(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "10")) {
          return;
       }
       this.l = m1.f(p0, 0x7f0a1cfe);
       this.m = m1.f(p0, 0x7f0a1a96);
       return;
    }
    public void F(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "11")) {
          return;
       }
       if (!p0 instanceof c) {
          return;
       }
       c e = p0.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(this, e, LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem.class, "1")) {
          Iterator iterator = e.b.values().iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa != null) {
                uoa.accept(this);
             }
          }
          e.b.clear();
       }
       this.l.setPlaceHolderImage(p0.b);
       return;
    }
    public void b(float p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oh, "2")) {
          return;
       }
       oh = this.m;
       if (oh != null) {
          oh.setAlpha(p0);
       }
       return;
    }
    public void m(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "6")) {
          return;
       }
       oh = this.l;
       if (oh != null) {
          oh.setBackgroundResource(p0);
       }
       return;
    }
    public void o(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "3")) {
          return;
       }
       oh = this.l;
       if (oh != null) {
          oh.y(p0, 0, 0);
       }
       return;
    }
    public void q(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "7")) {
          return;
       }
       this.m(p0);
       return;
    }
    public void setEnabled(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "1")) {
          return;
       }
       oh = this.m;
       if (oh != null) {
          oh.setEnabled(p0);
       }
       return;
    }
    public void x(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       h tl = this.l;
       if (tl != null) {
          tl.setController(p0);
       }
       return;
    }
}
