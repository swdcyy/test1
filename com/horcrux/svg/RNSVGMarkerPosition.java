package com.horcrux.svg.RNSVGMarkerPosition;
import com.horcrux.svg.RNSVGMarkerType;
import com.horcrux.svg.Point;
import java.lang.Object;
import java.lang.Math;
import com.horcrux.svg.SegmentData;
import com.horcrux.svg.RNSVGMarkerPosition$1;
import java.lang.Enum;
import com.horcrux.svg.PathElement;
import java.util.ArrayList;
import com.horcrux.svg.ElementType;
import java.util.Iterator;

public class RNSVGMarkerPosition	// class@0005b8
{
    public double angle;
    public Point origin;
    public RNSVGMarkerType type;
    public static boolean auto_start_reverse_;
    public static int element_index_;
    public static Point in_slope_;
    public static Point origin_;
    public static Point out_slope_;
    public static ArrayList positions_;
    public static Point subpath_start_;

    public void RNSVGMarkerPosition(RNSVGMarkerType p0,Point p1,double p2){
       super();
       this.type = p0;
       this.origin = p1;
       this.angle = p2;
    }
    public static double BisectingAngle(double p0,double p1){
       if (Math.abs((p0 - p1)) - 0x4066800000000000 > 0) {
          p0 = p0 + 360.00f;
       }
       return ((p0 + p1) / 2.00f);
    }
    public static void ComputeQuadTangents(SegmentData p0,Point p1,Point p2,Point p3){
       p0.start_tangent = RNSVGMarkerPosition.subtract(p2, p1);
       p0.end_tangent = RNSVGMarkerPosition.subtract(p3, p2);
       if (RNSVGMarkerPosition.isZero(p0.start_tangent)) {
          p0.start_tangent = p0.end_tangent;
       }else if(RNSVGMarkerPosition.isZero(p0.end_tangent)){
          p0.end_tangent = p0.start_tangent;
       }
       return;
    }
    public static double CurrentAngle(RNSVGMarkerType p0){
       double d = RNSVGMarkerPosition.rad2deg(RNSVGMarkerPosition.SlopeAngleRadians(RNSVGMarkerPosition.in_slope_));
       double d1 = RNSVGMarkerPosition.rad2deg(RNSVGMarkerPosition.SlopeAngleRadians(RNSVGMarkerPosition.out_slope_));
       int i = RNSVGMarkerPosition$1.$SwitchMap$com$horcrux$svg$RNSVGMarkerType[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                d = 0;
             }
             return d;
          }else {
             return RNSVGMarkerPosition.BisectingAngle(d, d1);
          }
       }else if(RNSVGMarkerPosition.auto_start_reverse_){
          d1 = d1 + 180.00f;
       }
       return d1;
    }
    public static SegmentData ExtractPathElementFeatures(PathElement p0){
       SegmentData segmentData = new SegmentData();
       PathElement points = p0.points;
       int i = RNSVGMarkerPosition$1.$SwitchMap$com$horcrux$svg$ElementType[p0.type.ordinal()];
       object oobject = 2;
       int i1 = 0;
       if (i != 1) {
          if (i != oobject) {
             if (i != 3 && i != 4) {
                if (i == 5) {
                   Point subpath_star = RNSVGMarkerPosition.subpath_start_;
                   segmentData.position = subpath_star;
                   segmentData.start_tangent = RNSVGMarkerPosition.subtract(subpath_star, RNSVGMarkerPosition.origin_);
                   segmentData.end_tangent = RNSVGMarkerPosition.subtract(segmentData.position, RNSVGMarkerPosition.origin_);
                }
             }else {
                object oobject1 = points[i1];
                segmentData.position = oobject1;
                segmentData.start_tangent = RNSVGMarkerPosition.subtract(oobject1, RNSVGMarkerPosition.origin_);
                segmentData.end_tangent = RNSVGMarkerPosition.subtract(segmentData.position, RNSVGMarkerPosition.origin_);
             }
          }else {
             segmentData.position = points[1];
             RNSVGMarkerPosition.ComputeQuadTangents(segmentData, RNSVGMarkerPosition.origin_, points[i1], points[1]);
          }
       }else {
          segmentData.position = points[oobject];
          segmentData.start_tangent = RNSVGMarkerPosition.subtract(points[i1], RNSVGMarkerPosition.origin_);
          segmentData.end_tangent = RNSVGMarkerPosition.subtract(points[oobject], points[1]);
          if (RNSVGMarkerPosition.isZero(segmentData.start_tangent)) {
             RNSVGMarkerPosition.ComputeQuadTangents(segmentData, points[i1], points[1], points[oobject]);
          }else if(RNSVGMarkerPosition.isZero(segmentData.end_tangent)){
             RNSVGMarkerPosition.ComputeQuadTangents(segmentData, RNSVGMarkerPosition.origin_, points[i1], points[1]);
          }
       }
       return segmentData;
    }
    public static void PathIsDone(){
       RNSVGMarkerType kEndMarker = RNSVGMarkerType.kEndMarker;
       RNSVGMarkerPosition.positions_.add(new RNSVGMarkerPosition(kEndMarker, RNSVGMarkerPosition.origin_, RNSVGMarkerPosition.CurrentAngle(kEndMarker)));
    }
    public static double SlopeAngleRadians(Point p0){
       return Math.atan2(p0.y, p0.x);
    }
    public static void UpdateFromPathElement(PathElement p0){
       SegmentData segmentData = RNSVGMarkerPosition.ExtractPathElementFeatures(p0);
       RNSVGMarkerPosition.out_slope_ = segmentData.start_tangent;
       int element_inde = RNSVGMarkerPosition.element_index_;
       if (element_inde > 0) {
          RNSVGMarkerType kStartMarker = (element_inde == 1)? RNSVGMarkerType.kStartMarker: RNSVGMarkerType.kMidMarker;
          RNSVGMarkerPosition.positions_.add(new RNSVGMarkerPosition(kStartMarker, RNSVGMarkerPosition.origin_, RNSVGMarkerPosition.CurrentAngle(kStartMarker)));
       }
       RNSVGMarkerPosition.in_slope_ = segmentData.end_tangent;
       RNSVGMarkerPosition.origin_ = segmentData.position;
       PathElement type = p0.type;
       if (type == ElementType.kCGPathElementMoveToPoint) {
          RNSVGMarkerPosition.subpath_start_ = p0.points[0];
       }else if(type == ElementType.kCGPathElementCloseSubpath){
          RNSVGMarkerPosition.subpath_start_ = new Point(0, 0);
       }
       RNSVGMarkerPosition.element_index_ = RNSVGMarkerPosition.element_index_ + 1;
       return;
    }
    public static ArrayList fromPath(ArrayList p0){
       RNSVGMarkerPosition.positions_ = new ArrayList();
       RNSVGMarkerPosition.element_index_ = 0;
       RNSVGMarkerPosition.origin_ = new Point(0, 0);
       RNSVGMarkerPosition.subpath_start_ = new Point(0, 0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          RNSVGMarkerPosition.UpdateFromPathElement(iterator.next());
       }
       RNSVGMarkerPosition.PathIsDone();
       return RNSVGMarkerPosition.positions_;
    }
    public static boolean isZero(Point p0){
       boolean b = (!p0.x && !p0.y)? true: false;
       return b;
    }
    public static double rad2deg(double p0){
       return (p0 * 0x404ca5dc1a63c1f8);
    }
    public static Point subtract(Point p0,Point p1){
       return new Point((p1.x - p0.x), (p1.y - p0.y));
    }
}
