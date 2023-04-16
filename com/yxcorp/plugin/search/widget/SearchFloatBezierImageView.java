package com.yxcorp.plugin.search.widget.SearchFloatBezierImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.PointF;

public class SearchFloatBezierImageView extends KwaiImageView	// class@0007db
{
    public PointF A;
    public int x;
    public PointF y;
    public PointF z;

    public void SearchFloatBezierImageView(Context p0){
       super(p0);
       this.x = 2000;
    }
    public void SearchFloatBezierImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.x = 2000;
    }
    public void SearchFloatBezierImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = 2000;
    }
    public void setDuration(int p0){
       this.x = p0;
    }
    public void setTerminalPointF(PointF p0){
       this.A = p0;
    }
}
