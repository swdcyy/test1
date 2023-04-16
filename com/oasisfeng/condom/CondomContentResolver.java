package com.oasisfeng.condom.CondomContentResolver;
import com.oasisfeng.condom.ContentResolverWrapper;
import com.oasisfeng.condom.CondomCore;
import android.content.Context;
import android.content.ContentResolver;
import java.lang.String;
import android.content.IContentProvider;

public class CondomContentResolver extends ContentResolverWrapper	// class@000a5d
{
    public final CondomCore a;

    public void CondomContentResolver(CondomCore p0,Context p1,ContentResolver p2){
       super(p1, p2);
       this.a = p0;
    }
    public IContentProvider acquireProvider(Context p0,String p1){
       if (!this.a.shouldAllowProvider(p0, p1, 0x20000)) {
          return null;
       }
       return super.acquireProvider(p0, p1);
    }
    public IContentProvider acquireUnstableProvider(Context p0,String p1){
       if (!this.a.shouldAllowProvider(p0, p1, 0x20000)) {
          return null;
       }
       return super.acquireUnstableProvider(p0, p1);
    }
}
