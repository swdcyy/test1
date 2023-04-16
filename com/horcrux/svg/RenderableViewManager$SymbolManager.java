package com.horcrux.svg.RenderableViewManager$SymbolManager;
import com.horcrux.svg.RenderableViewManager$GroupViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.SymbolView;
import java.lang.String;

public class RenderableViewManager$SymbolManager extends RenderableViewManager$GroupViewManager	// class@0005e6
{

    public void RenderableViewManager$SymbolManager(){
       super(RenderableViewManager$SVGClass.RNSVGSymbol);
    }
    public void setAlign(SymbolView p0,String p1){
       p0.setAlign(p1);
    }
    public void setMeetOrSlice(SymbolView p0,int p1){
       p0.setMeetOrSlice(p1);
    }
    public void setMinX(SymbolView p0,float p1){
       p0.setMinX(p1);
    }
    public void setMinY(SymbolView p0,float p1){
       p0.setMinY(p1);
    }
    public void setVbHeight(SymbolView p0,float p1){
       p0.setVbHeight(p1);
    }
    public void setVbWidth(SymbolView p0,float p1){
       p0.setVbWidth(p1);
    }
}
