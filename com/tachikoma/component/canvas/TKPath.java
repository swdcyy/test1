package com.tachikoma.component.canvas.TKPath;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Path$FillType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import iq8.n;
import android.graphics.Path$Direction;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;
import java.util.Map;
import nn8.a;
import com.tkruntime.v8.V8Object;
import gx4.c;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;

public class TKPath extends TKBaseNativeModule	// class@000cdd
{
    public final Path f;
    public final RectF g;
    public boolean h;

    public void TKPath(f p0){
       super(p0);
       this.g = new RectF();
       Path path = new Path();
       this.f = path;
       path.setFillType(Path$FillType.WINDING);
    }
    public void addCircle(float p0,float p1,float p2){
       if (PatchProxy.isSupport(TKPath.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, TKPath.class, "3")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.f.addCircle((float)n.a(p0), (float)n.a(p1), (float)n.a(p2), Path$Direction.CW);
       return;
    }
    public void addOval(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPath.class, "2")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       a.a(this.g, V8ObjectUtilsQuick.getValue(p0));
       this.f.addOval(this.g, Path$Direction.CW);
       return;
    }
    public void addPath(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPath.class, "5")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.f.addPath(this.getNativeModule(p0).getPath());
       return;
    }
    public void addRect(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKPath.class, "1")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       a.a(this.g, V8ObjectUtilsQuick.getValue(p0));
       this.f.addRect(this.g, Path$Direction.CW);
       return;
    }
    public void addRoundRect(Object p0,float p1,float p2){
       if (PatchProxy.isSupport(TKPath.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, TKPath.class, "4")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       a.a(this.g, V8ObjectUtilsQuick.getValue(p0));
       this.f.addRoundRect(this.g, (float)n.a(p1), (float)n.a(p2), Path$Direction.CW);
       return;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, TKPath.class, "10")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.f.close();
       return;
    }
    public void cubicTo(float p0,float p1,float p2,float p3,float p4,float p5){
       TKPath tKPath = TKPath.class;
       if (PatchProxy.isSupport(tKPath)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, tKPath, "9")) {
             return;
          }
       }
       if (this.h != null) {
          return;
       }else {
          this.f.cubicTo((float)n.a(p0), (float)n.a(p1), (float)n.a(p2), (float)n.a(p3), (float)n.a(p4), (float)n.a(p5));
          return;
       }
    }
    public Path getPath(){
       return this.f;
    }
    public void lineTo(float p0,float p1){
       TKPath tKPath = TKPath.class;
       if (PatchProxy.isSupport(tKPath) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, tKPath, "7")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.f.lineTo((float)n.a(p0), (float)n.a(p1));
       return;
    }
    public void moveTo(float p0,float p1){
       TKPath tKPath = TKPath.class;
       if (PatchProxy.isSupport(tKPath) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, tKPath, "6")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.f.moveTo((float)n.a(p0), (float)n.a(p1));
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKPath tKPath = TKPath.class;
       if (PatchProxy.isSupport(tKPath) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKPath, "12")) {
          return;
       }
       super.onDestroy(p0, p1);
       this.h = true;
       return;
    }
    public void quadTo(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(TKPath.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, TKPath.class, "8")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.f.quadTo((float)n.a(p0), (float)n.a(p1), (float)n.a(p2), (float)n.a(p3));
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, TKPath.class, "11")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.f.reset();
       return;
    }
}
