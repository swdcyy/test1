package com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$b;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfileBackgroundPublishManager$b	// class@00122e
{
    public final boolean a;
    public final boolean b;
    public ImageSelectSupplier$c c;

    public void ProfileBackgroundPublishManager$b(boolean p0,boolean p1,ImageSelectSupplier$c p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final ImageSelectSupplier$c a(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundPublishManager$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfileBackgroundPublishManager$b && (this.a == p0.a && (this.b == p0.b && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       ProfileBackgroundPublishManager$b tc;
       ProfileBackgroundPublishManager$b obj = PatchProxy.apply(null, this, ProfileBackgroundPublishManager$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       ProfileBackgroundPublishManager$b tb = this.b;
       if (tb == null) {
          tc = tb;
       }
       i1 = (i1 + i) * 31;
       tc = this.c;
       i = (tc != null)? tc.hashCode(): 0;
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfileBackgroundPublishManager$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BgOptionConfig\(enableModifyVideo="+this.a+", enableAutoUpload="+this.b+", dialogConfig="+this.c+"\)";
    }
}
