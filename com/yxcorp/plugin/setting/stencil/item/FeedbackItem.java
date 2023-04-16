package com.yxcorp.plugin.setting.stencil.item.FeedbackItem;
import ihc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.stencil.item.FeedbackItem$action$1;
import msd.l;

public final class FeedbackItem extends a	// class@000914
{
    public final l r;

    public void FeedbackItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.r = new FeedbackItem$action$1(this);
    }
    public l getAction(){
       return this.r;
    }
}
