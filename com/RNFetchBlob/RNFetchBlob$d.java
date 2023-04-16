package com.RNFetchBlob.RNFetchBlob$d;
import com.facebook.react.bridge.ActivityEventListener;
import com.RNFetchBlob.RNFetchBlob;
import java.lang.Object;
import android.app.Activity;
import android.content.Intent;
import l4.b;
import java.lang.Integer;
import android.net.Uri;
import android.util.SparseArray;
import com.facebook.react.bridge.Promise;
import java.lang.String;

public class RNFetchBlob$d implements ActivityEventListener	// class@000d4d
{
    public final RNFetchBlob b;

    public void RNFetchBlob$d(RNFetchBlob p0){
       this.b = p0;
       super();
    }
    public void onActivityResult(Activity p0,int p1,int p2,Intent p3){
       Integer a = b.a;
       if (p1 == a.intValue() && p2 == -1) {
          RNFetchBlob.promiseTable.get(a.intValue()).resolve(p3.getData().toString());
          RNFetchBlob.promiseTable.remove(a.intValue());
       }
       return;
    }
    public void onNewIntent(Intent p0){
    }
}
