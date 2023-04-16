package com.yxcorp.plugin.setting.activity.PushSettingsActivity$b;
import erd.g;
import com.yxcorp.plugin.setting.activity.PushSettingsActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.yxcorp.gifshow.model.response.PushStatusResponse;
import com.google.gson.Gson;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.yxcorp.plugin.setting.activity.e;
import android.view.View$OnClickListener;

public class PushSettingsActivity$b implements g	// class@000811
{
    public final PushSettingsActivity b;

    public void PushSettingsActivity$b(PushSettingsActivity p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushSettingsActivity$b.class, "1")) {
       }else {
          p0 = e.y();
          if (!TextUtils.x(p0)) {
             this.b.z = a.a.h(p0, PushStatusResponse.class);
             p0 = this.b.A;
             if (p0 != null) {
                p0.dismiss();
             }
             this.b.v3(true);
          }else {
             p0 = this.b.A;
             if (p0 != null) {
                p0.dismiss();
             }
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.p(new e(this));
             uoa.a(c.h(this.b.y.j, b.g));
          }
       }
       return;
    }
}
