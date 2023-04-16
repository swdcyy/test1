package com.k.tran.TranMService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class TranMService extends Service	// class@00070f
{

    public void TranMService(){
       super();
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return 2;
    }
}
