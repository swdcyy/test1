package com.yxcorp.gifshow.camera.record.sidebar.d;
import com.yxcorp.gifshow.camera.bubble.b$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.camera.record.sidebar.g;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class d implements b$c	// class@000f13
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final void a(c p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("is_side_bar_fold_btn_shown", true);
       g.a(uEditor);
    }
}
