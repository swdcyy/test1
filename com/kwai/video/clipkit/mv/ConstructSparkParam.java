package com.kwai.video.clipkit.mv.ConstructSparkParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class ConstructSparkParam	// class@001abb
{
    public String directory;
    public ExtraInterface extraInterface;
    public String projectPlaceHolderImagePath;
    public int templateGrade;

    public void ConstructSparkParam(){
       super();
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, ConstructSparkParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.directory) && (this.extraInterface != null && !TextUtils.isEmpty(this.projectPlaceHolderImagePath)))? true: false;
       return b;
    }
}
