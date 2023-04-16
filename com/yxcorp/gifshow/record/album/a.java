package com.yxcorp.gifshow.record.album.a;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import k8c.e;
import java.lang.Runnable;
import ekd.k1;

public final class a implements g	// class@00170e
{
    public final LocalAlbumFragment b;

    public void a(LocalAlbumFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       k1.o(new e(tb, p0));
    }
}
