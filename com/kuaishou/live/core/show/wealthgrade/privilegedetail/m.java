package com.kuaishou.live.core.show.wealthgrade.privilegedetail.m;
import ya1.j$b;
import java.lang.Object;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import java.lang.String;
import km8.b;
import oe6.g;

public final class m implements j$b	// class@001277
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final void a(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"isWealthGradeProtectionReconfirmTipsDialogShowDisabled", p0);
       g.a(uEditor);
    }
}
