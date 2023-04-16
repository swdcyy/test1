package com.yxcorp.gifshow.record.album.w;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import m8c.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import k8c.n0;
import u07.u;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;

public final class w implements g	// class@001783
{
    public final LocalAlbumListFragment b;
    public final GifshowActivity c;
    public final e d;
    public final int e;
    public final String f;

    public void w(LocalAlbumListFragment p0,GifshowActivity p1,e p2,int p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       w tb = this.b;
       w tc = this.c;
       w td = this.d;
       w te = this.e;
       w tf = this.f;
       tb.w = false;
       if (p0.booleanValue()) {
          n0 on0 = new n0(tb, tc, td, te, tf);
          LocalAlbumUtils.D(tc, p0.booleanValue());
       }else {
          tb.gh(tc, td, te, 0, tf);
       }
       return;
    }
}
