package com.yxcorp.gifshow.album.selected.interact.AlbumSelectControllerImpl$selectItemStatus$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import java.lang.Integer;

public final class AlbumSelectControllerImpl$selectItemStatus$2 extends Lambda implements a	// class@001ac2
{
    public static final AlbumSelectControllerImpl$selectItemStatus$2 INSTANCE;

    static {
       AlbumSelectControllerImpl$selectItemStatus$2.INSTANCE = new AlbumSelectControllerImpl$selectItemStatus$2();
    }
    public void AlbumSelectControllerImpl$selectItemStatus$2(){
       super(0);
    }
    public final MutableLiveData invoke(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectControllerImpl$selectItemStatus$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MutableLiveData(new Pair(Integer.valueOf(0), null));
    }
    public Object invoke(){
       return this.invoke();
    }
}
