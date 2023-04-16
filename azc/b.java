package azc.b;
import zf6.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;
import czc.a;
import android.util.DisplayMetrics;
import java.lang.String;
import java.lang.Object;
import android.view.WindowManager;
import android.view.Display;
import java.lang.Math;
import cw9.c;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;

public class b extends a	// class@000310
{
    public float h;
    public float i;

    public void b(Context p0,float p1,float p2){
       super(p0, 0);
       this.h = p1;
       this.i = p2;
    }
    public static Context f(Context p0,int p1,boolean p2,boolean p3){
       DisplayMetrics uDisplayMetr;
       int a;
       Configuration configuratio = p0.getResources().getConfiguration();
       if (p3 || !p2) {
          if (a.a <= 0) {
             try{
                uDisplayMetr = new DisplayMetrics();
                p0.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
                a.a = (int)((float)Math.min(uDisplayMetr.widthPixels, uDisplayMetr.heightPixels) / uDisplayMetr.density);
             }catch(java.lang.Exception e0){
                a.a = 0;
             }
          }
       }
    label_0050 :
       if (p1 <= 0) {
          return p0;
       }else {
          uDisplayMetr = c.c(p0.getResources());
          DisplayMetrics widthPixels = uDisplayMetr.widthPixels;
          DisplayMetrics heightPixels = uDisplayMetr.heightPixels;
          if (widthPixels > heightPixels) {
             widthPixels = heightPixels;
          }
          float f = ((float)widthPixels * 0x3f800000) / (float)p1;
          Configuration uConfigurati = new Configuration(e0);
          uConfigurati.screenWidthDp = (int)((float)uDisplayMetr.widthPixels / f);
          uConfigurati.screenHeightDp = (int)((float)uDisplayMetr.heightPixels / f);
          uConfigurati.densityDpi = (int)(160.00f * f);
          if (p3) {
             uConfigurati.fontScale = 0x3f800000;
          }
          uConfigurati.uiMode = (p0 instanceof a)? p0.b(): e0.uiMode & 0x30;
          float f1 = uConfigurati.fontScale * f;
          b uob = new b(p0, f, f1);
          uob.a(uConfigurati);
          b.h(uob.getResources(), f, f1);
          return uob;
       }
    }
    public static Context g(Context p0,AttributeSet p1){
       int i = 414;
       int i1 = 1;
       int i2 = 0;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.L1);
          i = typedArray.getInteger(i2, i);
          i2 = typedArray.getBoolean(i1, i2);
          i1 = typedArray.getBoolean(2, i1);
          typedArray.recycle();
       }
       return b.f(p0, i, i2, i1);
    }
    public static void h(Resources p0,float p1,float p2){
       if (p0 != null) {
          int i = 0;
          if (p1 - i > 0 && p2 - i > 0) {
             DisplayMetrics uDisplayMetr = c.c(p0);
             if (uDisplayMetr.density - p1 || uDisplayMetr.scaledDensity - p2) {
                uDisplayMetr.density = p1;
                uDisplayMetr.scaledDensity = p2;
                uDisplayMetr.densityDpi = (int)(p1 * 160.00f);
             }
          }
       }
       return;
    }
    public Resources getResources(){
       Resources resources = super.getResources();
       b.h(resources, this.h, this.i);
       return resources;
    }
}
