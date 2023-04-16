package com.yxcorp.gifshow.detail.ocrtext.OcrResponse;
import la6.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.Collections;
import kotlin.jvm.internal.a;

public final class OcrResponse implements b	// class@001600
{
    public List mContents;
    public String mEmptyMsg;

    public void OcrResponse(){
       super();
       this.mContents = new ArrayList();
    }
    public List getItems(){
       List obj = PatchProxy.apply(null, this, OcrResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mContents)) {
          return new ArrayList();
       }
       obj = Collections.unmodifiableList(this.mContents);
       a.o(obj, "Collections.unmodifiableList\(mContents\)");
       return obj;
    }
    public final List getMContents(){
       return this.mContents;
    }
    public final String getMEmptyMsg(){
       return this.mEmptyMsg;
    }
    public boolean hasMore(){
       return false;
    }
    public final void setMContents(List p0){
       this.mContents = p0;
    }
    public final void setMEmptyMsg(String p0){
       this.mEmptyMsg = p0;
    }
}
