package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$a;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SwapMagicAlbumActivity$a	// class@001c19
{
    public QMedia a;
    public KSAssetExportInfo b;
    public boolean c;
    public boolean d;

    public void SwapMagicAlbumActivity$a(){
       super(null, null, false, false);
    }
    public void SwapMagicAlbumActivity$a(QMedia p0,KSAssetExportInfo p1,boolean p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final KSAssetExportInfo a(){
       return this.b;
    }
    public final QMedia b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwapMagicAlbumActivity$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SwapMagicAlbumActivity$a && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (this.c == p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SwapMagicAlbumActivity$a obj = PatchProxy.apply(null, this, SwapMagicAlbumActivity$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SwapMagicAlbumActivity$a tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (i1 + i) * 31;
       SwapMagicAlbumActivity$a tc = this.c;
       int i2 = 1;
       if (tc != null) {
          tc = 1;
       }
       i1 = (i1 + tc) * 31;
       tc = this.d;
       if (tc == null) {
          i2 = tc;
       }
       return (i1 + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SwapMagicAlbumActivity$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ClipStoreInfo\(media="+this.a+", ksAssetExportInfo="+this.b+", needSound="+this.c+", needClip="+this.d+"\)";
    }
}
