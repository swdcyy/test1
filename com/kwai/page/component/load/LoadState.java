package com.kwai.page.component.load.LoadState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LoadState extends Enum	// class@001041
{
    public static final LoadState[] $VALUES;
    public static final LoadState DESTROY;
    public static final LoadState LOAD;
    public static final LoadState UNLOAD;

    static {
       LoadState loadState = new LoadState("LOAD", 0);
       LoadState.LOAD = loadState;
       LoadState loadState1 = new LoadState("UNLOAD", 1);
       LoadState.UNLOAD = loadState1;
       LoadState loadState2 = new LoadState("DESTROY", 2);
       LoadState.DESTROY = loadState2;
       LoadState[] loadStateArr = new LoadState[]{loadState,loadState1,loadState2};
       LoadState.$VALUES = loadStateArr;
    }
    public void LoadState(String p0,int p1){
       super(p0, p1);
    }
    public static LoadState valueOf(String p0){
       return Enum.valueOf(LoadState.class, p0);
    }
    public static LoadState[] values(){
       return LoadState.$VALUES.clone();
    }
}
