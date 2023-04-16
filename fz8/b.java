package fz8.b;
import android.text.style.ClickableSpan;
import fz8.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import e3a.a;
import com.kuaishou.webkit.URLUtil;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import k59.c2;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import k59.c2$a;
import android.text.TextPaint;
import lnc.a1;

public final class b extends ClickableSpan	// class@0023a4
{
    public final a b;
    public final PhotoAdvertisement$HalfPrivacyLink c;

    public void b(a p0,PhotoAdvertisement$HalfPrivacyLink p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "widget");
       Activity uActivity = a.b(this.b.getContext());
       if (uActivity != null && URLUtil.isNetworkUrl(this.c.mLinkUrl)) {
          a q = this.b.q;
          if (q == null) {
             a.S("mPhoto");
          }
          BaseFeed entity = q.getEntity();
          if (entity != null) {
             a.o(uActivity, "activity");
             PhotoAdvertisement$HalfPrivacyLink mLinkUrl = this.c.mLinkUrl;
             a.o(mLinkUrl, "link.mLinkUrl");
             c2$a.a(b.a(0xdb243e0), uActivity, new PhotoAdDataWrapper(entity), mLinkUrl, false, 8, null);
          }
       }
    label_005a :
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "ds");
       p0.setColor(a1.a(R.color.arg_RES_7f061db8));
       p0.setUnderlineText(true);
       return;
    }
}
