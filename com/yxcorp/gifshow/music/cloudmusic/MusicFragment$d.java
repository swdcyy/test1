package com.yxcorp.gifshow.music.cloudmusic.MusicFragment$d;
import ok.h;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import upb.a;
import upb.f;
import brd.t;
import cjd.e;
import erd.o;
import lob.d0;
import com.yxcorp.gifshow.music.cloudmusic.f;
import erd.g;

public class MusicFragment$d implements h	// class@001fe5
{
    public final MusicFragment b;

    public void MusicFragment$d(MusicFragment p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MusicFragment$d.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = f.a().a(this.b.u).map(new e()).subscribe(new d0(this), new f(this));
       }
       return p0;
    }
}
