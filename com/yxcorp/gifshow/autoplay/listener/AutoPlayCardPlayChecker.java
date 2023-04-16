package com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker;
import java.lang.Enum;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$1;
import java.lang.String;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$2;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$3;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$4;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$5;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker$6;
import android.graphics.Rect;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewGroup;

public class AutoPlayCardPlayChecker extends Enum	// class@001bef
{
    public Rect mRect;
    public static final AutoPlayCardPlayChecker[] $VALUES;
    public static final AutoPlayCardPlayChecker BOTTOM_ALL_TOP_ALL;
    public static final AutoPlayCardPlayChecker BOTTOM_HALF_TOP_ALL;
    public static final AutoPlayCardPlayChecker BOTTOM_HALF_TOP_HALF;
    public static final AutoPlayCardPlayChecker EXPLORE_SLIDE_ITEM_FULL;
    public static final AutoPlayCardPlayChecker ITEM_VERTICAL_PERCENT;
    public static final AutoPlayCardPlayChecker LEFT_HALF_RIGHT_HALF;

    static {
       AutoPlayCardPlayChecker$1 u1 = new AutoPlayCardPlayChecker$1("BOTTOM_HALF_TOP_HALF", 0);
       AutoPlayCardPlayChecker.BOTTOM_HALF_TOP_HALF = u1;
       AutoPlayCardPlayChecker$2 u2 = new AutoPlayCardPlayChecker$2("LEFT_HALF_RIGHT_HALF", 1);
       AutoPlayCardPlayChecker.LEFT_HALF_RIGHT_HALF = u2;
       AutoPlayCardPlayChecker$3 u3 = new AutoPlayCardPlayChecker$3("BOTTOM_HALF_TOP_ALL", 2);
       AutoPlayCardPlayChecker.BOTTOM_HALF_TOP_ALL = u3;
       AutoPlayCardPlayChecker$4 u4 = new AutoPlayCardPlayChecker$4("BOTTOM_ALL_TOP_ALL", 3);
       AutoPlayCardPlayChecker.BOTTOM_ALL_TOP_ALL = u4;
       AutoPlayCardPlayChecker$5 u5 = new AutoPlayCardPlayChecker$5("EXPLORE_SLIDE_ITEM_FULL", 4);
       AutoPlayCardPlayChecker.EXPLORE_SLIDE_ITEM_FULL = u5;
       AutoPlayCardPlayChecker$6 u6 = new AutoPlayCardPlayChecker$6("ITEM_VERTICAL_PERCENT", 5);
       AutoPlayCardPlayChecker.ITEM_VERTICAL_PERCENT = u6;
       AutoPlayCardPlayChecker[] uAutoPlayCar = new AutoPlayCardPlayChecker[]{u1,u2,u3,u4,u5,u6};
       AutoPlayCardPlayChecker.$VALUES = uAutoPlayCar;
    }
    public void AutoPlayCardPlayChecker(String p0,int p1){
       super(p0, p1);
       this.mRect = new Rect();
    }
    public void AutoPlayCardPlayChecker(String p0,int p1,AutoPlayCardPlayChecker$1 p2){
       super(p0, p1);
    }
    public static AutoPlayCardPlayChecker valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AutoPlayCardPlayChecker.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AutoPlayCardPlayChecker.class, p0);
    }
    public static AutoPlayCardPlayChecker[] values(){
       Object obj = PatchProxy.apply(null, null, AutoPlayCardPlayChecker.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AutoPlayCardPlayChecker.$VALUES.clone();
    }
    public boolean checkPlay(View p0,float p1){
       return false;
    }
    public boolean checkPlay(ViewGroup p0,View p1,View p2){
       return false;
    }
}
