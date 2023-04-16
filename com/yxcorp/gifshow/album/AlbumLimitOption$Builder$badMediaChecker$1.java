package com.yxcorp.gifshow.album.AlbumLimitOption$Builder$badMediaChecker$1;
import com.yxcorp.gifshow.album.IBadMediaChecker;
import java.lang.Object;
import r79.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import o79.q;
import java.util.Objects;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import java.io.File;

public final class AlbumLimitOption$Builder$badMediaChecker$1 implements IBadMediaChecker	// class@0019ba
{

    public void AlbumLimitOption$Builder$badMediaChecker$1(){
       super();
    }
    public boolean isBadMediaInfo(c p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q obj = PatchProxy.applyOneRefs(p0, this, AlbumLimitOption$Builder$badMediaChecker$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.q(p0, "item");
       obj = q.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, q.class, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(p0 == null){
          Log.d("Util", "isBadMediaInfo: wrong item is null");
       }else if(TextUtils.x(p0.getPath())){
          Log.d("Util", "isBadMediaInfo: wrong item empty path "+p0);
       }else if(p0.getDataType() != DataType.CUSTOM && !new File(p0.getPath()).exists()){
          Log.d("Util", "isBadMediaInfo: path is not exist path="+p0.getPath());
       }else {
          b = false;
       }
       b = true;
       return b;
    }
}
