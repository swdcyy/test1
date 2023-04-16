package com.kwai.video.clipkit.watermark.WatermarkSize;
import java.lang.Object;
import java.lang.Double;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class WatermarkSize	// class@001b09
{
    public double height;
    public double projectHeight;
    public double projectWidth;
    public double subAssetHeight;
    public double subAssetWidth;
    public double width;

    public void WatermarkSize(){
       super();
       this.width = 0;
       this.height = 0;
       this.projectWidth = 0;
       this.projectHeight = 0;
       this.subAssetWidth = 0;
       this.subAssetHeight = 0;
    }
    public Double getHeight(){
       Object obj = PatchProxy.apply(null, this, WatermarkSize.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Double.valueOf(this.height);
    }
    public double getProjectHeight(){
       return this.projectHeight;
    }
    public double getProjectWidth(){
       return this.projectWidth;
    }
    public double getSubAssetHeight(){
       return this.subAssetHeight;
    }
    public double getSubAssetWidth(){
       return this.subAssetWidth;
    }
    public Double getWidth(){
       Object obj = PatchProxy.apply(null, this, WatermarkSize.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Double.valueOf(this.width);
    }
    public void setHeight(Double p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WatermarkSize.class, "4")) {
          return;
       }
       this.height = p0.doubleValue();
       return;
    }
    public void setProjectHeight(double p0){
       this.projectHeight = p0;
    }
    public void setProjectWidth(double p0){
       this.projectWidth = p0;
    }
    public void setSubAssetHeight(double p0){
       this.subAssetHeight = p0;
    }
    public void setSubAssetWidth(double p0){
       this.subAssetWidth = p0;
    }
    public void setWidth(Double p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WatermarkSize.class, "2")) {
          return;
       }
       this.width = p0.doubleValue();
       return;
    }
}
