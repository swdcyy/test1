package com.kuaishou.android.model.mix.StyleInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.mix.WeakStyleInfo;

public final class StyleInfo implements Serializable	// class@000e02
{
    public WeakStyleInfo mTagUiInfo;

    public void StyleInfo(){
       super();
    }
    public final WeakStyleInfo getMTagUiInfo(){
       return this.mTagUiInfo;
    }
    public final void setMTagUiInfo(WeakStyleInfo p0){
       this.mTagUiInfo = p0;
    }
}
