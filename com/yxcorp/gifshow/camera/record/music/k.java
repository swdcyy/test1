package com.yxcorp.gifshow.camera.record.music.k;
import com.yxcorp.gifshow.camera.bubble.b$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.camera.record.music.n;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class k implements b$c	// class@000e83
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final void a(c p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("is_need_show_ktv_guide_bubble", false);
       g.a(uEditor);
    }
}
