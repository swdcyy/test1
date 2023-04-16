package com.yxcorp.gifshow.album.home.AlbumAssetFragment$mSceneType$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public final class AlbumAssetFragment$mSceneType$2 extends Lambda implements a	// class@0019e6
{
    public final AlbumAssetFragment this$0;

    public void AlbumAssetFragment$mSceneType$2(AlbumAssetFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Bundle obj = PatchProxy.apply(null, this, AlbumAssetFragment$mSceneType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.getArguments();
       String str = "tab_all";
       if (obj != null) {
          String str1 = obj.getString("album_scene_type", str);
          if (str1 != null) {
             str = str1;
          }
       }
       return str;
    }
}
