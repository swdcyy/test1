package com.kuaishou.android.post.EditAbilityConfig$TextParam;
import java.io.Serializable;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class EditAbilityConfig$TextParam implements Serializable	// class@000e9c
{
    public float[] mContainerLimitRect;
    public final int mTextNumberLimit;
    public static final long serialVersionUID = 0x61336b2e0fa00629;

    public void EditAbilityConfig$TextParam(int p0,RectF p1){
       super();
       this.mTextNumberLimit = p0;
       if (p1 != null) {
          float[] uofloatArray = new float[]{p1.left,p1.top,p1.right,p1.bottom};
          this.mContainerLimitRect = uofloatArray;
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditAbilityConfig$TextParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TextParam{mTextNumberLimit="+this.mTextNumberLimit+"mContainerLimitRect="+this.mContainerLimitRect+'}';
    }
}
