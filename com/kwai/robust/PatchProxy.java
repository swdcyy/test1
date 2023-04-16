package com.kwai.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.kwai.robust.ChangeQuickRedirect;
import java.lang.String;
import java.lang.Class;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import com.kwai.robust.PatchProxy$a;

public class PatchProxy	// class@000ee5
{
    public static final String METHOD_NAME_APPLY = "apply";
    public static final String METHOD_NAME_APPLY_VOID = "applyVoid";
    public static final String METHOD_NAME_APPLY_VOID_WITH_LISTENER = "applyVoidWithListener";
    public static final String METHOD_NAME_APPLY_WITH_LISTENER = "applyWithListener";
    public static final String METHOD_NAME_PROXY = "proxy";
    public static final String METHOD_NAME_PROXY_VOID = "proxyVoid";
    public static final String METHOD_NAME_isSupport = "isSupport";
    public static final String METHOD_NAME_isSupport2 = "isSupport2";
    public static final String METHOD_NAME_onMethodExit = "onMethodExit";
    public static Map sChangeQuickRedirect;
    public static boolean sChangeQuickRedirectEmpty;
    public static PatchProxy$a sMethodCall;

    static {
       PatchProxy.sChangeQuickRedirect = new ConcurrentHashMap();
       PatchProxy.sChangeQuickRedirectEmpty = true;
       PatchProxy.sMethodCall = null;
    }
    public void PatchProxy(){
       super();
    }
    public static Object accessDispatch(Object[] p0,Object p1,ChangeQuickRedirect p2,String p3){
       if (p2 == null) {
          return null;
       }
       return p2.accessDispatch(p1, p0, p3);
    }
    public static synchronized void addChangeQuickRedirect(Class p0,ChangeQuickRedirect p1){
       _monitor_enter(PatchProxy.class);
       PatchProxy.sChangeQuickRedirect.put(p0, p1);
       PatchProxy.sChangeQuickRedirectEmpty = PatchProxy.sChangeQuickRedirect.isEmpty();
       _monitor_exit(PatchProxy.class);
    }
    public static Object apply(Object[] p0,Object p1,Class p2,String p3){
       if (PatchProxy.sChangeQuickRedirectEmpty || !PatchProxy.sChangeQuickRedirect.containsKey(p2)) {
          return PatchProxyResult.class;
       }
       return PatchProxy.newProxy(p0, p1, p2, p3);
    }
    public static Object applyFourRefs(Object p0,Object p1,Object p2,Object p3,Object p4,Class p5,String p6){
       if (PatchProxy.sChangeQuickRedirectEmpty || !PatchProxy.sChangeQuickRedirect.containsKey(p5)) {
          return PatchProxyResult.class;
       }
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       return PatchProxy.newProxy(objArray, p4, p5, p6);
    }
    public static Object applyFourRefsWithListener(Object p0,Object p1,Object p2,Object p3,Object p4,Class p5,String p6){
       if (!PatchProxy.isSupport2(p5, p6)) {
          return PatchProxyResult.class;
       }
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       return PatchProxy.newProxy(objArray, p4, p5, p6);
    }
    public static Object applyOneRefs(Object p0,Object p1,Class p2,String p3){
       if (PatchProxy.sChangeQuickRedirectEmpty || !PatchProxy.sChangeQuickRedirect.containsKey(p2)) {
          return PatchProxyResult.class;
       }
       Object[] objArray = new Object[]{p0};
       return PatchProxy.newProxy(objArray, p1, p2, p3);
    }
    public static Object applyOneRefsWithListener(Object p0,Object p1,Class p2,String p3){
       if (!PatchProxy.isSupport2(p2, p3)) {
          return PatchProxyResult.class;
       }
       Object[] objArray = new Object[]{p0};
       return PatchProxy.newProxy(objArray, p1, p2, p3);
    }
    public static Object applyThreeRefs(Object p0,Object p1,Object p2,Object p3,Class p4,String p5){
       if (PatchProxy.sChangeQuickRedirectEmpty || !PatchProxy.sChangeQuickRedirect.containsKey(p4)) {
          return PatchProxyResult.class;
       }
       Object[] objArray = new Object[]{p0,p1,p2};
       return PatchProxy.newProxy(objArray, p3, p4, p5);
    }
    public static Object applyThreeRefsWithListener(Object p0,Object p1,Object p2,Object p3,Class p4,String p5){
       if (!PatchProxy.isSupport2(p4, p5)) {
          return PatchProxyResult.class;
       }
       Object[] objArray = new Object[]{p0,p1,p2};
       return PatchProxy.newProxy(objArray, p3, p4, p5);
    }
    public static Object applyTwoRefs(Object p0,Object p1,Object p2,Class p3,String p4){
       if (PatchProxy.sChangeQuickRedirectEmpty || !PatchProxy.sChangeQuickRedirect.containsKey(p3)) {
          return PatchProxyResult.class;
       }
       Object[] objArray = new Object[]{p0,p1};
       return PatchProxy.newProxy(objArray, p2, p3, p4);
    }
    public static Object applyTwoRefsWithListener(Object p0,Object p1,Object p2,Class p3,String p4){
       if (!PatchProxy.isSupport2(p3, p4)) {
          return PatchProxyResult.class;
       }
       Object[] objArray = new Object[]{p0,p1};
       return PatchProxy.newProxy(objArray, p2, p3, p4);
    }
    public static boolean applyVoid(Object[] p0,Object p1,Class p2,String p3){
       if (PatchProxy.sChangeQuickRedirectEmpty || !PatchProxy.sChangeQuickRedirect.containsKey(p2)) {
          return false;
       }
       return PatchProxy.proxyVoid(p0, p1, p2, p3);
    }
    public static boolean applyVoidFourRefs(Object p0,Object p1,Object p2,Object p3,Object p4,Class p5,String p6){
       if (PatchProxy.sChangeQuickRedirectEmpty || !PatchProxy.sChangeQuickRedirect.containsKey(p5)) {
          return false;
       }
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       return PatchProxy.proxyVoid(objArray, p4, p5, p6);
    }
    public static boolean applyVoidFourRefsWithListener(Object p0,Object p1,Object p2,Object p3,Object p4,Class p5,String p6){
       if (!PatchProxy.isSupport2(p5, p6)) {
          return false;
       }
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       return PatchProxy.proxyVoid(objArray, p4, p5, p6);
    }
    public static boolean applyVoidOneRefs(Object p0,Object p1,Class p2,String p3){
       if (PatchProxy.sChangeQuickRedirectEmpty || !PatchProxy.sChangeQuickRedirect.containsKey(p2)) {
          return false;
       }
       Object[] objArray = new Object[]{p0};
       return PatchProxy.proxyVoid(objArray, p1, p2, p3);
    }
    public static boolean applyVoidOneRefsWithListener(Object p0,Object p1,Class p2,String p3){
       if (!PatchProxy.isSupport2(p2, p3)) {
          return false;
       }
       Object[] objArray = new Object[]{p0};
       return PatchProxy.proxyVoid(objArray, p1, p2, p3);
    }
    public static boolean applyVoidThreeRefs(Object p0,Object p1,Object p2,Object p3,Class p4,String p5){
       if (PatchProxy.sChangeQuickRedirectEmpty || !PatchProxy.sChangeQuickRedirect.containsKey(p4)) {
          return false;
       }
       Object[] objArray = new Object[]{p0,p1,p2};
       return PatchProxy.proxyVoid(objArray, p3, p4, p5);
    }
    public static boolean applyVoidThreeRefsWithListener(Object p0,Object p1,Object p2,Object p3,Class p4,String p5){
       if (!PatchProxy.isSupport2(p4, p5)) {
          return false;
       }
       Object[] objArray = new Object[]{p0,p1,p2};
       return PatchProxy.proxyVoid(objArray, p3, p4, p5);
    }
    public static boolean applyVoidTwoRefs(Object p0,Object p1,Object p2,Class p3,String p4){
       if (PatchProxy.sChangeQuickRedirectEmpty || !PatchProxy.sChangeQuickRedirect.containsKey(p3)) {
          return false;
       }
       Object[] objArray = new Object[]{p0,p1};
       return PatchProxy.proxyVoid(objArray, p2, p3, p4);
    }
    public static boolean applyVoidTwoRefsWithListener(Object p0,Object p1,Object p2,Class p3,String p4){
       if (!PatchProxy.isSupport2(p3, p4)) {
          return false;
       }
       Object[] objArray = new Object[]{p0,p1};
       return PatchProxy.proxyVoid(objArray, p2, p3, p4);
    }
    public static boolean applyVoidWithListener(Object[] p0,Object p1,Class p2,String p3){
       if (!PatchProxy.isSupport2(p2, p3)) {
          return false;
       }
       return PatchProxy.proxyVoid(p0, p1, p2, p3);
    }
    public static Object applyWithListener(Object[] p0,Object p1,Class p2,String p3){
       if (!PatchProxy.isSupport2(p2, p3)) {
          return PatchProxyResult.class;
       }
       return PatchProxy.newProxy(p0, p1, p2, p3);
    }
    public static synchronized Boolean containsChangeQuickRedirect(Class p0){
       _monitor_enter(PatchProxy.class);
       _monitor_exit(PatchProxy.class);
       return Boolean.valueOf(PatchProxy.sChangeQuickRedirect.containsKey(p0));
    }
    public static synchronized Map getChangeQuickRedirect(){
       _monitor_enter(PatchProxy.class);
       _monitor_exit(PatchProxy.class);
       return new HashMap(PatchProxy.sChangeQuickRedirect);
    }
    public static boolean isSupport(Class p0){
       boolean b = (!PatchProxy.sChangeQuickRedirectEmpty && PatchProxy.sChangeQuickRedirect.containsKey(p0))? true: false;
       return b;
    }
    public static boolean isSupport(Object[] p0,Object p1,ChangeQuickRedirect p2,String p3){
       if (p2 == null) {
          return false;
       }
       return p2.isSupport(p1, p0, p3);
    }
    public static boolean isSupport2(Class p0,String p1){
       boolean b;
       if (PatchProxy.sMethodCall != null) {
          try{
             PatchProxy.sMethodCall.onMethodEntry(p0, p1);
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static Object newProxy(Object[] p0,Object p1,Class p2,String p3){
       ChangeQuickRedirect uChangeQuick = PatchProxy.sChangeQuickRedirect.get(p2);
       if (PatchProxy.isSupport(p0, p1, uChangeQuick, p3)) {
          return PatchProxy.accessDispatch(p0, p1, uChangeQuick, p3);
       }
       return PatchProxyResult.class;
    }
    public static void onMethodExit(Class p0,String p1){
       try{
          if (PatchProxy.sMethodCall != null) {
             PatchProxy.sMethodCall.onMethodExit(p0, p1);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static PatchProxyResult proxy(Object[] p0,Object p1,Class p2,String p3){
       ChangeQuickRedirect uChangeQuick = PatchProxy.sChangeQuickRedirect.get(p2);
       PatchProxyResult patchProxyRe = new PatchProxyResult();
       if (PatchProxy.isSupport(p0, p1, uChangeQuick, p3)) {
          patchProxyRe.isSupported = true;
          patchProxyRe.result = PatchProxy.accessDispatch(p0, p1, uChangeQuick, p3);
       }
       return patchProxyRe;
    }
    public static boolean proxyVoid(Object[] p0,Object p1,Class p2,String p3){
       ChangeQuickRedirect uChangeQuick = PatchProxy.sChangeQuickRedirect.get(p2);
       if (!PatchProxy.isSupport(p0, p1, uChangeQuick, p3)) {
          return false;
       }
       PatchProxy.accessDispatch(p0, p1, uChangeQuick, p3);
       return true;
    }
    public static synchronized ChangeQuickRedirect removeChangeQuickRedirect(Class p0){
       _monitor_enter(PatchProxy.class);
       PatchProxy.sChangeQuickRedirectEmpty = PatchProxy.sChangeQuickRedirect.isEmpty();
       _monitor_exit(PatchProxy.class);
       return PatchProxy.sChangeQuickRedirect.remove(p0);
    }
    public static void setMethodCall(PatchProxy$a p0){
       PatchProxy.sMethodCall = p0;
    }
}
