package com.kuaishou.live.core.show.test.t0;
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

public final class t0 implements CompoundButton$OnCheckedChangeListener	// class@0011c2
{
    public static final t0 b;

    static {
       t0.b = new t0();
    }
    public void t0(){
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("live_red_packet_new_style_v2_enable", p1);
       g.a(uEditor);
       StringBuilder str = "红包新样式->";
       String str1 = (p1)? "展示": "不展示";
       s.q(str+str1);
       return;
    }
}
