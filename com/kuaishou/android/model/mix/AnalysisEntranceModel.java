package com.kuaishou.android.model.mix.AnalysisEntranceModel;
import java.io.Serializable;
import java.lang.Object;

public class AnalysisEntranceModel implements Serializable	// class@000bc0
{
    public int mPosition;
    public String mText;
    public String mUrl;
    public static final long serialVersionUID = 0x3f6be11f7908d042;

    public void AnalysisEntranceModel(){
       super();
    }
    public boolean isShowLeft(){
       boolean b = true;
       if (this.mPosition == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isShowRight(){
       boolean b = (this.mPosition == 2)? true: false;
       return b;
    }
}
