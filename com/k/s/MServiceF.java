package com.k.s.MServiceF;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MServiceF extends Service	// class@000709
{

    public void MServiceF(){
       super();
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return 2;
    }
}
