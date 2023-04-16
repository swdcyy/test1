package com.yxcorp.gifshow.nearby.NearbyParam;
import java.io.Serializable;
import com.yxcorp.gifshow.nearby.NearbyParam$a;
import nsd.u;
import java.lang.Object;
import erb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class NearbyParam implements Serializable	// class@0020de
{
    public boolean mEnableQuickComment;
    public a mPoiParams;
    public static final NearbyParam$a Companion;
    public static final long serialVersionUID;

    static {
       NearbyParam.Companion = new NearbyParam$a(null);
    }
    public void NearbyParam(){
       super();
    }
    public final a getMPoiParams(){
       return this.mPoiParams;
    }
    public final boolean isEnableQuickComment(){
       return this.mEnableQuickComment;
    }
    public final boolean isPoiDetailStyle(){
       boolean b;
       NearbyParam obj = PatchProxy.apply(null, this, NearbyParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPoiParams;
       if (obj != null) {
          a.m(obj);
          if (!TextUtils.isEmpty(obj.d())) {
             b = true;
          label_0028 :
             return b;
          }
       }
       b = false;
       goto label_0028 ;
    }
    public final void setEnableQuickComment(boolean p0){
       this.mEnableQuickComment = p0;
    }
    public final void setMPoiParams(a p0){
       this.mPoiParams = p0;
    }
}
