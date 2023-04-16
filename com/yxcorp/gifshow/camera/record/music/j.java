package com.yxcorp.gifshow.camera.record.music.j;
import com.yxcorp.gifshow.camera.bubble.b$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.camera.record.music.n;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import java.lang.String;
import km8.b;
import oe6.g;

public final class j implements b$c	// class@000e82
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final void a(c p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"FirstShowSwitchMusicHint", false);
       g.a(uEditor);
    }
}
