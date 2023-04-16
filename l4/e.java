package l4.e;
import android.os.AsyncTask;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.lang.String;
import java.io.File;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Exception;
import java.lang.Integer;

public final class e extends AsyncTask	// class@002512
{
    public final Callback a;

    public void e(Callback p0){
       this.a = p0;
       super();
    }
    public Object doInBackground(Object[] p0){
       int i = 1;
       try{
          ArrayList uArrayList = new ArrayList();
          int i1 = 0;
          while (i1 < p0[0].size()) {
             String str = p0[0].getString(i1);
             File uFile = new File(str);
             if (uFile.exists() && !uFile.delete()) {
                uArrayList.add(str);
             }
             i1 = i1 + 1;
          }
          if (uArrayList.isEmpty()) {
             Object[] objArray1 = new Object[]{null,Boolean.TRUE};
             this.a.invoke(objArray1);
          }else {
             StringBuilder str1 = "Failed to delete: ";
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                str1 = str1+iterator.next()+", ";
             }
             Object[] objArray2 = new Object[i];
             objArray2[0] = str1;
             this.a.invoke(objArray2);
          }
       }catch(java.lang.Exception e2){
          Object[] objArray = new Object[i];
          objArray[0] = e2.getLocalizedMessage();
          this.a.invoke(objArray);
       }
       return Integer.valueOf(p0[0].size());
    }
}
