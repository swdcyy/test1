package com.yxcorp.plugin.setting.entries.holder.g$a$d;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.entries.holder.g$a;
import java.lang.String;
import erd.g;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.plugin.setting.entries.holder.g;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;

public class g$a$d implements SlipSwitchButton$b	// class@000856
{
    public j a;
    public final String b;
    public final g c;
    public final g$a d;

    public void g$a$d(g$a p0,String p1,g p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       g$a$d uoa$d = g$a$d.class;
       if (PatchProxy.isSupport(uoa$d) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa$d, "1")) {
          return;
       }
       g$a$d ta = this.a;
       g$a$d tb = this.b;
       boolean b = (tb.equals("not_recommend_to_contacts") != p1)? true: false;
       ta.n(p0, tb, b, this.d.r.e, this.c);
       return;
    }
}
