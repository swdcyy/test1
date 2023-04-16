package androidx.appcompat.widget.a$g;
import android.os.AsyncTask;
import androidx.appcompat.widget.a;
import java.lang.Object;
import java.lang.Void;
import java.util.List;
import java.lang.String;
import java.io.FileOutputStream;
import android.content.Context;
import org.xmlpull.v1.XmlSerializer;
import android.util.Xml;
import java.io.OutputStream;
import java.lang.Boolean;
import androidx.appcompat.widget.a$e;
import android.content.ComponentName;

public final class a$g extends AsyncTask	// class@00063c
{
    public final a a;

    public void a$g(a p0){
       this.a = p0;
       super();
    }
    public Void a(Object[] p0){
       String str = "historical-record";
       object oobject = p0[0];
       object oobject1 = p0[1];
       String str1 = null;
       try{
          FileOutputStream uFileOutputS = this.a.d.openFileOutput(oobject1, 0);
          XmlSerializer xmlSerialize = Xml.newSerializer();
          try{
             xmlSerialize.setOutput(uFileOutputS, str1);
             xmlSerialize.startDocument("UTF-8", Boolean.TRUE);
             xmlSerialize.startTag(str1, "historical-records");
             int i = oobject.size();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                a$e uoe = oobject.remove(0);
                xmlSerialize.startTag(str1, str);
                xmlSerialize.attribute(str1, "activity", uoe.a.flattenToString());
                xmlSerialize.attribute(str1, "time", String.valueOf(uoe.b));
                xmlSerialize.attribute(str1, "weight", String.valueOf(uoe.c));
                xmlSerialize.endTag(str1, str);
             }
             xmlSerialize.endTag(str1, "historical-records");
             xmlSerialize.endDocument();
             this.a.i = true;
             if (uFileOutputS == null) {
             label_0098 :
                return str1;
             }
          }catch(java.lang.IllegalArgumentException e0){
             this.a.i = true;
             if (!uFileOutputS) {
             label_0098 :
                return str1;
             }
          }catch(java.lang.IllegalStateException e0){
             this.a.i = true;
             if (!uFileOutputS) {
             label_0098 :
                return str1;
             }
          }catch(java.io.IOException e0){
             this.a.i = true;
             if (!uFileOutputS) {
             label_0098 :
                return str1;
             }
          }
          try{
             uFileOutputS.close();
             goto label_0098 ;
          }catch(java.io.IOException e0){
          }
       }catch(java.io.FileNotFoundException e0){
          return str1;
       }
    }
    public Object doInBackground(Object[] p0){
       this.a(p0);
       return null;
    }
}
