package com.kuaishou.common.encryption.model.DrawingSendInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import com.kuaishou.common.encryption.model.DrawingGiftPoint;
import java.util.ArrayList;

public class DrawingSendInfo implements Serializable	// class@0016bd
{
    public List drawingGiftPoints;
    public long toUserId;

    public void DrawingSendInfo(){
       super();
    }
    public void DrawingSendInfo(long p0,List p1){
       super();
       this.toUserId = p0;
       this.drawingGiftPoints = p1;
    }
    public synchronized void addDrawingGiftPoint(DrawingGiftPoint p0){
       if (this.drawingGiftPoints == null) {
          this.drawingGiftPoints = new ArrayList();
       }
       this.drawingGiftPoints.add(p0);
       return;
    }
    public List getDrawingGiftPoints(){
       return this.drawingGiftPoints;
    }
    public long getToUserId(){
       return this.toUserId;
    }
    public void setDrawingGiftPoints(List p0){
       this.drawingGiftPoints = p0;
    }
    public void setToUserId(long p0){
       this.toUserId = p0;
    }
}
