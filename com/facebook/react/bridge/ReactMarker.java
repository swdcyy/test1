package com.facebook.react.bridge.ReactMarker;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import com.facebook.react.bridge.ReactMarker$DirectionalMarkerListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.facebook.react.bridge.ReactMarker$FabricMarkerListener;
import com.facebook.react.bridge.ReactMarker$MarkerListener;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.lang.Integer;
import java.util.Iterator;
import java.lang.Long;
import com.facebook.react.bridge.ReactMarker$TMMMarkerListener;

public class ReactMarker	// class@001226
{
    public static final List sDirectionalListeners;
    public static final List sFabricMarkerListeners;
    public static final List sListeners;

    static {
       ReactMarker.sListeners = new CopyOnWriteArrayList();
       ReactMarker.sFabricMarkerListeners = new CopyOnWriteArrayList();
       ReactMarker.sDirectionalListeners = new CopyOnWriteArrayList();
    }
    public void ReactMarker(){
       super();
    }
    public static void addDirectionalMarkerListener(ReactMarker$DirectionalMarkerListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactMarker.class, "18")) {
          return;
       }
       List sDirectional = ReactMarker.sDirectionalListeners;
       if (!sDirectional.contains(p0)) {
          sDirectional.add(p0);
       }
       return;
    }
    public static void addFabricListener(ReactMarker$FabricMarkerListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactMarker.class, "4")) {
          return;
       }
       List sFabricMarke = ReactMarker.sFabricMarkerListeners;
       if (!sFabricMarke.contains(p0)) {
          sFabricMarke.add(p0);
       }
       return;
    }
    public static void addListener(ReactMarker$MarkerListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactMarker.class, "1")) {
          return;
       }
       List sListeners = ReactMarker.sListeners;
       if (!sListeners.contains(p0)) {
          sListeners.add(p0);
       }
       return;
    }
    public static void clearDirectionalMarkerListeners(){
       if (PatchProxy.applyVoid(null, null, ReactMarker.class, "20")) {
          return;
       }
       ReactMarker.sDirectionalListeners.clear();
       return;
    }
    public static void clearFabricMarkerListeners(){
       if (PatchProxy.applyVoid(null, null, ReactMarker.class, "6")) {
          return;
       }
       ReactMarker.sFabricMarkerListeners.clear();
       return;
    }
    public static void clearMarkerListeners(){
       if (PatchProxy.applyVoid(null, null, ReactMarker.class, "3")) {
          return;
       }
       ReactMarker.sListeners.clear();
       return;
    }
    public static void directionalLogMarker(ReactMarkerConstants p0,String p1,int p2){
       if (PatchProxy.isSupport(ReactMarker.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, ReactMarker.class, "23")) {
          return;
       }
       Iterator iterator = ReactMarker.sDirectionalListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().directionalLogMarker(p0, p1, p2);
       }
       return;
    }
    public static void logFabricMarker(ReactMarkerConstants p0,String p1,int p2){
       if (PatchProxy.isSupport(ReactMarker.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, ReactMarker.class, "8")) {
          return;
       }
       ReactMarker.logFabricMarker(p0, p1, p2, -1);
       return;
    }
    public static void logFabricMarker(ReactMarkerConstants p0,String p1,int p2,long p3){
       if (PatchProxy.isSupport(ReactMarker.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), null, ReactMarker.class, "7")) {
          return;
       }
       Iterator iterator = ReactMarker.sFabricMarkerListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().logFabricMarker(p0, p1, p2, p3);
       }
       return;
    }
    public static void logMarker(ReactMarkerConstants p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactMarker.class, "13")) {
          return;
       }
       ReactMarker.logMarker(p0, null, 0);
       return;
    }
    public static void logMarker(ReactMarkerConstants p0,int p1){
       ReactMarker reactMarker = ReactMarker.class;
       if (PatchProxy.isSupport(reactMarker) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, reactMarker, "14")) {
          return;
       }
       ReactMarker.logMarker(p0, null, p1);
       return;
    }
    public static void logMarker(ReactMarkerConstants p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ReactMarker.class, "15")) {
          return;
       }
       ReactMarker.logMarker(p0, p1, 0);
       return;
    }
    public static void logMarker(ReactMarkerConstants p0,String p1,int p2){
       if (PatchProxy.isSupport(ReactMarker.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, ReactMarker.class, "16")) {
          return;
       }
       ReactMarker.logFabricMarker(p0, p1, p2);
       Iterator iterator = ReactMarker.sListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().logMarker(p0, p1, p2);
       }
       return;
    }
    public static void logMarker(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactMarker.class, "9")) {
          return;
       }
       ReactMarker.logMarker(p0, null);
       return;
    }
    public static void logMarker(String p0,int p1){
       ReactMarker reactMarker = ReactMarker.class;
       if (PatchProxy.isSupport(reactMarker) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, reactMarker, "10")) {
          return;
       }
       ReactMarker.logMarker(p0, null, p1);
       return;
    }
    public static void logMarker(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ReactMarker.class, "11")) {
          return;
       }
       ReactMarker.logMarker(p0, p1, 0);
       return;
    }
    public static void logMarker(String p0,String p1,int p2){
       if (PatchProxy.isSupport(ReactMarker.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, ReactMarker.class, "12")) {
          return;
       }
       ReactMarker.logMarker(ReactMarkerConstants.valueOf(p0), p1, p2);
       return;
    }
    public static void logMarkerWithUniqueId(String p0,String p1,int p2){
       if (PatchProxy.isSupport(ReactMarker.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, ReactMarker.class, "21")) {
          return;
       }
       ReactMarkerConstants reactMarkerC = ReactMarkerConstants.valueOf(p0);
       ReactMarker.logMarker(reactMarkerC, p1, 0);
       ReactMarker.directionalLogMarker(reactMarkerC, p1, p2);
       return;
    }
    public static void logMarkerWithUniqueId(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactMarker.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, ReactMarker.class, "22")) {
          return;
       }
       ReactMarkerConstants reactMarkerC = ReactMarkerConstants.valueOf(p0);
       ReactMarker.logMarker(reactMarkerC, p1, p2);
       ReactMarker.directionalLogMarker(reactMarkerC, p1, p3);
       return;
    }
    public static void logTMMMarker(String p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(ReactMarker.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, ReactMarker.class, "17")) {
          return;
       }
       Iterator iterator = ReactMarker.sListeners.iterator();
       while (iterator.hasNext()) {
          ReactMarker$MarkerListener markerListen = iterator.next();
          if (markerListen instanceof ReactMarker$TMMMarkerListener) {
             markerListen.logTMMMarker(p0, p1, p2, p3);
          }
       }
       return;
    }
    public static void removeDirectionalMarkerListener(ReactMarker$DirectionalMarkerListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactMarker.class, "19")) {
          return;
       }
       ReactMarker.sDirectionalListeners.remove(p0);
       return;
    }
    public static void removeFabricListener(ReactMarker$FabricMarkerListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactMarker.class, "5")) {
          return;
       }
       ReactMarker.sFabricMarkerListeners.remove(p0);
       return;
    }
    public static void removeListener(ReactMarker$MarkerListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactMarker.class, "2")) {
          return;
       }
       ReactMarker.sListeners.remove(p0);
       return;
    }
}
