package com.yxcorp.gifshow.camera.record.album.n;
import com.yxcorp.gifshow.camera.bubble.b$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class n implements b$c	// class@001cbd
{
    public static final n a;

    static {
       n.a = new n();
    }
    public void n(){
       super();
    }
    public final void a(c p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("first_show_save_to_album_tips", false);
       g.a(uEditor);
    }
}
