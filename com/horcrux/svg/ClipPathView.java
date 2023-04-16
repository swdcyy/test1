package com.horcrux.svg.ClipPathView;
import com.horcrux.svg.GroupView;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.VirtualView;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.String;
import cb.a;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.SvgView;

public class ClipPathView extends GroupView	// class@00059e
{

    public void ClipPathView(ReactContext p0){
       super(p0);
       this.mClipRule = 1;
    }
    public void draw(Canvas p0,Paint p1,float p2){
       a.x("ReactNative", "RNSVG: ClipPath can\'t be drawn, it should be defined as a child component for `Defs` ");
    }
    public int hitTest(float[] p0){
       return -1;
    }
    public boolean isResponsible(){
       return false;
    }
    public void mergeProperties(RenderableView p0){
    }
    public void resetProperties(){
    }
    public void saveDefinition(){
       this.getSvgView().defineClipPath(this, this.mName);
    }
}
