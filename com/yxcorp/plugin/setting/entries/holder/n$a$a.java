package com.yxcorp.plugin.setting.entries.holder.n$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.n$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.entries.holder.n;
import kgd.d0;
import kgd.e0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import erd.g;
import com.yxcorp.plugin.setting.utils.b;

public class n$a$a implements View$OnClickListener	// class@000878
{
    public final n$a b;

    public void n$a$a(n$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a$a.class, "1")) {
          return;
       }
       b.d(this.b.q.a, new d0(this), new e0(this));
       return;
    }
}
