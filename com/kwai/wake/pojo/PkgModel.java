package com.kwai.wake.pojo.PkgModel;
import java.io.Serializable;
import com.kwai.wake.pojo.PkgModel$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import zsd.u;
import com.kwai.wake.pojo.Element;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.lang.CharSequence;
import org.json.JSONObject;
import kotlin.jvm.internal.a;
import org.json.JSONArray;
import java.util.Iterator;

public final class PkgModel implements Serializable	// class@00111d
{
    public List elements;
    public boolean enable;
    public String pkg;
    public int strategy;
    public long timestamp;
    public static final PkgModel$a Companion;
    public static final long serialVersionUID;

    static {
       PkgModel.Companion = new PkgModel$a(null);
    }
    public void PkgModel(){
       super();
       this.pkg = "";
       this.strategy = 1;
    }
    public void PkgModel(u p0){
       super();
    }
    public boolean equals(Object p0){
       Element[] uElementArra;
       Object[] objArray1;
       boolean b = true;
       if (this == p0) {
       }else if(p0 instanceof PkgModel){
          Object[] objArray = null;
          if (u.J1(this.pkg, p0.pkg, false, 2, objArray) && (!this.timestamp - p0.timestamp && (this.enable == p0.enable && this.strategy == p0.strategy))) {
             PkgModel telements = this.elements;
             if (telements != null) {
                uElementArra = new Element[false];
                objArray1 = telements.toArray(uElementArra);
                Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
             }else {
                objArray1 = objArray;
             }
             p0 = p0.elements;
             if (p0 != null) {
                uElementArra = new Element[false];
                p0 = p0.toArray(uElementArra);
                Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Array<T>");
                objArray = p0;
             }
             if (!Arrays.equals(objArray1, objArray)) {
             label_0055 :
                b = false;
             }
          }else {
             goto label_0055 ;
          }
       }else {
          goto label_0055 ;
       }
       return b;
    }
    public final List getElements(){
       return this.elements;
    }
    public final boolean getEnable(){
       return this.enable;
    }
    public final String getPkg(){
       return this.pkg;
    }
    public final int getStrategy(){
       return this.strategy;
    }
    public final long getTimestamp(){
       return this.timestamp;
    }
    public int hashCode(){
       PkgModel tpkg = this.pkg;
       int i = 0;
       int i1 = (tpkg != null)? tpkg.hashCode(): 0;
       i1 = (((((i1 * 31) + (int)this.timestamp) * 31) + this.enable) * 31) + this.strategy;
       PkgModel telements = this.elements;
       if (telements != null) {
          Element[] uElementArra = new Element[i];
          Object[] objArray = telements.toArray(uElementArra);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          i1 = (i1 * 31) + Arrays.hashCode(objArray);
       }
       return i1;
    }
    public final boolean isValid(){
       PkgModel tpkg = this.pkg;
       boolean b = false;
       tpkg = (tpkg == null || !tpkg.length())? 1: null;
       if (!tpkg) {
          tpkg = this.elements;
          if (tpkg != null && (1 == (tpkg.isEmpty() ^ 1) && this.enable != null)) {
             b = true;
          }
       }
       return b;
    }
    public final void setTimestamp(long p0){
       this.timestamp = p0;
    }
    public String toString(){
       JSONObject jSONObject = new JSONObject();
       PkgModel tpkg = this.pkg;
       if (tpkg != null) {
          jSONObject.put("pkg", tpkg);
       }
       jSONObject.put("timestamp", this.timestamp);
       jSONObject.put("enable", this.enable);
       jSONObject.put("strategy", this.strategy);
       tpkg = this.elements;
       if (tpkg != null && (tpkg.isEmpty() ^ 0x01)) {
          Objects.requireNonNull(Element.Companion);
          a.p(tpkg, "elements");
          JSONArray jSONArray = new JSONArray();
          Iterator iterator = tpkg.iterator();
          while (iterator.hasNext()) {
             Element uElement = iterator.next();
             if (uElement != null) {
                jSONArray.put(uElement.toString());
             }
          }
          String str = jSONArray.toString();
          a.o(str, "jsonArray.toString\(\)");
          jSONObject.put("elements", str);
       }
       String str1 = jSONObject.toString();
       a.o(str1, "json.toString\(\)");
       return str1;
    }
}
