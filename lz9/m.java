package lz9.m;
import erd.g;
import java.lang.Object;
import rd5.g;
import lz9.b0;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import java.lang.System;
import java.lang.String;
import oe6.g;

public final class m implements g	// class@002ee3
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final void accept(Object p0){
       g.a(n.b().edit().putLong("PREF_KEY_SHOW_COMMENT_LAST_CLICK", System.currentTimeMillis()));
    }
}
