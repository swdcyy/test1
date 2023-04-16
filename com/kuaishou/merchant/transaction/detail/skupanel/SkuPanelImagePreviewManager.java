package com.kuaishou.merchant.transaction.detail.skupanel.SkuPanelImagePreviewManager;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.List;
import com.kuaishou.merchant.transaction.base.sku.c;
import java.lang.Object;
import com.kuaishou.merchant.transaction.detail.skupanel.SkuPanelImagePreviewManager$mPreviewPageInterface$2;
import msd.a;
import qrd.p;
import qrd.s;

public final class SkuPanelImagePreviewManager	// class@00077a
{
    public List a;
    public SkuInfo b;
    public SkuPanelImagePreviewManager$a c;
    public PreviewAnchorInfo d;
    public final p e;
    public GifshowActivity f;
    public List g;
    public c h;

    public void SkuPanelImagePreviewManager(GifshowActivity p0,List p1,c p2){
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.e = s.c(new SkuPanelImagePreviewManager$mPreviewPageInterface$2(this));
    }
    public final c a(){
       return this.h;
    }
}
