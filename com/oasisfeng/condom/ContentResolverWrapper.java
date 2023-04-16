package com.oasisfeng.condom.ContentResolverWrapper;
import android.content.ContentResolver;
import android.content.Context;
import java.lang.String;
import android.content.IContentProvider;
import java.util.ArrayList;
import android.content.ContentProviderResult;
import android.net.Uri;
import java.util.List;
import android.database.ContentObserver;
import android.os.Bundle;

public class ContentResolverWrapper extends ContentResolver	// class@000a93
{
    public final ContentResolver mBase;

    public void ContentResolverWrapper(Context p0,ContentResolver p1){
       super(p0);
       this.mBase = p1;
    }
    public IContentProvider acquireExistingProvider(Context p0,String p1){
       return this.mBase.acquireExistingProvider(p0, p1);
    }
    public IContentProvider acquireProvider(Context p0,String p1){
       return this.mBase.acquireProvider(p0, p1);
    }
    public IContentProvider acquireUnstableProvider(Context p0,String p1){
       return this.mBase.acquireUnstableProvider(p0, p1);
    }
    public ContentProviderResult[] applyBatch(String p0,ArrayList p1){
       return this.mBase.applyBatch(p0, p1);
    }
    public void cancelSync(Uri p0){
       this.mBase.cancelSync(p0);
    }
    public List getOutgoingPersistedUriPermissions(){
       return this.mBase.getOutgoingPersistedUriPermissions();
    }
    public List getPersistedUriPermissions(){
       return this.mBase.getPersistedUriPermissions();
    }
    public String[] getStreamTypes(Uri p0,String p1){
       return this.mBase.getStreamTypes(p0, p1);
    }
    public void notifyChange(Uri p0,ContentObserver p1){
       this.mBase.notifyChange(p0, p1);
    }
    public void notifyChange(Uri p0,ContentObserver p1,int p2){
       this.mBase.notifyChange(p0, p1, p2);
    }
    public void notifyChange(Uri p0,ContentObserver p1,boolean p2){
       this.mBase.notifyChange(p0, p1, p2);
    }
    public void releasePersistableUriPermission(Uri p0,int p1){
       this.mBase.releasePersistableUriPermission(p0, p1);
    }
    public boolean releaseProvider(IContentProvider p0){
       return this.mBase.releaseProvider(p0);
    }
    public boolean releaseUnstableProvider(IContentProvider p0){
       return this.mBase.releaseUnstableProvider(p0);
    }
    public void startSync(Uri p0,Bundle p1){
       this.mBase.startSync(p0, p1);
    }
    public void takePersistableUriPermission(Uri p0,int p1){
       this.mBase.takePersistableUriPermission(p0, p1);
    }
    public void unstableProviderDied(IContentProvider p0){
       this.mBase.unstableProviderDied(p0);
    }
}
