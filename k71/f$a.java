package k71.f$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f$a	// class@002cac
{
    public final String backgroundImage;
    public final String buttonText;
    public final String rewardIcon;
    public final String subTitle;
    public final String taskType;
    public final String title;

    public final String a(){
       return this.buttonText;
    }
    public final String b(){
       return this.taskType;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f$a && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.rewardIcon, p0.rewardIcon) && (a.g(this.buttonText, p0.buttonText) && (a.g(this.backgroundImage, p0.backgroundImage) && a.g(this.taskType, p0.taskType)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       f$a obj = PatchProxy.apply(null, this, f$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       f$a tsubTitle = this.subTitle;
       int i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.rewardIcon;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.buttonText;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.backgroundImage;
       i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.taskType;
       if (tsubTitle != null) {
          i = tsubTitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(title="+this.title+", subTitle="+this.subTitle+", rewardIcon="+this.rewardIcon+", buttonText="+this.buttonText+", backgroundImage="+this.backgroundImage+", taskType="+this.taskType+"\)";
    }
}
