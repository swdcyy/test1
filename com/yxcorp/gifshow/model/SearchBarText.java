package com.yxcorp.gifshow.model.SearchBarText;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ra6.a;
import com.yxcorp.utility.TextUtils;

public class SearchBarText implements Serializable	// class@001e88
{
    public String mTextEn;
    public String mTextSc;
    public String mTextTc;
    public static final long serialVersionUID = 0x5fe72080e2757a4d;

    public void SearchBarText(){
       super();
    }
    public String getTitle(boolean p0){
       if (PatchProxy.isSupport(SearchBarText.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, SearchBarText.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          return this.mTextSc;
       }else {
          int i = a.d();
          if (i != 2) {
             if (i != 3) {
                return this.mTextSc;
             }else {
                return TextUtils.i(this.mTextEn, this.mTextSc);
             }
          }else {
             return TextUtils.i(this.mTextTc, this.mTextSc);
          }
       }
    }
}
