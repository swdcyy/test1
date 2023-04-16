package com.yxcorp.gifshow.camera.record.photo.c;
import com.yxcorp.gifshow.camera.bubble.b$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class c implements b$c	// class@000ea5
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void a(c p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("take_picture_hd_tip_unshown", false);
       g.a(uEditor);
    }
}
