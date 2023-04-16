package com.kuaishou.merchant.transaction.purchase.model.Agreement;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class Agreement implements Serializable	// class@00093c
{
    public String mDesc;
    public String mText;
    public String mUrl;
    public static final long serialVersionUID = 0x9d95425f97676ba4;

    public void Agreement(){
       super();
    }
    public static Agreement of(String p0,String p1){
       Agreement obj = PatchProxy.applyTwoRefs(p0, p1, null, Agreement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Agreement();
       obj.mText = p0;
       obj.mUrl = p1;
       return obj;
    }
}
