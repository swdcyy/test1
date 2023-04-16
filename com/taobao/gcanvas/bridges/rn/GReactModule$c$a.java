package com.taobao.gcanvas.bridges.rn.GReactModule$c$a;
import java.lang.Runnable;
import com.taobao.gcanvas.bridges.rn.GReactModule$c;
import java.lang.String;
import android.os.Handler;
import java.lang.Object;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.taobao.gcanvas.bridges.rn.GReactModule;
import java.util.concurrent.atomic.AtomicReference;
import com.taobao.gcanvas.bridges.rn.GReactModule$HostLifeState;
import java.lang.Enum;
import java.util.HashMap;
import com.taobao.gcanvas.bridges.rn.GReactTextureView;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import com.taobao.gcanvas.bridges.rn.GReactModule$b;
import yq8.a;
import java.lang.Class;
import java.lang.Throwable;
import android.util.Log;

public class GReactModule$c$a implements Runnable	// class@000df5
{
    public final String b;
    public final int c;
    public final Handler d;
    public final GReactModule$c e;

    public void GReactModule$c$a(GReactModule$c p0,String p1,int p2,Handler p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       GReactTextureView gReactTextur;
       try{
          Activity currentActiv = this.e.f.getCurrentActivity();
          if (currentActiv == null || this.e.f.mLifeRef.get().ordinal() > GReactModule$HostLifeState.Paused.ordinal()) {
          }else if(this.e.f.mViews.containsKey(this.b) && this.e.f.mCacheCmdList.containsKey(this.b)){
             gReactTextur = this.e.f.mViews.get(this.b);
          }else {
             gReactTextur = currentActiv.findViewById(this.c);
             if (gReactTextur != null && gReactTextur.a()) {
                this.e.f.mViews.put(this.b, gReactTextur);
             }else {
                gReactTextur = null;
             }
          }
          if (gReactTextur != null && (this.e.f.mCacheCmdList.containsKey(this.b) && gReactTextur.a())) {
             Iterator iterator = this.e.f.mCacheCmdList.remove(this.b).iterator();
             while (iterator.hasNext()) {
                GReactModule$b uob = iterator.next();
                uob.getClass();
                uob.execute();
             }
             return;
          }else {
             this.d.removeCallbacks(this);
             this.d.postDelayed(this, 16);
             return;
          }
       }catch(java.lang.Exception e0){
          Log.getStackTraceString(e0);
       }
       return;
    }
}
