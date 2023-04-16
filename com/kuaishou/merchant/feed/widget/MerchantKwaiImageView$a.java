package com.kuaishou.merchant.feed.widget.MerchantKwaiImageView$a;
import rb.g;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import java.lang.Object;
import rb.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Set;
import com.facebook.imagepipeline.request.ImageRequest;
import android.net.Uri;

public class MerchantKwaiImageView$a implements g	// class@0016b8
{
    public final MerchantKwaiImageView a;

    public void MerchantKwaiImageView$a(MerchantKwaiImageView p0){
       this.a = p0;
       super();
    }
    public void a(f p0,int p1){
       MerchantKwaiImageView$a uoa = MerchantKwaiImageView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (3 == p1 && p0 != null) {
          this.a.z.clear();
          if (p0.e() != null) {
             ImageRequest[] imageRequest = p0.e();
             int len = imageRequest.length;
             for (int i = 0; i < len; i = i + 1) {
                this.a.z.add(imageRequest[i].s().toString());
             }
          }
          if (this.a.z.isEmpty() && p0.p() != null) {
             this.a.z.add(p0.p().s().toString());
          }
       }else if(5 == p1){
          this.a.z.clear();
       }
       MerchantKwaiImageView d = this.a.D;
       if (d != null) {
          d.a(p0, p1);
       }
       return;
    }
    public void b(f p0,int p1){
       MerchantKwaiImageView$a uoa = MerchantKwaiImageView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       MerchantKwaiImageView d = this.a.D;
       if (d != null) {
          d.b(p0, p1);
       }
       return;
    }
}
