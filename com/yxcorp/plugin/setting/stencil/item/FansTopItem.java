package com.yxcorp.plugin.setting.stencil.item.FansTopItem;
import ihc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import oe6.b;
import com.yxcorp.plugin.setting.stencil.item.FansTopTagStyle;
import java.lang.Enum;
import com.yxcorp.plugin.setting.stencil.item.FansTopItem$action$1;
import msd.l;

public final class FansTopItem extends a	// class@000911
{
    public final int r;
    public final int s;
    public final l t;

    public void FansTopItem(BaseFragment p0,SettingItemStencil p1){
       int i;
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.r = 0x7f07030a;
       if (b.t() == FansTopTagStyle.CARD.ordinal()) {
          i = 0x7f081f94;
       }else if(b.t() == FansTopTagStyle.FREECARD.ordinal()){
          i = 0x7f081f95;
       }else {
          i = 0;
       }
       this.s = i;
       this.t = new FansTopItem$action$1(this);
       return;
    }
    public int e(){
       return this.r;
    }
    public l getAction(){
       return this.t;
    }
    public int j(){
       return this.s;
    }
}
