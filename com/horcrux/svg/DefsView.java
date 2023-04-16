package com.horcrux.svg.DefsView;
import com.horcrux.svg.DefinitionView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.View;
import com.horcrux.svg.VirtualView;

public class DefsView extends DefinitionView	// class@0005a0
{

    public void DefsView(ReactContext p0){
       super(p0);
    }
    public void draw(Canvas p0,Paint p1,float p2){
    }
    public void saveDefinition(){
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (childAt instanceof VirtualView) {
             childAt.saveDefinition();
          }
          i = i + 1;
       }
       return;
    }
}
