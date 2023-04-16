package com.kuaishou.android.model.mix.BottomStyleInfoModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;

public class BottomStyleInfoModel implements Serializable	// class@000bd2
{
    public BottomStyleInfoModel$BottomStrongStyleInfo mBottomStrongStyle;
    public BottomStyleInfoModel$BottomWeakStyleInfo mBottomWeakStyle;
    public long mShowWeakVideoCountdownMillis;
    public long mShowWeakVideoMillis;
    public double mShowWeakVideoPercent;
    public long mStrongVideoHideMillis;
    public double mStrongVideoHidePercent;
    public long mWeakToStrongVideoMillis;
    public long mWeakToStrongVideoPercent;
    public static final long serialVersionUID = 0x50d4b4be9b5f32d8;

    public void BottomStyleInfoModel(){
       super();
    }
    public static String getParseColor(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BottomStyleInfoModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return "#FFFFFF";
       }
       Objects.requireNonNull(p0);
       return "#FFFFFF";
    }
}
