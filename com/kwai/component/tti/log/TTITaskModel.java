package com.kwai.component.tti.log.TTITaskModel;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class TTITaskModel implements Serializable	// class@000bc9
{
    public long mConst;
    public long mDelay;
    public boolean mIsUI;
    public String mName;
    public String mScene;

    public void TTITaskModel(String p0,boolean p1,String p2,long p3,long p4){
       super();
       this.mName = p0;
       this.mIsUI = p1;
       this.mScene = p2;
       this.mDelay = p3;
       this.mConst = p4;
    }
}
