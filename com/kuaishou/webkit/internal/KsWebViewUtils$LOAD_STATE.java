package com.kuaishou.webkit.internal.KsWebViewUtils$LOAD_STATE;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KsWebViewUtils$LOAD_STATE extends Enum	// class@00131c
{
    public static final KsWebViewUtils$LOAD_STATE[] $VALUES;
    public static final KsWebViewUtils$LOAD_STATE LOADED;
    public static final KsWebViewUtils$LOAD_STATE LOADING;
    public static final KsWebViewUtils$LOAD_STATE NONE_INIT;

    static {
       KsWebViewUtils$LOAD_STATE lOAD_STATE = new KsWebViewUtils$LOAD_STATE("NONE_INIT", 0);
       KsWebViewUtils$LOAD_STATE.NONE_INIT = lOAD_STATE;
       KsWebViewUtils$LOAD_STATE lOAD_STATE1 = new KsWebViewUtils$LOAD_STATE("LOADING", 1);
       KsWebViewUtils$LOAD_STATE.LOADING = lOAD_STATE1;
       KsWebViewUtils$LOAD_STATE lOAD_STATE2 = new KsWebViewUtils$LOAD_STATE("LOADED", 2);
       KsWebViewUtils$LOAD_STATE.LOADED = lOAD_STATE2;
       KsWebViewUtils$LOAD_STATE[] lOAD_STATEAr = new KsWebViewUtils$LOAD_STATE[]{lOAD_STATE,lOAD_STATE1,lOAD_STATE2};
       KsWebViewUtils$LOAD_STATE.$VALUES = lOAD_STATEAr;
    }
    public void KsWebViewUtils$LOAD_STATE(String p0,int p1){
       super(p0, p1);
    }
    public static KsWebViewUtils$LOAD_STATE valueOf(String p0){
       return Enum.valueOf(KsWebViewUtils$LOAD_STATE.class, p0);
    }
    public static KsWebViewUtils$LOAD_STATE[] values(){
       return KsWebViewUtils$LOAD_STATE.$VALUES.clone();
    }
}
