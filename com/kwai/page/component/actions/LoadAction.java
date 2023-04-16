package com.kwai.page.component.actions.LoadAction;
import ee7.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LoadAction extends Enum implements e	// class@00103e
{
    public static final LoadAction[] $VALUES;
    public static final LoadAction BUILDER_SYNC;

    static {
       LoadAction loadAction = new LoadAction("BUILDER_SYNC", 0);
       LoadAction.BUILDER_SYNC = loadAction;
       LoadAction[] loadActionAr = new LoadAction[]{loadAction};
       LoadAction.$VALUES = loadActionAr;
    }
    public void LoadAction(String p0,int p1){
       super(p0, p1);
    }
    public static LoadAction valueOf(String p0){
       return Enum.valueOf(LoadAction.class, p0);
    }
    public static LoadAction[] values(){
       return LoadAction.$VALUES.clone();
    }
}
