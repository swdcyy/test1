package com.horcrux.svg.PathElement;
import com.horcrux.svg.ElementType;
import com.horcrux.svg.Point;
import java.lang.Object;

public class PathElement	// class@0005af
{
    public Point[] points;
    public ElementType type;

    public void PathElement(ElementType p0,Point[] p1){
       super();
       this.type = p0;
       this.points = p1;
    }
}
