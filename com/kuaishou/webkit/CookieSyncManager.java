package com.kuaishou.webkit.CookieSyncManager;
import com.kuaishou.webkit.WebSyncManager;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import com.kuaishou.webkit.CookieManager;

public final class CookieSyncManager extends WebSyncManager	// class@001248
{
    public static boolean sGetInstanceAllowed;
    public static final Object sLock;
    public static CookieSyncManager sRef;

    static {
       CookieSyncManager.sLock = new Object();
    }
    public void CookieSyncManager(){
       super(null, null);
    }
    public static void checkInstanceIsAllowed(){
       if (CookieSyncManager.sGetInstanceAllowed) {
          return;
       }
       throw new IllegalStateException("CookieSyncManager::createInstance\(\) needs to be called before CookieSyncManager::getInstance\(\)");
    }
    public static CookieSyncManager createInstance(Context p0){
       Object sLock = CookieSyncManager.sLock;
       _monitor_enter(sLock);
       if (p0 == null) {
          throw new IllegalArgumentException("Invalid context argument");
       }
       CookieSyncManager.setGetInstanceIsAllowed();
       _monitor_exit(sLock);
       return CookieSyncManager.getInstance();
    }
    public static CookieSyncManager getInstance(){
       Object sLock = CookieSyncManager.sLock;
       _monitor_enter(sLock);
       CookieSyncManager.checkInstanceIsAllowed();
       if (CookieSyncManager.sRef == null) {
          CookieSyncManager.sRef = new CookieSyncManager();
       }
       _monitor_exit(sLock);
       return CookieSyncManager.sRef;
    }
    public static void setGetInstanceIsAllowed(){
       CookieSyncManager.sGetInstanceAllowed = true;
    }
    public void resetSync(){
    }
    public void run(){
       super.run();
    }
    public void startSync(){
    }
    public void stopSync(){
    }
    public void sync(){
       CookieManager.getInstance().flush();
    }
    public void syncFromRamToFlash(){
       CookieManager.getInstance().flush();
    }
}
