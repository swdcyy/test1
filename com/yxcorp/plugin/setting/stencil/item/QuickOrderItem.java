package com.yxcorp.plugin.setting.stencil.item.QuickOrderItem;
import ihc.a;
import com.yxcorp.plugin.setting.stencil.item.QuickOrderItem$a;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.stencil.item.QuickOrderItem$action$1;
import msd.l;

public final class QuickOrderItem extends a	// class@000919
{
    public final l r;
    public static final QuickOrderItem$a s;

    static {
       QuickOrderItem.s = new QuickOrderItem$a(null);
    }
    public void QuickOrderItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.r = new QuickOrderItem$action$1(this);
    }
    public l getAction(){
       return this.r;
    }
}
