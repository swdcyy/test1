package com.kwai.flash.Scene;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Scene extends Enum	// class@0014c4
{
    public static final Scene[] $VALUES;
    public static final Scene ALBUM;
    public static final Scene APP_BOOT;
    public static final Scene CAMERA;

    static {
       Scene scene = new Scene("ALBUM", 0);
       Scene.ALBUM = scene;
       Scene scene1 = new Scene("CAMERA", 1);
       Scene.CAMERA = scene1;
       Scene scene2 = new Scene("APP_BOOT", 2);
       Scene.APP_BOOT = scene2;
       Scene[] sceneArray = new Scene[]{scene,scene1,scene2};
       Scene.$VALUES = sceneArray;
    }
    public void Scene(String p0,int p1){
       super(p0, p1);
    }
    public static Scene valueOf(String p0){
       return Enum.valueOf(Scene.class, p0);
    }
    public static Scene[] values(){
       return Scene.$VALUES.clone();
    }
}
