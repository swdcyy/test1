package com.yxcorp.gifshow.v3.editor.music_v2.a;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo;

public final class a implements g	// class@00105d
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void subscribe(v p0){
       LyricRepo.b().e(p0);
    }
}
