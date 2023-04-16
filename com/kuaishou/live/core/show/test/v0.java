package com.kuaishou.live.core.show.test.v0;
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

public final class v0 implements CompoundButton$OnCheckedChangeListener	// class@0011c6
{
    public static final v0 b;

    static {
       v0 ov0 = new v0();
       ov0.b = ov0;
    }
    public void v0(){
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("live_red_packet_skin_enable_toast", p1);
       g.a(uEditor);
       StringBuilder str = "展示测试toast->";
       String str1 = (p1)? "展示": "不展示";
       s.q(str+str1);
       return;
    }
}
