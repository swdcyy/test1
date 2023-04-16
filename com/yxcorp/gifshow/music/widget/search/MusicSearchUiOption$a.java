package com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$a;
import java.lang.Object;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$c;

public final class MusicSearchUiOption$a	// class@0020a7
{
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public MusicSearchUiOption$c e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    public void MusicSearchUiOption$a(){
       super();
       this.a = -1;
       this.b = -1;
       this.f = -1;
       this.g = -999;
       this.h = -999;
    }
    public final MusicSearchUiOption a(){
       Object obj = PatchProxy.apply(null, this, MusicSearchUiOption$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MusicSearchUiOption musicSearchU = new MusicSearchUiOption(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
       return obj;
    }
    public final MusicSearchUiOption$a b(int p0){
       this.f = p0;
       return this;
    }
    public final MusicSearchUiOption$a c(int p0){
       this.h = p0;
       return this;
    }
}
