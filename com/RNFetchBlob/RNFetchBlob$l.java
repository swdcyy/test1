package com.RNFetchBlob.RNFetchBlob$l;
import java.lang.Runnable;
import com.RNFetchBlob.RNFetchBlob;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.RNFetchBlob.b;
import l4.d;
import android.content.Context;
import android.media.MediaScannerConnection$OnScanCompletedListener;
import android.media.MediaScannerConnection;
import java.lang.Exception;

public class RNFetchBlob$l implements Runnable	// class@000d55
{
    public final ReadableArray b;
    public final ReactApplicationContext c;
    public final Callback d;
    public final RNFetchBlob e;

    public void RNFetchBlob$l(RNFetchBlob p0,ReadableArray p1,ReactApplicationContext p2,Callback p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       RNFetchBlob$l td;
       int i = this.b.size();
       String[] stringArray = new String[i];
       String[] stringArray1 = new String[i];
       int i1 = 0;
       String str = null;
       while (i1 < i) {
          ReadableMap map = this.b.getMap(i1);
          String str1 = "path";
          if (map.hasKey(str1)) {
             stringArray[i1] = map.getString(str1);
             str1 = "mime";
             stringArray1[i1] = (map.hasKey(str1))? map.getString(str1): str;
          }
       label_0034 :
          i1 = i1 + 1;
       }
       b uob = new b(this.c);
       try{
          td = this.d;
          MediaScannerConnection.scanFile(uob.a, stringArray, stringArray1, new d(uob, td));
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[]{e0.getLocalizedMessage(),str};
          td.invoke(objArray);
       }
       return;
    }
}
