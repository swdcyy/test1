package com.k.tran.TranSService;
import android.app.Service;
import com.k.tran.TranSService$a;
import android.content.Intent;
import android.os.IBinder;
import ax7.b$a;

public final class TranSService extends Service	// class@000711
{
    public final TranSService$a b;

    public void TranSService(){
       super();
       this.b = new TranSService$a();
    }
    public IBinder onBind(Intent p0){
       TranSService tb = this.b;
       tb.asBinder();
       return tb;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return 2;
    }
}
