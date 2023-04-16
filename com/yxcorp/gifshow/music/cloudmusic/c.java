package com.yxcorp.gifshow.music.cloudmusic.c;
import ekd.q$b;
import java.lang.Object;
import com.yxcorp.gifshow.model.MusicCategory;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;
import java.lang.String;

public final class c implements q$b	// class@001ff5
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final boolean a(Object p0){
       return (("favorite").equals(p0.mType) ^ 0x01);
    }
}
