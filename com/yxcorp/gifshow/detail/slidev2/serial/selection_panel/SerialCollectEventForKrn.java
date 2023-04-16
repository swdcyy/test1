package com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialCollectEventForKrn;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class SerialCollectEventForKrn implements Serializable	// class@0019eb
{
    public final boolean isCollect;
    public final String serialId;

    public void SerialCollectEventForKrn(String p0,boolean p1){
       a.p(p0, "serialId");
       super();
       this.serialId = p0;
       this.isCollect = p1;
    }
    public final String getSerialId(){
       return this.serialId;
    }
    public final boolean isCollect(){
       return this.isCollect;
    }
}
