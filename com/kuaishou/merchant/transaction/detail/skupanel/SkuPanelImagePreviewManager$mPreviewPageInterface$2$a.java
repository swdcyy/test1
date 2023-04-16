package com.kuaishou.merchant.transaction.detail.skupanel.SkuPanelImagePreviewManager$mPreviewPageInterface$2$a;
import ix7.a0;
import com.kuaishou.merchant.transaction.detail.skupanel.SkuPanelImagePreviewManager$mPreviewPageInterface$2;
import java.lang.Object;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ix7.z;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.merchant.transaction.detail.skupanel.SkuPanelImagePreviewManager;
import java.util.List;
import kx7.c;
import java.util.Objects;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.PreviewAnchorInfo;
import com.kuaishou.merchant.transaction.detail.skupanel.SkuPanelImagePreviewManager$a;
import com.kuaishou.merchant.transaction.base.sku.c;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification$PropValue;

public final class SkuPanelImagePreviewManager$mPreviewPageInterface$2$a implements a0	// class@000778
{
    public final SkuPanelImagePreviewManager$mPreviewPageInterface$2 a;

    public void SkuPanelImagePreviewManager$mPreviewPageInterface$2$a(SkuPanelImagePreviewManager$mPreviewPageInterface$2 p0){
       this.a = p0;
       super();
    }
    public BaseFragment a(Context p0){
       return z.a(this, p0);
    }
    public void b(int p0){
       SkuPanelImagePreviewManager$mPreviewPageInterface$2$a omPreviewPag = SkuPanelImagePreviewManager$mPreviewPageInterface$2$a.class;
       if (PatchProxy.isSupport(omPreviewPag) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, omPreviewPag, "1")) {
          return;
       }
       z.b(this, p0);
       SkuPanelImagePreviewManager a = this.a.this$0.a;
       if (a == null || (p0 >= 0 && p0 < a.size())) {
          SkuPanelImagePreviewManager$mPreviewPageInterface$2 obj = a.get(p0).a();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.merchant.transaction.detail.self.selfdetail.model.PreviewAnchorInfo");
          a = this.a.this$0.c;
          if (a != null) {
             a.b(obj);
          }
          if (obj.isMainImage()) {
             obj = this.a.this$0;
             a = obj.d;
             if (a != null) {
                obj.a().n(Long.valueOf(a.getPropValueId()), false);
             }
             return;
          }else {
             c uoc = this.a.this$0.a();
             Long longx = Long.valueOf(obj.getPropValueId());
             SkuPanelImagePreviewManager b = this.a.this$0.b;
             Objects.requireNonNull(uoc);
             Object obj1 = PatchProxy.applyTwoRefs(longx, b, uoc, c.class, "12");
             boolean b1 = true;
             boolean b2 = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): uoc.o(longx, b, b1);
             if (!b2) {
                SkuPanelImagePreviewManager$mPreviewPageInterface$2 this$0 = this.a.this$0;
                Objects.requireNonNull(this$0);
                if (!PatchProxy.applyVoidOneRefs(obj, this$0, SkuPanelImagePreviewManager.class, "3")) {
                   Iterator iterator = new ArrayList(this$0.h.d.values()).iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (iterator.next().mPropValueId - obj.getPropValueId()) {
                            continue ;
                         }
                      }else {
                         b1 = 0;
                      }
                      if (b1) {
                         SkuPanelImagePreviewManager d = this$0.d;
                         if (d != null) {
                            this$0.h.n(Long.valueOf(d.getPropValueId()), false);
                         }
                         a = this$0.c;
                         if (a != null) {
                            a.a(obj);
                            break ;
                         }
                      }
                   }
                }
             }
          }
       }
    label_00ef :
       return;
    }
    public void c(int p0){
       z.c(this, p0);
    }
}
