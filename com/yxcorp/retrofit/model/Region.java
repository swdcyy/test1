package com.yxcorp.retrofit.model.Region;
import java.lang.Object;
import java.lang.String;

public class Region	// class@0013e2
{
    public String mName;
    public String mTicket;
    public String mUid;

    public void Region(){
       super();
    }
    public void Region(String p0,String p1,String p2){
       super();
       this.mUid = p0;
       this.mName = p1;
       this.mTicket = p2;
    }
    public String a(){
       Region tmName = this.mName;
       if (tmName == null) {
          tmName = "";
       }
       return tmName;
    }
    public String b(){
       Region tmTicket = this.mTicket;
       if (tmTicket == null) {
          tmTicket = "";
       }
       return tmTicket;
    }
    public String c(){
       Region tmUid = this.mUid;
       if (tmUid == null) {
          tmUid = "";
       }
       return tmUid;
    }
}
