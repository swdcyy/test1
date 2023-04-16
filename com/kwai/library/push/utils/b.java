package com.kwai.library.push.utils.b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import android.app.Activity;
import com.kwai.library.push.utils.InPushSettingExt;
import u07.t$a;
import java.lang.CharSequence;
import qy6.a;
import u07.u;
import com.kwai.library.push.utils.a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class b implements Runnable	// class@0008db
{
    public final String b;

    public void b(String p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       t$a uoa = new t$a(InPushSettingExt.c());
       uoa.X0("发送inApp提醒失败");
       uoa.z0(tb);
       uoa.T0("复制");
       uoa.R0("确定");
       uoa.u0(new a(tb));
       uoa.L(a.b);
       f.e(uoa).Y(PopupInterface.a);
    }
}
