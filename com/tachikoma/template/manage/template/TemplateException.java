package com.tachikoma.template.manage.template.TemplateException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class TemplateException extends Exception	// class@000deb
{
    public String mErrorType;
    public String mTemplateId;
    public int mVersionCode;
    public static final long serialVersionUID = 0xa54698f2f3a1ac15;

    public void TemplateException(){
       super();
       this.mErrorType = "";
    }
    public void TemplateException(String p0){
       super(p0);
       this.mErrorType = "";
    }
    public void TemplateException(String p0,Throwable p1){
       super(p0, p1);
       this.mErrorType = "";
       if (p1 instanceof TemplateException) {
          this.mTemplateId = p1.mTemplateId;
          this.mVersionCode = p1.mVersionCode;
          this.mErrorType = p1.mErrorType;
       }
       return;
    }
    public void TemplateException(Throwable p0){
       super(p0);
       this.mErrorType = "";
       if (p0 instanceof TemplateException) {
          this.mTemplateId = p0.mTemplateId;
          this.mVersionCode = p0.mVersionCode;
          this.mErrorType = p0.mErrorType;
       }
       return;
    }
    public String getErrorType(){
       return this.mErrorType;
    }
    public String getTemplateId(){
       return this.mTemplateId;
    }
    public int getVersionCode(){
       return this.mVersionCode;
    }
    public TemplateException setErrorType(String p0){
       this.mErrorType = p0;
       return this;
    }
    public TemplateException setTemplateId(String p0){
       this.mTemplateId = p0;
       return this;
    }
    public TemplateException setVersionCode(int p0){
       this.mVersionCode = p0;
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TemplateException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TemplateException{mErrorType=\'"+this.mErrorType+'''+", mTemplateId=\'"+this.mTemplateId+'''+", mVersionCode="+this.mVersionCode+'}'+super.toString();
    }
}
