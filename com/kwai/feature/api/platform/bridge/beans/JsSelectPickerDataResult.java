package com.kwai.feature.api.platform.bridge.beans.JsSelectPickerDataResult;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import com.kwai.feature.api.platform.bridge.beans.JsSelectPickerDataResult$SelectedData;

public class JsSelectPickerDataResult implements Serializable	// class@00106a
{
    public JsSelectPickerDataResult$SelectedData mData;
    public final int mResult;
    public static final long serialVersionUID = 0x1e493a3c21c3abea;

    public void JsSelectPickerDataResult(List p0){
       super();
       this.mResult = 1;
       JsSelectPickerDataResult$SelectedData selectedData = new JsSelectPickerDataResult$SelectedData();
       selectedData.mSelectedData = p0;
       this.mData = selectedData;
    }
}
