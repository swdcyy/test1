package com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class c implements g	// class@001136
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("AudioRecordController", "audio record state", p0);
    }
}
