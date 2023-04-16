package ci4.a;
import ye4.c;
import ci4.a$a;
import nsd.u;
import android.app.Activity;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.RuleItem;
import java.lang.CharSequence;
import android.widget.TextView;
import android.net.Uri;
import ci4.a$b;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import ekd.m1;

public final class a extends c	// class@000473
{
    public TextView e;
    public TextView f;
    public MerchantKwaiImageView g;
    public static final a$a h;

    static {
       a.h = new a$a(null);
    }
    public void a(Activity p0){
       super(p0);
    }
    public static final MerchantKwaiImageView h(a p0){
       p0 = p0.g;
       if (p0 == null) {
          a.S("mImageView");
       }
       return p0;
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (!p0 instanceof RuleItem) {
          return;
       }
       a te = this.e;
       if (te == null) {
          a.S("mTitleView");
       }
       te.setText(p0.mTitle);
       te = this.f;
       if (te == null) {
          a.S("mDescriptionView");
       }
       te.setText(p0.mContent);
       te = this.g;
       if (te == null) {
          a.S("mImageView");
       }
       te.B(Uri.parse(p0.mIconUrl), 0, 0, new a$b(this));
       return;
    }
    public int c(){
       return 0x7f0d066f;
    }
    public void g(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a14da);
       this.f = m1.f(p0, 0x7f0a14d8);
       this.g = m1.f(p0, 0x7f0a14d9);
       return;
    }
}
