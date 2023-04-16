package be8.l;
import z0.a;
import java.lang.Object;
import java.lang.String;

public final class l implements a	// class@000339
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public final Object apply(Object p0){
       if (("album").equalsIgnoreCase(p0)) {
          p0 = "从相册选取";
       }else if(("camera").equalsIgnoreCase(p0)){
          p0 = "拍摄";
       }
       return p0;
    }
}
