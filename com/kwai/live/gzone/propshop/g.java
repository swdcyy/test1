package com.kwai.live.gzone.propshop.g;
import u07.u;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kwai.live.gzone.propshop.h;
import f37.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class g implements u	// class@000de4
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void a(t p0,View p1){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("isShowLiabilityExemptionDialog", false);
       g.a(uEditor);
    }
}
