package com.google.common.graph.GraphConstants$Presence;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class GraphConstants$Presence extends Enum	// class@0018d5
{
    public static final GraphConstants$Presence[] $VALUES;
    public static final GraphConstants$Presence EDGE_EXISTS;

    static {
       GraphConstants$Presence presence = new GraphConstants$Presence("EDGE_EXISTS", 0);
       GraphConstants$Presence.EDGE_EXISTS = presence;
       GraphConstants$Presence[] presenceArra = new GraphConstants$Presence[]{presence};
       GraphConstants$Presence.$VALUES = presenceArra;
    }
    public void GraphConstants$Presence(String p0,int p1){
       super(p0, p1);
    }
    public static GraphConstants$Presence valueOf(String p0){
       return Enum.valueOf(GraphConstants$Presence.class, p0);
    }
    public static GraphConstants$Presence[] values(){
       return GraphConstants$Presence.$VALUES.clone();
    }
}
