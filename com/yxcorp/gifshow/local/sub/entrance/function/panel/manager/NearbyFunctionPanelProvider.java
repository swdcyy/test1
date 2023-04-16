package com.yxcorp.gifshow.local.sub.entrance.function.panel.manager.NearbyFunctionPanelProvider;
import java.io.Serializable;
import java.lang.Object;
import mrd.a;

public class NearbyFunctionPanelProvider implements Serializable	// class@001aa9
{
    public final a mFunctionEntranceDataSubject;
    public static final long serialVersionUID = 0xd55edfad90ed8bfd;

    public void NearbyFunctionPanelProvider(){
       super();
       this.mFunctionEntranceDataSubject = a.g();
    }
    public a getDataObservable(){
       return this.mFunctionEntranceDataSubject;
    }
}
