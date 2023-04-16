package com.yxcorp.gifshow.camera.record.album.m;
import com.yxcorp.gifshow.camera.bubble.b$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class m implements b$c	// class@001cbc
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final void a(c p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("first_show_album_aggregation_tips", false);
       g.a(uEditor);
    }
}
