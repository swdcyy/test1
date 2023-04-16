package com.horcrux.svg.GlyphPathBag;
import android.graphics.Paint;
import java.lang.Object;
import java.util.ArrayList;
import android.graphics.Path;
import java.lang.String;

public class GlyphPathBag	// class@0005a7
{
    public final int[][] data;
    public final Paint paint;
    public final ArrayList paths;

    public void GlyphPathBag(Paint p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.paths = uArrayList;
       int[][] ointArray = new int[][256];
       this.data = ointArray;
       this.paint = p0;
       uArrayList.add(new Path());
    }
    public final int getIndex(char p0){
       object oobject = this.data[(p0 >> 8)];
       if (oobject == null) {
          return 0;
       }
       return oobject[(p0 & 0x00ff)];
    }
    public Path getOrCreateAndCache(char p0,String p1){
       Path path;
       int index = this.getIndex(p0);
       if (index) {
          path = this.paths.get(index);
       }else {
          Path path2 = new Path();
          this.paint.getTextPath(p1, 0, 1, 0, 0, path2);
          GlyphPathBag tdata = this.data;
          index = p0 >> 8;
          object oobject = tdata[index];
          if (oobject == null) {
             oobject = new int[256];
             tdata[index] = oobject;
          }
          oobject[(p0 & 0x00ff)] = this.paths.size();
          this.paths.add(path2);
          path = path2;
       }
       Path path1 = new Path();
       path1.addPath(path);
       return path1;
    }
}
