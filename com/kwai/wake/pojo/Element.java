package com.kwai.wake.pojo.Element;
import java.io.Serializable;
import com.kwai.wake.pojo.Element$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import zsd.u;
import org.json.JSONObject;
import kotlin.jvm.internal.a;

public final class Element implements Serializable	// class@00111b
{
    public boolean enable;
    public int mode;
    public String uri;
    public static final Element$a Companion;
    public static final long serialVersionUID;

    static {
       Element.Companion = new Element$a(null);
    }
    public void Element(){
       super();
       this.uri = "";
    }
    public void Element(u p0){
       super();
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
       }else if(p0 instanceof Element && (this.enable == p0.enable && (this.mode == p0.mode && u.J1(this.uri, p0.uri, false, 2, null)))){
          b = false;
       }
       return b;
    }
    public final boolean getEnable(){
       return this.enable;
    }
    public final int getMode(){
       return this.mode;
    }
    public final String getUri(){
       return this.uri;
    }
    public int hashCode(){
       int i = ((this.mode * 31) + this.enable) * 31;
       Element turi = this.uri;
       int i1 = (turi != null)? turi.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("enable", this.enable);
       jSONObject.put("mode", this.mode);
       Element turi = this.uri;
       if (turi != null) {
          jSONObject.put("uri", turi);
       }
       String str = jSONObject.toString();
       a.o(str, "json.toString\(\)");
       return str;
    }
}
