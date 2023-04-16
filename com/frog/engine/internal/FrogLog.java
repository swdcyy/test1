package com.frog.engine.internal.FrogLog;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.FrogCanvas;
import com.frog.engine.FrogCanvasLogInterface;
import java.lang.Exception;

public class FrogLog	// class@00153a
{

    public void FrogLog(){
       super();
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogLog.class, "2")) {
          return;
       }
       FrogCanvasLogInterface sFrogLogInte = FrogCanvas.sFrogLogInterface;
       if (sFrogLogInte != null) {
          sFrogLogInte.d(p0, p1);
       }
       return;
    }
    public static void e(String p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogLog.class, "5")) {
          return;
       }
       FrogCanvasLogInterface sFrogLogInte = FrogCanvas.sFrogLogInterface;
       if (sFrogLogInte != null) {
          sFrogLogInte.e(p0, p1);
       }else {
          p1.getMessage();
       }
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogLog.class, "3")) {
          return;
       }
       FrogCanvasLogInterface sFrogLogInte = FrogCanvas.sFrogLogInterface;
       if (sFrogLogInte != null) {
          sFrogLogInte.e(p0, p1);
       }
       return;
    }
    public static void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogLog.class, "1")) {
          return;
       }
       FrogCanvasLogInterface sFrogLogInte = FrogCanvas.sFrogLogInterface;
       if (sFrogLogInte != null) {
          sFrogLogInte.v(p0, p1);
       }
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogLog.class, "4")) {
          return;
       }
       FrogCanvasLogInterface sFrogLogInte = FrogCanvas.sFrogLogInterface;
       if (sFrogLogInte != null) {
          sFrogLogInte.w(p0, p1);
       }
       return;
    }
}
