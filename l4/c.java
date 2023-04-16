package l4.c;
import android.os.AsyncTask;
import com.facebook.react.bridge.Callback;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import java.lang.Integer;
import java.io.File;
import java.lang.StringBuilder;
import com.facebook.react.bridge.WritableMap;
import com.RNFetchBlob.b;
import com.facebook.react.bridge.ReadableMap;

public final class c extends AsyncTask	// class@002510
{
    public final Callback a;
    public final Context b;

    public void c(Callback p0,Context p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object doInBackground(Object[] p0){
       Object[] objArray1;
       WritableArray writableArra = Arguments.createArray();
       Integer integer = Integer.valueOf(0);
       int i = 1;
       if (p0[0] == null) {
          Object[] objArray = new Object[i];
          objArray[0] = "the path specified for lstat is either `null` or `undefined`.";
          this.a.invoke(objArray);
       }else {
          File uFile = new File(p0[0]);
          if (!uFile.exists()) {
             objArray1 = new Object[i];
             objArray1[0] = "failed to lstat path `"+p0[0]+"` because it does not exist or it is not a folder";
             this.a.invoke(objArray1);
          }else if(uFile.isDirectory()){
             String[] stringArray = uFile.list();
             int len = stringArray.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                writableArra.pushMap(b.i(this.b, uFile.getPath()+"/"+stringArray[i1]));
             }
          }else {
             writableArra.pushMap(b.i(this.b, uFile.getAbsolutePath()));
          }
          objArray1 = new Object[]{null,writableArra};
          this.a.invoke(objArray1);
       }
       return integer;
    }
}
