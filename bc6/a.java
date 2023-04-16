package bc6.a;
import java.lang.Runnable;
import com.kwai.framework.perf.phonelevel.d;
import java.lang.Object;
import java.lang.String;
import e66.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class a implements Runnable	// class@000459
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       String str = "generalDeviceScore";
       float f = (float)tb.a(str) / 1000.00f;
       if (f > 0) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putFloat(str, f);
          g.a(uEditor);
       }
       Log.g("PhoneLevelUtils", "update deviceScore = "+f);
       int i = tb.a("kuaishouGeneralDeviceClassifier");
       if (i > 0) {
          SharedPreferences$Editor uEditor1 = a.a.edit();
          uEditor1.putInt("generalDeviceClassifier", i);
          g.a(uEditor1);
       }
       Log.g("PhoneLevelUtils", "update devicePercent = "+i);
       return;
    }
}
