package dv8.a;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import com.yxcorp.experiment.logger.LogEventSeqIdInfo;
import java.lang.Class;
import wu8.a;
import java.lang.System;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class a	// class@0020eb
{
    public final SharedPreferences a;

    public void a(SharedPreferences p0){
       super();
       this.a = p0;
    }
    public synchronized void a(Long p0){
       if (p0 == null) {
          return;
       }
       String str = String.valueOf(p0);
       LogEventSeqIdInfo logEventSeqI = a.e(this.a.getString(str, null), LogEventSeqIdInfo.class);
       if (logEventSeqI == null) {
          logEventSeqI = new LogEventSeqIdInfo();
       }
       int seqId = logEventSeqI.getSeqId();
       int i = 1;
       if (seqId < Integer.MAX_VALUE) {
          i = i + seqId;
       }
       logEventSeqI.setSeqId(i);
       logEventSeqI.setTimestamp(System.currentTimeMillis());
       String str1 = a.d(logEventSeqI);
       if (TextUtils.isEmpty(str1)) {
          return;
       }else {
          SharedPreferences$Editor uEditor = this.a.edit();
          uEditor.putString(str, str1);
          g.a(uEditor);
          return;
       }
    }
}
