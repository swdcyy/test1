package com.horcrux.svg.SvgViewModule$1$1;
import java.lang.Runnable;
import com.horcrux.svg.SvgViewModule$1;
import java.lang.Object;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.SvgViewManager;
import com.horcrux.svg.SvgViewModule$1$1$1;

public class SvgViewModule$1$1 implements Runnable	// class@0005fb
{
    public final SvgViewModule$1 this$0;

    public void SvgViewModule$1$1(SvgViewModule$1 p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.this$0.val$tag);
       if (svgViewByTag == null) {
          return;
       }
       svgViewByTag.setToDataUrlTask(new SvgViewModule$1$1$1(this));
       return;
    }
}
