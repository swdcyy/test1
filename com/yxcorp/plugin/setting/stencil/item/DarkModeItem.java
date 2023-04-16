package com.yxcorp.plugin.setting.stencil.item.DarkModeItem;
import ihc.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.stencil.item.DarkModeItem$action$1;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import ihc.a;
import zf6.k;
import android.content.Context;

public final class DarkModeItem extends c	// class@00090d
{
    public final l s;

    public void DarkModeItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.s = new DarkModeItem$action$1(this);
    }
    public l getAction(){
       return this.s;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, DarkModeItem.class, "1")) {
          return;
       }
       MutableLiveData status = this.getStatus();
       String str = (k.d())? this.b.getString(R.string.arg_RES_7f1009c5): this.b.getString(R.string.arg_RES_7f1009c4);
       status.setValue(str);
       return;
    }
}
