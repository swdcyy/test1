package com.yxcorp.gifshow.commercial.bridge.model.NeoTaskParam;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o35.b;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import android.util.Base64;
import fg6.a;
import ok.c;
import java.nio.charset.Charset;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.NeoParamsBaseInfo;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class NeoTaskParam implements Serializable, a	// class@00112f
{
    public String mCallback;
    public String mNeoParams;
    public NeoParamsBaseInfo mNeoParamsInfo;
    public static final long serialVersionUID = 0xef28b607034a5be5;

    public void NeoTaskParam(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, NeoTaskParam.class, "1")) {
          return;
       }
       this.parseNeoParamsInfo();
       return;
    }
    public void parseNeoParamsInfo(){
       if (PatchProxy.applyVoid(null, this, NeoTaskParam.class, "2")) {
          return;
       }
       int i = 0;
       if (TextUtils.x(this.mNeoParams)) {
          Object[] objArray = new Object[i];
          b.g().i("NeoParamsInfo", "mNeoParams is null", objArray);
          return;
       }else {
          ParameterizedType genericSuper = this.getClass().getGenericSuperclass();
          if (genericSuper != null) {
             this.mNeoParamsInfo = a.a.h(new String(Base64.decode(this.mNeoParams, 8), c.c), genericSuper.getActualTypeArguments()[i]);
          }
          return;
       }
    }
}
