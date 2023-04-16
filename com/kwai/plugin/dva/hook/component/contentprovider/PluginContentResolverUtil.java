package com.kwai.plugin.dva.hook.component.contentprovider.PluginContentResolverUtil;
import java.lang.Object;
import android.content.ContentResolver;
import android.net.Uri;
import android.content.ContentProviderClient;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.ContentValues;
import java.lang.Number;
import android.os.Bundle;
import android.content.Context;
import qj7.h;
import ii7.a;
import android.database.ContentObserver;
import java.lang.Integer;
import java.lang.Boolean;
import android.content.res.AssetFileDescriptor;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import com.kwai.plugin.dva.hook.component.contentprovider.ProxyContentProvider;
import java.util.Set;
import qj7.g;
import java.net.URLEncoder;
import qj7.d;
import java.lang.Exception;
import android.database.Cursor;

public class PluginContentResolverUtil	// class@000e8b
{
    public static ContentResolver a;
    public static boolean b;
    public static String c;

    public void PluginContentResolverUtil(){
       super();
    }
    public static final ContentProviderClient acquireContentProviderClient(ContentResolver p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PluginContentResolverUtil.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.acquireContentProviderClient(PluginContentResolverUtil.proxyUri(p1));
    }
    public static final ContentProviderClient acquireUnstableContentProviderClient(ContentResolver p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PluginContentResolverUtil.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.acquireUnstableContentProviderClient(PluginContentResolverUtil.proxyUri(p1));
    }
    public static final int bulkInsert(ContentResolver p0,Uri p1,ContentValues[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PluginContentResolverUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.bulkInsert(PluginContentResolverUtil.proxyUri(p1), p2);
    }
    public static final Bundle call(ContentResolver p0,Uri p1,String p2,String p3,Bundle p4){
       PluginContentResolverUtil pluginConten = PluginContentResolverUtil.class;
       if (PatchProxy.isSupport(pluginConten)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, pluginConten, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p0.call(PluginContentResolverUtil.proxyUri(p1), p2, p3, p4);
    }
    public static final Uri canonicalize(ContentResolver p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PluginContentResolverUtil.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.canonicalize(PluginContentResolverUtil.proxyUri(p1));
    }
    public static final int delete(ContentResolver p0,Uri p1,String p2,String[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, PluginContentResolverUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.delete(PluginContentResolverUtil.proxyUri(p1), p2, p3);
    }
    public static final String[] getStreamTypes(ContentResolver p0,Uri p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PluginContentResolverUtil.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getStreamTypes(PluginContentResolverUtil.proxyUri(p1), p2);
    }
    public static final String getType(ContentResolver p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PluginContentResolverUtil.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getType(PluginContentResolverUtil.proxyUri(p1));
    }
    public static void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PluginContentResolverUtil.class, "1")) {
          return;
       }
       PluginContentResolverUtil.b = h.b(p0);
       PluginContentResolverUtil.a = p0.getContentResolver();
       PluginContentResolverUtil.c = a.a(p0);
       return;
    }
    public static final Uri insert(ContentResolver p0,Uri p1,ContentValues p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PluginContentResolverUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.insert(PluginContentResolverUtil.proxyUri(p1), p2);
    }
    public static void notifyChange(ContentResolver p0,Uri p1,ContentObserver p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, PluginContentResolverUtil.class, "30")) {
          return;
       }
       p0.notifyChange(PluginContentResolverUtil.proxyUri(p1), p2);
       return;
    }
    public static void notifyChange(ContentResolver p0,Uri p1,ContentObserver p2,int p3){
       if (PatchProxy.isSupport(PluginContentResolverUtil.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, PluginContentResolverUtil.class, "32")) {
          return;
       }
       p0.notifyChange(PluginContentResolverUtil.proxyUri(p1), p2, p3);
       return;
    }
    public static void notifyChange(ContentResolver p0,Uri p1,ContentObserver p2,boolean p3){
       if (PatchProxy.isSupport(PluginContentResolverUtil.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, PluginContentResolverUtil.class, "31")) {
          return;
       }
       p0.notifyChange(PluginContentResolverUtil.proxyUri(p1), p2, p3);
       return;
    }
    public static final AssetFileDescriptor openAssetFileDescriptor(ContentResolver p0,Uri p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PluginContentResolverUtil.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.openAssetFileDescriptor(PluginContentResolverUtil.proxyUri(p1), p2);
    }
    public static final AssetFileDescriptor openAssetFileDescriptor(ContentResolver p0,Uri p1,String p2,CancellationSignal p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, PluginContentResolverUtil.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.openAssetFileDescriptor(PluginContentResolverUtil.proxyUri(p1), p2, p3);
    }
    public static final ParcelFileDescriptor openFileDescriptor(ContentResolver p0,Uri p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PluginContentResolverUtil.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.openFileDescriptor(PluginContentResolverUtil.proxyUri(p1), p2);
    }
    public static final ParcelFileDescriptor openFileDescriptor(ContentResolver p0,Uri p1,String p2,CancellationSignal p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, PluginContentResolverUtil.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.openFileDescriptor(PluginContentResolverUtil.proxyUri(p1), p2, p3);
    }
    public static final InputStream openInputStream(ContentResolver p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PluginContentResolverUtil.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.openInputStream(PluginContentResolverUtil.proxyUri(p1));
    }
    public static final OutputStream openOutputStream(ContentResolver p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PluginContentResolverUtil.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.openOutputStream(PluginContentResolverUtil.proxyUri(p1));
    }
    public static final OutputStream openOutputStream(ContentResolver p0,Uri p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PluginContentResolverUtil.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.openOutputStream(PluginContentResolverUtil.proxyUri(p1), p2);
    }
    public static final AssetFileDescriptor openTypedAssetFileDescriptor(ContentResolver p0,Uri p1,String p2,Bundle p3,CancellationSignal p4){
       PluginContentResolverUtil pluginConten = PluginContentResolverUtil.class;
       if (PatchProxy.isSupport(pluginConten)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, pluginConten, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p0.openTypedAssetFileDescriptor(PluginContentResolverUtil.proxyUri(p1), p2, p3, p4);
    }
    public static final Uri proxyUri(Uri p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, PluginContentResolverUtil.class, "35");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (PluginContentResolverUtil.b && ProxyContentProvider.getInstance().getRegisteredProviderAuths().contains(p0.getHost())) {
          try{
             obj1 = "content://%s?%s=%s";
             Object[] objArray = new Object[3];
             objArray[0] = PluginContentResolverUtil.c;
             objArray[1] = "real";
             String str = p0.toString();
             obj = PatchProxy.applyOneRefs(str, obj, g.class, "2");
             if (obj != patchProxyRe) {
             }else {
                obj = URLEncoder.encode(str, "utf8");
             }
             objArray[2] = obj;
             obj1 = String.format(obj1, objArray);
             Object[] objArray1 = new Object[]{p0.toString(),obj1};
             d.c(String.format("[contentprovider] change %s to %s", objArray1));
             return Uri.parse(obj1);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       label_006f :
          return p0;
       }else {
          goto label_006f ;
       }
    }
    public static final Cursor query(ContentResolver p0,Uri p1,String[] p2,Bundle p3,CancellationSignal p4){
       PluginContentResolverUtil pluginConten = PluginContentResolverUtil.class;
       if (PatchProxy.isSupport(pluginConten)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, pluginConten, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p0.query(PluginContentResolverUtil.proxyUri(p1), p2, p3, p4);
    }
    public static final Cursor query(ContentResolver p0,Uri p1,String[] p2,String p3,String[] p4,String p5){
       PluginContentResolverUtil pluginConten = PluginContentResolverUtil.class;
       if (PatchProxy.isSupport(pluginConten)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, null, pluginConten, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p0.query(PluginContentResolverUtil.proxyUri(p1), p2, p3, p4, p5);
    }
    public static final Cursor query(ContentResolver p0,Uri p1,String[] p2,String p3,String[] p4,String p5,CancellationSignal p6){
       PluginContentResolverUtil pluginConten = PluginContentResolverUtil.class;
       if (PatchProxy.isSupport(pluginConten)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          Object obj = PatchProxy.apply(objArray, null, pluginConten, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p0.query(PluginContentResolverUtil.proxyUri(p1), p2, p3, p4, p5, p6);
    }
    public static final boolean refresh(ContentResolver p0,Uri p1,Bundle p2,CancellationSignal p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, PluginContentResolverUtil.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.refresh(PluginContentResolverUtil.proxyUri(p1), p2, p3);
    }
    public static final void registerContentObserver(ContentResolver p0,Uri p1,boolean p2,ContentObserver p3){
       if (PatchProxy.isSupport(PluginContentResolverUtil.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, PluginContentResolverUtil.class, "28")) {
          return;
       }
       p0.registerContentObserver(PluginContentResolverUtil.proxyUri(p1), p2, p3);
       return;
    }
    public static void releasePersistableUriPermission(ContentResolver p0,Uri p1,int p2){
       if (PatchProxy.isSupport(PluginContentResolverUtil.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, PluginContentResolverUtil.class, "34")) {
          return;
       }
       p0.releasePersistableUriPermission(PluginContentResolverUtil.proxyUri(p1), p2);
       return;
    }
    public static void takePersistableUriPermission(ContentResolver p0,Uri p1,int p2){
       if (PatchProxy.isSupport(PluginContentResolverUtil.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, PluginContentResolverUtil.class, "33")) {
          return;
       }
       p0.takePersistableUriPermission(PluginContentResolverUtil.proxyUri(p1), p2);
       return;
    }
    public static final Uri uncanonicalize(ContentResolver p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PluginContentResolverUtil.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.uncanonicalize(PluginContentResolverUtil.proxyUri(p1));
    }
    public static final void unregisterContentObserver(ContentResolver p0,ContentObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PluginContentResolverUtil.class, "29")) {
          return;
       }
       p0.unregisterContentObserver(p1);
       return;
    }
    public static final int update(ContentResolver p0,Uri p1,ContentValues p2,String p3,String[] p4){
       PluginContentResolverUtil pluginConten = PluginContentResolverUtil.class;
       if (PatchProxy.isSupport(pluginConten)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, pluginConten, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return p0.update(PluginContentResolverUtil.proxyUri(p1), p2, p3, p4);
    }
    public final ContentProviderClient acquireContentProviderClient(ContentResolver p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PluginContentResolverUtil.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.acquireContentProviderClient(p1);
    }
    public final ContentProviderClient acquireUnstableContentProviderClient(ContentResolver p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PluginContentResolverUtil.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.acquireUnstableContentProviderClient(p1);
    }
    public final AssetFileDescriptor openTypedAssetFileDescriptor(ContentResolver p0,Uri p1,String p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PluginContentResolverUtil.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.openTypedAssetFileDescriptor(PluginContentResolverUtil.proxyUri(p1), p2, p3);
    }
}
