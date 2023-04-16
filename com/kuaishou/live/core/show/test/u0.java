package com.kuaishou.live.core.show.test.u0;
import android.widget.CompoundButton$OnCheckedChangeListener;
import java.lang.Object;
import android.widget.CompoundButton;
import s81.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import e17.i;
import e17.s;

public final class u0 implements CompoundButton$OnCheckedChangeListener	// class@0011c4
{
    public static final u0 b;

    static {
       u0.b = new u0();
    }
    public void u0(){
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("live_red_packet_skin_cdn_resize_enable", p1);
       g.a(uEditor);
       StringBuilder str = "设置cdn resize 成功->";
       String str1 = (p1)? "打开": "关闭";
       s.q(str+str1);
       return;
    }
}
