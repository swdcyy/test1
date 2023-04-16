package com.kwai.middleware.resourcemanager.cache.type.RequestState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RequestState extends Enum	// class@000f40
{
    public static final RequestState[] $VALUES;
    public static final RequestState FAILED;
    public static final RequestState NONE;
    public static final RequestState PROCESSING;
    public static final RequestState SUCCESS;

    static {
       RequestState requestState1;
       RequestState[] requestState = new RequestState[]{requestState1,requestState1,requestState1,requestState1};
       requestState1 = new RequestState("NONE", 0);
       RequestState.NONE = requestState1;
       requestState1 = new RequestState("PROCESSING", 1);
       RequestState.PROCESSING = requestState1;
       requestState1 = new RequestState("SUCCESS", 2);
       RequestState.SUCCESS = requestState1;
       requestState1 = new RequestState("FAILED", 3);
       RequestState.FAILED = requestState1;
       RequestState.$VALUES = requestState;
    }
    public void RequestState(String p0,int p1){
       super(p0, p1);
    }
    public static RequestState valueOf(String p0){
       return Enum.valueOf(RequestState.class, p0);
    }
    public static RequestState[] values(){
       return RequestState.$VALUES.clone();
    }
}
