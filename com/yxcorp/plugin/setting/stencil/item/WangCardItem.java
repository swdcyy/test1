package com.yxcorp.plugin.setting.stencil.item.WangCardItem;
import ihc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.stencil.item.WangCardItem$action$1;
import msd.l;

public final class WangCardItem extends a	// class@00091f
{
    public final l r;

    public void WangCardItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.r = new WangCardItem$action$1(this, p1);
    }
    public l getAction(){
       return this.r;
    }
}
