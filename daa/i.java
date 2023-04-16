package daa.i;
import daa.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.yxcorp.gifshow.easteregg.model.PokePosition;
import com.yxcorp.gifshow.easteregg.model.PokeSize;
import java.lang.StringBuilder;

public final class i implements f	// class@001ed4
{
    public final Boolean enableVibrate;
    public final PokeSize imageSize;
    public final String imageUrl;
    public final String lottieFileUrl;
    public final PokeSize lottieSize;
    public final PokePosition position;
    public final Long startTime;

    public final String a(){
       return this.imageUrl;
    }
    public final String b(){
       return this.lottieFileUrl;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof i && (a.g(this.startTime, p0.startTime) && (a.g(this.position, p0.position) && (a.g(this.enableVibrate, p0.enableVibrate) && (a.g(this.lottieFileUrl, p0.lottieFileUrl) && (a.g(this.lottieSize, p0.lottieSize) && (a.g(this.imageUrl, p0.imageUrl) && a.g(this.imageSize, p0.imageSize))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       i obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.startTime;
       i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       i tposition = this.position;
       int i2 = (tposition != null)? tposition.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tposition = this.enableVibrate;
       i2 = (tposition != null)? tposition.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tposition = this.lottieFileUrl;
       i2 = (tposition != null)? tposition.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tposition = this.lottieSize;
       i2 = (tposition != null)? tposition.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tposition = this.imageUrl;
       i2 = (tposition != null)? tposition.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tposition = this.imageSize;
       if (tposition != null) {
          i = tposition.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PokeExplodeFirework\(startTime="+this.startTime+", position="+this.position+", enableVibrate="+this.enableVibrate+", lottieFileUrl="+this.lottieFileUrl+", lottieSize="+this.lottieSize+", imageUrl="+this.imageUrl+", imageSize="+this.imageSize+"\)";
    }
}
