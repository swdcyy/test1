package gd.c;
import gd.b;
import ed.d;
import z1.g;
import android.graphics.BitmapFactory$Options;
import android.graphics.ColorSpace;
import android.graphics.Bitmap$Config;
import nd.a;

public class c extends b	// class@0016d6
{

    public void c(d p0,int p1,g p2){
       super(p0, p1, p2);
    }
    public int f(int p0,int p1,BitmapFactory$Options p2){
       BitmapFactory$Options outColorSpac = p2.outColorSpace;
       outColorSpac = (outColorSpac != null && (outColorSpac.isWideGamut() && p2.inPreferredConfig != Bitmap$Config.RGBA_F16))? 1: 0;
       p0 = (outColorSpac)? (p0 * p1) * 8: a.c(p0, p1, p2.inPreferredConfig);
       return p0;
    }
}
