package com.yxcorp.gifshow.album.home.AlbumAssetFragment$mType$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.Integer;

public final class AlbumAssetFragment$mType$2 extends Lambda implements a	// class@0019e8
{
    public final AlbumAssetFragment this$0;

    public void AlbumAssetFragment$mType$2(AlbumAssetFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       Bundle obj = PatchProxy.apply(null, this, AlbumAssetFragment$mType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.this$0.getArguments();
       int i = 1;
       if (obj != null) {
          i = obj.getInt("album_type", i);
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
