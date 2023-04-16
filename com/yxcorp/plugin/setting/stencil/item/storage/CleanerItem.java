package com.yxcorp.plugin.setting.stencil.item.storage.CleanerItem;
import ihc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.plugin.setting.stencil.item.storage.CleanerItem$action$1;
import msd.l;

public final class CleanerItem extends a	// class@00092b
{
    public final String r;
    public final int s;
    public final String t;
    public final l u;

    public void CleanerItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       String str = this.b.getString(R.string.arg_RES_7f100594);
       a.o(str, "context.getString\(R.string.cleaner_clean_rubbish\)");
       this.r = str;
       this.s = 0x7f081f8a;
       this.u = new CleanerItem$action$1(this);
    }
    public int c(){
       return this.s;
    }
    public l getAction(){
       return this.u;
    }
    public String getIconUrl(){
       return this.t;
    }
    public String getTitle(){
       return this.r;
    }
}
