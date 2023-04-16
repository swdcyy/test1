package com.amap.api.fence.GeoFenceClient;
import android.content.Context;
import java.lang.Object;
import com.loc.a;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Throwable;
import com.loc.fj;
import com.amap.api.location.DPoint;
import java.util.List;
import android.app.PendingIntent;
import java.util.ArrayList;
import com.amap.api.fence.GeoFence;
import com.amap.api.fence.GeoFenceListener;

public class GeoFenceClient	// class@000ec2
{
    public Context a;
    public a b;

    public void GeoFenceClient(Context p0){
       super();
       Context uContext = null;
       this.a = uContext;
       this.b = uContext;
       if (p0 == null) {
          throw new IllegalArgumentException("Context参数不能为null");
       }
       p0 = p0.getApplicationContext();
       this.a = p0;
       this.b = GeoFenceClient.a(p0);
       return;
    }
    public static a a(Context p0){
       return new a(p0);
    }
    public void addGeoFence(DPoint p0,float p1,String p2){
       this.b.a(p0, p1, p2);
    }
    public void addGeoFence(String p0,String p1){
       this.b.a(p0, p1);
    }
    public void addGeoFence(String p0,String p1,DPoint p2,float p3,int p4,String p5){
       this.b.a(p0, p1, p2, p3, p4, p5);
    }
    public void addGeoFence(String p0,String p1,String p2,int p3,String p4){
       this.b.a(p0, p1, p2, p3, p4);
    }
    public void addGeoFence(List p0,String p1){
       this.b.a(p0, p1);
    }
    public PendingIntent createPendingIntent(String p0){
       PendingIntent pendingInten = this.b.a(p0);
       return pendingInten;
    }
    public List getAllGeoFence(){
       ArrayList uArrayList = new ArrayList();
       List list = this.b.b();
       return list;
    }
    public boolean isPause(){
       return this.b.i();
    }
    public void pauseGeoFence(){
       this.b.f();
    }
    public void removeGeoFence(){
       this.b.a();
    }
    public boolean removeGeoFence(GeoFence p0){
       return this.b.a(p0);
    }
    public void resumeGeoFence(){
       this.b.h();
    }
    public void setActivateAction(int p0){
       this.b.a(p0);
    }
    public void setGeoFenceAble(String p0,boolean p1){
       this.b.a(p0, p1);
    }
    public void setGeoFenceListener(GeoFenceListener p0){
       this.b.a(p0);
    }
}
