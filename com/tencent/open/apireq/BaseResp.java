package com.tencent.open.apireq.BaseResp;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class BaseResp	// class@000f40
{
    public int a;
    public String b;

    public void BaseResp(){
       super();
       this.a = 0;
       this.b = "";
    }
    public String a(int p0){
       return "Api call failed.";
    }
    public int getCode(){
       return this.a;
    }
    public String getErrorMsg(){
       return this.b;
    }
    public boolean isSuccess(){
       boolean b = (this.a == null)? true: false;
       return b;
    }
    public void setCode(int p0){
       String str;
       this.a = p0;
       if (p0 != -2001) {
          if (p0 != -2000) {
             if (p0) {
                switch (p0){
                    case 0xfffffc16:
                      str = "The QQ branch \(e.g. TIM\) is not supported";
                      break;
                    case 0xfffffc17:
                      str = "QQ version is too low.";
                      break;
                    case 0xfffffc18:
                      str = "QQ is not installed.";
                      break;
                    default:
                      str = this.a(p0);
                }
             }else {
                str = "";
             }
          }else {
             str = "The given params check failed.";
          }
       }else {
          str = "Not login.";
       }
       this.setErrorMsg(str);
       return;
    }
    public void setErrorMsg(String p0){
       this.b = p0;
    }
    public String toString(){
       return "BaseResp{mCode="+this.a+", mErrorMsg=\'"+this.b+'''+'}';
    }
}
