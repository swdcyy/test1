package com.google.common.graph.Graphs$NodeVisitState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Graphs$NodeVisitState extends Enum	// class@0018d6
{
    public static final Graphs$NodeVisitState[] $VALUES;
    public static final Graphs$NodeVisitState COMPLETE;
    public static final Graphs$NodeVisitState PENDING;

    static {
       Graphs$NodeVisitState nodeVisitSta = new Graphs$NodeVisitState("PENDING", 0);
       Graphs$NodeVisitState.PENDING = nodeVisitSta;
       Graphs$NodeVisitState nodeVisitSta1 = new Graphs$NodeVisitState("COMPLETE", 1);
       Graphs$NodeVisitState.COMPLETE = nodeVisitSta1;
       Graphs$NodeVisitState[] nodeVisitSta2 = new Graphs$NodeVisitState[]{nodeVisitSta,nodeVisitSta1};
       Graphs$NodeVisitState.$VALUES = nodeVisitSta2;
    }
    public void Graphs$NodeVisitState(String p0,int p1){
       super(p0, p1);
    }
    public static Graphs$NodeVisitState valueOf(String p0){
       return Enum.valueOf(Graphs$NodeVisitState.class, p0);
    }
    public static Graphs$NodeVisitState[] values(){
       return Graphs$NodeVisitState.$VALUES.clone();
    }
}
