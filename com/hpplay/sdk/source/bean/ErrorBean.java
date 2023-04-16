package com.hpplay.sdk.source.bean.ErrorBean;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;

public class ErrorBean	// class@00064c
{
    public final String TAG;
    public String data;
    public String error;
    public int errorCode;
    public int manifestVer;

    public void ErrorBean(){
       super();
       this.TAG = "ErrorBean";
    }
    public JSONObject encode(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("manifestVer", this.manifestVer);
          jSONObject.put("errorCode", this.errorCode);
          jSONObject.put("error", this.error);
          jSONObject.put("data", this.data);
       }catch(java.lang.Exception e1){
          a.b("ErrorBean", e1);
       }
       return jSONObject;
    }
    public String getData(){
       return this.data;
    }
    public String getError(){
       return this.error;
    }
    public int getErrorCode(){
       return this.errorCode;
    }
    public int getManifestVer(){
       return this.manifestVer;
    }
    public void setData(String p0){
       this.data = p0;
    }
    public void setError(String p0){
       this.error = p0;
    }
    public void setErrorCode(int p0){
       this.errorCode = p0;
    }
    public void setManifestVer(int p0){
       this.manifestVer = p0;
    }
}
