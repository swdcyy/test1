package com.kwai.video.clipkit.utils.Utils$Size;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class Utils$Size	// class@001afd
{
    public static int height;
    public static int width;

    public void Utils$Size(){
       super();
    }
    public void Utils$Size(int p0,int p1){
       super();
       Utils$Size.width = p0;
       Utils$Size.height = p1;
    }
    public static Rect getRectWithRatioKept(long p0,long p1,long p2,long p3){
       long l1;
       long l2;
       long l3;
       if (PatchProxy.isSupport(Utils$Size.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), null, Utils$Size.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = 0;
       if (p0 - l && p1 - l) {
          l1 = p0 * p3;
          l2 = p2 * p1;
          l3 = 2;
          if (l1 - l2 > 0) {
             l2 = l2 / p0;
             l1 = (p3 - l2) / l3;
             l2 = l2 + l1;
             l3 = l1;
             l1 = p2;
          }else {
             l1 = l1 / p1;
             l2 = (p2 - l1) / l3;
             l1 = l1 + l2;
             l3 = l;
             l = l2;
             l2 = p3;
          }
       }else {
          l1 = p2;
          l2 = p3;
          l3 = l;
       }
       return new Rect((int)l, (int)l3, (int)l1, (int)l2);
    }
    public String toString(){
       Object[] obj = PatchProxy.apply(null, this, Utils$Size.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{Integer.valueOf(Utils$Size.width),Integer.valueOf(Utils$Size.height)};
       return String.format("Size[width=%d,height=%d]", obj);
    }
}
