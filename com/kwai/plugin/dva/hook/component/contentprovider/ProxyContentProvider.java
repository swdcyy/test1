package com.kwai.plugin.dva.hook.component.contentprovider.ProxyContentProvider;
import android.content.ContentProvider;
import java.util.HashMap;
import android.net.Uri;
import android.util.Pair;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qj7.g;
import java.net.URLDecoder;
import java.util.Map;
import java.lang.Exception;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.ContentValues;
import java.lang.Number;
import java.util.Set;
import java.lang.StringBuilder;
import qj7.d;
import android.content.res.Configuration;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Integer;
import android.content.res.AssetFileDescriptor;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Bundle;
import android.content.ContentProvider$PipeDataWriter;
import android.database.Cursor;
import java.lang.Boolean;

public class ProxyContentProvider extends ContentProvider	// class@001332
{
    public Map b;
    public static ProxyContentProvider c;

    public void ProxyContentProvider(){
       super();
       this.b = new HashMap();
       ProxyContentProvider.c = this;
    }
    public static ProxyContentProvider getInstance(){
       return ProxyContentProvider.c;
    }
    public final Pair a(Uri p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, ProxyContentProvider.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       try{
          String queryParamet = p0.getQueryParameter("real");
          if (queryParamet != null) {
             String str = PatchProxy.applyOneRefs(queryParamet, obj, g.class, "3");
             if (str != patchProxyRe) {
             }else {
                str = URLDecoder.decode(queryParamet, "utf8");
             }
             queryParamet = Uri.parse(str);
             return new Pair(this.b.get(queryParamet.getHost()), queryParamet);
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return obj;
    }
    public void attachInfo(Context p0,ProviderInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProxyContentProvider.class, "3")) {
          return;
       }
       super.attachInfo(p0, p1);
       return;
    }
    public int bulkInsert(Uri p0,ContentValues[] p1){
       Pair obj = PatchProxy.applyTwoRefs(p0, p1, this, ProxyContentProvider.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.bulkInsert(obj.second, p1);
       }
       return super.bulkInsert(p0, p1);
    }
    public Uri canonicalize(Uri p0){
       Pair obj = PatchProxy.applyOneRefs(p0, this, ProxyContentProvider.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.canonicalize(obj.second);
       }
       return super.canonicalize(p0);
    }
    public int delete(Uri p0,String p1,String[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProxyContentProvider.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Pair pair = this.a(p0);
       if (pair != null) {
          return pair.first.delete(pair.second, p1, p2);
       }
       return 0;
    }
    public Set getRegisteredProviderAuths(){
       Object obj = PatchProxy.apply(null, this, ProxyContentProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.keySet();
    }
    public String[] getStreamTypes(Uri p0,String p1){
       Pair obj = PatchProxy.applyTwoRefs(p0, p1, this, ProxyContentProvider.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.getStreamTypes(p0, p1);
       }
       return super.getStreamTypes(p0, p1);
    }
    public String getType(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProxyContentProvider.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.c("ProxyContentProvider getType "+p0.toString());
       Pair pair = this.a(p0);
       if (pair != null) {
          return pair.first.getType(pair.second);
       }
       return null;
    }
    public Uri insert(Uri p0,ContentValues p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ProxyContentProvider.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Pair pair = this.a(p0);
       if (pair != null) {
          return pair.first.insert(pair.second, p1);
       }
       return null;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProxyContentProvider.class, "11")) {
          return;
       }
       super.onConfigurationChanged(p0);
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onConfigurationChanged(p0);
       }
       return;
    }
    public boolean onCreate(){
       return false;
    }
    public void onLowMemory(){
       if (PatchProxy.applyVoid(null, this, ProxyContentProvider.class, "12")) {
          return;
       }
       super.onLowMemory();
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onLowMemory();
       }
       return;
    }
    public void onTrimMemory(int p0){
       if (PatchProxy.isSupport(ProxyContentProvider.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ProxyContentProvider.class, "13")) {
          return;
       }
       super.onTrimMemory(p0);
       Iterator iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onTrimMemory(p0);
       }
       return;
    }
    public AssetFileDescriptor openAssetFile(Uri p0,String p1){
       Pair obj = PatchProxy.applyTwoRefs(p0, p1, this, ProxyContentProvider.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.openAssetFile(obj.second, p1);
       }
       return super.openAssetFile(p0, p1);
    }
    public AssetFileDescriptor openAssetFile(Uri p0,String p1,CancellationSignal p2){
       Pair obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProxyContentProvider.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.openAssetFile(obj.second, p1, p2);
       }
       return super.openAssetFile(p0, p1, p2);
    }
    public ParcelFileDescriptor openFile(Uri p0,String p1){
       Pair obj = PatchProxy.applyTwoRefs(p0, p1, this, ProxyContentProvider.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.openFile(obj.second, p1);
       }
       return super.openFile(p0, p1);
    }
    public ParcelFileDescriptor openFile(Uri p0,String p1,CancellationSignal p2){
       Pair obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProxyContentProvider.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.openFile(obj.second, p1, p2);
       }
       return super.openFile(p0, p1, p2);
    }
    public ParcelFileDescriptor openPipeHelper(Uri p0,String p1,Bundle p2,Object p3,ContentProvider$PipeDataWriter p4){
       Pair obj;
       if (PatchProxy.isSupport(ProxyContentProvider.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, ProxyContentProvider.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.openPipeHelper(obj.second, p1, p2, p3, p4);
       }else {
          return super.openPipeHelper(p0, p1, p2, p3, p4);
       }
    }
    public AssetFileDescriptor openTypedAssetFile(Uri p0,String p1,Bundle p2){
       Pair obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProxyContentProvider.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.openTypedAssetFile(obj.second, p1, p2);
       }
       return super.openTypedAssetFile(p0, p1, p2);
    }
    public AssetFileDescriptor openTypedAssetFile(Uri p0,String p1,Bundle p2,CancellationSignal p3){
       Pair obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ProxyContentProvider.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.openTypedAssetFile(obj.second, p1, p2, p3);
       }
       return super.openTypedAssetFile(p0, p1, p2, p3);
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       if (PatchProxy.isSupport(ProxyContentProvider.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, ProxyContentProvider.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Pair pair = this.a(p0);
       if (pair != null) {
          return pair.first.query(pair.second, p1, p2, p3, p4);
       }else {
          return null;
       }
    }
    public boolean refresh(Uri p0,Bundle p1,CancellationSignal p2){
       Pair obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProxyContentProvider.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.refresh(p0, p1, p2);
       }
       return super.refresh(p0, p1, p2);
    }
    public void registerContentProvider(String p0,ContentProvider p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProxyContentProvider.class, "2")) {
          return;
       }
       if (this.b.containsKey(p0)) {
          return;
       }
       HashMap hashMap = new HashMap(this.b);
       hashMap.put(p0, p1);
       this.b = hashMap;
       return;
    }
    public Uri uncanonicalize(Uri p0){
       Pair obj = PatchProxy.applyOneRefs(p0, this, ProxyContentProvider.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a(p0);
       if (obj != null) {
          return obj.first.uncanonicalize(obj.second);
       }
       return super.uncanonicalize(p0);
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ProxyContentProvider.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Pair pair = this.a(p0);
       if (pair != null) {
          return pair.first.update(pair.second, p1, p2, p3);
       }
       return 0;
    }
}
