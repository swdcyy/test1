package com.yxcorp.plugin.setting.stencil.item.logout.LogoutItem;
import ihc.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.plugin.setting.stencil.item.logout.LogoutItem$action$1;
import msd.l;

public final class LogoutItem extends b	// class@000925
{
    public final int n;
    public final int o;
    public final l p;

    public void LogoutItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("LogoutShownSetPasswordDialog", false);
       g.a(uEditor);
       this.n = 0x7f0702e8;
       this.o = 0x7f061a83;
       this.p = new LogoutItem$action$1(this);
    }
    public int d(){
       return this.n;
    }
    public l getAction(){
       return this.p;
    }
    public int getTextColor(){
       return this.o;
    }
}
