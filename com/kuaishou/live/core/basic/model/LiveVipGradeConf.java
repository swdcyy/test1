package com.kuaishou.live.core.basic.model.LiveVipGradeConf;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import android.graphics.Color;

public class LiveVipGradeConf implements Serializable	// class@0008ae
{
    public int[] b;
    public int mLevel;
    public List mScoreBarColors;
    public static final long serialVersionUID = 0xa64eb03e03225260;

    public void LiveVipGradeConf(){
       super();
    }
    public int[] getParsedScoreBarColors(){
       LiveVipGradeConf obj = PatchProxy.apply(null, this, LiveVipGradeConf.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          return obj;
       }
       obj = this.mScoreBarColors;
       if (obj != null && obj.size() > 0) {
          int[] ointArray = new int[this.mScoreBarColors.size()];
          int i = 0;
          Iterator iterator = this.mScoreBarColors.iterator();
          while (iterator.hasNext()) {
             int i1 = i + 1;
             ointArray[i] = Color.parseColor(iterator.next());
             i = i1;
          }
          this.b = ointArray;
       }
       return this.b;
    }
}
