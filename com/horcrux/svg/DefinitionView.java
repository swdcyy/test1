package com.horcrux.svg.DefinitionView;
import com.horcrux.svg.VirtualView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public class DefinitionView extends VirtualView	// class@00059f
{

    public void DefinitionView(ReactContext p0){
       super(p0);
    }
    public void draw(Canvas p0,Paint p1,float p2){
    }
    public Path getPath(Canvas p0,Paint p1){
       return null;
    }
    public int hitTest(float[] p0){
       return -1;
    }
    public boolean isResponsible(){
       return false;
    }
}
