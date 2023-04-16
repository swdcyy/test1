package com.yxcorp.plugin.setting.stencil.item.ECommercePromotionorItem;
import ihc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.stencil.item.ECommercePromotionorItem$action$1;
import msd.l;

public final class ECommercePromotionorItem extends a	// class@00090f
{
    public final l r;

    public void ECommercePromotionorItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.r = new ECommercePromotionorItem$action$1(this);
    }
    public l getAction(){
       return this.r;
    }
}
