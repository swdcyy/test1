package com.kwai.plugin.dva.feature.core.hook.component.ContentProviderProxy;
import android.content.ContentProvider;
import java.util.ArrayList;
import android.content.ContentProviderResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.content.pm.ProviderInfo;
import com.kwai.plugin.dva.feature.core.loader.SplitLoaderManager;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.util.List;
import android.net.Uri;
import android.content.ContentValues;
import java.lang.Number;
import android.os.Bundle;
import java.lang.ClassLoader;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.StringBuilder;
import android.content.res.Configuration;
import java.lang.Integer;
import android.content.res.AssetFileDescriptor;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.content.ContentProvider$PipeDataWriter;
import android.database.Cursor;
import java.lang.Boolean;

public abstract class ContentProviderProxy extends ContentProvider	// class@001306
{
    public ProviderInfo providerInfo;
    public ContentProvider realContentProvider;
    public String realContentProviderClassName;
    public String splitName;

    public void ContentProviderProxy(){
       super();
    }
    public ContentProviderResult[] applyBatch(ArrayList p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ContentProviderProxy.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.applyBatch(p0);
       }
       return super.applyBatch(p0);
    }
    public void attachInfo(Context p0,ProviderInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ContentProviderProxy.class, "2")) {
          return;
       }
       String[] stringArray = (this.getClass().getName()).split("_Decorated_");
       this.realContentProviderClassName = stringArray[0];
       this.splitName = stringArray[1];
       super.attachInfo(p0, p1);
       this.providerInfo = new ProviderInfo(p1);
       ContentProviderProxy tsplitName = this.splitName;
       if (!PatchProxy.applyVoidTwoRefs(tsplitName, this, null, SplitLoaderManager.class, "4")) {
          a.p(tsplitName, "splitName");
          a.p(this, "providerProxy");
          Map c = SplitLoaderManager.c;
          List list = c.get(tsplitName);
          if (list == null) {
             list = new ArrayList();
             c.put(tsplitName, list);
          }
          list.add(this);
       }
       return;
    }
    public int bulkInsert(Uri p0,ContentValues[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ContentProviderProxy.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.bulkInsert(p0, p1);
       }
       return super.bulkInsert(p0, p1);
    }
    public Bundle call(String p0,String p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContentProviderProxy.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.call(p0, p1, p2);
       }
       return super.call(p0, p1, p2);
    }
    public Uri canonicalize(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ContentProviderProxy.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getRealContentProvider() != null) {
          return this.realContentProvider.canonicalize(p0);
       }
       return super.canonicalize(p0);
    }
    public abstract boolean checkRealContentProviderInstallStatus(String p0);
    public void createAndActivateRealContentProvider(ClassLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContentProviderProxy.class, "1")) {
          return;
       }
       ContentProviderProxy trealContent = this.realContentProviderClassName;
       if (trealContent == null) {
          throw new Exception("Unable to read real content-provider for "+this.getClass().getName());
       }
       Throwable throwable = null;
       try{
          ContentProvider uContentProv = p0.loadClass(trealContent).newInstance();
          this.realContentProvider = uContentProv;
          uContentProv.attachInfo(this.getContext(), this.providerInfo);
       }catch(java.lang.IllegalAccessException e4){
       }catch(java.lang.InstantiationException e4){
       }catch(java.lang.ClassNotFoundException e4){
       }
       if (!throwable) {
          return;
       }
       throw new Exception(throwable);
    }
    public int delete(Uri p0,String p1,String[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContentProviderProxy.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.delete(p0, p1, p2);
       }
       return 0;
    }
    public ContentProvider getRealContentProvider(){
       return this.realContentProvider;
    }
    public String[] getStreamTypes(Uri p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ContentProviderProxy.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.getStreamTypes(p0, p1);
       }
       return super.getStreamTypes(p0, p1);
    }
    public String getType(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ContentProviderProxy.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.getType(p0);
       }
       return null;
    }
    public Uri insert(Uri p0,ContentValues p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ContentProviderProxy.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.insert(p0, p1);
       }
       return null;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContentProviderProxy.class, "3")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          this.realContentProvider.onConfigurationChanged(p0);
       }
       return;
    }
    public boolean onCreate(){
       return true;
    }
    public void onLowMemory(){
       if (PatchProxy.applyVoid(null, this, ContentProviderProxy.class, "23")) {
          return;
       }
       super.onLowMemory();
       ContentProviderProxy trealContent = this.realContentProvider;
       if (trealContent != null) {
          trealContent.onLowMemory();
       }
       return;
    }
    public void onTrimMemory(int p0){
       if (PatchProxy.isSupport(ContentProviderProxy.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ContentProviderProxy.class, "22")) {
          return;
       }
       super.onTrimMemory(p0);
       ContentProviderProxy trealContent = this.realContentProvider;
       if (trealContent != null) {
          trealContent.onTrimMemory(p0);
       }
       return;
    }
    public AssetFileDescriptor openAssetFile(Uri p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ContentProviderProxy.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.openAssetFile(p0, p1);
       }
       return super.openAssetFile(p0, p1);
    }
    public AssetFileDescriptor openAssetFile(Uri p0,String p1,CancellationSignal p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContentProviderProxy.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.openAssetFile(p0, p1, p2);
       }
       return super.openAssetFile(p0, p1, p2);
    }
    public ParcelFileDescriptor openFile(Uri p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ContentProviderProxy.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.openFile(p0, p1);
       }
       return super.openFile(p0, p1);
    }
    public ParcelFileDescriptor openFile(Uri p0,String p1,CancellationSignal p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContentProviderProxy.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.openFile(p0, p1, p2);
       }
       return super.openFile(p0, p1, p2);
    }
    public ParcelFileDescriptor openPipeHelper(Uri p0,String p1,Bundle p2,Object p3,ContentProvider$PipeDataWriter p4){
       if (PatchProxy.isSupport(ContentProviderProxy.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, ContentProviderProxy.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.openPipeHelper(p0, p1, p2, p3, p4);
       }else {
          return super.openPipeHelper(p0, p1, p2, p3, p4);
       }
    }
    public AssetFileDescriptor openTypedAssetFile(Uri p0,String p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContentProviderProxy.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.openTypedAssetFile(p0, p1, p2);
       }
       return super.openTypedAssetFile(p0, p1, p2);
    }
    public AssetFileDescriptor openTypedAssetFile(Uri p0,String p1,Bundle p2,CancellationSignal p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ContentProviderProxy.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.openTypedAssetFile(p0, p1, p2, p3);
       }
       return super.openTypedAssetFile(p0, p1, p2, p3);
    }
    public Cursor query(Uri p0,String[] p1,Bundle p2,CancellationSignal p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ContentProviderProxy.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.query(p0, p1, p2, p3);
       }
       return super.query(p0, p1, p2, p3);
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       if (PatchProxy.isSupport(ContentProviderProxy.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, ContentProviderProxy.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.query(p0, p1, p2, p3, p4);
       }else {
          return null;
       }
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4,CancellationSignal p5){
       if (PatchProxy.isSupport(ContentProviderProxy.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, this, ContentProviderProxy.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.query(p0, p1, p2, p3, p4, p5);
       }else {
          return super.query(p0, p1, p2, p3, p4, p5);
       }
    }
    public boolean refresh(Uri p0,Bundle p1,CancellationSignal p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContentProviderProxy.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.refresh(p0, p1, p2);
       }
       return super.refresh(p0, p1, p2);
    }
    public Uri uncanonicalize(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ContentProviderProxy.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.uncanonicalize(p0);
       }
       return super.uncanonicalize(p0);
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ContentProviderProxy.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.checkRealContentProviderInstallStatus(this.splitName)) {
          return this.realContentProvider.update(p0, p1, p2, p3);
       }
       return 0;
    }
}
