package com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBorderData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class LiveFloatingScreenBorderData implements Serializable	// class@000fb8
{
    public float borderGradientAngle;
    public int[] borderGradientIntColors;
    public float[] borderGradientLocations;
    public String[] borderGradientStrColors;
    public float borderWidth;

    public void LiveFloatingScreenBorderData(){
       super();
    }
    public final float getBorderGradientAngle(){
       return this.borderGradientAngle;
    }
    public final int[] getBorderGradientIntColors(){
       return this.borderGradientIntColors;
    }
    public final float[] getBorderGradientLocations(){
       return this.borderGradientLocations;
    }
    public final String[] getBorderGradientStrColors(){
       return this.borderGradientStrColors;
    }
    public final float getBorderWidth(){
       return this.borderWidth;
    }
    public final void setBorderGradientAngle(float p0){
       this.borderGradientAngle = p0;
    }
    public final void setBorderGradientIntColors(int[] p0){
       this.borderGradientIntColors = p0;
    }
    public final void setBorderGradientLocations(float[] p0){
       this.borderGradientLocations = p0;
    }
    public final void setBorderGradientStrColors(String[] p0){
       this.borderGradientStrColors = p0;
    }
    public final void setBorderWidth(float p0){
       this.borderWidth = p0;
    }
}
