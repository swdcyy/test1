package com.yxcorp.plugin.setting.activity.a;
import android.view.View$OnLongClickListener;
import com.yxcorp.plugin.setting.activity.AboutUsActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import mz6.b;
import android.content.Context;
import java.lang.CharSequence;
import mz6.b$d;
import java.util.Collection;
import zfd.c;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public class a implements View$OnLongClickListener	// class@00081d
{
    public final AboutUsActivity b;

    public void a(AboutUsActivity p0){
       this.b = p0;
       super();
    }
    public boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       ArrayList uArrayList = new ArrayList();
       b uob = new b(this.b);
       uob.o("反馈日志");
       uArrayList.add(new b$d("上传到服务器"));
       uArrayList.add(new b$d("转发到其它APP"));
       uob.b(uArrayList);
       uob.l(new c(this));
       uob.q();
       return true;
    }
}
