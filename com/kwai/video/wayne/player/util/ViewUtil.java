package com.kwai.video.wayne.player.util.ViewUtil;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import android.content.res.Resources;
import android.content.Context;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import android.view.WindowManager;
import android.view.Display;

public class ViewUtil	// class@000dc3
{
    public static int mDeviceHeight;
    public static int mDeviceWidth;

    static {
       ViewUtil.mDeviceWidth = c.c(WaynePlayerInitor.APP_CONTEXT.getResources()).widthPixels;
       ViewUtil.mDeviceHeight = c.c(WaynePlayerInitor.APP_CONTEXT.getResources()).heightPixels;
    }
    public void ViewUtil(){
       super();
    }
    public static int getScreenRealHeight(){
       Object obj = PatchProxy.apply(null, null, ViewUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (InjectConfig.getConfig().enableViewUtilNewMethod()) {
          return ViewUtil.mDeviceHeight;
       }
       return ViewUtil.getScreenRealHeight(WaynePlayerInitor.APP_CONTEXT);
    }
    public static int getScreenRealHeight(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       c.d(p0.getSystemService("window").getDefaultDisplay(), uDisplayMetr);
       return uDisplayMetr.heightPixels;
    }
    public static int getScreenWidth(){
       Object obj = PatchProxy.apply(null, null, ViewUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (InjectConfig.getConfig().enableViewUtilNewMethod()) {
          return ViewUtil.mDeviceWidth;
       }
       return ViewUtil.getScreenWidth(WaynePlayerInitor.APP_CONTEXT);
    }
    public static int getScreenWidth(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.widthPixels;
    }
}
