package com.k.fs.MFServiceF;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MFServiceF extends Service	// class@0006f3
{

    public void MFServiceF(){
       super();
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return 2;
    }
}
