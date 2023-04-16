package com.kwai.feature.api.danmaku.model.DanmakuWishMockData;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DanmakuWishMockData	// class@000e82
{
    public final int direction;
    public final ArrayList pictures;

    public final int a(){
       return this.direction;
    }
    public final ArrayList b(){
       return this.pictures;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DanmakuWishMockData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DanmakuWishMockData && (this.direction == p0.direction && a.g(this.pictures, p0.pictures)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, DanmakuWishMockData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.direction * 31;
       DanmakuWishMockData tpictures = this.pictures;
       int i1 = (tpictures != null)? tpictures.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DanmakuWishMockData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DanmakuWishMockData\(direction="+this.direction+", pictures="+this.pictures+"\)";
    }
}
