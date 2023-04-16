package g63.i;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import g63.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Color;
import android.widget.HorizontalScrollView;
import android.content.res.ColorStateList;
import android.util.StateSet;
import lnc.a1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public class i	// class@002a84
{

    public void i(){
       super();
    }
    public static String a(int p0,String p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, oi, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (Integer.toHexString(Math.round((((float)p0 / 100.00f) * 0x437f0000)))).toUpperCase();
       if (str.length() == 1) {
          str = "0"+str;
       }
       return "#"+str+p1.substring((p1.indexOf("#") + 1));
    }
    public static void b(GzonePagerSlidingTabStrip p0,g p1){
       int[] ointArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "1")) {
          return;
       }
       if (p1 != null && !TextUtils.isEmpty(p1.i)) {
          try{
             p0.setBackgroundColor(Color.parseColor(p1.i));
             int[][] ointArray = new int[][2]{ointArray1,StateSet.WILD_CARD};
             ointArray1 = new int[]{0x10100a1};
             int[] ointArray2 = new int[]{-1,a1.a(0x7f06204e)};
             p0.setTextColor(new ColorStateList(ointArray, ointArray2));
             p0.setIndicatorColor(R.color.arg_RES_7f061c32);
          }catch(java.lang.IllegalArgumentException e7){
             b.I(LiveLogTag.GZONE, "parse color error: "+p1.i, e7);
          }
       }
    }
}
