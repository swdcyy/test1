package com.kwai.performance.component.manager.provider.UniversalProvider;
import android.content.ContentProvider;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import ke7.a;
import com.kwai.performance.component.manager.provider.a;
import java.lang.RuntimeException;
import android.net.Uri;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Exception;
import android.content.Context;
import android.content.pm.ProviderInfo;
import com.kwai.performance.component.manager.provider.j;
import com.kwai.performance.component.manager.provider.i;
import com.kwai.performance.component.manager.provider.f;
import com.kwai.performance.component.manager.provider.h;
import com.kwai.performance.component.manager.provider.g;
import com.kwai.performance.component.manager.provider.e;
import com.kwai.performance.component.manager.provider.b;
import com.kwai.performance.component.manager.provider.c;
import com.kwai.performance.component.manager.provider.d;
import androidx.lifecycle.ProcessLifecycleOwnerInitializer;
import android.content.ContentValues;
import java.util.List;
import android.os.ParcelFileDescriptor;
import android.database.Cursor;

public class UniversalProvider extends ContentProvider	// class@001046
{
    public static final Map b;
    public static final Map c;
    public static final List d;
    public static UniversalProvider e;

    static {
       UniversalProvider.b = new ConcurrentHashMap();
       UniversalProvider.c = new ConcurrentHashMap();
       UniversalProvider.d = new CopyOnWriteArrayList();
       UniversalProvider.e = null;
    }
    public void UniversalProvider(){
       super();
    }
    public static void c(Callable p0,String p1){
       UniversalProvider.c.put(p0, p1);
    }
    public static void d(a p0,String p1){
       if (p0 instanceof a && p1.isEmpty()) {
          throw new RuntimeException("fatal: the authorities of MirrorProvider can\'t be null");
       }
       UniversalProvider.b.put(p0, p1);
       UniversalProvider e = UniversalProvider.e;
       if (e != null) {
          e.onCreate();
       }
       return;
    }
    public final a a(Uri p0){
       Map$Entry uEntry;
       String value;
       Iterator iterator = UniversalProvider.b.entrySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             uEntry = iterator.next();
             if (this.b(p0, uEntry.getValue())) {
                return uEntry.getKey();
             }
             continue ;
          }else {
             iterator = UniversalProvider.c.entrySet().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   uEntry = iterator.next();
                   value = uEntry.getValue();
                   if (this.b(p0, value)) {
                   }else {
                      continue ;
                   }
                }else {
                }
             }
             try{
                a uoa = uEntry.getKey().call();
                UniversalProvider.d(uoa, value);
                return uoa;
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
                goto label_0033 ;
             }
          }
       }
       return null;
    }
    public void attachInfo(Context p0,ProviderInfo p1){
       UniversalProvider.c(j.b, "com.yxcorp.gifshow.authorization.authProvider");
       UniversalProvider.c(i.b, "com.yxcorp.gifshow.authorization.fontsProvider");
       UniversalProvider.c(f.b, "com.yxcorp.gifshow.ShareAuthProvider");
       UniversalProvider.c(h.b, "KWAI_PROVIDER_AUTHORITY.com.smile.gifmaker");
       UniversalProvider.c(g.b, "com.smile.gifmaker.plugin.data.provider");
       UniversalProvider.c(e.b, "com.smile.gifmaker.DfpBridgeContentProvider");
       UniversalProvider.c(b.b, "com.smile.gifmaker.v2.mmProviderF");
       UniversalProvider.c(c.b, "com.smile.gifmaker.v2.mmProviderS");
       UniversalProvider.c(d.b, "com.smile.gifmaker.v2.mmProviderT");
       UniversalProvider.d(new ProcessLifecycleOwnerInitializer(), "com.smile.gifmaker.lifecycle-process");
       super.attachInfo(p0, p1);
       UniversalProvider.e = this;
    }
    public final boolean b(Uri p0,String p1){
       if (p1 == null) {
          return false;
       }
       return (p0.getAuthority()).equals(p1);
    }
    public int delete(Uri p0,String p1,String[] p2){
       a uoa = this.a(p0);
       if (uoa instanceof a) {
          return uoa.delete(p0, p1, p2);
       }
       return 0;
    }
    public String getType(Uri p0){
       a uoa = this.a(p0);
       if (uoa instanceof a) {
          return uoa.getType(p0);
       }
       return null;
    }
    public Uri insert(Uri p0,ContentValues p1){
       a uoa = this.a(p0);
       if (uoa instanceof a) {
          return uoa.insert(p0, p1);
       }
       return null;
    }
    public boolean onCreate(){
       Context context = this.getContext();
       if (context == null) {
          return false;
       }
       Iterator iterator = UniversalProvider.b.keySet().iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          List d = UniversalProvider.d;
          if (d.contains(uoa)) {
             continue ;
          }else {
             d.add(uoa);
             uoa.create(context);
          }
       }
       return true;
    }
    public ParcelFileDescriptor openFile(Uri p0,String p1){
       a uoa = this.a(p0);
       if (uoa instanceof a) {
          return uoa.openFile(p0, p1);
       }
       return super.openFile(p0, p1);
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       a uoa = this.a(p0);
       if (uoa instanceof a) {
          return uoa.query(p0, p1, p2, p3, p4);
       }
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       a uoa = this.a(p0);
       if (uoa instanceof a) {
          return uoa.update(p0, p1, p2, p3);
       }
       return 0;
    }
}
