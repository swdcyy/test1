package com.yxcorp.gifshow.album.home.AlbumFragment$k;
import androidx.lifecycle.Observer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class AlbumFragment$k implements Observer	// class@0019f6
{
    public static final AlbumFragment$k b;

    static {
       AlbumFragment$k.b = new AlbumFragment$k();
    }
    public void AlbumFragment$k(){
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumFragment$k.class, "1")) {
       }else {
          Log.g("AlbumFragment", "currentSceneType="+p0);
       }
       return;
    }
}
