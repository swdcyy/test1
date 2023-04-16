package com.yxcorp.gifshow.album.home.AlbumAssetFragment$mIsDefault$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public final class AlbumAssetFragment$mIsDefault$2 extends Lambda implements a	// class@0019e3
{
    public final AlbumAssetFragment this$0;

    public void AlbumAssetFragment$mIsDefault$2(AlbumAssetFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Bundle obj = PatchProxy.apply(null, this, AlbumAssetFragment$mIsDefault$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.getArguments();
       boolean b = false;
       if (obj != null) {
          b = obj.getBoolean("is_default", b);
       }
       return b;
    }
}
