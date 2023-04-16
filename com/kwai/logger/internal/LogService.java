package com.kwai.logger.internal.LogService;
import android.app.Service;
import q87.d;
import com.kwai.logger.KwaiLog;
import q87.e;
import android.content.Intent;
import android.os.IBinder;

public class LogService extends Service	// class@000d24
{
    public static e b;

    public void LogService(){
       super();
    }
    public static void a(d p0){
       if (p0 != null && KwaiLog.a != null) {
          LogService.b.d(p0);
       }
       return;
    }
    public IBinder onBind(Intent p0){
       return null;
    }
}
