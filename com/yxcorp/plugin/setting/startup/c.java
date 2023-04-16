package com.yxcorp.plugin.setting.startup.c;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.plugin.setting.startup.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.plugin.setting.startup.SettingStartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yfd.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import lt7.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.sdk.switchconfig.a;
import wkd.b;
import qgd.a;
import brd.t;
import cjd.e;
import erd.o;
import ugd.a;
import erd.a;
import com.yxcorp.plugin.setting.startup.b;
import erd.g;
import crd.b;

public class c extends ConfigAutoParseJsonConsumer	// class@0008f0
{
    public b e;

    public void c(){
       super(a.b);
       this.e = null;
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean(b.d("user")+"EnableShowAlbumTab", p0.mEnableShowAlbumTab);
          uEditor.putString(b.d("user")+"incentive_activity", b.e(p0.mIncentiveActivityInfo));
          uEditor.putString(b.d("user")+"IncentivePlansConfig", b.e(p0.mIncentivePlansConfig));
          g.a(uEditor);
          if (b.a() && (QCurrentUser.ME.isLogined() && !a.t().d("disableRelationKnockedDialogInfo", false))) {
             this.e = b.a(0x2730586).a().map(new e()).doFinally(new a(this)).subscribe(b.b);
          }
       }
       return;
    }
}
