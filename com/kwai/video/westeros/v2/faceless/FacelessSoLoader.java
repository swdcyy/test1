package com.kwai.video.westeros.v2.faceless.FacelessSoLoader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import h35.a;
import java.lang.Boolean;

public class FacelessSoLoader	// class@0010e9
{

    public void FacelessSoLoader(){
       super();
    }
    public static void loadLibraryDeps(){
       if (PatchProxy.applyVoid(null, null, FacelessSoLoader.class, "2")) {
          return;
       }
       WesterosSoLoader.loadNative();
       WesterosSoLoader.loadLibrary("klsf");
       if (!a.c.booleanValue()) {
          WesterosSoLoader.loadLibrary("skwai");
       }
       if (a.f.booleanValue()) {
          WesterosSoLoader.loadLibrary("kgpu");
       }
       WesterosSoLoader.loadLibrary("spine");
       WesterosSoLoader.loadLibrary("kwai-v8-lite");
       return;
    }
    public static void loadNative(){
       if (PatchProxy.applyVoid(null, null, FacelessSoLoader.class, "1")) {
          return;
       }
       FacelessSoLoader.loadLibraryDeps();
       WesterosSoLoader.loadLibrary("CGE");
       WesterosSoLoader.loadLibrary("gorgeous");
       WesterosSoLoader.loadLibrary("FaceMagic");
       return;
    }
}
