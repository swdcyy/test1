package com.yxcorp.plugin.setting.activity.i;
import ga.n0$a;
import com.yxcorp.plugin.setting.activity.PushSilenceSettingActivity;
import java.lang.Object;
import java.util.Date;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.text.SimpleDateFormat;
import com.yxcorp.gifshow.util.DateUtils;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import cjd.e;
import erd.o;
import zfd.o;
import sfc.a;
import erd.g;
import crd.b;

public class i implements n0$a	// class@000825
{
    public final PushSilenceSettingActivity a;

    public void i(PushSilenceSettingActivity p0){
       this.a = p0;
       super();
    }
    public void a(Date p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "1")) {
          return;
       }
       String str = DateUtils.n("HH:mm").format(p0);
       o oo = new o(this, str);
       b.a(0x330163e).updatePushSwitchStatus(15, 7, this.a.G, str).map(new e()).subscribe(oo, new a());
       return;
    }
    public void onCancel(){
    }
}
