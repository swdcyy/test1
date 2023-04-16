package com.kwai.video.westeros.veplugin.ColorPickResult;
import java.lang.Object;

public class ColorPickResult	// class@0010fd
{
    public int alpha;
    public int blue;
    public int green;
    public int red;

    public void ColorPickResult(int p0,int p1,int p2,int p3){
       super();
       this.red = p0;
       this.green = p1;
       this.blue = p2;
       this.alpha = p3;
    }
    public int getComponents(int p0){
       if (!p0) {
          return this.red;
       }
       if (p0 == 1) {
          return this.green;
       }
       if (p0 == 2) {
          return this.blue;
       }
       if (p0 != 3) {
          return 0;
       }
       return this.alpha;
    }
}
