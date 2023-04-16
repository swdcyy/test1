package com.yxcorp.gifshow.album.home.AlbumAssetFragment$fetchTimeListFromLoader$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import k79.f;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import q79.d;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import jlb.b;

public final class AlbumAssetFragment$fetchTimeListFromLoader$$inlined$let$lambda$1 extends Lambda implements l	// class@0019d9
{
    public final f $loader$inlined;
    public final AlbumAssetFragment this$0;

    public void AlbumAssetFragment$fetchTimeListFromLoader$$inlined$let$lambda$1(AlbumAssetFragment p0,f p1){
       this.this$0 = p0;
       this.$loader$inlined = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(QMedia p0){
       AlbumAssetFragment$fetchTimeListFromLoader$$inlined$let$lambda$1 obj = PatchProxy.applyOneRefsWithListener(p0, this, AlbumAssetFragment$fetchTimeListFromLoader$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "media");
       obj = this.this$0;
       boolean b = obj.ih(p0, obj.rh().v0().getValue());
       PatchProxy.onMethodExit(AlbumAssetFragment$fetchTimeListFromLoader$$inlined$let$lambda$1.class, "1");
       return b;
    }
}
