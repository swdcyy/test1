package com.yxcorp.plugin.setting.activity.c;
import erd.g;
import com.yxcorp.plugin.setting.activity.CalendarSettingActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import yfd.a;
import java.lang.StringBuilder;
import java.lang.String;
import km8.b;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.yxcorp.plugin.setting.stencil.entity.CalendarSettingConfig;
import java.lang.Class;
import com.google.gson.Gson;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import zfd.h;
import android.view.View$OnClickListener;

public final class c implements g	// class@00081f
{
    public final CalendarSettingActivity b;

    public void c(CalendarSettingActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       p0 = a.a.getString(b.d("user")+"lastCalendarSetting", "");
       if (!TextUtils.x(p0)) {
          tb.z = a.a.h(p0, CalendarSettingConfig.class);
          p0 = tb.A;
          if (p0 != null) {
             p0.dismiss();
          }
          tb.v3();
       }else {
          p0 = tb.A;
          if (p0 != null) {
             p0.dismiss();
          }
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.p(new h(tb));
          uoa.a(c.h(tb.y.j, b.g));
       }
       return;
    }
}
