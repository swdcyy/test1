package com.yxcorp.plugin.setting.activity.UserSettingsUpdateActivity$a$a;
import u07.u;
import com.yxcorp.plugin.setting.activity.UserSettingsUpdateActivity$a;
import com.yxcorp.gifshow.model.SelectOption;
import xgc.e;
import android.view.View;
import java.lang.Object;
import u07.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import com.yxcorp.plugin.setting.activity.UserSettingsUpdateActivity;
import com.yxcorp.gifshow.settings.holder.SettingSelectData;
import java.lang.Integer;
import brd.t;
import zfd.s;
import sfc.a;
import erd.g;
import crd.b;

public class UserSettingsUpdateActivity$a$a implements u	// class@00081a
{
    public final SelectOption b;
    public final e c;
    public final View d;
    public final UserSettingsUpdateActivity$a e;

    public void UserSettingsUpdateActivity$a$a(UserSettingsUpdateActivity$a p0,SelectOption p1,e p2,View p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserSettingsUpdateActivity$a$a.class, "1")) {
          return;
       }
       b.a(0x330163e).changePrivateOption(this.e.a.z.mKey, Integer.valueOf(this.b.mValue).toString()).subscribe(new s(this, this.c, this.b, this.d), new a());
       return;
    }
}
