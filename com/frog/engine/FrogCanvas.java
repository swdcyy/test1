package com.frog.engine.FrogCanvas;
import java.lang.Object;
import java.lang.String;
import com.frog.engine.FrogCanvasLogInterface;
import android.app.Activity;
import com.frog.engine.data.FrogInitParam;
import com.frog.engine.FrogRunGameResultListener;
import com.frog.engine.FrogCommonListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.FrogCanvasKVStorageProxy;
import com.frog.engine.internal.FrogEngineInternal;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Intent;
import com.frog.engine.FrogActivity;
import android.content.Context;
import com.frog.engine.FrogGLVersionListener;

public class FrogCanvas	// class@0014ec
{
    public static FrogGLVersionListener sFrogGLVersionListener;
    public static FrogCanvasLogInterface sFrogLogInterface;

    public void FrogCanvas(){
       super();
    }
    public static String getFrogCanvasVersion(){
       return "0.5.19.9";
    }
    public static void init(FrogCanvasLogInterface p0){
       FrogCanvas.sFrogLogInterface = p0;
    }
    public static void runGame(Activity p0,FrogInitParam p1,FrogRunGameResultListener p2,FrogCommonListener p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, FrogCanvas.class, "1")) {
          return;
       }
       FrogEngineInternal.runGame(p0, p1, p2, p3, null);
       return;
    }
    public static void runGame(Activity p0,FrogInitParam p1,FrogRunGameResultListener p2,FrogCommonListener p3,FrogCanvasKVStorageProxy p4){
       FrogCanvas uFrogCanvas = FrogCanvas.class;
       if (PatchProxy.isSupport(uFrogCanvas)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uFrogCanvas, "2")) {
             return;
          }
       }
       FrogEngineInternal.runGame(p0, p1, p2, p3, p4);
       return;
    }
    public static boolean runGameWithActivity(Activity p0,FrogInitParam p1){
       Intent obj = PatchProxy.applyTwoRefs(p0, p1, null, FrogCanvas.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p1 == null) {
          return false;
       }
       obj = new Intent(p0, FrogActivity.class);
       obj.putExtra("frogInitParam", p1.toJSONString());
       p0.startActivity(obj);
       return true;
    }
    public static void setGLVersionListener(FrogGLVersionListener p0){
       FrogCanvas.sFrogGLVersionListener = p0;
    }
}
