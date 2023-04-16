package com.kwai.video.waynelive.quality.a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.video.waynelive.quality.LiveQualityManager;

public final class a implements Comparator	// class@000e18
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return LiveQualityManager.lambda$new$0(p0, p1);
    }
}
