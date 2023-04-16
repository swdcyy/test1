package com.albinmathew.photocrop.cropoverlay.edge.Edge;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Edge extends Enum	// class@000ddc
{
    public float mCoordinate;
    public static final Edge[] $VALUES;
    public static final Edge BOTTOM;
    public static final Edge LEFT;
    public static final Edge RIGHT;
    public static final Edge TOP;

    static {
       Edge uEdge = new Edge("LEFT", 0);
       Edge.LEFT = uEdge;
       Edge uEdge1 = new Edge("TOP", 1);
       Edge.TOP = uEdge1;
       Edge uEdge2 = new Edge("RIGHT", 2);
       Edge.RIGHT = uEdge2;
       Edge uEdge3 = new Edge("BOTTOM", 3);
       Edge.BOTTOM = uEdge3;
       Edge[] uEdgeArray = new Edge[]{uEdge,uEdge1,uEdge2,uEdge3};
       Edge.$VALUES = uEdgeArray;
    }
    public void Edge(String p0,int p1){
       super(p0, p1);
    }
    public static float getHeight(){
       return (Edge.BOTTOM.getCoordinate() - Edge.TOP.getCoordinate());
    }
    public static float getWidth(){
       return (Edge.RIGHT.getCoordinate() - Edge.LEFT.getCoordinate());
    }
    public static Edge valueOf(String p0){
       return Enum.valueOf(Edge.class, p0);
    }
    public static Edge[] values(){
       return Edge.$VALUES.clone();
    }
    public float getCoordinate(){
       return this.mCoordinate;
    }
    public void setCoordinate(float p0){
       this.mCoordinate = p0;
    }
}
